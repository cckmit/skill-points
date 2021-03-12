package javaBase.specialUse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ImproveFactory {
    public static Properties init() {
        // 从properties文件中读取shortName对应的完整包名
        Properties properties = new Properties();
        try {
            properties.load(ImproveFactory.class.getClassLoader().getResourceAsStream("cla.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static IFruit choose(String shortName) {
        IFruit iFruit = null;
        try {
            String fullName = ImproveFactory.init().getProperty(shortName);
            iFruit = (IFruit) Class.forName(fullName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iFruit;
    }
}

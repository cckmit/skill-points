package iilibxc.doublecolon.doublecolon;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class DoubleColon extends BaseExample {
    @Test
    public void test() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc");

        System.out.println("------静态方法语法-------");
        //静态方法语法	ClassName::methodName
        list.forEach(DoubleColon::staticPrint);

        System.out.println("------类实例方法语法-------");
        //类实例方法语法	ClassName::methodName
        list.forEach(new DoubleColon()::print);

        System.out.println("------类实例方法语法-------");
        //父类方法
        list.forEach(super::print);
    }

    public void print(String content) {
        System.out.println(content);
    }

    public static void staticPrint(String content) {
        System.out.println(content);
    }

}

package iilibxc.doublecolon.doublecolon;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
public class StaticMethod {
    @Test
    public void test() {
        List<String> list = Arrays.asList("StaticMethod1", "StaticMethod2", "StaticMethod3");

        //静态方法语法	ClassName::methodName
        list.forEach(StaticMethod::print);
    }

    public static void print(String content){
        System.out.println(content);
    }
}


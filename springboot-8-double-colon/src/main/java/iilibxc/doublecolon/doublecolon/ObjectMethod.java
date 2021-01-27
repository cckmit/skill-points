package iilibxc.doublecolon.doublecolon;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class ObjectMethod {
    @Test
    public void test() {
        List<String> list = Arrays.asList("ObjectMethod1", "ObjectMethod2", "ObjectMethod3");

        //对象实例语法	instanceRef::methodName
        list.forEach(new ObjectMethod()::print);
    }

    public void print(String content){
        System.out.println(content);
    }
}


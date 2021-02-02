package iilibxc.doublecolon;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class SuperMethod extends BaseExample {

    @Test
    public void test() {
        List<String> list = Arrays.asList("SuperMethod1", "SuperMethod2", "SuperMethod3");

        //对象的超类方法语法： super::methodName
        list.forEach(super::print);
    }
}


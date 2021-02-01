package iilibxc.doublecolon.doublecolon;
import org.junit.Test;

public class InterfaceMethod {

    @Test
    public void test() {
        InterfaceExample com =  InterfaceMethod::new;
        InterfaceMethod bean = com.create();
        System.out.println(bean);
    }
}


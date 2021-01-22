package iilibxc.doublecolon.doublecolon;

import java.util.function.Function;

public class Example {

    String name;

    Example(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("------带参数的构造器-------");
        InteerfaceEX com = Example::new;
        Example bean = com.create("hello world");
        System.out.println(bean.name);
        System.out.println("------带参数的构造器-------");
        Function<Integer, Example[]> function = Example[]::new;
        Example[] array = function.apply(4);	//这里的4是数组的大小

        for(Example e:array){
            System.out.println(e);	//如果输出的话，你会发现会输出4个空对象(null)
        }
    }
    public interface InteerfaceEX {
        Example create(String name);
    }
}


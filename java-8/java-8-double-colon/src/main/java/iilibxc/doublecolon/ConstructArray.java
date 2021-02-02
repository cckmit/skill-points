package iilibxc.doublecolon;

import java.util.function.Function;

public class ConstructArray {
    public static void main(String[] args) {
        Function<Integer, ConstructArray[]> function = ConstructArray[]::new;
        ConstructArray[] array = function.apply(4);    //这里的4是数组的大小

        for (ConstructArray e : array) {

            System.out.println(e);    //如果输出的话，你会发现会输出4个空对象(null)
        }
    }
}


package iilibxc.doublecolon;

public class ConstructFunction {

    public static void main(String[] args) {
        Interface <Integer, ConstructFunction[]> function = ConstructFunction[]::new;
        ConstructFunction[] array = function.apply(4);	//这里的4是数组的大小

        for(ConstructFunction e:array){
            System.out.println(e);
        }
    }
}

@FunctionalInterface
interface Interface<A, T>{
    T apply(A a);
}


package iilibxc.doublecolon.doublecolon;

public class ExampleArray {

    public static void main(String[] args) {
        Interface <Integer, Example[]> function = Example[]::new;
        Example[] array = function.apply(4);	//这里的4是数组的大小

        for(Example e:array){
            System.out.println(e);
        }
    }
}

interface Interface<A, T>{
    T apply(A a);
}

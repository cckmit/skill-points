package iilibxc.doublecolon.doublecolon;

public class ConstructParamMethod {

    private String name;

    ConstructParamMethod(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        InterfaceParamExample com =  ConstructParamMethod::new;
        ConstructParamMethod bean = com.create("hello world");
        System.out.println(bean.name);
    }

}


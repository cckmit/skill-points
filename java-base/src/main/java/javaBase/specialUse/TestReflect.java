package javaBase.specialUse;

import javaBase.lists.UnchangeableList;

/*
但如果只获得一个字符串，例如获得String类对应的Class对象，则不能使用String.class方式，而是使用Class.forName（"java.lang.String"）。
注意：如果要想获得基本数据类型的Class对象，可以使用对应的打包类加上.TYPE，例如，Integer.TYPE可获得int的Class对象，但要获得Integer.class的Class对象，
则必须使用Integer.class。在获得Class对象后，就可以使用表13.4中的方法来取得Class对象的基本信息
* */
public class TestReflect {
    Class c = UnchangeableList.class;

    //简单工厂模式 使用映射
    public static void main(String[] args) {
        IFruit fruit = FruitFactory
                .getInstance("javaBase.specialUse.Apple");
        fruit.eat();
        ImproveFactory.choose("orange").eat();
    }
}

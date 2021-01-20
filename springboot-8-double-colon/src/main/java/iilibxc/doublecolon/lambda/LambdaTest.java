package iilibxc.doublecolon.lambda;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class LambdaTest {
    @Test
    public void test() {
        String[] array = {"aaaa", "bbbb", "cccc"};
        List<String> list = Arrays.asList(array);

        //Java 7
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");
        //Java 8
        //  foreach相对于for循环，代码减少了，但是foreach依赖IEnumerable(IEnumerable是一个接口，
        //  它定义一个方法GetEnumerator，它返回一个IEnumerator接口，这允许只读访问一个集合，
        //  然后实现IEnumerable的集合可以与for-each语句一起使用)。在运行的时候效率低于for循环。
        //  在处理不确定循环次数的循环，或者循环次数需要计算的情况下，使用foreach比较方便。
        //  而且foreach的代码经过编译系统的代码优化后，和for循环的循环类似。
        //  可以说，foreach语句是for语句的特殊简化版本，
        //  在遍历数组、集合方面，foreach为开发人员提供了极大的方便。在复杂的循环设计时，还是应该使用for循环更加的灵活。

        //1、正常遍历
        list.forEach(item -> System.out.println(item));
        //forEach（）方法是Iterable<T>接口中的一个方法。Java容器中，
        // 所有的Collection子类（List、Set）会实现Iteratable接口以实现foreach功能。
        // forEach（）方法里面有个Consumer类型，它是Java8新增的一个消费型函数式接口，其中的accept(T t)方法代表了接受一个输入参数并且无返回的操作。
        //2、根据条件遍历
        list.forEach(item -> {
            if ("bbbb".equals(item)) {
                System.out.println(item);
            }

        });
    }
}
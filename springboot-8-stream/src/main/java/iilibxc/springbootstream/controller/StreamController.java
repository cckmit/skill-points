package iilibxc.springbootstream.controller;

import iilibxc.springbootstream.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@RestController
public class StreamController {
    //https://www.cnblogs.com/owenma/p/12207330.html

    /**
     * Stream 是 Java8 中处理集合的关键抽象概念，它可以指定你希望对集合进行的操作，可以执行非常复杂的查找、过滤和映射数据等操作。使用Stream API 对集合数据进行操作，就类似于使用 SQL 执行的数据库查询。也可以使用 Stream API 来并行执行操作。简而言之，Stream API 提供了一种高效且易于使用的处理数据的方式。
     * <p>
     * 特点：
     * <p>
     * 1不是数据结构，不会保存数据。
     * <p>
     * 2不会修改原来的数据源，它会将操作后的数据保存到另外一个对象中。（保留意见：毕竟peek方法可以修改流中元素）
     * <p>
     * 3惰性求值，流在中间处理过程中，只是对操作进行了记录，并不会立即执行，需要等到执行终止操作的时候才会进行实际的计算。
     * <p>
     * 二、分类
     */


    @GetMapping("streamTest")
    public void streamTest() throws FileNotFoundException {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        System.out.print("list s:");
        list.forEach(s -> {
            System.out.print(" " + s);
        });
        System.out.println();
        Stream<String> stream1 = list.stream(); //获取一个顺序流
        System.out.println("顺序流stream1" + stream1);

        Stream<String> parallelStream = list.parallelStream(); //获取一个并行流
        System.out.println("并行流parallelStream" + parallelStream);

        Integer[] nums = new Integer[10];
        Stream<Integer> stream2 = Arrays.stream(nums);//数组转成流
        System.out.println("数组转成流stream2" + stream2);
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        System.out.println("Stream中的静态方法of()" + stream);
        Stream<Integer> stream3 = Stream.iterate(0, (x) -> (x + 2)).limit(10);
        System.out.println("Stream中的静态方法iterate()(取偶数集):");
        stream3.forEach(System.out::print); // 0 2 4 6 8 10
        System.out.println();
        Stream<Integer> stream31 = Stream.iterate(1, (x) -> x + 2).limit(10);
        stream31.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println();
        Stream<Double> stream4 = Stream.generate((Math::random)).limit(2);
        stream4.forEach(System.out::println);
        //使用 BufferedReader.lines() 方法，将每行内容转成流
        BufferedReader reader = new BufferedReader(new FileReader("e:\\test_stream.txt"));
        Stream<String> lineStream = reader.lines();
        lineStream.forEach(System.out::println);
        //使用 Pattern.splitAsStream() 方法，将字符串分隔成流
        Pattern pattern = Pattern.compile(",");
        Stream<String> stringStream = pattern.splitAsStream("a,b,c,d");
        stringStream.forEach(System.out::println);
    }
    /*筛选与切片
    　　filter：过滤流中的某些元素
    　　limit(n)：获取n个元素
    　　skip(n)：跳过n元素，配合limit(n)可实现分页
    　　distinct：通过流中元素的 hashCode() 和 equals() 去除重复元素*/

    @GetMapping("method")
    public void method() {
        Stream<Integer> stream = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);

        Stream<Integer> newStream = stream.filter(s -> s > 5) //6 6 7 9 8 10 12 14 14
                .distinct() //6 7 9 8 10 12 14
                .skip(2) //9 8 10 12 14
                .limit(2); //9 8
        newStream.forEach(System.out::println);

        /*
        map：接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        flatMap：接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
        */
        List<String> list = Arrays.asList("a,b,c", "1,2,3");

        //将每个元素转成一个新的且不带逗号的元素
        Stream<String> s1 = list.stream().map(s -> s.replaceAll(",", ""));
        s1.forEach(System.out::println); // abc 123

        Stream<String> s3 = list.stream().flatMap(s -> {
            //将每个元素转换成一个stream
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        });
        System.out.println();
        s3.forEach(System.out::println); // a b c 1 2 3
        System.out.println("-----User-----");
        List<User> users = Arrays.asList(new User(1, "user1", new Date()), new User(2, "user2", new Date()));
        Stream<User> userStream = users.stream().map(user -> {
            user.setId(user.getId() + 1000);
            return user;
        });
        userStream.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}

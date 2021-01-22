package iilibxc.springbootstream.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public void streamTest() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.forEach(s -> {
            System.out.println(s);
        });
        Stream<String> stream1 = list.stream(); //获取一个顺序流
        System.out.println(stream1);

        Stream<String> parallelStream = list.parallelStream(); //获取一个并行流
        System.out.println(parallelStream);

        Integer[] nums = new Integer[10];
        Stream<Integer> stream2 = Arrays.stream(nums);
        System.out.println(stream2);
        System.out.println("---------------------");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

        Stream<Integer> stream3 = Stream.iterate(0, (x) -> x + 2).limit(6);
        stream2.forEach(System.out::println); // 0 2 4 6 8 10

        Stream<Double> stream4 = Stream.generate(Math::random).limit(2);
        stream3.forEach(System.out::println);
    }
}

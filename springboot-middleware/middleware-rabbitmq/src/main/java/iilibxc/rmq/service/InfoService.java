package iilibxc.rmq.service;

import iilibxc.rmq.entity.Info;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InfoService {

    public Info getInfo(Integer id) {
        long s = System.currentTimeMillis();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        id = 2021;
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "4");
        map.put(5, "6");
        Info info = new Info(id, "" + (int) (Math.random() * 10000), new Date(), true, list, map);
        long e = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "数据库查询花费时间:" + (e - s));
        return info;
    }
}

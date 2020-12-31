package com.springboot.yuanfenge.webflux.service;

import com.springboot.yuanfenge.webflux.bean.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StuService {

    public Student selectSimple(){
        return Student.builder()
                .name("")
                .age(20)
                .build();
    }

    public List<Student> selectList(){
        List<Student> datas=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student item=Student.builder()
                    .name(""+i)
                    .age(20+i)
                    .build();
            datas.add(item);
        }
        return datas;
    }
}

package javaBase.lists;

import lombok.Data;

import java.util.*;

//不可更改的集合
@Data
public class UnchangeableList {
    private String string;
    private Integer integer;
    private Date date;

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collection cs = Collections.unmodifiableCollection(strings);
        cs.add("ppppp");
    }
}

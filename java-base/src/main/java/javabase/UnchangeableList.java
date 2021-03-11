package javabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnchangeableList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collection cs = Collections.unmodifiableCollection(strings);
        cs.add("ppppp");
    }
}

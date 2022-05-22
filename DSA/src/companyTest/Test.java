package companyTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("uysksks");


        List<String> collect = list.stream().map(x -> x = x + 1).filter(x->x!=null).collect(Collectors.toList());
        System.out.println(collect);
    }
}

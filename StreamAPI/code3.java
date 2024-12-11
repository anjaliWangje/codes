package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class code3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);
        list.add("anjali");
        list.add("aboli");
        list.add("Akash");
        list.add("priti");
        list.add("Pooja");
        list.add("pallavi");
        list.add(" akshra");
        list.add("anuja");
        list.add("aarpita");
        list.add("shivam");
        list.add("aaru");
        list.add("pranali");
        list.add("megha");
        list.add("anuj");
        list.add("sidh");
        list.add("shruti");
        list.add("angha");
        list.add("radha");
        list.add("vaishu");
        list.add("sidhik");
        List<String>list2=new ArrayList<>();
        for(String str1:list){
            if(str1.startsWith("a")){
                list2.add(str1);
            }
        }
        Collections.sort(list, Comparator.comparingInt(String::length));
        for(String str2:list){
            System.out.println(str2+" "+str2.length());
        }

    }
}

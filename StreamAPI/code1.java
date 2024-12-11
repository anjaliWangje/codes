package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;

public class code1 {
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
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i).contains("a")){
                System.out.println(list.get(i)+" - "+list.get(i).length());
            }
        }


    }
}
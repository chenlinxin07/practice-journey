package upperpart.BasicKnowledg.ArrayList;

import java.util.ArrayList;

public class TraverseArrayList {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        for (int i = 0; i < list.size(); i++) {
            if(i==0)
            {
                System.out.print("[");
            }
            if(i<list.size()-1){
                System.out.print(list.get(i)+",");
            }
            if(i==list.size()-1){
                System.out.println(list.get(i)+"]");
            }
        }
    }
}

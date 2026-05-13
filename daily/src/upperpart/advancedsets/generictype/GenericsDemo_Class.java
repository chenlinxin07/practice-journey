package upperpart.advancedsets.generictype;

public class GenericsDemo_Class {
    static void main(String[] args) {
       /* MyArrayList&lt;String&gt; list = new MyArrayList&lt;&gt;();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        System.out.println(list);*/



        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);


        int i = list2.get(0);
        System.out.println(i);


        System.out.println(list2);
    }
}

package upperpart.advancedsets.generictype;

public class GenericDemo_Interface {
    static void main(String[] args) {
        /*
            泛型接口的两种使用方式：
                1.实现类给出具体的类型
                2.实现类延续泛型，创建实现类对象时再确定类型
        */

        MyArrayList2_InterfaceHasGenerics list1 = new MyArrayList2_InterfaceHasGenerics();

        MyArrayList3_InterfaceHasNoType<String> list2 = new MyArrayList3_InterfaceHasNoType<>();
    }
}

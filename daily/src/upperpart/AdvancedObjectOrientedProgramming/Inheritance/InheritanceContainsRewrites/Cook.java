package upperpart.AdvancedObjectOrientedProgramming.Inheritance.InheritanceContainsRewrites;

public class Cook extends Employee {
        public Cook() {
        }

        public Cook(String id, String name, double salary) {
            super(id, name, salary);
        }


        @Override//重写都加上这个,优雅且不容易出错
        public void work() {
            System.out.println("厨师正在炒菜");
        }
}

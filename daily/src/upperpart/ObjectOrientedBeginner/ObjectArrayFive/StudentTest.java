package upperpart.ObjectOrientedBeginner.ObjectArrayFive;

//定义数组存储3个学生对象。
// 学生的属性：学号，姓名，年龄。
// 要求1：添加的时候需要进行学号的唯一性判断。
// 要求2：添加完毕之后，遍历所有学生信息。
// 要求3：通过id删除学生信息,如果存在，则删除，如果不存在，则提示删除失败。
// 要求4：删除完毕之后，遍历所有学生信息。
// 要求5：id为102的学生，年龄+1岁
public class StudentTest {
    static void main(String[] args) {
        Student []arr = new Student[3];
        Student s1 = new Student(101,"张三",12);
        Student s2 = new Student(102,"李四",12);
        Student s3 = new Student(103,"王五",12);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Student s4 = new Student(104,"歌姬",19);
    //  printStudentArr(arr);
    //  System.out.println("---------------------------------------");
        //要求一:唯一性判断
        boolean flag = contains(arr,s4.getStudentID());
        if(flag){
            //有相同id,不能添加
            System.out.println("当前id重复,请修改id");
        }
        else{
            int count = getCount(arr);
            if(count == arr.length){
                //数组已满,需创建一个新数组
                arr = createNewArr(arr,s4);
            }
            else{
                arr[count] = s4;
            }
        }
        //要求二:添加完毕的遍历
        printStudentArr(arr);
        System.out.println();
        System.out.println("------------------------------------");
        //要求三:通过id删除学生信息
        deleteStuByID(arr,102);
        //要求四:删除完遍历
        printStudentArr(arr);
        System.out.println("------------------------------------");
        System.out.println();
        //要求五: 通过id加减年龄
        changeAgeByID(arr,104,-1);
        printStudentArr(arr);
    }

    //查看id是否存在
    public static boolean contains(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if (arr[i].getStudentID() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //查看数组存了多少个元素
    public static int getCount(Student []arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= null){
                count ++;
            }
        }
        return count;
    }

    //创建新数组
    public static Student[] createNewArr(Student []arr ,Student newStudent){
        Student []newArr = new Student[arr.length+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i ==newArr.length-1){
                newArr[i] = newStudent;
            }
            else{
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    //打印Student数组
    public static void printStudentArr(Student []arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println("ID:"+arr[i].getStudentID()+" name:"
                        +arr[i].getName()+" age:"+arr[i].getAge());
            }
        }
    }

    //通过id删除学生信息
    public static void deleteStuByID(Student []arr ,int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getStudentID() == id) {
                    arr[i] = null;
                    return;
                }
            }
        }
        System.out.println("删除失败,该id不存在,请重新确认");
        return;
    }

    //通过id改变年龄
    public static void changeAgeByID(Student []arr,int id,int changeAge){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getStudentID()==id){
                    arr[i].setAge(arr[i].getAge()+changeAge);
                    return;
                }
            }
        }
        System.out.println("没有该id,存在,请确认");
        return;
    }
}

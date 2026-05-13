package upperpart.ObjectOrientedBeginner.UserLogin;

public class User {
    private String username ;
    private String password;
    private String emil;
    private String gender;
    private int age;

    public User() {
    }

    public User(String username, String password, String emil, String gender, int age) {
        this.username = username;
        this.password = password;
        this.emil = emil;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return emil
     */
    public String getEmil() {
        return emil;
    }

    /**
     * 设置
     * @param emil
     */
    public void setEmil(String emil) {
        this.emil = emil;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", emil = " + emil + ", gender = " + gender + ", age = " + age + "}";
    }

    //快捷键:
    //alt + insert

    //插件PTG 1秒生成标准JavaBean




    /*
    alt+insert生成的
    public User() {
    }

    public User(String username, String password, String emil, String gender, int age) {
        this.username = username;
        this.password = password;
        this.emil = emil;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     */

    /*手打的
    public User(String username,String password,String emil,String gender){
    this.age = age;
    this.emil = emil;
    this.username  = username;
    this.password = password;
    this.gender = gender;
    }
    public User(){}


    public void setAge(int age){
        this.age = age;
    }
    public void setName(String username){
        this.username = username;
    }
    public void setPassaword(String password){
        this.password = password;
    }
    public void setEmail(String emil){
        this.emil = emil;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    */
}

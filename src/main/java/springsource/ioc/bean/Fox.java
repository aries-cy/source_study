package springsource.ioc.bean;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Fox {

    private String name;
    private Integer age;

    private User user;

    public Fox(){
        System.out.println("无参数构造器");
    }

    public Fox(User user ){
        System.out.println(user);
    }

    public User getUser() {
        return user;
    }

    public void setxxxUserxx(User user) {
        System.out.println("setter方法注入");
        this.user = user;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

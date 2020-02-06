package springsource.ioc.datasource;

/**
 * TODO 描述
 *
 * @author cy
 */
public class User {

    private String name;

    private String passWorld;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passWorld='" + passWorld + '\'' +
                '}';
    }
}

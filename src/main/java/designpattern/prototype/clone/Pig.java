package designpattern.prototype.clone;

import java.util.Date;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Pig implements Cloneable {

    private String name;
    private Date birthday;

    public Pig() {

    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆
        pig.birthday = (Date) pig.getBirthday().clone();
        return pig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}'+super.toString();
    }
}

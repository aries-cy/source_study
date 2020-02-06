package designpattern.prototype;



/**
 * TODO 描述
 *
 * @author cy
 */

public class Mail implements Cloneable {
    private String name;
    private String address;
    private String content;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail");
        return super.clone();
    }

    public Mail() {
        System.out.println("Mail send");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

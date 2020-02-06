package designpattern.singleton;

/**
 * TODO 描述
 *
 * @author cy
 */
public enum EnumInstance {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}

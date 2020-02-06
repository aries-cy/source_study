package designpattern.adapter;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        int outputDC5 = dc5.outputDC5();
        System.out.println(outputDC5);
    }

    
}

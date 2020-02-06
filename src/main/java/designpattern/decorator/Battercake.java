package designpattern.decorator;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 5;
    }
}

package designpattern.decorator;

/**
 * TODO 描述  装饰者模式
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new SausageDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);

        System.out.println(aBattercake.getDesc());
        System.out.println(aBattercake.cost());
    }
}

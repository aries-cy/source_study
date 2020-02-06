package designpattern.adapter;

/**
 * TODO 描述
 *
 * @author cy
 */
public class PowerAdapter implements DC5{

    AC220 ac220 = new AC220();

    @Override
    public int outputDC5() {
        int intput = ac220.outputAC220();
        //变压器
        int output = intput/44;
        System.out.println("使用PowerAdapter变压器输入AC:"+intput+" 输出DC:"+output+"V");
        return output;
    }
}

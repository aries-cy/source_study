package designpattern.flyweight;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    private static final String[] DEPARTMENTS  = {"RD","QA","PM"};

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            String department = DEPARTMENTS[(int)(Math.random()*DEPARTMENTS.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}

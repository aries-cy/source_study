package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO 描述
 *
 * @author cy
 */
public class EmployeeFactory {

    private final static Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(null==manager){
            manager = new Manager(department);
            System.out.print("创建部门经理："+department);

            String content = department+"部门汇报：此次报告的内容是......";
            manager.setReportContent(content);
            System.out.println(" 创建报告："+department);

            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }

}

package springsource.ioc.datasource.mapper;

import org.apache.ibatis.annotations.Select;
import springsource.ioc.datasource.User;

import java.util.List;

/**
 * TODO 描述
 *
 * @author cy
 */
public interface TestMapper {

    @Select("select * from user limit 1")
    List<User> test();
}

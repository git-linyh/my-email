package pers.linyh.emailmanage;

import com.baomidou.mybatisplus.extension.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.linyh.emailmanage.entity.TestTable;
import pers.linyh.emailmanage.mapper.TestTableMapper;

import java.util.List;

@SpringBootTest
class EmailManageApplicationTests {

    @Autowired
    private TestTableMapper testTableMapper;

    @Test
    void contextLoads() {
    }



    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<TestTable> userList = testTableMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}

package info.zhiqing.forus.utils;

import info.zhiqing.forus.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhiqing on 17-7-30.
 */
public class AccountUtilTest extends BaseTest {

    @Autowired
    private AccountUtil accountUtil;

    @Test
    public void testBuildPass() {
        System.out.println(accountUtil.buildPassword("lizhiqing"));
    }
}

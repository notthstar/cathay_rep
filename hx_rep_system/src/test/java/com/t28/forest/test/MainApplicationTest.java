package com.t28.forest.test;

import static org.junit.Assert.assertTrue;

import com.t28.forest.user.dao.UserDao;
import com.t28.forest.user.entity.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Autowired
    UserDao userDao;

    @Test
    public void loginTest() {
        UserDTO userDTO = new UserDTO();
//        userDTO.setUserName();
//        userDTO.setPassword();
        UserDTO user = userDao.findUserByCondition(userDTO);
    }

}

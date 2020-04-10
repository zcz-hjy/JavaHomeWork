package main;

import entity.ISqlUtil;
import entity.SqlUtilImpl;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ISqlUtil util = new SqlUtilImpl();
        User user = new User();
        user.setId(175);
        try {
            System.out.println(util.query(user));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // print: SELECT * FROM user WHERE id = 175

        // test query2
        user = new User();
        user.setUserName("史荣贞");
        try {
            System.out.println(util.query(user));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // print: SELECT * FROM `user` WHERE `username` LIKE '史荣贞';

        // test insert
        user = new User();
        user.setUserName("user");
        user.setTelephone("12345678123");
        user.setEmail("user@123.com");
        user.setAge(20);
        System.out.println(util.insert(user));
        // print: INSERT INTO `user` (`username`, `telephone`, `email`, `age`) VALUES ('user', '12345678123', 'user@123.com', 20)

        // test insert list
        User user2 = new User();
        user2.setUserName("user2");
        user2.setTelephone("12345678121");
        user2.setEmail("user2@123.com");
        user2.setAge(20);
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        System.out.println(util.insert(list));
        // print: INSERT INTO `user` (`username`, `telephone`, `email`, `age`) VALUES ('user', '12345678123', 'user@123.com', 20), ('user2', '12345678121', 'user2@123.com', 20)

        // test update
        user = new User();
        user.setId(1);
        user.setEmail("change@123.com");
        System.out.println(util.update(user));
        // print: UPDATE `user` SET `email` = 'change@123.com' WHERE `id` = 1;

        // test delete
        user = new User();
        user.setId(1);
        System.out.println(util.delete(user));



    }
}

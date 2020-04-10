package entity;

import java.util.List;

public interface ISqlUtil {
    String query(User user) throws IllegalAccessException;
    String insert(User user);
    String insert(List<User> users);
    String delete(User user);
    String update(User user);
}


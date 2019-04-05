package CodeGym.userDao;

import CodeGym.model.Login;
import CodeGym.model.User;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUser
{
    private static List<User> userList = new ArrayList<>();

    static
    {
        userList = new ArrayList<>();
        User user1 = new User();
        user1.setName("Ha");
        user1.setAge(24);
        user1.setAccount("ha");
        user1.setEmail("hahah@gmail.com");
        user1.setPassword("123");
        userList.add(user1);

        userList = new ArrayList<>();
        User user2 = new User();
        user2.setName("Tu");
        user2.setAge(24);
        user2.setAccount("tu");
        user2.setEmail("tu@gmail.com");
        user2.setPassword("123");
        userList.add(user2);

        userList = new ArrayList<>();
        User user3 = new User();
        user3.setName("Trang");
        user3.setAge(24);
        user3.setAccount("trang");
        user3.setEmail("trangw@gmail.com");
        user3.setPassword("123");
        userList.add(user3);
    }
    public static User checkLogin(Login login)
    {
        for (User user : userList)
        {
            if(user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword()))
            {
                return user;
            }
        }
        return null;
    }
}

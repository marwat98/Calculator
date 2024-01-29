package calculator;


import org.mindrot.jbcrypt.BCrypt;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    String login;
    String password;

    public Map<String,String> users = new HashMap();

    public void addUser(String login, String password){
        this.login = login;
        this.password = password;
        String hashPass = BCrypt.hashpw(password,BCrypt.gensalt());
        users.put(login,password);
    }
    public boolean checkPassword(String login, String password){
        this.login = login;
        this.password = password;
        String checkUser = users.get(login);
        return checkUser != null && BCrypt.checkpw(password,checkUser);
    }


}


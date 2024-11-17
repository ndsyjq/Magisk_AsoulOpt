package project;

import java.util.ArrayList;

public class Login {
    private static ArrayList<String []> userList;
    public Login() {
        userList = new ArrayList<>();
    }
    public static void register(String username, String password) {
        if(userList==null){
            userList = new ArrayList<>();
        }
        for (String[] strings : userList) {
            if (strings[0].equals(username)) {
                System.out.println(strings[0] + "用户已存在，请重新注册");
                return;
            }
        }
        System.out.println("注册成功");
        userList.add(new String[] {username, password});
    }
    public static boolean login(String username, String password) {
        if(userList==null){
            userList = new ArrayList<>();
        }
        for (String[] strings : userList) {
            if (strings[0].equals(username) && strings[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}

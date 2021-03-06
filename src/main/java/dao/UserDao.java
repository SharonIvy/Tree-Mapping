package dao;

import models.Clan;
import models.Users;

import java.util.List;

public interface UserDao {
    //create
    void add(Users user);
    void joinClan(Users user, Clan clan);

    //read
    byte[] getUserSalt(String username);
    List<Users> allUsers();
    Users findUser(int userId);
    int getTreesPlanted(int userId);
    String findPasswordById(int userId);

    //update
    void updateUsername(Users user);
    void updatePassword(Users user);
    void updateEmail(Users user);
    void updateDisplayName(Users user);
    void updateTreesPlanted(Users user);

    //delete

}

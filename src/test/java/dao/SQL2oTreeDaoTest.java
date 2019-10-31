package dao;

import models.Tree;
import models.Users;
import org.eclipse.jetty.server.Authentication;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SQL2oTreeDaoTest {
    private Sql2oUserDao userDao = new Sql2oUserDao();
    private SQL2oTreeDao treeDao = new SQL2oTreeDao();

    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void treeGetsId(){
        Tree tree = newTree();
        System.out.println(tree.getId());
        assertNotEquals(0,tree.getId());
    }

    @Test
    public void userCanPlantTree_true() throws Exception{
        Users user = newUser();
        System.out.println("Tree counter: " +user.getTrees_planted());
        Tree tree = newTree();
        userDao.plantNewTree(user,tree,"s-23498j34","24n234-234");
    }




    /*------------HELPERS------------*/
    private Users newUser() throws Exception{
        Users user = new Users("username","asdf");
        userDao.add(user);
        return user;
    }

    private Users newUser2() throws Exception {
        Users user = new Users("anotherusername","1234");
        userDao.add(user);
        return user;
    }

    private Tree newTree(){
        Tree tree = new Tree("Moringa","Arabuko sokoke");
        treeDao.addTree(tree);
        return tree;
    }

}
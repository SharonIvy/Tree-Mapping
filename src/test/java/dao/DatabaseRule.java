package dao;

import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource {
    // TODO: 10/29/19 Change database credentials after merging
    protected void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/tree_mapping_test","nick","00000000");
    }

    protected void after(){
        /*try(Connection con = DB.sql2o.open()) {
            String deleteUsers = "DELETE FROM users *;";
            String deleteTrees = "DELETE FROM trees *;";
            String deleteTreesPlaned = "DELETE FROM trees_planted *;";
            con.createQuery(deleteUsers).executeUpdate();
            con.createQuery(deleteTrees).executeUpdate();
            con.createQuery(deleteTreesPlaned).executeUpdate();
        }*/
    }

}

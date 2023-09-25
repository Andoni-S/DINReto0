/**
 * The DBModelImplementation class is an implementation of the Model interface.
 * It represents a model that interacts with a database to retrieve greeting information.
 * This class currently throws an UnsupportedOperationException for the 'getGreeting' method, indicating that it's not yet implemented.
 *
 * @authors Andoni Sanz, Ander Goirigolzarri Iturburu
 */
package model;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBModelImplementation implements Model {

    protected Connection con;
    protected PreparedStatement stmt;
    protected DBConnection conController = new DBConnection();
    protected ResultSet rs;

    @Override
    public String getGreeting() {
        rs = null;
        String greet = null;
        try {
            con = conController.openConnection();
            String OBTAINgreeting = "SELECT greeting FROM HELLOWORLD";

            stmt = con.prepareStatement(OBTAINgreeting);
            rs = stmt.executeQuery();

            if (rs.next()) {
                greet = new String(rs.getString("greeting"));
            }
            conController.closeConnection(stmt, con);
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        return greet;
    }
}

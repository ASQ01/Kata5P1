import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Kata5P1 {
    public static void main(String[] args){
        String url = "jdbc:sqlite:KATA5.db";
        String sql = "SELECT * FROM PEOPLE";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()){
                System.out.println(result.getInt("Id") + "\t" +
                        result.getString("Name") + "\t" +
                        result.getString("Apellidos") + "\t" +
                        result.getString("Departamento") + "\t");
            }
        }

        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
import java.io.IOException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Kata5P1 {
    public static void main(String[] args) throws IOException{
        String sql = "INSERT INTO EMAIL(direccion) VALUES(?)";
        String url = "jdbc:sqlite:KATA5.db";
        Connection conn = null;
        List<String> emails = MailListReader.read("email.txt");
        
        try{
            conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            for (String email : emails) {
                pstmt.setString(1, email);
                pstmt.executeUpdate();
            }
        }
        
        catch(SQLException e){
            
        }
        
    }
}
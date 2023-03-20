import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;

public class TestCollection {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setServerName("LAPTOP-R8H9E9G1");
        ds.setPortNumber(1433);
        ds.setDatabaseName("LIENKET1");
        ds.setEncrypt(false);
        try (Connection conn = ds.getConnection()){
            System.out.println("Connection Success!!");
            System.out.println(conn.getMetaData());
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

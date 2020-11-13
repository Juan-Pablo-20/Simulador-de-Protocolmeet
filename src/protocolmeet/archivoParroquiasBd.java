package protocolmeet;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class archivoParroquiasBd {
    public static void main(String[] args) throws SQLException{
        String archivoDos = "jdbc:h2:./baseParroquias";
        
        ConnectionSource conexion2 = new JdbcConnectionSource(archivoDos);
        
        TableUtils.createTableIfNotExists(conexion2, parroquia.class);
    }
}

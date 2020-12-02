package protocolmeet;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class archivoDataBaseField {
    public static void main(String[] args) throws SQLException{
        String archivo = "jdbc:h2:./baseDatosPerson";
        
        ConnectionSource conexion = new JdbcConnectionSource(archivo);
        
        TableUtils.createTableIfNotExists(conexion, persona.class);
    }
}

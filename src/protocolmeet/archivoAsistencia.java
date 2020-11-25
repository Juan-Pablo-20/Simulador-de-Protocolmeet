package protocolmeet;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class archivoAsistencia {

    public static void main(String[] args) throws SQLException {
        String archivo3 = "jdbc:h2:./baseDatosAsistence";

        ConnectionSource conexion3 = new JdbcConnectionSource(archivo3);

        TableUtils.createTableIfNotExists(conexion3, asistencia.class);
    }
}

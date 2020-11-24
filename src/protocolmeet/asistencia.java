package protocolmeet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class asistencia {

    @DatabaseField (id = true)
    private String name;
    @DatabaseField
    private String lugar;
    @DatabaseField
    private String fecha;
    @DatabaseField
    private String hour;

    /*el id sera el nombre, cuando se muestren las reservas registradas se mostrara
   por persona, es decir, las reservas de cada persona. La base de datos de asistencia
    registrara nombre, lugar, fecha y hora y para mostrar las reservas se mostraran
    esos datos segun el nombre de la persona registrada. Es como cuando muestro
    los estudiantes segun su horarios
    */
    
    public asistencia(String name, String lugar, String fecha, String hour) {
        this.name = name;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}

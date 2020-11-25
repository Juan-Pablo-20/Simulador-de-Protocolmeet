package protocolmeet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

@DatabaseTable
public class asistencia {

    @DatabaseField
    private String name;
    @DatabaseField  
    private String lugar;
    @DatabaseField
    private String fecha;
    @DatabaseField
    private String hour;
    @DatabaseField
    private boolean encuesta;
    @DatabaseField
    private double temp;
    @DatabaseField (id = true)
    private String codigo;

    
    public asistencia(String name, String lugar, String fecha, String hour, boolean encuesta, double temp, String codigo) {
        this.name = name;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hour = hour;
        this.encuesta = encuesta;
        this.temp = temp;
        this.codigo = codigo;
    }
    
    public asistencia(){
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
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isEncuesta() {
        return encuesta;
    }

    public void setEncuesta(boolean encuesta) {
        this.encuesta = encuesta;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}

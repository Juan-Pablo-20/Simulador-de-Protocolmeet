package protocolmeet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

@DatabaseTable
public class persona {

    @DatabaseField(id = true)
    private long cedula;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String passw;
    @DatabaseField
    private long celular;
    @DatabaseField
    private String correo;
    @DatabaseField
    private String direccion;
    @DatabaseField
    private String ciudad;
    @DatabaseField
    private double temp;
    @DatabaseField
    private String fechaM;
    @DatabaseField
    private String fechaR;
    @DatabaseField
    private String hora;
    @DatabaseField
    private boolean encuesta;

    public persona() {
    }

    public persona(long cedula, String nombre,String passw, long celular, String correo,
            String direccion, String ciudad, double temp, String fechaM,
            String fechaR, String hora, boolean encuesta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.passw = passw;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.temp = temp;
        this.fechaM = fechaM;
        this.fechaR = fechaR;
        this.hora = hora;
        this.encuesta = encuesta;
    }
    
    public long getCedula(){
        return cedula;
    }
    
    public void setCedula(long cedula){
        this.cedula = cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getPassw(){
        return passw;
    }
    
    public void setPassw(String passw){
        this.passw = passw;
    }
    
    public long getCelular(){
        return celular;
    }
    
    public void setCelular(long celular){
        this.celular = celular;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public double getTemp(){
        return temp;
    }
    
    public void setTemp(double temp){
        this.temp = temp;
    }
    
    public String getFechaM(){
        return fechaM;
    }
    
    public void setFechaM(String fechaM){
        this.fechaM = fechaM;
    }
    
    public String getFechaR(){
        return fechaR;
    }
    
    public void setFechaR(String fechaR){
        this.fechaR = fechaR;
    }
    
    public String getHora(){
        return hora;
    }
    
    public void setHora(String hora){
        this.hora = hora;
    }

    public boolean isEncuesta() { //parece que aca es is por lo que es un boolean
        return encuesta;
    }

    public void setEncuesta(boolean encuesta) {
        this.encuesta = encuesta;
    }
}

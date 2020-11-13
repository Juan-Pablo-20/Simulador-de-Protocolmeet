package protocolmeet;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class parroquia {
    @DatabaseField
    private String Diocesis;
    @DatabaseField
    private String nombreP;
    @DatabaseField
    private String parroco;
    @DatabaseField
    private long telefono;
    @DatabaseField
    private String correo;
    @DatabaseField
    private String direcc;
    @DatabaseField
    private int capc;
    @DatabaseField(id = true)
    private long nit;
    @DatabaseField
    private String pass;
    
    public parroquia(){
        //ES IMPORTANTE CREAR UN CONSTRUCTOR VACIO PARA QUE EL ARCHIVO DE LA BD FUNCIONE
    }

    public parroquia(String Diocesis, String nombreP, String parroco, long telefono, 
            String correo, String direcc, int capc, long nit, String pass) {
        this.Diocesis = Diocesis;
        this.nombreP = nombreP;
        this.parroco = parroco;
        this.telefono = telefono;
        this.correo = correo;
        this.direcc = direcc;
        this.capc = capc;
        this.nit = nit;
        this.pass = pass;
    }

    public String getDiocesis() {
        return Diocesis;
    }

    public void setDiocesis(String Diocesis) {
        this.Diocesis = Diocesis;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getParroco() {
        return parroco;
    }

    public void setParroco(String parroco) {
        this.parroco = parroco;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public int getCapc() {
        return capc;
    }

    public void setCapc(int capc) {
        this.capc = capc;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

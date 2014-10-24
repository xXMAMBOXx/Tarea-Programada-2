
import java.io.Serializable;
public class Cliente implements  Serializable {
    private String Nombre;
    private String Correo;
    private int Prioridad;
    private String tipo;
    private eMail email;
    Cliente(){
        this.Nombre=null;
        this.Correo=null;
        this.Prioridad=4;}
    Cliente(String nombre, String correo,int prioridad){
        this.Nombre=nombre;
        this.Correo=correo;
        this.Prioridad=prioridad;
        this.tipo=this.setTipo();
        this.email=new eMail(this.Nombre,this.tipo,this.Correo);
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getCorreo(){
        return this.Correo;
    }
    public int getPrioridad(){
        return Prioridad;
    }
    public void informarCliente(boolean YN,String logo){
        this.email.send(YN,logo);
    }
    public String horaAtendido(){
        return this.email.horaSend();
    }
    public String fechaAtendido(){
        return this.email.fechaSend();
    }
    private String setTipo(){
        if(this.Prioridad==0){
            return "Especial";}
        if(this.Prioridad==1){
            return "Adulto mayor";}
        if(this.Prioridad==2){
            return "Embarazada";}
        if(this.Prioridad==3){
            return "Corporativo";}
        else{
           return "Regular";}
    }
    public String getTipo(){
        return this.tipo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mambocoto
 */
public class Cliente {
    private String Nombre;
    private String Correo;
    private int Prioridad;
    private eMail email;
    Cliente(){
        this.Nombre=null;
        this.Correo=null;
        this.Prioridad=4;}
    Cliente(String nombre, String correo,int prioridad){
        this.Nombre=nombre;
        this.Correo=correo;
        this.Prioridad=prioridad;
         this.email=new eMail(this.Nombre,this.Prioridad,this.Correo);
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
}

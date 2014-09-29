
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mambocoto
 */
public class Banco {
    public class Cajero{
        private String temporal;
        private String nombre= "Cajero #";
        private  boolean status;//FALSE=NOLIBRE TRUE=LIBRE
        private String Stat;
        Cajero(){//REVISAR
            this.status=true;
        }
        public void setStatus(boolean stat){
            temporal=this.nombre;
            if (!stat){
                this.Stat=" Ocupado";
            }
            else{
                this.Stat=" Disponible";
            }
            this.status=stat;
            this.temporal+=Stat;
        }
        public boolean getStatus(){
            return this.status;
        }
        public void setNombre(int x){
            this.nombre+=Integer.toString(x);
            this.temporal=nombre+" Disponible";
        }
        public String getNombre(){
            return this.temporal;
        }
    }
    private Cajero actual;
    private String image;
    private String name;
    private int cajeros;
    Cajero[] Cajeros;
    public Banco(){
            this.cajeros=0;
            this.image=null;
            this.name=null;
    }
    public void setCactual(Cajero x){
        this.actual=x;
    }
    public Cajero getCactual(){
        return this.actual;
    }
    public void setCajeros(int x){
        this.cajeros=x;
        Cajeros=new Cajero[x];
        for(int i=0;x>i;i++){        
            Cajeros[i]=new Cajero();Cajeros[i].setNombre(i);
            System.out.println(Cajeros[i].getNombre()+" "+Cajeros[i].getStatus());
        }
    }
    public Cajero[] getCajeros(){
        return this.Cajeros;
    }
    public String [] getNombres(){
        String []nombres=new String[this.cajeros];
        for(int i=0;this.cajeros!=i;i++){
            nombres[i]=this.Cajeros[i].getNombre();
        }
        return nombres;
    }
    public int getNCajeros(){
        return this.cajeros;
    }
    public void setNombre(String nbanco){
        this.name=nbanco;}
    public String getNombre(){
        return this.name;
    }
    
    public void setImage(){
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Logo");
        FileNameExtensionFilter filter= new FileNameExtensionFilter("JPG, PNG & GIF","jpg","jpeg","png","gif");
        chooser.setFileFilter(filter);
        int seleccionado=chooser.showOpenDialog(null);
        try{
            ImageIcon image = new ImageIcon(chooser.getSelectedFile().getPath()); 
            File archivo= chooser.getSelectedFile();
            this.image= archivo.getAbsolutePath();
            System.out.println(image);
           
        }catch(Exception e){
            return;
    }}
    public String getImage(){
            return this.image;
        }
}

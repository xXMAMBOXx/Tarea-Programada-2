
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dia implements  Serializable {
    private class hora implements  Serializable{
        private int atendidos=0;
        private int regulares,corporativo,embarazada,Amayor,Especial;
        Date now = new Date(System.currentTimeMillis());
        private String hora;
        hora(){
        SimpleDateFormat hour = new SimpleDateFormat("HH");
        this.hora=hour.format(now);
        }
        public String getHora(){
            return this.hora;
        }
        public String getActual(){
            Date ahora = new Date(System.currentTimeMillis());
            SimpleDateFormat hour = new SimpleDateFormat("HH");
            return hour.format(ahora);
        }
        public void addCliente(int regulares,int corporativo,int embarazada,int Amayor,int Especial){
            this.atendidos++;
        }
        public int getAtendidos(){
            return this.atendidos;
        }
        public int getRegularesxHora(){
            return this.regulares;}
        public int getCorporativosxHora(){
            return this.corporativo;}
        public int getEmbrazadasxHora(){
            return this.embarazada;}
        public int getAmayorxHora(){
            return this.Amayor;}
        public int getEspecialxHora(){
            return this.Especial;}
        public int getTotalxHora(){
            return this.Amayor+this.Especial+this.corporativo+this.embarazada+this.regulares;
    }
    }
   
    private String fecha;
    private hora[] horas;
    private hora horaActual;
    private Lista Latendidos= new Lista();
    private int regulares,corporativo,embarazada,Amayor,Especial;
    SimpleDateFormat hour = new SimpleDateFormat("HH");
    public Dia(){
    horas=new hora[24];
    Date now = new Date(System.currentTimeMillis());
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    this.fecha=date.format(now);
    this.horaActual=new hora();
    regulares=0;corporativo=0;embarazada=0;Amayor=0;Especial=0;
    File archivo = new File("Días.obj");
    System.out.println("guardo dia? ");
    if(!archivo.exists()){this.Initguardar(); System.out.println("SIII");
    }
    
    }
    public void atendido(Cliente a){
        if(a.getPrioridad()==0){
            this.Especial++;}
        if(a.getPrioridad()==1){
            this.Amayor++;}
        if(a.getPrioridad()==2){
            this.embarazada++;}
        if(a.getPrioridad()==3){
            this.corporativo++;}
        if(a.getPrioridad()==4){
            this.regulares++;}
        System.out.print(!this.horaActual.getHora().equals(this.horaActual.getActual()));
        if (!this.horaActual.getHora().equals(this.horaActual.getActual())){
            System.out.print(Integer.parseInt(this.horaActual.getHora()));
           this.horas[Integer.parseInt(this.horaActual.getHora())]=this.horaActual;
           System.out.print(this.horas[0]);
           this.horaActual=new hora(); 
        }else{ this.horas[Integer.parseInt(this.horaActual.getHora())]=this.horaActual;}
        this.horaActual.addCliente(this.regulares,this.corporativo,this.embarazada,this.Amayor,this.Especial);
        this.Latendidos.add(a);
        System.out.println(Latendidos.getLast().getNombre()+" atendidos "+this.horaActual.getAtendidos()+" en hora "+this.horaActual.getHora());
    }
    public int getRegulares(){
        return this.regulares;}
    public int getCorporativos(){
        return this.corporativo;}
    public int getEmbrazadas(){
        return this.embarazada;}
    public int getAmayor(){
        return this.Amayor;}
    public int getEspecial(){
        return this.Especial;}
    public int getTotal(){
        return this.Amayor+this.Especial+this.corporativo+this.embarazada+this.regulares;
    }
    public void Initguardar(){
        Dia[] Dias=new Dia[365];
        Dias[0]=this;
        try{
        File archivo = new File("Días.obj");
        FileOutputStream filew=new FileOutputStream(archivo);
        ObjectOutputStream oos=new ObjectOutputStream(filew);
        oos.writeObject(Dias);System.out.println("guardo la lista de díasDguardados empezando");
        oos.close();}catch(Exception e){System.out.println("no guardo lista Días");}
    }
    public void guardar(){
        Dia[] Dguardados=this.leer();
        int total = 0;
        System.out.println("Antes");
        for(int j=0;Dguardados[j]!=null;j++){
            System.out.println("dia: "+Dguardados[j].fecha+"iteraciones"+j);
            total=j;
        }
        System.out.println("ULTIMAAA ENTRADA"+Dguardados[total].fecha);
        if(Dguardados[total].fecha.equals(this.fecha)){
           Dguardados[total]=this;
        }
        else if(!Dguardados[total].fecha.equals(new Dia().fecha)){
        Dguardados[total+1]=this;}
        try{
           File archivo = new File("Días.obj");
           FileOutputStream filew=new FileOutputStream(archivo);
           ObjectOutputStream oos=new ObjectOutputStream(filew);
           oos.writeObject(Dguardados);System.out.println("guardo la lista de días");
           oos.close();}catch(Exception e){System.out.println("no guardo lista Días");}
        System.out.println("DESPUES:"+Dguardados[total]);
        for(int j=0;Dguardados[j]!=null;j++){
            System.out.println("dia: "+Dguardados[j].fecha);
            
        }
    }
    public Dia[] leer(){
        try{
        File f = new File("Días.obj");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ios=new ObjectInputStream(fis);
        Dia[] Ldias=(Dia[])ios.readObject();
        return Ldias;
        }catch(Exception e){System.out.println("no leyo días");}
        return null;
    }
    public int horavshoraT(int d,int b){
        int nclientes=0;
        for(int a=0;a!=b;a++){
            System.out.println(this.horas[a]);
            if(this.horas[a]!=null){
            System.out.println(this.horas[a].getHora());
            nclientes+=this.horas[a].getAtendidos();}
             System.out.println(nclientes);
        }
        return nclientes;
    }
    public int horavshoraES(int d,int b){
        int especial=0;
        for(int a=0;a!=b;a++){
            System.out.println(this.horas[a]);
            if(this.horas[a]!=null){
            System.out.println(this.horas[a].getHora());
            especial+=this.horas[a].getEspecialxHora();}
             System.out.println(especial);
        }
        return especial;
    }
    public int horavshoraAM(int d,int b){
        int AM=0;
        for(int a=0;a!=b;a++){
            System.out.println(this.horas[a]);
            if(this.horas[a]!=null){
            System.out.println(this.horas[a].getHora());
            AM+=this.horas[a].getAmayorxHora();}
             System.out.println(AM);
        }
        return AM;}
     public int horavshoraEM(int d,int b){
        int embara=0;
        for(int a=0;a!=b;a++){
            System.out.println(this.horas[a]);
            if(this.horas[a]!=null){
            System.out.println(this.horas[a].getHora());
            embara+=this.horas[a].getAmayorxHora();}
             System.out.println(embara);
        }
        return embara;}
     public int horavshoraCO(int d,int b){
        int corpo=0;
        for(int a=0;a!=b;a++){
            System.out.println(this.horas[a]);
            if(this.horas[a]!=null){
            System.out.println(this.horas[a].getHora());
            corpo+=this.horas[a].getAmayorxHora();}
             System.out.println(corpo);
        }
        return corpo;}
     public int horavshoraRE(int d,int b){
        int reg=0;
        for(int a=0;a!=b;a++){
            System.out.println(this.horas[a]);
            if(this.horas[a]!=null){
            System.out.println(this.horas[a].getHora());
            reg+=this.horas[a].getAmayorxHora();}
             System.out.println(reg);
        }
        return reg;}
    public String[] listaDias(){
         Dia[] Dguardados=this.leer();
         String[] fechas=new String[Dguardados.length];
         for(int i=0;Dguardados[i]!=null;i++){
         fechas[i]=Dguardados[i].fecha;
         }
         return fechas;
    }
    public hora[] getHoras(){
        return this.horas;
    }
    public int nDias(){
        int contador=0;
        Dia[] Dguardados=this.leer();
        System.out.println(Dguardados.length);
        String[] fechas=new String[Dguardados.length];
        for(int i=0;Dguardados[i]!=null;i++){
             contador++;
         }
         return contador-1;
    }
    public boolean isToday(){
        System.out.println("es hoy"+this.fecha.equals(new Dia().fecha));
        if(this.fecha.equals(new Dia().fecha)){
            return true;
        }else return false;
    }
}

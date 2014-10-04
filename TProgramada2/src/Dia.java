
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dia {
    private class hora{
        private int atendidos=0;
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
        public void addCliente(){
            this.atendidos++;
        }
        public int getAtendidos(){
            return this.atendidos;
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
    }
    public void atendido(Cliente a){
        if(a.getPrioridad()==1){
            this.Especial++;}
        if(a.getPrioridad()==2){
            this.Amayor++;}
        if(a.getPrioridad()==3){
            this.embarazada++;}
        if(a.getPrioridad()==3){
            this.corporativo++;}
        if(a.getPrioridad()==3){
            this.regulares++;}
        System.out.print(!this.horaActual.getHora().equals(this.horaActual.getActual()));
        if (!this.horaActual.getHora().equals(this.horaActual.getActual())){
            System.out.print(Integer.parseInt(this.horaActual.getHora()));
           this.horas[Integer.parseInt(this.horaActual.getHora())]=this.horaActual;
           System.out.print(this.horas[0]);
           this.horaActual=new hora(); 
        }else{ this.horas[Integer.parseInt(this.horaActual.getHora())]=this.horaActual;}
        this.horaActual.addCliente();
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
    public int horavshora(int d,int b){
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
    
}

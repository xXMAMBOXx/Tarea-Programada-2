
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Queue implements  Serializable {
    private int maxcapacity;
    private Cliente front;
    private Cliente rear;
    private Lista  list;
    public Queue(){
        this.list=new Lista();
        this.front=null;
        this.rear=null;
    }
    public void setMax(int x){
        this.maxcapacity=x;
    }
    
    public void queue(Cliente c){
        if(c.getPrioridad()==4){
            list.add(c);  }
        else{list.add(c);list.bubbleSort();System.out.println("ordena");}
        this.front=list.getFirst();this.rear=list.getLast();
    }
    public void dequeue(){
        this.list.deleteFirst();this.front=list.getFirst();this.rear=list.getLast();
    }
    public int lenght(){
        return this.list.getSize();
    }
    public void print(){
         list.ToString();
    }
    public Cliente getFront(){
        return this.front;
    }
    public Cliente getRear(){
        return this.rear;
    }
    public void saveQueue() {
        try{
        File archivo = new File("Queue.obj");
        FileOutputStream filew=new FileOutputStream(archivo);
        ObjectOutputStream oos=new ObjectOutputStream(filew);
        oos.writeObject(this);System.out.println("cantidad en cola: "+this.lenght());
        System.out.println("guardo la cola");
        oos.close();}catch(Exception e){System.out.println("no leyo la cola");}
    }
    public Queue readQueue(){
        try{
        File f = new File("Queue.obj");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ios=new ObjectInputStream(fis);
        Queue queue=(Queue)ios.readObject();System.out.println("Cola "+queue.front.getNombre());
        queue.ver();
        return queue;
        }catch(Exception e){System.out.println("no leyo la cola");}
       return null;
    }
    public void deleteFile(){
    System.out.println(this.lenght());
    File archivo = new File("Queue.obj");    
    if (this.lenght()==0){archivo.delete();System.out.println("SE BORRO NO HAY NAdA");return;}
        
    }
    public void ver(){
        this.list.ToString();
    }
}

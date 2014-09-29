/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mambocoto
 */
public class Queue {
    private int maxcapacity;
    private Cliente front;
    private Cliente rear;
    private Lista  list;
    Queue(){
        this.list=new Lista();
        this.front=null;
        this.rear=null;
    }
    public void setMax(int x){
        this.maxcapacity=x;
    }
    
    public void queue(Cliente c){
        if(c.getPrioridad()==5){
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
    
}

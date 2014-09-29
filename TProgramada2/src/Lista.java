/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mambocoto
 */
public class Lista {
    private class Nodo{
        private Cliente data;
        private Nodo next;
        private Nodo previous;
        
    public Nodo(Cliente data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }
    public Cliente getData(){
        return this.data;
    }
    public void setNext(Nodo x){
        this.next=x;
    }
    public void setPrevious(Nodo y){
        this.previous=y;
    }
    public Nodo getNext(){
        return this.next;
    }
    public Nodo getPrevious(){
        return this.previous;
    }
    public void setData(Cliente o){
        this.data=o;
    }
    public void exchange(Nodo x){
        Cliente t=new Cliente();
        t=x.getData();
        x.setData(this.getData());
        this.setData(t);
    }
    }
    private int size;
    private Nodo first;
    private Nodo last;
    private Nodo actual;
    
    public Lista(){
        this.size=0;
        this.first=null;
        this.last=null;
        this.actual=null;
    }
    public void add(Cliente o){
        Nodo node=new Nodo(o);
        if(this.size==0){
            this.first=node;
            this.last=node;
            this.actual=node;}
        else{
            this.last.setNext(node);
            node.setPrevious(this.last);
            this.last=node;this.actual=node;}
        size++;}
    public int getSize(){
        return this.size;
    }
    public void deleteFirst(){
        if(this.size--==1){
            this.first=null;
            this.last=null;
            this.actual=null;
            return;
        }
        this.first=this.first.getNext();
        this.first.setPrevious(null);
    }
    public Object getDataActual(){
        if (actual!=null){
           this.actual.getData(); 
        }
        return null;
    }
    public Cliente getFirst(){
        if (this.size!=0){
            return this.first.getData();}
        return null;
        }
    public Cliente getLast(){
        if (this.size!=0){
            return this.last.getData();}
        return null;
        }
    public void moveToFirst(){
        this.actual=this.first;
    }
    public void bubbleSort(){
        boolean flag;
        this.moveToFirst();
        for (int i=0;i!=this.size-1;i++){
            flag=true;
            this.moveToFirst();
            for(int j=0;this.size-1!=j;j++){
                if (this.actual.data.getPrioridad()>this.actual.getNext().getData().getPrioridad()){
                    flag=false;
                    this.actual.exchange(actual.getNext());}
                if(flag&&actual.next.getNext()==null){
                    return;}
                this.actual=this.actual.getNext();
            }
        }
    }
    
    public void ToString(){
        this.moveToFirst();
        for(int i=0;i!=this.size;i++){
            System.out.println(this.actual.getData().getNombre()+"  "+this.actual.getData().getPrioridad());
            this.actual=this.actual.getNext();
        }    
    }

}


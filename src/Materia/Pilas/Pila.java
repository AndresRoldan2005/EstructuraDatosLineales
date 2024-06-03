package Materia.Pilas;



import Materia.Models.Node;

public class Pila {
    private Node top;

    public Pila() {
        top = null;
        
    }

    // Push agregar elemetno a la pila//

    public void push (int value){
        Node nuevoNode = new Node(value);
        nuevoNode.next = top;
        top = nuevoNode;
    }
    public int pop(){
        if (top == null){
            System.out.println("la pila esta vacia");
            return 0;
            
        }else{
            int value = top.value;
            top = top.next;

            return value;
        }
    }
        public int peek(){
         if (top == null){
             System.out.println("la pila esta vacia");
          }
         
        return top.value;
        

    }

    public boolean isEmpty(){
        return top == null;
    }
}
    


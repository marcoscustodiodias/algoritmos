
package algoritmos;


public class Algoritmos {

    public static void quadrado(double n) {
    
        double r = n * n;
    }
    
    public static double metade(double v) {
    
        double r = v / 2;
        return r;
    }
    
    
    public static void main(String[] args) {
        double raiz;
        raiz = Math.sqrt(15);
        
        System.out.println("A raiz é"+raiz);
        
        quadrado(15);
        
        double result;
        result = metade(15.9);
        
        System.out.println("Metade: "+metade(15));
        
    }
    
}

package fibonacci;




public class Fibonacci {

    
    
    
    public static void main(String[] args) {
    
        for (int i = 0; i < 40; i++) {
            System.out.println(isFibonacci(i)? i + " é um numero fibonacci " : i + " não é um numero fibonacci");
        }
    }
    
    static boolean fibonacciC(int i){
        int f = (int) Math.sqrt(i);
        return (f*f == i);
    }
    
    static boolean isFibonacci(int n){
        
        return fibonacciC(5*n*n +4) || fibonacciC(5*n*n - 4);
    }
    
    
}

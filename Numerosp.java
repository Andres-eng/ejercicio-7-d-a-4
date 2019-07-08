import java.util.Scanner;
public class Numerosp{
public static void main(String[] args) {
        int sw=1;
        int suma =0;
        int x;
        Scanner teclado= new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero a calcular: ");
        n = teclado.nextInt();
        for(x=2;x<=n/2;x++){
            if(n%x==0){
                sw=1;
            }else if(sw==0){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
        }
    }
    
}

package unifatecie;
import java.util.Scanner;
public class Lista7ex5 {
    public static void main(String[] args){;
    Scanner imput = new Scanner(System.in);
    
    double n1 ,n2 , n3, n4, M, R;
    
        System.out.println("digite a primeira nota: ");
        n1 = imput.nextDouble();
        System.out.println("digite a segunda nota: ");
        n2 = imput.nextDouble();
        System.out.println("digite a terceira nota: ");
        n3 = imput.nextDouble();
        System.out.println("digite a quarta nota: ");
        n4 = imput.nextDouble();
        
        M = (n1+n2+n3+n4)/4;
        
        if(M >= 7.0){
            System.out.println("Aprovado com media "+M);
        }else if(M >= 4.0 && M < 7.0){
            System.out.println("Recuperação com média "+M);
            System.out.println("Digite a nota da recuperação: ");
            R = imput.nextDouble();
            if(R >= 5.0){
                System.out.println("Aprovado na recuperação com media "+R);
            
            }else
                System.out.println("Reprovado na recuperação com media "+R);
            
            
        }else if(M < 4.0){
            System.out.println("Reprovado com media"+ M);

        }
    }
}

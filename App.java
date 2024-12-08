/**
* Metodo principal
* @author Marcus
* @since 07-12-24 at 21:52
*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        
        System.out.println("Digite o seu número de matrícula:");
        String matricula = scan.nextLine();
        
        System.out.println("Digite a sua primeira nota:");
        double n1 = scan.nextDouble();
        
        System.out.println("Digite a sua segunda nota:");
        double n2 = scan.nextDouble();
        
        System.out.println("Digite a sua terceira nota:");
        double n3 = scan.nextDouble();
        
        System.out.println("Digite a sua quarta nota:");
        double n4 = scan.nextDouble();
        
        Aluno aluno = new Aluno(nome, matricula,n1 ,n2 ,n3 ,n4);
        
        aluno.situacaoAluno();
        
        scan.close();
    }
}

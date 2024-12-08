/**
 * Classe para objetos do tipo aluno.
 * @author Marcus Vinícius Nunes Silva
 * @since 07-12-24 at 10:25
 */

public class Aluno
{
    private String nome;
    private String matricula;
    private double n1;
    private double n2;
    private double n3;
    private double n4;

    /**
     * Construtor que inicializa as informações do aluno.
     * @param nome Nome do aluno.
     * @param matricula Matrícula do aluno.
     * @param n1 Nota 1 do aluno.
     * @param n2 Nota 2 do aluno.
     * @param n3 Nota 3 do aluno.
     * @param n4 Nota 4 do aluno.
     */
    public Aluno(String nome, String matricula, double n1, double n2, double n3, double n4) {
    this.nome = nome;
    this.matricula = matricula;
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    this.n4 = n4;
    }

    /**
     * Método para retornar a matrícula do Aluno.
     * @return String numero da matricula
     */
    public String getMatricula() {
        return this.matricula;
    }

    /**
     * Método para retornar o nome do Aluno.
     * @return String nome da aluno
     */
    public String getNome() {
        return this.nome;
    }
    
    /**
     * Método para retornar a nota 1 do aluno.
     * @return double nota 1
     */
    public double n1() {
        return this.n1;
    }

    /**
     * Método para retornar a nota 2 do aluno.
     * @return double nota 2
     */
    public double n2() {
        return this.n2;
    }

    /**
     * Método para retornar a nota 3 do aluno.
     * @return double nota 3
     */
    public double n3() {
        return this.n3;
    }

    /**
     * Método para retornar a nota 4 do aluno.
     * @return double nota 4
     */
    public double n4() {
        return this.n4;
    }
    /**
     * Método para calcular a média do aluno.
     * @return calculo media
     */
    public double calculoMedia() {
        return (n1 + n2 + n3 + n4) / 4;
    }
    /**
     * Método para fazer a validação da situação do aluno.
     */
    public void situacaoAluno() {
        double media = calculoMedia();
        System.out.println("A média do aluno " + nome + " foi:" + media);
        if (media >= 6.0) {
            System.out.println("Parabéns " + this.nome + " você foi aprovado(a):)");
        }
        else {
            System.out.println(this.nome + " você foi reprovado(a);(");
        }
    }  
}

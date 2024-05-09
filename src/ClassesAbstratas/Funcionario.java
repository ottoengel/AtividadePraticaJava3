package ClassesAbstratas;

public abstract class Funcionario{
    
    private String nome;
    private int matricula;
    private float valHora;
    private int hrsTrabalhadas;

    
    public Funcionario(){

    }

    public Funcionario(String nome, int matricula, float valHora, int hrsTrabalhadas) {
        this.nome = nome;
        this.matricula = matricula;
        this.valHora = valHora;
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getValHora() {
        return valHora;
    }
    public void setValHora(float valHora) {
        this.valHora = valHora;
    }
    public int getHrsTrabalhadas() {
        return hrsTrabalhadas;
    }
    public void setHrsTrabalhadas(int horasTrabalhadas) {
        this.hrsTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nMatricula: " + matricula;
    }
    
    public abstract float calcularSalario();
}
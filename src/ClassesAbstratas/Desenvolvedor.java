package ClassesAbstratas;
import Interface.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel{

    private String tecDomina;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, int matricula, float valHora, int hrsTrabalhadas,
            String tecDomina) {
        super(nome, matricula, valHora, hrsTrabalhadas);
        this.tecDomina = tecDomina;
    }

    public String getTecDomina() {
        return tecDomina;
    }
    public void setTecDomina(String tecDomina) {
        this.tecDomina = tecDomina;
    }


    @Override
    public float calcularSalario() {
        return (getHrsTrabalhadas() * getValHora());        
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Desenvolvedor" + "\nTecnologia que domina: " + tecDomina + "\nSalário: R$:" + calcularSalario();
    }
    @Override
    public String trabalhar() {
        return "O desenvolvedor " + getNome() + " está trabalhando no momento";
    }
    @Override
    public String relatarProgresso() {
        return"O desenvolvedor " + getNome() + " está finalizando o projeto.";
    }
}
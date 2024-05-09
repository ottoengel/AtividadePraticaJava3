package Sistema;
import ClassesAbstratas.Desenvolvedor;
import ClassesAbstratas.Estagiario;
import ClassesAbstratas.Gerente;

public class Sistema {

    private static String mensagemDefault()  {
        return "Opção inválida";
    }
    
    private static void menuPrincipal() {

        System.out.println("======================");
        System.out.println("\nSistema da Empresa");
        System.out.println("1 - Cadastrar:");
        System.out.println("2 - Remover:");
        System.out.println("3 - Listar:");
        System.out.println("4 - Buscar:");
        System.out.println("5 - Listar todos os funcionários do sistema:");
        System.out.println("0 - Sair:");
    }

    private static void menuFuncionarios(){
        System.out.println("\n================");
        System.out.println("\nCargo");
        System.out.println("1 - Gerente:");
        System.out.println("2 - Desenvolvedor:");
        System.out.println("3 - Estagiário:");
    }

    private static void cadastrarGerente(){

        System.out.println("\n================");
        System.out.println("\nCadastro de Gerente\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        int matricula;

        while (true) { 
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            if (Cadastro.buscarGerente(matricula) != null) {
                System.out.println("\nGerente " + matricula + " já está cadastrado!");
            } 
            else {
                break; 
            }
        }

        System.out.print("Valor da hora: ");
        float vlrHora = Console.lerFloat();
        System.out.print("Horas trabalhadas: ");
        int hTrab = Console.lerInt();
        System.out.print("Bônus: ");
        float bonus = Console.lerFloat();
        System.out.print("Equipe: ");
        String equipe = Console.lerString();

        Gerente g1 = new Gerente(nome, matricula, vlrHora, hTrab, bonus, equipe);
        Cadastro.cadastrarGerente(g1);
    }

    private static void cadastrarDesenvolvedor() {

        System.out.println("\n===============================");
        System.out.println("\nCadastro de Desenvolvedor\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        int matricula;
        
        while (true) { 
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            if (Cadastro.buscarDesenvolvedor(matricula) != null) {
                System.out.println("\nDesenvolvedor " + matricula + " já está cadastrado!");
            } 
            else {
                break; 
            }
        }

        System.out.print("Valor da hora: ");
        float vlrHora = Console.lerFloat();
        System.out.print("Horas trabalhadas: ");
        int hTrab = Console.lerInt();
        System.out.print("Tecnologias que domina: ");
        String tec = Console.lerString();

        Desenvolvedor d1 = new Desenvolvedor(nome, matricula, vlrHora, hTrab, tec);
        Cadastro.cadastrarDesenvolvedor(d1);
    }

    private static void cadastrarEstagiario() {

        System.out.println("\n===========================");
        System.out.println("\nCadastro de estagiário\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        int matricula;
        
        while (true) { 
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            if (Cadastro.buscarEstagiario(matricula) != null) {
                System.out.println("\nEstágiario " + matricula + " já está cadastrado!");
            } 
            else {
                break; 
            }
        }
        
        System.out.print("Valor da hora: ");
        float vlrHora = Console.lerFloat();
        System.out.print("Horas trabalhadas: ");
        int hTrab = Console.lerInt();
        System.out.print("Supervisor: ");
        String sup = Console.lerString();

        Estagiario e1 = new Estagiario(nome, matricula, vlrHora, hTrab, sup);
        Cadastro.cadastrarEstagiario(e1);

    }
    
    private static void removerGerente() {

        if(Cadastro.getListaGerente().size() == 0){
            System.out.println("Não há gerentes cadastrados!");
            return;
        }
        System.out.print("Matricula do gerente: ");
        int mat = Console.lerInt();
        Gerente g1 = Cadastro.buscarGerente(mat);
        if (g1 == null){
            System.out.println("Matricula não encontrada");
            return;
        }

        Cadastro.removerGerente(mat);
        System.out.println("Gerente removido com sucesso!");
    }

    private static void removerDesenvolvedor() {

        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.print("Matricula do desenvolvedor: ");
        int mat = Console.lerInt();
        Desenvolvedor d1 = Cadastro.buscarDesenvolvedor(mat);
        if (d1 == null){
            System.out.println("Matricula não encontrada");
            return;
        }
        Cadastro.removerDesenvolvedor(mat);
        System.out.println("Desenvolvedor removido com sucesso!");
    }

    private static void removerEstagiario() {

        if(Cadastro.getListaEstagiario().size() == 0){
            System.out.println("Não há estagiários cadastrados!");
            return;
        }
        System.out.print("Matricula do estagiário: ");
        int mat = Console.lerInt();
        Estagiario e1 = Cadastro.buscarEstagiario(mat);
        if (e1 == null){
            System.out.println("Matricula não encontrada");
            return;
        }
        Cadastro.removerEstagiario(mat);
        System.out.println("Estagiário removido com sucesso!");
    }



    private static void listarGerente() {
        if(Cadastro.getListaGerente().size() == 0){
            System.out.println("Não há gerentes cadastrados!");
            return;
        }
        System.out.println("\n====================");
        System.out.println("\nLista de Gerentes\n");
        for(Gerente temp : Cadastro.getListaGerente()){
            System.out.println(temp);
        }
    }

    private static void listarDesenvolvedor() {

        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.println("\n============================");
        System.out.println("\nLista de Desenvolvedores\n");
        for(Desenvolvedor temp : Cadastro.getListaDesenvolvedor()){
            System.out.println(temp);
        }
    }


    private static void listarEstagiario() {

        if(Cadastro.getListaEstagiario().size() == 0){
            System.out.println("Não há estagiários cadastrados!");
            return;
        }
        System.out.println("\n========================");
        System.out.println("\nLista de Estagiários\n");
        for(Estagiario temp : Cadastro.getListaEstagiario()){
            System.out.println(temp);
        }
    }


    private static void buscarGerente() {

        if(Cadastro.getListaGerente().size() == 0){
            System.out.println("Não há gerentes cadastrados!");
            return;
        }
        System.out.print("Matricula do gerente: ");
        int mat = Console.lerInt();
        Gerente g1 = Cadastro.buscarGerente(mat);
        if (g1 == null){
            System.out.println("Gerente não encontrado");
            return;
        }
        System.out.println(g1.toString());
        System.out.println(g1.trabalhar());
        System.out.println(g1.relatarProgresso());
    }



    private static void buscarDesenvolvedor() {

        if(Cadastro.getListaDesenvolvedor().size() == 0){
            System.out.println("Não há desenvolvedores cadastrados!");
            return;
        }
        System.out.print("Matricula do Desenvolvedor: ");
        int mat = Console.lerInt();
        Desenvolvedor d1 = Cadastro.buscarDesenvolvedor(mat);
        if (d1 == null){
            System.out.println("Desenvolvedor não encontrado");
            return;
        }
        System.out.println(d1.toString());
        System.out.println(d1.trabalhar());
        System.out.println(d1.relatarProgresso());
    }

    private static void buscarEstagiario() {

        if(Cadastro.getListaEstagiario().size() == 0){
            System.out.println("Não há estagiários cadastrados!");
            return;
        }
        System.out.print("Matricula do Estagiário: ");
        int mat = Console.lerInt();
        Estagiario e1 = Cadastro.buscarEstagiario(mat);
        if (e1 == null){
            System.out.println("Estagiário não encontrado");
            return;
        }
        System.out.println(e1.toString());
        System.out.println(e1.trabalhar());
        System.out.println(e1.relatarProgresso());
    }


    public static void executar() {

        int op;
        int op2;

        do {
            menuPrincipal();
            op = Console.lerInt();
            switch (op) {
                case 1:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            cadastrarGerente();
                            break;

                        case 2:
                            cadastrarDesenvolvedor();
                            break;

                        case 3:
                            cadastrarEstagiario();
                            break;

                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 2:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            removerGerente();
                            break;

                        case 2:
                            removerDesenvolvedor();
                            break;

                        case 3:
                            removerEstagiario();
                            break;

                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 3:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            listarGerente();
                            break;

                        case 2:
                            listarDesenvolvedor();
                            break;

                        case 3:
                            listarEstagiario();
                            break;

                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 4:
                    menuFuncionarios();
                    op2 = Console.lerInt();
                    switch (op2) {
                        case 1:
                            buscarGerente();
                            break;

                        case 2:
                            buscarDesenvolvedor();
                            break;

                        case 3:
                            buscarEstagiario();
                            break;

                        default:
                            System.out.println(mensagemDefault());
                            break;
                    }
                    break;

                case 5:
                    listarGerente();
                    listarDesenvolvedor();
                    listarEstagiario();
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println(mensagemDefault());
                    break;
            }

        } while (op != 0);
    }
    

}
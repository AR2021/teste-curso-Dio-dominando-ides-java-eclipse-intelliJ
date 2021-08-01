package br.com.dio;
/*Para impotar alT + ENTER*/

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro1 = new Livro("O problema dos 3 corpos " , 300);
        System.out.println(livro1);

/*        int a = 10;
        int b = 25;
        System.out.println("Hello world! "  + (a+b));*/

        /*Para imprimi SHIFT + F10*/
        /*   System.out.println(gato);para apagar a linea CPNTROL + Y */


    }
}
class Livro{
    private String nome;
    private Integer numPagina;

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}

/*        ATALHOS PRINCIPAIS
        REFACTORAR(SHIFT + F6)
        TELA COMPLETA DO EDITOR (SHIFT + F12)
        PARA ORGANIZAR MEU CODIGO (CONTRO + ALT + L)
        DUPLICAR LINEA (CONTRO + D)
        DELETAR (CONTROL . Y )
        PARA MOVER MINHA LINEA (CONTRO .SHIFT . SETA PARA CIMA OU PARA BAIXO)
        Geral

        Alt + 1: Focar aba de projetos
        Alt + Shift + Insert: Alterna entre modo de seleção de linha/coluna
        Ctrl + Shift + F12: Expandir a tela

        Na aba de projetos

        Alt + Insert: Para criar um novo arquivo

        Templates de código

        psvm: Criar método main
        sout: System.out.println()
        Ctrl + Alt + C: Cria constante (precisa estar sobre código que permite atribuição)
        Ctrl + Alt + F: Cria field - propriedade da classe (precisa estar sobre código que permite atribuição)
        Ctrl + Alt + V: Cria variável (precisa estar sobre código que permite atribuição)
        Ctrl + Alt + T: Templates de IF, for, while, etc (precisa selecionar o código antes)
        Ctrl + J: Exibe todos os templates disponíveis

        Na aba de código

        Ctrl + Y: Apaga a linha inteira
        Ctrl + D: Duplicar linha atual
        Alt + Shift + Setas: Mover linha atual
        Ctrl + Shift + Setas: Mover linha atual mantendo contexto
        Ctrl + Shift + A: Find Action - mostra todas as ações da IDE em uma lista
        Ctrl + N: Busca rápida de classes
        Ctrl + Shift + N: Busca rápida de arquivos
        Ctrl + B: Inspecionar elemento - go to class, method, declaration, etc
        Ctrl + Alt + L: Reformatar código
        Ctrl + Alt + M: Extrair método - transforma código selecionado em método
        Shift + F6: Renomeia classe, variável, método, etc
        Ctrl + Shift + F6: Usar referência de outra classe
        Shift & Shift: Search everywhere
        Ctrl + Shift + F: Busca por conteúdo de arquivo
        Alt + Enter: Intention actions
        Alt + Insert: Generate shortcut
        Ctrl + F12: Mostra a estrutura do arquivo - por exemplo, exibe métodos de uma classe
        Alt + F7: Find usages - mostra a lista de quem está chamando o método, usando a variável, etc
        Ctrl + G: Ir para linha
        Ctrl + H: Mostrar hierarquia da classe (classes pais)
        Alt + Home: Ir para a barra de navegação
        Ctrl + P: Mostrar parâmetros do método
        Ctrl + Q: Documentação rápida
        Ctrl + / ou Ctrl + Shift + /: Comentar código
        Ctrl + Shift + Alt + T: Métodos de refatoração
        Ctrl + Alt + O: Reajustar imports da classe (remove imports não utilizados)*/
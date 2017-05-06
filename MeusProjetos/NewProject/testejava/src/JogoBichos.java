
import javax.swing.JOptionPane;

public class JogoBichos {

    public static void main(String[] args) {


        //Cria��o da �rvore
        //Inser��o do bicho tubar�o na ra�z da �rvore
        NoBicho bichos = new NoBicho("Tubar�o", "vive embaixo d'�gua");
        
        //Inser��o do bicho Le�o � direita do Tubar�o
        bichos.insere(new NoBicho("Le�o", "sabe rugir"), NoBicho.DIRECAO.DIREITA);
        NoBicho bichoAtual = null;
                
        int resposta = 0; //resposta dos dialogs
        boolean fimDeJogo = false; //flag para marcar o fim do jogo
        int jogar = JOptionPane.YES_OPTION; //flag e resposta do usu�rio para iniciar o jogo e jogar novamente

        jogar = JOptionPane.showConfirmDialog(null, "Pense em um animal", "Animais", JOptionPane.YES_NO_OPTION);
        while (jogar == JOptionPane.YES_OPTION) {

           //escolhe a raiz da �rvore para ser o bicho inicial
            bichoAtual = bichos;
            fimDeJogo = false; //garante que ainda n�o � fim de jogo caso n�o seja a primeira rodada
            while (!fimDeJogo) {
                resposta = JOptionPane.showConfirmDialog(null, String.format("O animal %s?", bichoAtual.getDescricao()), "", JOptionPane.YES_NO_OPTION);

                
                if (resposta == JOptionPane.YES_OPTION) {
                    resposta = JOptionPane.showConfirmDialog(null, String.format("O animal � o(a) %s?", bichoAtual.getNome()), "", JOptionPane.YES_NO_OPTION);

                    
                    
                    if (resposta == JOptionPane.YES_OPTION) {
                        //ent�o o bicho pensado foi descoberto - fim de jogo
                        fimDeJogo = true;
                        JOptionPane.showMessageDialog(null, "Acertei!");
                        
                    } else {
                        //caso n�o haja mais bichos � esquerda - fim de jogo
                        // --> � necess�rio ent�o perguntar ao usu�rio qual o bicho que ele havia pensado
                        //caso haja mais bichos � esquerda, continuar a busca normalmente
                        fimDeJogo = bichoAtual.getEsquerda() == null;
                        bichoAtual = caminhaArvore(bichoAtual, NoBicho.DIRECAO.ESQUERDA);
                    }
                } else {
                    //O bicho tem outra caracter�stica, ent�o � preciso percorrer a �rvore � direita
                    //caso n�o haja mais bichos � direita - fim de jogo
                    // --> � necess�rio ent�o perguntar ao usu�rio qual o bicho que ele havia pensado
                    fimDeJogo = bichoAtual.getDireita() == null;
                    bichoAtual = caminhaArvore(bichoAtual, NoBicho.DIRECAO.DIREITA);
                }
            }
            
            jogar = JOptionPane.showConfirmDialog(null, "Vamos jogar novamente?", "Jogo dos animais", JOptionPane.YES_NO_OPTION);
        }


    }
    
    
    //respons�vel por percorrer a �rvore em uma das dire��es
    //caso chegue em um n� nulo, um novo bicho � inserido
    private static NoBicho caminhaArvore(NoBicho bicho, NoBicho.DIRECAO dir) {
        String nomeBicho = null;
        String descricaoBicho = null;
        NoBicho prox = null;

        //inicializa o prox de acordo com a dire��o a ser tomada
        prox = dir == NoBicho.DIRECAO.ESQUERDA ? bicho.getEsquerda() : bicho.getDireita();

        
        if (prox != null) {
            return prox;
        } else {
            nomeBicho = null;
            while (nomeBicho == null || nomeBicho.equals("")) {
                nomeBicho = JOptionPane.showInputDialog(null, "Qual o nome do animal que voc� pensou?", "Desisto!!!", JOptionPane.QUESTION_MESSAGE);
            }
            descricaoBicho = null;
            while (descricaoBicho == null || descricaoBicho.equals("")) {
                descricaoBicho = JOptionPane.showInputDialog(null, String.format("O(A) %s ___, mas o(a) %s n�o", nomeBicho, bicho.getNome()), "Complete, por favor", JOptionPane.INFORMATION_MESSAGE);                
            }
            prox = new NoBicho(nomeBicho, descricaoBicho);
            bicho.insere(prox, dir);
            return prox;
        }
    }
}

class NoBicho {

    private String nome;
    private String descricao;
    private NoBicho esquerda;
    private NoBicho direita;
    enum DIRECAO {

        ESQUERDA, DIREITA
    };
    

    //construtor da classe, espera o nome do bicho e a descricao
    public NoBicho(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        esquerda = null;
        direita = null;
    }

    //insere um novo bicho na dire��o indicada (esquerda ou direita)
    public void insere(NoBicho no, DIRECAO dir) {
        if (dir == DIRECAO.ESQUERDA) {
            setEsquerda(no);
        } else {
            setDireita(no);
        }

    }    
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NoBicho getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(NoBicho esquerda) {
        this.esquerda = esquerda;
    }

    public NoBicho getDireita() {
        return direita;
    }
    public void setDireita(NoBicho direita) {
        this.direita = direita;
    }

}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner scan = new Scanner(System.in);
     ListaJogos l = new ListaJogos();
     
     System.out.println("Adicionar jogo: ");
      String jg = scan.nextLine();
       l.setAdicionarJogos(jg);
 
       l.removerJogos(scan);

    

    }
 }

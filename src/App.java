import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner scan = new Scanner(System.in);
     ListaJogos l = new ListaJogos();
     Menu m = new Menu();
     int opcao = 0;

    m.menuPrincipal();
     opcao = scan.nextInt();
      scan.nextLine();
     
     while (opcao != 4) {
      switch (opcao) {
          case 1:

          l.setAdicionarJogos(scan);
           m.menuPrincipal();
            opcao = scan.nextInt();
          break;

          case 2: 
          l.removerJogos(scan);            
           m.menuPrincipal();
            opcao = scan.nextInt();
          break;
            
          case 3:        
          l.ExibirLista();
           m.menuPrincipal();
            opcao = scan.nextInt();    
            
          default:   
          if (opcao >= 5) {            
          System.out.println("====== OPÇÃO INVÁLIDA ======");
           m.menuPrincipal();
            opcao = scan.nextInt();   
          }
          
          break;
               
       }      
      }         
           System.out.println("Encerrando...");      
    }
   }

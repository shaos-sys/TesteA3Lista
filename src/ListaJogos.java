 import java.util.ArrayList;
  import java.util.Scanner;

  public class ListaJogos { 
  private ArrayList<String> lista = new ArrayList<>();
  public String jg;
  

     public void setAdicionarJogos( Scanner sc){

       do {
       System.out.println("Digite um jogo (ou 'N' para sair).");
       jg = sc.nextLine();
                   
       if (!jg.equalsIgnoreCase("N")) {
        lista.add(jg);
       }
  
        } while (!jg.equalsIgnoreCase("N"));
       }
  
     public void ExibirLista(){
      System.out.println("====== LISTA ======");
      System.out.println(lista);
      System.out.println("===================");
     }

     public void removerJogos (Scanner sc){
      System.out.println("====== REMOVER JOGO ======");  
      System.out.println("Informe a posição do jogo na lista a ser removido (começando do 0): ");
      System.out.println(lista);
      int i = sc.nextInt();

      try {
      lista.remove(i);   
      } catch(IndexOutOfBoundsException e) {
      System.out.println("ERRO! Posição inválida.");
      e.getMessage();
        
      }              
     }      
    }

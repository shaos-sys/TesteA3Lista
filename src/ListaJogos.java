 import java.util.ArrayList;
  import java.util.Scanner;

  public class ListaJogos { 
  private ArrayList<String> lista = new ArrayList<>();

     public void setAdicionarJogos(String jogo){
      lista.add(jogo);
      
     }
  
     public void getExibirLista(){
        System.out.println("====== LISTA ======");
        System.out.println(lista.size());
        System.out.println("===================");
     }

     public void removerJogos (Scanner sc){
      System.out.println("====== REMOVER JOGO ======");  
      System.out.println("Informe a posição do jogo na lista a ser removido: ");
       int i = sc.nextInt();

        try {
        lista.remove(i);   
        } catch(IndexOutOfBoundsException e) {
        System.out.println("ERRO! Posição inválida.");
        e.getMessage();
        
      }              
     }    
 }

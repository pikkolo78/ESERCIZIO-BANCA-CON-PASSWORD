import java.util.Scanner;
public class Banca
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    BankWithPassword contoCorrente= new BankWithPassword(26);
    System.out.println("Digita importo da versare in banca:");
    contoCorrente.versamento(input.nextInt());
    System.out.println("Digita l'importo da prelevare");
    contoCorrente.controlloPrelievo(input.nextInt());
    contoCorrente.controlloPassword(input.nextInt());
    /*System.out.println("Vuoi stampare il saldo? ");
    contoCorrente.stampaSaldo(input.next());*/


  }





}

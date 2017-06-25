import java.util.Scanner;
public class BankWithPassword

{
  private int password;
  private int fondoCassa;

  public BankWithPassword(int password)//creiamo un costruttore per creare un conto partendo da 0
  {
    this .password=password;
    this.fondoCassa=0;
  }
  public void versamento(int fondoCassa)// metodo per versare soldi nel conto
  {
    this.fondoCassa=this.fondoCassa+fondoCassa;
  }
  public boolean controlloPassword(int password)
  {
    if (this.password == password)
    {
    //System.out.println("Password esatta,Digita la somma da prelevare ") ;
    return true;
    }
    else
    {
    //System.out.println("Password errata,ripetere");
    return false;
    }
  }

  public void controlloPrelievo(int sommaPrelevata)
  {
    Scanner input= new Scanner(System.in);

    while(sommaPrelevata > this.fondoCassa)

    {
      System.out.println("Somma non disponibile");
      System.out.println("Digita somma");
      sommaPrelevata= input.nextInt();

    }
    System.out.println("Somma disponibile");
  }

  /*public void controlloPassword(int password)
  {
    while(this.password != password)
    {
      System.out.println("Password errata,ripetere");
    }
  }*/


  public void stampaSaldo(String saldo)
  {

    if (saldo.equals("si"))
    {
    System.out.println("Il tuo nuovo saldo e': "+this.fondoCassa);
    }
    else if (saldo.equals("no"))
    {
    System.out.println("Grazie e Arrivederci");
    }
    else if (!saldo.equals("si") && !saldo.equals("no"))
    {
      System.out.println("Risposta non corretta");
    }
  }











}

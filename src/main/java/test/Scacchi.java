package test;
import java.util.Scanner;

/*

Progetto scacchi versione 0.3.4
Progetto per Pawn e King

Progetto realizzato da:
    Picoco Mattia
    Fabiano Giuseppe
    Halim Daniel
    Aftohui Welid

*/
public class Scacchi 
{
    public static void main(String[] args)
    {
        //inizializzo Scanner e Scacchiera
        Scanner scanner = new Scanner(System.in);
        Scacchiera scacchiera = new Scacchiera();           //Scacchiera è la classe che gestisce le pedine
        //la inizializzo creando la schacchiera
        scacchiera.inizializzaScacchiera(); 

        //inizializzo il re
        King king = new King();
        boolean turno = true;
        //uso un while per creare possibili infiniti cicli di interazioni
        while (true) 
        {
            System.out.println("\nScegli una opzione:");
            System.out.println("1. Tutorial Gioco Scacchi");
            System.out.println("2. Tutorial Re");
            System.out.println("3. Gioca");
            System.out.println("0. Esci");
            int dato = scanner.nextInt();
            
            switch (dato) 
            {
                case 1:
                    System.out.println("\nScacchi - Tutorial");
                    System.out.println("Giocare a scacchi può essere all'inizio complesso e timoroso");
                    System.out.println("In realtà per giocare basta conoscere i movimenti basi delle pedine:");
                    System.out.println("\t- Regina");
                    System.out.println("\t- Cavallo");
                    System.out.println("\t- Torre");
                    System.out.println("\t- Alfiere");
                    System.out.println("\t- Re");
                    System.out.println("\t- Pedone");
                    System.out.println("Le pedine sono disposte sempre allo stesso modo");
                    System.out.println("Sono disposte all'interno della scacchiera");
                    System.out.println("\tLa scacchiera è composta da un quadrato di 8x8 caselle");
                    System.out.println("\tLe caselle sono alternate bianche e nere");
                    System.out.println("\tLe caselle hanno coordinate che variano da:");
                    System.out.println("\t\t a - h per le colonne");
                    System.out.println("\t\t 1 - 8 per le righe");
                    System.out.println("Inizia sempre il bianco, i giocatori si alternano nelle mosse");
                    System.out.println("Lo scopo del gioco è mettere sotto scacco matto il re");
                    break;
                case 2:
                    System.out.println("\nIl Re - Tutorial");
                    System.out.println("Il re e' la pedina più importante sulla scacchiera");
                    System.out.println("Ne e' presente solo uno per colore");
                    System.out.println("Il re può muoversi solo di 1 in ogni direzione");
                    System.out.println("\tSe messo sotto scacco matto la partita finisce");
                    System.out.println("\tnon vale punti e non può essere mangiato");
                    System.out.println("Il re può mangiare in ogni direzione di una casella");
                    System.out.println("Il re non può saltare pedine");
                    break;
                case 3:
                    while (true)
                    {
                    scacchiera.mostraScacchiera();                  //Metodo per stampare la scacchiera all'inizio di ogni mossa (ciclo)
            
                    //Prima richiesta per scegliere quale pedina muovere
                    System.out.println("\nInserisci le coordinate della pedina da muovere (ad esempio e2): ");
                    System.out.println("(per arrendersi al gioco o uscire inserire 0) ");
                    String coordinatePedina = scanner.next();
                    if (Character.getNumericValue(coordinatePedina.charAt(0))==0)
                    {
                        break;
                    }
                    int colonnaPedina = coordinatePedina.charAt(0) - 'a';                               //metodo che utilizzo per prendere il carattere della colonna
                    int rigaPedina = 8 - Character.getNumericValue(coordinatePedina.charAt(1));      //metodo che uso per rendere un char la cifra
                    
                    scacchiera.getPrimo(coordinatePedina);
                    /*
                    if che controlla se nella posizione indicata esista una pedina
                    si collega alla classe scacchiera
                    se nella posizione indicata è presente "-" allora sarà vuota e non valida
                    */
                    if (scacchiera.coordinateValide(rigaPedina, colonnaPedina)) 
                    {
                        char pedina = scacchiera.getPedina(rigaPedina, colonnaPedina);
                        if (pedina == '-') 
                        {
                            System.out.println("Non c'e' una pedina in quella posizione!");
                        }
                            else if (pedina == 'K' || pedina == 'k')            //controlla se è un re
                            {
                                if (pedina == 'K')
                                {
                                    if(turno == true)
                                    {
                                    turno = false;
                                    king.muovi(scacchiera, rigaPedina, colonnaPedina,pedina);       //usa il movimento del re
                                    }
                                    else 
                                    {
                                        System.out.println("Non e' il tuo turno !!");
                                    }
                                }
                                else if (pedina == 'k')
                                {
                                    if(turno == false)
                                    {
                                    turno = true;
                                    king.muovi(scacchiera, rigaPedina, colonnaPedina,pedina);       //usa il movimento del re
                                    }
                                    else 
                                    {
                                        System.out.println("Non e' il tuo turno !!");
                                    }
                                }
                                else 
                                {
                                    System.out.println("Non e' il tuo turno !!");
                                }     
                            } 
                        }   
                    }
                    
                case 0:
                    System.out.println("Uscita in corso...");
                    System.exit(0);
                default:
                    System.out.println("Dato inserito non valido, perfavore riprovare.");
            }
            
        }
    }
}
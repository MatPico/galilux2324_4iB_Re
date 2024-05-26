package test;

import java.util.Scanner;

class King 
{
    public void muovi(Scacchiera scacchiera, int rigaPedina, int colonnaPedina, char pedina) 
    {
        //inizializzo scanner e chiedo le cordinate di destinazione
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le coordinate per il movimento del re (ad esempio e4): ");
        String coordinateDestinazione = scanner.next();
        
        scacchiera.getSecondo(coordinateDestinazione);
        //li trasformo in dati validi per essere inseriti nel codice
        int colonnaDestinazione = coordinateDestinazione.charAt(0) - 'a';          //metodo che utilizzo per prendere il carattere della colonna
        int rigaDestinazione = 8 - Character.getNumericValue(coordinateDestinazione.charAt(1));     //metodo che uso per rendere un char la cifra
        
        /*
        Il re può muoversi di una sola posizione in ogni direzione
        Faccio quindi la differenza tra le direzioni per ottenere il dato di spostamento
        */
        int diffRighe = Math.abs(rigaDestinazione - rigaPedina);
        int diffColonne = Math.abs(colonnaDestinazione - colonnaPedina);
        
        char dato = scacchiera.getPedina(rigaDestinazione, colonnaDestinazione);    //prendo la pedina di destinazione dalla scacchiera
        
        if (pedina == 'K') //se è un re bianco
        {
            if ((diffRighe <= 1 && diffColonne <= 1) && (diffRighe != 0 || diffColonne != 0)) //controllo se compie un movimento valido per il re
            {
                if (dato == '-') //se la posizione di arrivo è vuota muove la pedina, oppure annulla e mostra un messaggio d'errore
                {
                    scacchiera.muoviPedina(rigaPedina, colonnaPedina, rigaDestinazione, colonnaDestinazione);   //movimento
                } 
                    else 
                    {
                        System.out.println("Movimento non valido! Casella occupata.");  //messaggio d'errore
                    }
            }
                else
                {
                    System.out.println("Movimento non valido!");                        //messaggio d'errore
                }
        }
  
        else if (pedina == 'k') //se è il re nero
        {
            if ((diffRighe <= 1 && diffColonne <= 1) && (diffRighe != 0 || diffColonne != 0)) //controllo se compie un movimento valido per il re
            {
                if (dato == '-') //se la posizione di arrivo è vuota muove la pedina, oppure annulla e mostra un messaggio d'errore
                {
                    scacchiera.muoviPedina(rigaPedina, colonnaPedina, rigaDestinazione, colonnaDestinazione);   //movimento
                } 
                    else 
                    {
                        System.out.println("Movimento non valido! Casella occupata.");  //messaggio d'errore
                    }
            }
                else
                {
                    System.out.println("Movimento non valido!");                        //messaggio d'errore
                }
        }
    }
}
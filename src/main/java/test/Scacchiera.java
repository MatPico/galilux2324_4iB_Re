package test;

import java.io.FileWriter;
import java.io.IOException;

class Scacchiera 
{
    /*
    dichiaro una matrice pubblica
    pubblica perchè così sara possibile usarla anche dalle altre classi
    matrice bidimensionale di tipo char[][] che si chiama scacchiera
    */
    public char[][] scacchiera = new char[8][8];
    String partenza;
    String arrivo;
    String partenza2;
    String arrivo2;
    int turno=1;
    /*
    metodo che inizializza la scacchiera riempiendola di trattini
    posiziona poi i pedoni con dei cicli for
    infine i 2 re usando le loro posizioni predefinite
    */
    public void inizializzaScacchiera() 
    {
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                if (i == 1) 
                {
                    scacchiera[i][j] = '-';
                } 
                else if (i == 6) 
                {
                    scacchiera[i][j] = '-';
                } 
                else 
                {
                    scacchiera[i][j] = '-';
                }
            }
        }
        scacchiera[7][4] = 'K';
        scacchiera[0][4] = 'k';
    }

    //stampa la scacchiera aggiornata usando un doppio ciclo 
    public void mostraScacchiera() 
    {
        for (int i = 0; i < 8; i++) 
        {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) 
            {
                System.out.print(scacchiera[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h"); //stampa la griglia delle colonne in modo indipendente
    }

    //controlla se le cordinate inserite siano all'interno della scacchiera
    public boolean coordinateValide(int riga, int colonna) 
    {
        return riga >= 0 && riga < 8 && colonna >= 0 && colonna < 8;
    }

    //metodo utilizzato per ottenere la pedina (in base alla posizione indicata) in una qualsiasi altra classe
    public char getPedina(int riga, int colonna) 
    {
        return scacchiera[riga][colonna];
    }

    /*
    metodo per muvoere definitivamente una pedina
    sovrascrive la posizione di destinazione utilizzando il dato della posizione di origine
    poi rimpiazza la posizione di origine con un trattino per indicare che lo spazio è vuoto
    */
    public void muoviPedina(int rigaPedina, int colonnaPedina, int rigaDestinazione, int colonnaDestinazione) 
    {
        char pedina = scacchiera[rigaPedina][colonnaPedina];            //pedina si riempie con la pedina all'origine
        scacchiera[rigaDestinazione][colonnaDestinazione] = pedina;     //la posizione di destinazione si riempie con la pedina
        scacchiera[rigaPedina][colonnaPedina] = '-';                    //la posizione di origine si riempie con un trattino
        this.Stampa();
    }
    
    public void getPrimo(String primo)
    {
        this.partenza = primo;
        if (turno%2 == 1)
        {
           this.partenza2 = this.partenza; 
        }  
    }
    
    public void getSecondo(String secondo)
    {
        this.arrivo = secondo;
        if (turno%2 == 1)
        {
          this.arrivo2 = this.arrivo;  
        }
    }
    
    public void Stampa()
    {         
        if (turno%2 == 0)
        {
            try (FileWriter filew = new FileWriter("Mosse.txt", true ))
            {
            filew.append("\n"+turno/2+".\t"+partenza2+arrivo2+"\t"+partenza+arrivo);
            } 
            catch (IOException e) 
            {
            System.out.println("Si è verificato un errore durante la stampa sul file ");
            e.printStackTrace();
            }
        }
            
        turno = turno + 1;
    }
    
}

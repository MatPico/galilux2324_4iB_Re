# Progetto scacchi - Re

Gruppo 4  
[01] Aftouhi Oualid  
[08] Fabiano Giuseppe  
[12] Halim Ayoub Meshrky Daniel  
[18] Picoco Mattia			4	discord admin

## Contiene Progetto King

-Parte di sviluppo del codice:   
Picoco Mattia    
Halim Daniel   
-Sviluppo delle relazioni:
Fabiano Giuseppe  
-Ragionamento sulle funzioni delle pedine:  
Aftohui Welid

-Il nostro progetto contiene contemporaneamente già Pawn che King, tenendoli in classi separate.   
il codice si basa su un array BiDimensionale che uso come scacchiera e che stampo continuamente.  
Utilizzo le lettere come segnaposto nella scacchiera e le classiche annotazioni (e5,b7,ecc..) per il movimento.

### -Errori conosciuti:  
1 mancanza di GUI

### -Traguardi raggiunti:  
1 scrivere il codice  
2 ideare un metodo di movimento e spazio per la scacchiera  
3 attuare il movimento in progetto  
4 permettere i movimenti completi delle pedine
5 turni in gioco  
6 tutorial  
7 registro delle mosse

## -Tutorial Scacchi:  
Giocare a scacchi può essere all'inizio complesso e timoroso
In realtà per giocare basta conoscere i movimenti basi delle pedine:  
- Regina  
- Cavallo  
- Torre  
- Alfiere  
- Re  
- Pedone

Le pedine sono disposte sempre allo stesso modo  
Sono disposte all'interno della scacchiera  
La scacchiera è composta da un quadrato di 8x8 caselle  
Le caselle sono alternate bianche e nere  
Le caselle hanno coordinate che variano da:  
- a - h per le colonne  
- 1 - 8 per le righe

Inizia sempre il bianco, i giocatori si alternano nelle mosse  
Lo scopo del gioco è mettere sotto scacco matto il re  

## -Tutorial Re:  
Il re e' la pedina più importante sulla scacchiera  
Ne e' presente solo uno per colore  
Il re può muoversi solo di 1 in ogni direzione  
Se messo sotto scacco matto la partita finisce  
non vale punti e non può essere mangiato  
Il re può mangiare in ogni direzione di una casella  
Il re non può saltare pedine  

## -Spiegazione codice:  
### -Scacchi:  
La classe scacchi.java è il main del progetto  
Utilizza le classi King.java e Scacchiera.java  
Le principali fasi del codice sono:  

1 inizializza tutti gli oggetti utilizzando le classi presenti e predisposte  
2 inizializza la scacchiera  
3 entra nel primo while e chiede quale funzione si voglia utilizzare:  (switch)  
- Tutorial = mostra il tutorial completo del gioco:
- Tutorial Pedone = mostra il tutorial specifico per il pedone:
- Tutorial Re = mostra il tutorial specifico per il re:
- Gioca = entra nella schermata di gioco effettiva:
- Esci = chiude il codice
 
4 se l'utente entra nella funzione gioca entra in un secondo while che conterrà la scacchiera;    
  ad ogni ciclo del while infatti verra stampato lo stato attuale della scacchiera.  
  Verrà poi chiesta quale casella si vuole scegliere (inserimento delle coordinate) e quindi quale pedina selezionare,  
  scelta la casella verrà controllato se il dato è valido e che pedina corrisponde a quella casella.  
  Trovata la pedina corrispondente si controlla con una variabile bool e con il peso della pedina se è il turno corretto.    
  (il bool alternerà true e false nei turni, durante i cicli true potrà solo muovere il bianco con le lettere maiuscole,  
  il nero viceversa)  
  Se il codice non da errore allora si mandano i dati alla classe del Pedone che tratterà il movimento.

![Scacchi](https://github.com/MatPico/galilux2324_4iB_Re/assets/160752254/227a8fbc-4a1a-45ab-b945-a75d1f727092)

### -Scacchiera:  
La classe Scacchiera.java si occupa di tutto quello che riguarda la scacchiera e le verifiche  
Contiene un array BiDimensionale che viene riempito con dei for  
La nomenclatura della nostra scacchiera usa "-" per le caselle vuote, le maiuscolo per il bianco e minuscole per il nero.  
Contiene principalmente metodi richiamabili da altre classi:  
- mostra la scacchiera
- controlla le coordinate
- muove la pedina (nel senso di sostituire i valori nell'array)
- trasmette (ricevute le coordinate) la pedina alla classe che la chiede

Scacchiera.java è un grande registro.

![Scacchiera](https://github.com/MatPico/galilux2324_4iB_Re/assets/160752254/504e3f73-e494-46a3-a9cb-8bfa79ad9fc7)

### -Re:  
La classe King.java si occupa delle regole del Re  
Il re infatti:  
- si muove in ogni direzione
- si muove sempre di 1 casella

Se le cordinate inviate rispettano i parametri allora avverrà il movimento (la sostituzione/sovrascrizione).

![King](https://github.com/MatPico/galilux2324_4iB_Re/assets/160752254/c1ca465a-cf82-4971-b9a3-a9fd6ef07f99)









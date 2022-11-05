import java.util.*;

public class Deck {

    public static void main(String[] args)
    {
        Card card = new Card();
            int colores = card.color.length;
            int palos = card.palo.length;
            int valores = card.valor.length;
            int n = palos * valores * colores;


        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < valores; i++) {
            for (int j = 0; j < palos; j++) {
                deck.add(card.palo[j]+ ", Rojo , " + card.valor[i]);
                deck.add(card.palo[j]+ ", Negro , " + card.valor[i]);
            }
        }

        Iterator<String> nombreIterator = deck.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" -- ");
        }
        suflle(deck);
        head(deck);
        pick(deck);
        hand(deck);
    }

    public static void suflle(ArrayList deck){

        ArrayList<String> values = deck;
        Collections.shuffle(values);
        System.out.println("\n\n********SE HA MEZCLADO EL DECK.**********");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
            String elemento = nombreIterator2.next();
            System.out.print(elemento+" - ");
        }
    }


    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas \n");
        System.out.println("------------------------------------");
    }



    public static void pick(ArrayList  deck){
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas \n");
        System.out.println("------------------------------------");
    }


    public static void hand(ArrayList deck){
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
}
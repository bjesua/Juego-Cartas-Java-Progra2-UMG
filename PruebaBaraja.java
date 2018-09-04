import java.util.*;

public class PruebaBaraja{

    private static Carta[] carta;
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static Control[] control;

    private static int  intentos = 0;

    private static int cartas = 53;
    private static int contadorCartaGen = 53;

    private static int contadorControl = 1;

    private static int ran;
    private static int ran2;

    public static void main(String[] args){

        carta = new Carta[cartas];
        for(int i = 1; i < cartas; i++){
//            System.out.println(i);
            if(i<=13){
                carta[i] = new Carta(i, "Corazon");
            }else if(i>13 && i<=26){
                b++;
                carta[i] = new Carta(b, "Espada");
            }else if(i>26 && i<=39){
                c++;
                carta[i] = new Carta(c, "Diamante");
            }else if(i>39){
                d++;
                carta[i] = new Carta(d, "Trebol");
            }
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("----------------------- Mazo generado ------------------------");
        System.out.println("--------------------------------------------------------------");

//        for(int i = 1; i<cartas; i++){
//            System.out.println( "Carta: "+ i + ").  " + carta[i].getRango() +" - "+ carta[i].getPalo() );
//        }

        PruebaBaraja pb = new PruebaBaraja();
        pb.generaRand();
//        while(contadorCartaGen > 0 ){
//
//        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("--------------- Seleccione si la carta siguiente es Mayor, Menor o Igual ---------------");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Mayor: 1");
        System.out.println("Menor: 2");
        System.out.println("Igual: 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------- Selección --------------------------");
        int seleccion = sc.nextInt();

        control = new Control[4];



        if(seleccion == 1){
            if(carta[ran].getRango()>ran2){
                control[contadorControl].setIntentos(intentos);
                control[contadorControl].setPunteo(intentos);
                intentos +=1;
            }else{
                System.out.println("Elección incorrecta...");
            }
        }else if(seleccion == 2){

        }else if(seleccion == 3){

        }else{
            System.out.println("No valido.");
        }







    }

    public static void generaRand(){
        Random aleatorio = new Random();
        ran = aleatorio.nextInt((51));
        ran2 = aleatorio.nextInt((51));
        
//        System.out.println( carta[ran].getRango() +" - "+ carta[ran].getPalo() );
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------- La carta ha sido generada --------------------");
        System.out.println("--------------------------------------------------------------");

    }

}
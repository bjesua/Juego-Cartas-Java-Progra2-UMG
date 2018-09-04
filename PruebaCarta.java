public class PruebaCarta{

    private static Carta[] carta;

    public static void main(String[] args){

        PruebaCarta pa = new PruebaCarta();
        pa.cartaQuemada();


    }

    public void cartaQuemada(){
        Carta ct = new Carta(4, "Corazones");
        System.out.println("Rango: "+ct.getRango() + " Palo: " + ct.getPalo());

    }



}
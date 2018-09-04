public  class Control{

    private int punteo = 0;
    private int intentos = 0;
    private int cartaSeleccion;
    private int rango;
    private String palo;

    public Control(){

    }

//    public Control(int pPunteo, int pIntentos){
//        punteo = pPunteo;
//        intentos = pIntentos;
//    }

    public void setPunteo(int pPunteo){
        punteo = pPunteo;
    }

    public int getPunteo(){
        return punteo;
    }

    public void setIntentos(int pIntentos){
        intentos = pIntentos;
    }

    public int getIntentos(){
        return intentos;
    }

    public void setCartaSeleccion(int pCartaSel){
        cartaSeleccion = pCartaSel;
    }

    public int getCartaSeleccion(){
        return cartaSeleccion;
    }

}
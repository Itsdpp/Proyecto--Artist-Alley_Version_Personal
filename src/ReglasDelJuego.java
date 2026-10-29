public class ReglasDelJuego {
    private Jugadores[] jugadores= new Jugadores[6];//cantidad de jugadores, editable (obviamente)
    private int rondas= 0;//con esto se llevaran las rondas del juego
    private int Comprador = 0;//

    public void GenerarComprador(){
        if (rondas < 6) {
            //para explicacion de este segmento en un txt aparte(ojala haber pensado en algo como eso, pero no conocia
            // la funcion math.floor)
            Comprador = (int) (Math.floor(Math.random() * ((35) - (10) + 1)) + (10));//obligatorio usar int, aunque floor
            // evite decimales
            rondas = rondas + 1;//lo ultimo que se debe hacer en cada turno
        } else {
            //metodo fin del juego ingresado aqui
        }
    }
    private void FinDelJuego(){


    }
}

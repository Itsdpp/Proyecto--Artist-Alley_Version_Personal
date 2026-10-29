import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Jugadores {
private String[] cartas = {"1","2","3","4","5","6","7","8","9","10","11","12"};
// guarda los valores de las cartas en string(tendra su sentido pronto)

private String[] cartasJugadas= new String[cartas.length];
//LET ME COOK

private int puntos = 0;
private BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

//primera vez que uso buffered reader, que lee todo directamente en string siempre

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //Se encarga de toda la verificacion de la carta(si no fue jugada o valores apropiados)
    public int UsarCarta(){
        int carta;//integer debido a que guardara el indice de la carta usada
        boolean ver = true;
        do {
            ver = true;
            Textos.EscribirLinea("por favor, escoja un numero para jugar");
            Textos.Escribir("[" + cartas[0] + ",");
            for (int i = 1; i < cartas.length - 1; i++) {//no revisa el primer elemento ni el ultimo
                Textos.Escribir(cartas[i] + ",");//genera todo el string excepto el primero y ultimo
            }
            Textos.EscribirLinea(cartas[cartas.length - 1] + "]");//tuve que revisar para hacer eso
            try {
                carta = Integer.parseInt(lector.readLine());
            } catch (IOException | NumberFormatException e) {//es posible hacer un multi-catch usando |, en estos casos, la e va al final.
                ver = false;
                Textos.EscribirLinea("Error de texto invalido, por favor escoja un numero.");
                throw new RuntimeException(e);
            }
            if (carta > cartas.length - 1 || carta < 0){//me aseguro que se coloque el indice de cartas correcto, si es mayor al indice o menor a 0
                ver = false;
            Textos.EscribirLinea("Por favor, escribir un valor valido");
            continue;//reinicia hasta
        }
            else{//si pasa el verificador y los catchs, se comprueba su valor
                boolean repetido = CartaJugada(cartas[carta-1]);//entra el valor cartas[valor de indice]
                //se resta uno, ya que de este forma entra en el indice correcto (1=index 0)
                //NOTA PERSONAL:
                // pensaba que debia ser un string[], pero como solo entra un valor de indice x
                //es string solamente.

                if (repetido==true){
                    Textos.EscribirLinea("Este numero ya lo jugo, porfavor escoja otro");
                    continue;//regresa al inicio
                }
                else//FINALMENTE LLEGUE AQUI, WOOOOOO
                {
                    int seleccion= Integer.parseInt(cartas[carta-1]);//coloco el valor en una variable aparte
                    cartas[carta-1]= Textos.tachar(cartas[carta-1]);//se tacha el texto dentro del indice, indicando que fue usada.
                 return seleccion;
                }
            }

        }while (!ver);//un while simple, si entra a una excepcion se vuelve false, se repite
        // y se vuelve true.

        return 35505;//en caso de que de alguna manera llegue aca, el valor regresado sera 35505, "ERROR" en numeros
    }//fin clase jugar_carta

    //se encarga de revisar si la carta fue jugada o no
    public boolean CartaJugada (String carta){
        for(int i=0;i<cartas.length;i++){
            if (cartasJugadas[i].equals(carta)){//el valor de ambas partes es igual,osea, se repitio el numero
                return true;
            }
        }
        return false;
    }
}

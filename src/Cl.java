//creacion hecha a base de codigo de:
// Keneth Benavidez 20-53-7089
// y
// Gabriel Ruiz 8-996-1074
// 10/06/2020
public class Cl {
    public static void clean() {//limpia toda la consola
        System.out.print("\033[H\033[2J");// Se limpia la consola
        System.out.flush();
    }

    public static void cleantimer(int x){//primero deja que pase un tiempo y luego limpia
        wait(x);
        clean();

    }
    public static void wait(int x){
        boolean verificador =true;
        while (verificador) {//se puede simplificar como verificador el verificador==true
            try {
                Thread.sleep(x);//x para la cantidad de milisegundos
                break;//acaba el while cuando se acaba el tiempo
            } catch (Exception e) {//en caso de cualquier error, aunque especificamente el: InterruptedException e
                System.out.println("error, se interrumpio la carga, reintentando");
            }
        }
    }


}

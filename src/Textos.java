public class Textos {
    //convierte el texto en uno tachado
    public static String tachar (String x){
        return "\\u001B[9m"+ x +"\\u001B[0m";
    }
    //atajo para system.out.print
    public static void Escribir(Object x){
     System.out.print(x);
    }
    //atajo para system.out.println
    public static void EscribirLinea (Object x){
        //Object, permite que cualquier tipo de dato entre
        System.out.println(x);
    }
}

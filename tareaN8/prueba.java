public class prueba{
    public static void main(String[] args){
        D obj = new D(1, 2, 3);
        obj.incrementaXZ();
        obj.incrementaYZ();
        obj.incrementaZ();     // Muestra de dónde se hereda
        obj.incrementaXYZ(); 
    }
}
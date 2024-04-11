package src;

 public class rectangulo1 {
    public int ancho;
    public int alto;
     public rectangulo1(int ancho, int alto) {
         this.ancho = ancho; this.alto = alto;
     }
     public int area() {
         return ancho *alto;
     }
     public int perimetro() {
         return 2 * ancho + 2 * alto;
     }
 }
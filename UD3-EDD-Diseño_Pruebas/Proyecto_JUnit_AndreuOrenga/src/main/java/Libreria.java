/**
 * @author Andreu Orenga
 */
public class Libreria {

        /**
         * Método de la categoría Métodos Numéricos
         * Calcula el factorial de un número entero positivo.
         * @author Andreu Orenga
         * @param n el número del que se calculará el factorial
         * @return el factorial de n
         * @throws IllegalArgumentException si n es negativo
         */
        public static int factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("El número debe ser positivo");
            }
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }

        /**
         * Invierte una cadena de texto.
         * Método de la categoría Métodos de Texto y Cadenas
         * @param texto la cadena de texto a invertir
         * @return la cadena de texto invertida
         */
        public static String invertir(String texto) {
            StringBuilder sb = new StringBuilder(texto);
            return sb.reverse().toString();
        }

        /**
         * Ordena un array de enteros de menor a mayor.
         * Método de la categoría Métodos de Arrays
         * @param array el array a ordenar
         */
        public static void ordenar(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        }

        /**
         * Comprueba si una cadena de texto es un email válido.
         * Método de la categoría Métodos de Validación y Autenticación
         * @param email la cadena de texto a comprobar
         * @return true si el email es válido, false en caso contrario
         */
        public static boolean validarEmail(String email) {
            // Expresión regular para validar el formato de un email
            String regex = "^[\\w-\\.\\+]+@([\\w-]+\\.)+[\\w-]{2,4}$";
            return email.matches(regex);
        }

        /**
         * Calcula la raíz cuadrada de un número real.
         *  Método de la categoría Métodos de Operaciones Matemáticas
         * @param x el número del que se calculará la raíz cuadrada
         * @return la raíz cuadrada de x
         * @throws IllegalArgumentException si x es negativo
         */
        public static double raizCuadrada(double x) {
            if (x < 0) {
                throw new IllegalArgumentException("El número debe ser positivo o cero");
            }
            return Math.sqrt(x);
        }

        /**
         * Genera un número aleatorio entre dos límites.
         *Método de la categoría Métodos Generales
         * @param min el límite inferior (inclusive)
         * @param max el límite superior (inclusive)
         * @return un número aleatorio entre min y max
         * @throws IllegalArgumentException si min es mayor que max
         */
        public static int aleatorio(int min, int max) {
            if (min > max) {
                throw new IllegalArgumentException("El mínimo debe ser menor o igual que el máximo");
            }
            return (int) (Math.random() * (max - min + 1) + min);
        }
    }



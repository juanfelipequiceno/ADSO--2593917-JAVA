import java.util.Scanner;
import java.io.IOException;

public class Ahorcado{
    
    private String palabra;
    private int intentos;
    private String[] letras;
    private boolean[] aciertos;
    
    public Ahorcado(String palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
        this.letras = new String[palabra.length()];
        this.aciertos = new boolean[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.letras[i] = Character.toString(palabra.charAt(i));
            this.aciertos[i] = false;
        }
    }
    
    private boolean validarLetra(String letra) {
        return letra.matches("[a-z]") && letra.length() == 1;
    }
    
    private boolean yaAdivinada(String letra) {
        for (int i = 0; i < this.letras.length; i++) {
            if (this.letras[i].equalsIgnoreCase(letra) && this.aciertos[i]) {
                return true;
            }
        }
        return false;
    }
    
    private boolean adivinarLetra(String letra) {
        boolean adivino = false;
        for (int i = 0; i < this.letras.length; i++) {
            if (this.letras[i].equalsIgnoreCase(letra)) {
                this.aciertos[i] = true;
                adivino = true;
            }
        }
        return adivino;
    }
    
    private boolean gano() {
        for (boolean acierto : this.aciertos) {
            if (!acierto) {
                return false;
            }
        }
        return true;
    }
    private String getPalabraAdivinada() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.letras.length; i++) {
            if (this.aciertos[i]) {
                builder.append(this.letras[i]).append(" ");
            } else {
                builder.append("_ ");
            }
        }
        return builder.toString();
    }
    public void jugar() {
        try { new ProcessBuilder("cmd","/c").inheritIO().start().waitFor();}catch(Exception e){}
        Scanner scanner = new Scanner(System.in);
        while (this.intentos > 0 && !this.gano()) {
            System.out.println("Palabra: " + this.getPalabraAdivinada());
            System.out.println("Intentos restantes: " + this.intentos);
            System.out.print("Ingrese una letra: ");
            String letra = scanner.next().toLowerCase();
            if (!this.validarLetra(letra)) {
                System.out.println("Letra inválida.");
            } else if (this.yaAdivinada(letra)) {
                System.out.println("Ya adivinaste esta letra.");
            } else if (this.adivinarLetra(letra)) {
                System.out.println("Adivinaste una letra!");
            } else {
                System.out.println("La letra no está en la palabra.");
                this.intentos--;
            }
            try { new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}catch(Exception e){}
        }
        if (this.gano()) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste. La palabra era " + this.palabra);
        }
    }
}

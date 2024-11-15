import java.util.Arrays;
import java.util.Scanner;

public class EserciziArray {
    
    // Esercizio 1: Dichiarazione e Inizializzazione
    public static void es1() {
        int[] array1 = new int[10];
        
        // Inizializzazione con i numeri da 1 a 10
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        // Stampa tutti gli elementi su una sola riga separati da spazio
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Esercizio 2: Calcolo di Media, Minimo e Massimo
    public static void es2() {
        int[] array2 = {15, 22, 8, 31, 42, 10, 5, 18, 35};
        
        // Calcolo della media
        int somma = 0;
        for (int num : array2) {
            somma += num;
        }
        double media = somma / (double) array2.length;
        System.out.println("Media: " + media);

        // Trova il minimo e il massimo
        int min = array2[0];
        int max = array2[0];
        for (int num : array2) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Minimo: " + min);
        System.out.println("Massimo: " + max);
    }

    // Esercizio 3: Ricerca in un Array
    public static void es3() {
        String[] array3 = {"Alice", "Bob", "Carol", "David", "Eve"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un nome da cercare: ");
        String nome = scanner.nextLine();
        
        boolean trovato = false;
        for (String s : array3) {
            if (s.equals(nome)) {
                trovato = true;
                break;
            }
        }

        if (trovato) {
            System.out.println("Il nome " + nome + " è stato trovato.");
        } else {
            System.out.println("Il nome " + nome + " non è stato trovato.");
        }
    }

    // Esercizio 4: Invertire un Array
    public static void es4() {
        int[] array4 = {10, 20, 30, 40, 50};
        
        // Invertire l'array
        int start = 0;
        int end = array4.length - 1;
        while (start < end) {
            int temp = array4[start];
            array4[start] = array4[end];
            array4[end] = temp;
            start++;
            end--;
        }

        // Stampa l'array invertito
        System.out.println("Array invertito: " + Arrays.toString(array4));
    }

    // Esercizio 5: Utilizzo di System.arraycopy()
    public static void es5() {
        int[] array5 = new int[10];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = i + 1;  // Numeri da 1 a 10
        }
        
        int[] arraySecondo = new int[5];
        
        // Copia i primi 5 elementi dell'array5 nell'arraySecondo
        System.arraycopy(array5, 0, arraySecondo, 0, 5);
        
        // Stampa il secondo array
        System.out.println("Secondo array dopo la copia: " + Arrays.toString(arraySecondo));
    }

    // Esercizio 7: Riempimento e Ordinamento con Arrays
    public static void es7() {
        int[] array7 = new int[5];
        
        // Riempi l'array con il valore 3
        Arrays.fill(array7, 3);
        
        // Modifica manualmente i valori
        array7[0] = 8;
        array7[1] = 3;
        array7[2] = 6;
        array7[3] = 1;
        array7[4] = 9;
        
        // Ordina l'array in ordine crescente
        Arrays.sort(array7);
        
        // Stampa l'array ordinato
        System.out.println("Array ordinato: " + Arrays.toString(array7));
    }

    public static void main(String[] args) {
        // Esecuzione degli esercizi
        System.out.println("Esercizio 1:");
        es1();
        System.out.println("\nEsercizio 2:");
        es2();
        System.out.println("\nEsercizio 3:");
        es3();
        System.out.println("\nEsercizio 4:");
        es4();
        System.out.println("\nEsercizio 5:");
        es5();
        System.out.println("\nEsercizio 7:");
        es7();
    }
}

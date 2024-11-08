import java.util.Scanner;

public class StringaOperazioni {

    // Funzione per verificare se la stringa è un palindromo
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Creiamo uno scanner per leggere l'input
        Scanner scanner = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire una stringa
        System.out.print("Inserisci una stringa: ");
        String str = scanner.nextLine();
        
        // Verifica che la stringa non sia vuota
        if (str.isEmpty()) {
            System.out.println("La stringa è vuota. Non è possibile eseguire le operazioni.");
            return; // Uscita dal programma se la stringa è vuota
        }
        
        // Calcolare e stampare la lunghezza della stringa
        int lunghezza = str.length();
        System.out.println("La lunghezza della stringa è: " + lunghezza);
        
        // Calcolare e stampare il carattere in posizione centrale
        int posizioneCentrale = lunghezza / 2;
        char carattereCentrale = str.charAt(posizioneCentrale);
        System.out.println("Il carattere in posizione centrale è: " + carattereCentrale);
        
        // Convertire in maiuscolo l'iniziale della stringa
        String inizialeMaiuscola = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println("Stringa con iniziale maiuscola: " + inizialeMaiuscola);
        
        // Contare il numero di occorrenze del carattere 'a' (sia minuscola che maiuscola)
        int occorrenzeA = 0;
        for (int i = 0; i < lunghezza; i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'a') {
                occorrenzeA++;
            }
        }
        System.out.println("Numero di occorrenze del carattere 'a': " + occorrenzeA);
        
        // Stampare la sottostringa dal primo al quarto carattere, se esistono
        if (lunghezza >= 4) {
            String sottostringa = str.substring(0, 4);
            System.out.println("La sottostringa dal primo al quarto carattere: " + sottostringa);
        } else {
            System.out.println("La stringa è troppo corta per avere una sottostringa dal primo al quarto carattere.");
        }
        
        // Stampare la stringa in maiuscolo
        System.out.println("La stringa in maiuscolo: " + str.toUpperCase());
        
        // Stampare la stringa in minuscolo
        System.out.println("La stringa in minuscolo: " + str.toLowerCase());
        
        // Verificare se la stringa è un palindromo
        if (isPalindrome(str)) {
            System.out.println("La stringa è un palindromo.");
        } else {
            System.out.println("La stringa NON è un palindromo.");
        }
        
        // Chiusura dello scanner
        scanner.close();
    }
}


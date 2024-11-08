import java.util.Scanner;

public class Programma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leggere due stringhe e verificare se sono uguali, ignorando maiuscole/minuscole
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();
        
        if (stringa1.equalsIgnoreCase(stringa2)) {
            System.out.println("Le stringhe sono uguali (ignorando maiuscole/minuscole).");
        } else {
            System.out.println("Le stringhe sono diverse.");
        }

        // 2. Leggere una stringa e convertirla in un numero intero (se possibile)
        System.out.println("\nInserisci una stringa da convertire in numero intero:");
        String numeroInteroString = scanner.nextLine();
        
        try {
            int numeroIntero = Integer.parseInt(numeroInteroString);
            System.out.println("Numero intero: " + numeroIntero);
        } catch (NumberFormatException e) {
            System.out.println("La stringa non è un numero intero valido.");
        }

        // 3. Leggere una stringa e convertirla in un numero decimale (se possibile)
        System.out.println("\nInserisci una stringa da convertire in numero decimale:");
        String numeroDecimaleString = scanner.nextLine();
        
        try {
            double numeroDecimale = Double.parseDouble(numeroDecimaleString);
            System.out.println("Numero decimale: " + numeroDecimale);
        } catch (NumberFormatException e) {
            System.out.println("La stringa non è un numero decimale valido.");
        }

        // 4. Leggere una frase e separarla in parole, stampando ciascuna parola su una riga separata
        System.out.println("\nInserisci una frase:");
        String frase = scanner.nextLine();
        String[] parole = frase.split("\\s+");
        System.out.println("Le parole nella frase sono:");
        for (String parola : parole) {
            System.out.println(parola);
        }

        // 5. Leggere una stringa e stampare i primi 5 caratteri
        System.out.println("\nInserisci una stringa per ottenere i primi 5 caratteri:");
        String stringaPerPrimi5 = scanner.nextLine();
        if (stringaPerPrimi5.length() >= 5) {
            System.out.println("I primi 5 caratteri: " + stringaPerPrimi5.substring(0, 5));
        } else {
            System.out.println("La stringa è troppo corta per avere 5 caratteri.");
        }

        // 6. Leggere una stringa e stampare gli ultimi 5 caratteri
        System.out.println("\nInserisci una stringa per ottenere gli ultimi 5 caratteri:");
        String stringaPerUltimi5 = scanner.nextLine();
        if (stringaPerUltimi5.length() >= 5) {
            System.out.println("Gli ultimi 5 caratteri: " + stringaPerUltimi5.substring(stringaPerUltimi5.length() - 5));
        } else {
            System.out.println("La stringa è troppo corta per avere 5 caratteri.");
        }

        // 7. Leggere una frase e separarla in parole, stampando la parola più lunga
        System.out.println("\nInserisci una frase per trovare la parola più lunga:");
        String frasePerParolaLunga = scanner.nextLine();
        String[] paroleLunghe = frasePerParolaLunga.split("\\s+");
        String parolaLunga = "";
        
        for (String parola : paroleLunghe) {
            if (parola.length() > parolaLunga.length()) {
                parolaLunga = parola;
            }
        }
        
        System.out.println("La parola più lunga è: " + parolaLunga);
        
        scanner.close();
    }
}

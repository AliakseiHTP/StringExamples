package by.kazak.string;

public class Task2StringBuilder {
    public static void main(String[] args) {
        String sAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String sText = "I like to sleep";
        StringBuilder sNewText = new StringBuilder();
        StringBuilder sNumberOfSymbols = new StringBuilder();

        for (int i = 0; i < sText.length(); i++) {
            char cSymbol = sText.toLowerCase().charAt(i);
            int iNumberOfLetterInAlphabet = sAlphabet.indexOf(cSymbol) + 1;
            if (cSymbol != ' ') {
                sNewText.append(cSymbol).append("  ");
                if(iNumberOfLetterInAlphabet >= 10) {
                    sNumberOfSymbols.append(iNumberOfLetterInAlphabet).append(" ");
                } else {
                    sNumberOfSymbols.append(iNumberOfLetterInAlphabet).append("  ");
                }
            } else {
                sNewText.append(cSymbol);
                sNumberOfSymbols.append(" ");
            }
        }
        System.out.println(sNewText);
        System.out.println(sNumberOfSymbols);
    }
}

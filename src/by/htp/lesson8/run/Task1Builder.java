package by.htp.lesson8.run;

public class Task1Builder {

	public static void main(String[] args) {
		String sText = "Hello! My name is Lesha. I am going to school";
        int k = 3;
        char cSymbol = '@';
        System.out.println(String.format("Text: %s", sText));
        System.out.println(String.format("New text: %s", replaceSymbol(sText, k, cSymbol)));
    }
 
    public static String replaceSymbol(String sText, int iIndex, char cSymbol) {
        StringBuilder sb = new StringBuilder();
        if (sText != null && sText.length() > 0 && iIndex > 0) {
            for (String sWord : sText.split(" ")) {
                if (sWord.length() >= iIndex) {
                    sb.append(sWord.substring(0, iIndex - 1)).append(cSymbol).append(sWord.substring(iIndex, sWord.length()));
                } else {
                    sb.append(sWord);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

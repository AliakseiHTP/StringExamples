package by.kazak.string;

public class Task3StringBuilder {
    public static void main(String[] args) {
        String sText = "She drank the paison, which brought her a pastman.", sSubstring = "pa", sReplacement = "po";
        StringBuilder sb = new StringBuilder(sText);
        int iPosition = sb.lastIndexOf(sSubstring);
        while (iPosition != -1) {
            sb.replace(iPosition, iPosition + sSubstring.length(), sReplacement);
            iPosition = sb.lastIndexOf(sSubstring);
        }
        System.out.println(String.format("Text: %s",sText));
        System.out.println(String.format("New text: %s",sb));
    }
}

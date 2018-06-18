package by.kazak.string;

public class Task7StringBuilder {
    public static void main(String[] args) {
        String sText = "bvdsjIOWF784)   565//@$fgwecx cvxcv,    vf4efZZ32dgfd erfewfg5432rtg";
        StringBuilder sNewText = new StringBuilder();
        char[] aChr = sText.toCharArray();
        for (char cCh : aChr) {
            if (Character.isLetter(cCh) || Character.isWhitespace(cCh))
                sNewText.append(cCh);
        }
        String[] aWords = sNewText.toString().split("\\s");
        sNewText = new StringBuilder();
        for (String s : aWords) {
            if (s.trim().length() > 0)
                sNewText.append(s).append(" ");
        }
        sNewText = new StringBuilder(sNewText.toString().trim());
        System.out.print(sNewText);
    }
}

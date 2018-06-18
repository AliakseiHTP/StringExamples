package by.htp.lesson8.run;

public class Task1String {

	public static void main(String[] args) {
		 // В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
		String sText = "Hello! My name is Lesha. I am going to school";
		int k = 3;
		String sTemp;
        String []aWords=sText.split("[\\p{Punct}\\s]"); // [\\s\\.\\!\\,\\?]
        System.out.println(String.format("Text: %s", sText));
        System.out.println("New text: ");
        for(int i=0;i<aWords.length;i++){
            if(k<aWords[i].length()){
            	sTemp="";
            	sTemp+=aWords[i].substring(0, k-1);
            	sTemp+='@';
            	sTemp+=aWords[i].substring(k,aWords[i].length());
                aWords[i]=sTemp;
            }
            System.out.print((aWords[i]+" "));
        }
	}

}

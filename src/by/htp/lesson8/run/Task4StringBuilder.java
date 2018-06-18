package by.htp.lesson8.run;

public class Task4Builder {

	public static void main(String[] args) {
		String sText = "Hello! My name is Lesha. I am going to school";
        int k = 3;
        String subText = "STRING";
        System.out.printf("Ðåçóëüòàò:%s%s", System.lineSeparator(),insertSub(sText, subText, k));
        }
     
        public static String putSub(String sText, String subText, int k) {
            StringBuilder sb = new StringBuilder();
            int sCount = 1;
            if (sText != null && subText != null && k > 0) {
                for (int i = 0; i < sText.length(); i++) {
                    sb.append(sText.charAt(i));
                    if (sCount == k) {
                        sb.append(subText);
                        sCount = 0;
                    }
                    sCount++;
                }
            }
            return sb.toString();
        }
        
        public static String insertSub(String sText, String subText, int k) {
            StringBuilder sb = new StringBuilder();
            int sCount = 1;
            if (sText != null && subText != null && k > 0) {
                for (int i = 0; i < sText.length(); i++) {
                    sb.append(sText.charAt(i));
                    if (sCount == k) {
                    	System.out.println(i);
                        sb.insert(i,subText);
                        sCount = 0;
                    }
                    sCount++;
                }
            }
            return sb.toString();
        }
}

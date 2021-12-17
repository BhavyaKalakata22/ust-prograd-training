public class Kata {
    public static String high(String s) {
        String[] words = s.split("\\s");
        int[] scor = new int[words.length];
        int highestscore=0, highestindex=0;
        for (int j = 0; j < words.length; j++) {
            int score = 0;
            for (int i = 0; i <words[j].length() ; i++) {
                score += words[j].charAt(i)-'a'+1;
            }
            scor[j]=score;
        }
        for (int i=0;i<scor.length;i++) {
            if(scor[i]>highestscore){
                highestscore=scor[i];
                highestindex=i;
            }
        }
        return words[highestindex];
    }
}
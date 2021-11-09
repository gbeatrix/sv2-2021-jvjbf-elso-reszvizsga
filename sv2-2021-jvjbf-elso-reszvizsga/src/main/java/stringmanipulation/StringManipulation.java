package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s) {
        char[] sAsCharArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sAsCharArray.length; i+=2){
            sb.append(sAsCharArray[i]);
        }
        return sb.toString();
    }
}

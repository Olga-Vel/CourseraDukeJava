import edu.duke.*;
public class TestCaesarCipherTwo {
	private String halfOfString(String message, int start) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < message.length(); i += 2) {
            char ch = message.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
    
    private int[] countLetters(String encrypt) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for(int i = 0; i < encrypt.length(); i++) {
            char ch = Character.toLowerCase(encrypt.charAt(i));
            int dex = alphabet.indexOf(ch);
            if(dex != - 1) {
                counts[dex] += 1;
            }
        }
        return counts;
    }
    
    private int maxIndex(int[] freqs) {
        int maxDex = 0;
        for(int i = 0; i < freqs.length; i++) {
            if(freqs[i] > freqs[maxDex]) {
                maxDex = i;
            }
        }
        return maxDex;
    }
    
    void breakCaesarCipher(String input) {
        int[] freqs = countLetters(input);
        int[] freqs1 = countLetters(input);
        int key1 = maxIndex(freqs);
        int key2 = maxIndex(freqs1);
    }
    
    static void simpleTests() {
        //FileResource fr = new FileResource();
        //String message = fr.asString();
    	String message ="Can you imagine life WITHOUT the internet AND computers in your pocket?";
        CaesarCipherTwo cc = new CaesarCipherTwo(14, 24);
        String encrypted = cc.encrypt(message);
        System.out.println("encrypted message: " + encrypted);
        String decrypted = cc.decrypt("Hfs cpwewloj loks cd Hoto kyg Cyy.");
        System.out.println("Decrypted message:");
        System.out.println(decrypted);
        //String firstHalf = halfOfString(message, 0);
        //String secondHalf = halfOfString(message, 1);
    }
    public static void main(String[] args) {
    	simpleTests();
    }
}

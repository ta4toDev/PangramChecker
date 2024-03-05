public class PangramChecker {

    public boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");
        for (char c : alphabet.toCharArray()) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker checker = new PangramChecker();
        System.out.println(checker.check(pangram1));
    }
}

public class MissingLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'e', 'f'}; // d is missing

        char missing = findMissing(letters);
        System.out.println("Missing letter is: " + missing);
    }

    static char findMissing(char[] letters) {
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i + 1] - letters[i] > 1) {
                return (char) (letters[i] + 1);
            }
        }
        return '-';
    }
}
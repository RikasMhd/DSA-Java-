public class CombinationGenerator {
    private static void generateCombinations(char[] chars, String currentCombination, int index) {
        System.out.println(currentCombination);  // Print the current combination

        for (int i = index; i < chars.length; i++) {
            generateCombinations(chars, currentCombination + chars[i], i + 1);
        }
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b','c'};

        generateCombinations(chars, "", 0);
    }
}

/*
3. Write a program to generate all possible unique combinations of a given set of characters. For example, given the characters {'a', 'b'}, 
the program should generate the following combinations: " ", "a", "ab", "b". Your task is to write a program of your choice that generates all possible combinations of a given set of characters using recursive backtracking.
*/
public class SwapWordsSentence {

    static class Node {
        String word;
        Node next;
        Node(String word) {
            this.word = word;
        }
    }

    static Node head;

    static void addWord(String word) {
        Node newNode = new Node(word);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void swapWords(String w1, String w2) {
        Node n1 = null, n2 = null;
        Node temp = head;
        while (temp != null) {
            if (temp.word.equals(w1)) n1 = temp;
            if (temp.word.equals(w2)) n2 = temp;
            temp = temp.next;
        }
        if (n1 != null && n2 != null) {
            String t = n1.word;
            n1.word = n2.word;
            n2.word = t;
        } else {
            System.out.println("One of the words not found");
        }
    }

    static void printSentence() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.word).append(" ");
            temp = temp.next;
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        String sentence = "I love programming a lot";
        for (String w : sentence.split(" ")) {
            addWord(w);
        }

        System.out.print("Original sentence: ");
        printSentence();

        swapWords("love", "lot"); // both words exist now

        System.out.print("After swap: ");
        printSentence();
    }
}
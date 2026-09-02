public class CompareSentences {

    static class Node {
        String word;
        Node next;
        Node(String word) {
            this.word = word;
        }
    }

    static Node buildList(String sentence) {
        Node head = null, tail = null;
        for (String w : sentence.split(" ")) {
            Node newNode = new Node(w);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    static boolean compare(Node h1, Node h2) {
        while (h1 != null && h2 != null) {
            if (!h1.word.equalsIgnoreCase(h2.word)) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        
        return h1 == null && h2 == null;
    }

    public static void main(String[] args) {
        Node s1 = buildList("Java Is Fun");
        Node s2 = buildList("java is fun");
        Node s3 = buildList("java is hard");

        System.out.println("s1 vs s2: " + compare(s1, s2));
        System.out.println("s1 vs s3: " + compare(s1, s3));
    }
}
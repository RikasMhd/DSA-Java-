public class CheckPalindrome {
    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            next = null;
        }
    }

    Node top;
    CheckPalindrome() {
        top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(char data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '0';
        }

        char data = top.data;
        top = top.next;
        return data;
    }

    char peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '0';
        }
        return top.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    boolean isPalindrome(String str) {
        String clean = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean = clean + Character.toLowerCase(ch);
            }
        }

        for (int i = 0; i < clean.length(); i++) {
            push(clean.charAt(i));
        }

        for (int i = 0; i < clean.length(); i++) {

            if (clean.charAt(i) != pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        CheckPalindrome s = new CheckPalindrome();

        String str = "Madam";

        System.out.println("Given String:");
        System.out.println(str);

        if (s.isPalindrome(str)) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
Java Data Structures — Complete Reference
1. Array
What it does: Fixed-size, contiguous block of memory holding elements of the same type, accessed by index.

How to use:

int[] arr = new int[5];              // declare with size
int[] arr2 = {1, 2, 3, 4, 5};        // declare with values
arr[0] = 10;                          // set
int x = arr[0];                       // get
int len = arr.length;                 // size (property, not method!)

// 2D array
int[][] grid = new int[3][3];
grid[0][0] = 1;
When to use:

You know the size in advance and it won't change.
You need fast index-based access — O(1).
Memory efficiency matters (no overhead per element like linked structures).
Classic use: fixed-size lookup tables, matrices, sliding window problems.
Downsides: Can't resize. Insertion/deletion in the middle is O(n) (must shift elements).

2. ArrayList
What it does: A resizable array — the "growable" version of an array, part of java.util.

How to use:

import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(10);                 // add to end - O(1) amortized
list.add(0, 5);                // insert at index - O(n)
int x = list.get(0);           // access - O(1)
list.set(0, 99);               // update
list.remove(0);                // remove by index - O(n)
list.remove(Integer.valueOf(99)); // remove by value
int size = list.size();
boolean has = list.contains(10);
When to use:

You need array-like access but don't know the size ahead of time.
Frequent reads, occasional insert/delete at the end.
Default "go-to" list in Java unless you have a specific reason for something else.
Avoid when: You're doing lots of insertions/deletions in the middle or at the front — use LinkedList instead.

3. LinkedList
What it does: A chain of nodes, each holding data + a reference to the next (and previous, since Java's is doubly-linked). Implements both List and Deque.

How to use:

import java.util.LinkedList;

LinkedList<Integer> ll = new LinkedList<>();
ll.addFirst(1);      // O(1)
ll.addLast(2);        // O(1)
ll.removeFirst();     // O(1)
ll.removeLast();      // O(1)
int first = ll.peekFirst();
When to use:

Frequent insertions/deletions at the beginning or middle.
Implementing a queue, stack, or deque from scratch.
You don't need random access (indexed get(i) is O(n) here — slow!).
Avoid when: You need fast random access by index — use ArrayList instead.

4. Stack (LIFO)
What it does: Last-In-First-Out structure. You push onto the top and pop from the top.

How to use:

import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
int top = stack.peek();   // 2, doesn't remove
int popped = stack.pop(); // 2, removes and returns
boolean empty = stack.isEmpty();
Note: Stack is technically legacy (synchronized, slower). Many prefer Deque as a stack:

Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);
stack.pop();
When to use:

Undo/redo functionality.
Matching brackets / parentheses validation.
Expression evaluation (postfix/infix conversion).
DFS (depth-first search) — using the stack explicitly instead of recursion.
Backtracking problems.
5. Queue (FIFO)
What it does: First-In-First-Out. You add to the back, remove from the front.

How to use:

import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> q = new LinkedList<>();
q.offer(1);     // add to back
q.offer(2);
int front = q.peek();  // 1, doesn't remove
int removed = q.poll(); // 1, removes and returns
When to use:

BFS (breadth-first search) on graphs/trees.
Task scheduling, print queues, buffering.
Any "process in the order received" scenario.
6. Deque (Double-Ended Queue)
What it does: Insert/remove from both ends. Can act as a stack, a queue, or both.

How to use:

import java.util.Deque;
import java.util.ArrayDeque;

Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(1);
deque.addLast(2);
deque.pollFirst();
deque.pollLast();
When to use:

Sliding window problems (a huge one for your hackathon prep!) — maintain a window's min/max efficiently using a monotonic deque.
Palindrome checking.
Whenever you need both stack and queue behavior.
7. HashMap
What it does: Stores key-value pairs. Uses hashing internally for near O(1) average lookup, insert, and delete.

How to use:

import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 3);              // insert/update
int count = map.get("apple");     // retrieve
boolean has = map.containsKey("apple");
map.getOrDefault("banana", 0);    // returns 0 if key missing
map.remove("apple");

// iterate
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// common pattern: frequency counting
map.put(word, map.getOrDefault(word, 0) + 1);
When to use:

Frequency counting (word count, character count).
Fast lookups by a key (caching, memoization).
Two-sum style problems — store value→index as you scan.
Anytime you think "have I seen this key before, and what's associated with it?"
Note: No guaranteed order. Use LinkedHashMap if you need insertion order, or TreeMap if you need sorted key order.

8. HashSet
What it does: Like a HashMap but stores only unique keys — no duplicates, no values.

How to use:

import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
set.add(5);
set.add(5);          // ignored, already present
boolean has = set.contains(5);   // O(1) average
set.remove(5);
int size = set.size();
When to use:

Checking for duplicates.
"Have I visited this node before?" in graph traversal.
Removing duplicates from a collection.
Fast membership testing — much faster than scanning an array/list.
Related: LinkedHashSet (preserves insertion order), TreeSet (keeps elements sorted).

9. TreeMap / TreeSet
What it does: Sorted versions of Map/Set, backed by a Red-Black Tree. Keeps keys/elements in sorted order automatically. O(log n) operations.

How to use:

import java.util.TreeMap;

TreeMap<Integer, String> tmap = new TreeMap<>();
tmap.put(3, "c");
tmap.put(1, "a");
tmap.firstKey();     // 1
tmap.lastKey();      // 3
tmap.ceilingKey(2);  // smallest key >= 2
tmap.floorKey(2);    // largest key <= 2
When to use:

You need data sorted at all times (e.g., leaderboard, ranges).
You need "nearest value" queries (ceiling/floor).
Slower than HashMap/HashSet, so only use when order matters.
10. PriorityQueue (Heap)
What it does: A queue where the "highest priority" element (smallest by default) always comes out first, not the one added first.

How to use:

import java.util.PriorityQueue;

PriorityQueue<Integer> minHeap = new PriorityQueue<>();  // min-heap by default
minHeap.offer(5);
minHeap.offer(1);
minHeap.offer(3);
int smallest = minHeap.poll();  // 1

// max-heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// custom comparator
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
When to use:

Getting the k-th largest/smallest element.
Dijkstra's algorithm, task scheduling by priority.
Merging k sorted lists.
Anytime you repeatedly need the min or max from a changing collection.
11. Graph (using adjacency list)
What it does: Represents nodes and connections between them. Java has no built-in Graph class — you build it with a HashMap or array of lists.

How to use:

import java.util.*;

Map<Integer, List<Integer>> graph = new HashMap<>();
graph.put(1, new ArrayList<>(List.of(2, 3)));
graph.put(2, new ArrayList<>(List.of(1)));

// add edge
graph.computeIfAbsent(1, k -> new ArrayList<>()).add(4);
When to use:

Modeling networks, dependencies, maps, social connections.
BFS/DFS traversal problems.
Shortest path, cycle detection, topological sort.
Quick Decision Guide
Need	Use
Fixed-size, fast index access	Array
Growable list, mostly reading	ArrayList
Frequent insert/delete at ends	LinkedList / ArrayDeque
LIFO behavior	Deque (as stack)
FIFO behavior	Queue / LinkedList
Fast key lookup, no order needed	HashMap
Fast uniqueness check	HashSet
Need sorted keys/elements	TreeMap / TreeSet
Need min/max repeatedly	PriorityQueue
Model connections/network	Graph via HashMap<Integer, List<Integer>>
Time Complexity Cheat Sheet
Structure	Access	Search	Insert	Delete
Array	O(1)	O(n)	O(n)	O(n)
ArrayList	O(1)	O(n)	O(1)*	O(n)
LinkedList	O(n)	O(n)	O(1)	O(1)
HashMap/HashSet	—	O(1) avg	O(1) avg	O(1) avg
TreeMap/TreeSet	—	O(log n)	O(log n)	O(log n)
Stack/Queue (ArrayDeque)	—	O(n)	O(1)	O(1)
PriorityQueue	—	O(n)	O(log n)	O(log n)
*amortized, at the end of the list

Tip for your hackathon prep: HashMap + HashSet cover the majority of "have I seen this before / count frequency" problems, while Deque/PriorityQueue cover most sliding-window and top-k problems. If a problem feels slow with brute force, ask "which of these gets me O(1) or O(log n) for the operation I'm repeating?"

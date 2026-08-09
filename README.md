# Java Data Structures & Algorithms (DSA)

A quick reference for learning and implementing common **Data Structures in Java**. This repository covers basic data structures, their operations, use cases, and time complexity.

## 📚 Data Structures Covered

### 1. Array

Fixed-size collection with fast index-based access.

```java
int[] arr = {1, 2, 3, 4, 5};

arr[0] = 10;
System.out.println(arr[0]);
System.out.println(arr.length);
```

**Use for:** Fixed-size data, fast index access, matrices, lookup tables.

---

### 2. ArrayList

Resizable array provided by `java.util`.

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.get(0);
list.set(0, 99);
list.remove(0);
```

**Use for:** Dynamic lists with frequent reading and occasional insertion/deletion.

---

### 3. LinkedList

Node-based structure where each node references other nodes.

```java
LinkedList<Integer> list = new LinkedList<>();

list.addFirst(10);
list.addLast(20);
list.removeFirst();
list.removeLast();
```

**Use for:** Frequent insertions/deletions, queues, and deque operations.

---

### 4. Stack (LIFO)

Last-In-First-Out structure.

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

int top = stack.peek();
int value = stack.pop();
```

**Use for:** Bracket matching, undo/redo, DFS, backtracking, expression evaluation.

---

### 5. Queue (FIFO)

First-In-First-Out structure.

```java
Queue<Integer> queue = new LinkedList<>();

queue.offer(10);
queue.offer(20);

int first = queue.peek();
int value = queue.poll();
```

**Use for:** BFS, task scheduling, buffering, and processing items in order.

---

### 6. Deque

Double-ended queue that supports insertion and deletion from both ends.

```java
Deque<Integer> deque = new ArrayDeque<>();

deque.addFirst(10);
deque.addLast(20);

deque.pollFirst();
deque.pollLast();
```

**Use for:** Sliding-window problems, palindrome checking, stacks, and queues.

---

### 7. HashMap

Stores data as **key-value pairs** with average O(1) lookup.

```java
HashMap<String, Integer> map = new HashMap<>();

map.put("Apple", 10);
map.put("Banana", 20);

System.out.println(map.get("Apple"));
System.out.println(map.containsKey("Banana"));
```

**Use for:** Frequency counting, caching, fast lookups, Two Sum, and memoization.

---

### 8. HashSet

Stores only unique elements.

```java
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10); // Duplicate ignored

System.out.println(set.contains(10));
```

**Use for:** Duplicate detection, visited nodes, uniqueness checks, and membership testing.

---

### 9. TreeMap / TreeSet

Sorted data structures based on a Red-Black Tree.

```java
TreeMap<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map.firstKey());
System.out.println(map.lastKey());
```

**Use for:** Sorted data, range queries, and finding nearest values.

---

### 10. PriorityQueue (Heap)

Returns elements according to priority rather than insertion order.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.offer(5);
pq.offer(1);
pq.offer(3);

System.out.println(pq.poll()); // 1
```

**Use for:** Top-K problems, Dijkstra's algorithm, scheduling, and repeatedly finding minimum/maximum values.

---

### 11. Graph

Represents vertices (nodes) and edges (connections).

```java
Map<Integer, List<Integer>> graph = new HashMap<>();

graph.put(1, new ArrayList<>(List.of(2, 3)));
graph.put(2, new ArrayList<>(List.of(1)));
```

**Use for:** Networks, maps, dependencies, BFS, DFS, shortest paths, and cycle detection.

---

## ⏱️ Time Complexity Cheat Sheet

| Data Structure    | Access |   Search |   Insert |   Delete |
| ----------------- | -----: | -------: | -------: | -------: |
| Array             |   O(1) |     O(n) |     O(n) |     O(n) |
| ArrayList         |   O(1) |     O(n) |    O(1)* |     O(n) |
| LinkedList        |   O(n) |     O(n) |   O(1)** |   O(1)** |
| HashMap           |      — | O(1) avg | O(1) avg | O(1) avg |
| HashSet           |      — | O(1) avg | O(1) avg | O(1) avg |
| TreeMap / TreeSet |      — | O(log n) | O(log n) | O(log n) |
| Stack / Queue     |      — |     O(n) |     O(1) |     O(1) |
| PriorityQueue     |      — |     O(n) | O(log n) | O(log n) |

* Amortized when adding at the end.
** When the node/position is already known.

---

## 🔍 Quick Decision Guide

| Requirement                         | Recommended Structure       |
| ----------------------------------- | --------------------------- |
| Fixed-size data                     | `Array`                     |
| Dynamic list + fast access          | `ArrayList`                 |
| Frequent insertion/deletion at ends | `LinkedList` / `ArrayDeque` |
| LIFO                                | `Deque`                     |
| FIFO                                | `Queue`                     |
| Fast key-value lookup               | `HashMap`                   |
| Unique values                       | `HashSet`                   |
| Sorted data                         | `TreeMap` / `TreeSet`       |
| Repeated min/max                    | `PriorityQueue`             |
| Networks/connections                | `Graph`                     |

## 🎯 Important Algorithms to Practice

* Searching — Linear Search, Binary Search
* Sorting — Bubble, Selection, Insertion, Merge, Quick Sort
* Recursion
* Linked List operations
* Stack & Queue operations
* Hashing
* Tree Traversals — Inorder, Preorder, Postorder
* BFS & DFS
* Shortest Path — Dijkstra
* Topological Sorting
* Sliding Window
* Two Pointers
* Backtracking
* Dynamic Programming

## 🛠️ Technologies

* **Language:** Java
* **Concept:** Data Structures & Algorithms
* **IDE:** IntelliJ IDEA / VS Code / Eclipse

## 📌 Goal

This repository is intended as a **Java DSA learning and revision reference**, with implementations and examples of fundamental data structures and algorithms.

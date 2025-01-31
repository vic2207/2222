 class Test {
    public static void main(String[] args) {

        System.out.println("Testing MyArrayList:");
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));
        arrayList.remove(1);
        System.out.println("Size after removal: " + arrayList.size());
        arrayList.clear();
        System.out.println("Size after clear: " + arrayList.size());


        System.out.println("\nTesting MyLinkedList:");
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        System.out.println("Size: " + linkedList.size());
        System.out.println("Element at index 2: " + linkedList.get(2));
        linkedList.remove(0);
        System.out.println("Size after removal: " + linkedList.size());
        linkedList.clear();
        System.out.println("Size after clear: " + linkedList.size());


        System.out.println("\nTesting MyQueue:");
        MyQueue queue = new MyQueue();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Size after poll: " + queue.size());
        queue.clear();
        System.out.println("Size after clear: " + queue.size());


        System.out.println("\nTesting MyStack:");
        MyStack stack = new MyStack();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size after pop: " + stack.size());
        stack.clear();
        System.out.println("Size after clear: " + stack.size());


        System.out.println("\nTesting MyHashMap:");
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        System.out.println("Size: " + hashMap.size());
        System.out.println("Value for key2: " + hashMap.get("key2"));
        hashMap.remove("key1");
        System.out.println("Size after removal: " + hashMap.size()); /
        hashMap.clear();
        System.out.println("Size after clear: " + hashMap.size());
    }
}


// 706. Design HashMap
// ===================

class MyHashMap {
    private static final int SIZE = 1000;
    private LinkedList<Entry>[] bucket;

    /** Initialize your data structure here. */
    public MyHashMap() {
        bucket = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            bucket[i] = new LinkedList<>();
        }
    }
    public void put(int key, int val) {
        int index = key % SIZE;
        for (Entry entry : bucket[index]) {
            if (entry.key == key) {
                entry.value = val;
                return;
            }
        }
        bucket[index].add(new Entry(key, val));
    }
    public int get(int key) {
        int index = key % SIZE;
        for (Entry entry : bucket[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1;
    }
    public void remove(int key) {
        int index = key % SIZE;
        bucket[index].removeIf(entry -> entry.key == key);
    }
    private static class Entry {
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
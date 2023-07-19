// 146. LRU Cache
// ==============

class LRUCache {
  private Map<Integer,Node> map;
  private int capacity;
  private Node head;
  private Node tail;
    
  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.map = new HashMap<>();
    this.head = new Node(-1,-1);
	this.tail = new Node(-1,-1);
	head.next = tail;
	tail.prev = head;
  }
    
  public int get(int key) {
    if(map.containsKey(key)){
      int val = map.get(key).value;
      this.put(key, val);
      Node node = map.get(key);
      removeNode(node);
      insertAtFront(node);
      return val;
    }else{
      return -1; 
    }
  }
    
  public void put(int key, int value) {
    if(map.containsKey(key)) {
		Node node = map.get(key);
		removeNode(node);
		node.value = value;
		insertAtFront(node);
    }else {
    	if(map.size() == capacity){
    	    Node lru = tail.prev;
    		removeNode(lru);
    		map.remove(lru.key);
    	}
    	Node newNode = new Node(key,value);
    	insertAtFront(newNode);
    	map.put(key, newNode);
    }
  }
  public void insertAtFront(Node node) {
    node.next = head.next;
    node.prev = head;
    head.next.prev = node;
    head.next = node;
  }
  public void removeNode(Node node) {
	node.prev.next = node.next;
	node.next.prev = node.prev;
  }
  private class Node{
    private int key, value;
    private Node next, prev;
    Node(int key,int value){
    	this.key = key;
    	this.value = value;
    }
  }
}
class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int capacity;
    int size;
    Node dummyHead;
    Node dummyTail;
    HashMap<Integer, Node> hm;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size=0;
        this.dummyHead = new Node(-1,-1);
        this.dummyTail = new Node(-1,-1);
        dummyHead.next=dummyTail;
        dummyTail.prev=dummyHead;
        this.hm = new HashMap<>();
    }
    void deleteNode(Node givenNode){
        givenNode.prev.next = givenNode.next;
        givenNode.next.prev = givenNode.prev;
    }
    void addLast(Node givenNode){
        dummyTail.prev.next = givenNode;
        givenNode.prev = dummyTail.prev;
        givenNode.next = dummyTail;
        dummyTail.prev = givenNode;
    }
    public int get(int key) {
        int val=-1;
        if(hm.containsKey(key)){
            val = hm.get(key).val;
            deleteNode(hm.get(key));
            addLast(hm.get(key));
        }
        return val;
    }
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            hm.get(key).val = value;
            deleteNode(hm.get(key));
            addLast(hm.get(key));
            return;
        }
        // now we dont have given key in cache
        Node currNode = new Node(key, value);
        if(size<capacity){
            //directly add at last
            addLast(currNode);
            hm.put(key, currNode);
            size++;
        }else{
            hm.remove(dummyHead.next.key);
            deleteNode(dummyHead.next);
            addLast(currNode);
            hm.put(key, currNode);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
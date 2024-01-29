const SinglyLinkedList = require("./SinglyLinkedList")

const Queue = class {
    count = 0;
    
    constructor() {
        this.data = new SinglyLinkedList();
        this.data.remove();
    }

    enqueue(val) {
        this.data.insert(val);
        this.count += 1;
        return this;
    }
    
    dequeue() {
        if (!this.isEmpty()) {
            const front = this.data.head.get();
            this.data.head = this.data.head.next;
            this.count -= 1;
            
            return front;
        } else {
            return "Queue is empty!";
        }
    }
    
    peek() {
        if (!this.isEmpty()) {
            return this.data.head.get();
        } else {
            return "Queue is empty!";
        }
    }

    isEmpty() {
        return this.count === 0;
    }

    toString() {
        return this.data.toString();
    }
}

module.exports = Queue;

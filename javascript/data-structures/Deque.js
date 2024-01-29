const Queue = class {
    constructor() {
        this.data = [];
    }

    enqueue(val) {}
    
    dequeue(val) {}
    
    peek() {
        return this.data.at(-1);
    }

    print() {
        console.log(this.data);
    }
}

module.exports = Queue;

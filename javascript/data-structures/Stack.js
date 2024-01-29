const Stack = class {
    constructor() {
        this.data = [];
    }

    push(val) {
        if (!val) {
            return;
        }
        this.data.push(val);
        return this;
    }
    
    pop() {
        this.data.pop();
        return this;
    }
    
    peek() {
        return this.data.at(-1);
    }

    isEmpty() {
        return this.data.length === 0;
    }

    toString() {
        return this.data.toLocaleString();
    }
}

module.exports = Stack;
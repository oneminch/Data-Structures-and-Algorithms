const SinglyLinkedListNode = class {
    constructor(val) {
        this.val = val;
        this.next = null;
    }

    get() {
        return this.val;
    }

    set(newVal) {
        this.val = newVal;
    }
}

module.exports = SinglyLinkedListNode;
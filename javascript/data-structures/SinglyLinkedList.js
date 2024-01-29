const SinglyLinkedListNode = require("./nodes/SinglyLinkedListNode")

const SinglyLinkedList = class {
    count = 0;

    constructor(val = 0) {
        this.head = new SinglyLinkedListNode(val);
        this.count += 1;
    }

    insert(val, index = this.count) {
        let curr = this.head;

        if (index > this.count) return;
        else if (index === 0 && !this.head) {
            this.head = new SinglyLinkedListNode(val);
            this.count += 1;
            return;
        }

        let i = 0;
        while (curr && i < index - 1) {
            curr = curr.next;
            i += 1;
        }

        let newNode = new SinglyLinkedListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        this.count += 1;

        return this;
    }

    search(val) {
        let curr = this.head;

        while (curr) {
            if (curr.val === val) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    remove(index = this.count - 1) {
        let curr = this.head;

        if (index > this.count) return;
        else if (index === 0 && this.head) {
            this.head = this.head.next;
            this.count -= 1;
            return;
        }

        let i = 0;
        while (curr && i < index - 1) {
            curr = curr.next;
            i += 1;
        }

        curr.next = curr.next.next;

        this.count -= 1;

        this.print();

        return this;
    }

    isEmpty() {
        return this.count === 0;
    }

    toString() {
        let curr = this.head;

        let linkedListStr = ""
        while (curr) {
            linkedListStr += `${curr.get()} -> `;
            curr = curr.next;
        }
        linkedListStr += `*`;

        return linkedListStr;
    }
}

module.exports = SinglyLinkedList;
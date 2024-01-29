const BinaryTreeNode = class {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    get() {
        return this.val;
    }

    set(newVal) {
        this.val = newVal;
    }
}

module.exports = BinaryTreeNode;
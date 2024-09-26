const BinarySearchTree = require("./data-structures/BinarySearchTree")
const BinaryTreeNode = require("./data-structures/nodes/BinaryTreeNode")
const Queue = require("./data-structures/Queue")
const SinglyLinkedList = require("./data-structures/SinglyLinkedList")
const Stack = require("./data-structures/Stack")

console.log("\n---------- Singly Linked List ----------\n");

const sll = new SinglyLinkedList(0)
sll.insert(1)
sll.insert(2)
sll.insert(5)
sll.insert(3, 3)
sll.insert(4, 4)
console.log(`Singly Linked List: ${sll.toString()}`)

console.log("\n---------- Stack ----------\n");

const myStack = new Stack();

myStack.push(1)
myStack.push(2)
myStack.push(3)
myStack.push(4)
myStack.push(5)
myStack.push(6)
myStack.pop()
console.log(`Top of Stack: ${myStack.peek()}`)
console.log(`Stack: ${myStack.toString()}`)

console.log("\n---------- Queue ----------\n");

const myQueue = new Queue();

myQueue.enqueue(1)
myQueue.enqueue(2)
myQueue.enqueue(3)
myQueue.enqueue(4)
myQueue.enqueue(5)
myQueue.enqueue(6)
myQueue.dequeue()
myQueue.dequeue()
console.log(`Front of Queue: ${myQueue.peek()}`)
console.log(`Queue: ${myQueue.toString()}`)

console.log("\n---------- Binary Search Tree ----------\n");

const myBST = new BinarySearchTree(5)

myBST.root.left = new BinaryTreeNode(4)
myBST.root.left.left = new BinaryTreeNode(2)

myBST.root.right = new BinaryTreeNode(6)
myBST.root.right.right = new BinaryTreeNode(7)

console.log(myBST.search(5))

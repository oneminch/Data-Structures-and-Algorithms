from dsa.array import Array
from dsa.binary_search_tree import BST
from dsa.doubly_linked_list import DoublyLinkedList
from dsa.graph import Graph
from dsa.hash_table import HashTable
from dsa.queue import Queue
from dsa.singly_linked_list import LinkedList
from dsa.stack import Stack

class DataStructureDemos:
    def __init__(self) -> None:
        pass

    
    def start_demo(self, title):
        print(f"\n{'='*10} {title} {'='*10}\n")


    def end_demo(self):
        print(f"\n{'='*29}\n")
    

    def array_demo(self):
        self.start_demo("Array Demo")

        arr = Array()

        print("Pushing...")
        arr.push(1)
        arr.push(4)
        arr.push(7)
        arr.push(10)

        print("\nArray: ", arr)

        print("\nPoping...")
        print(arr.pop())
        print(arr.pop())
        print(arr.pop())
        print(arr.pop())

        print("\nArray: ", arr)
        
        self.end_demo()


    def hash_table_demo(self):
        self.start_demo("Hash Table Demo")

        ht = HashTable(3)

        ht.set("grapes", 100)
        ht.set("apples", 200)
        ht.set("lemons", 300)
        ht.set("oranges", 400)

        print("Hash Table: ", ht)

        print("\nGrapes: ", ht.get("grapes"))
        print("\nApples: ", ht.get("apples"))
        print("\nLemons: ", ht.get("lemons"))
        print("\nOranges: ", ht.get("oranges"))

        print("\nKeys: ", ht.keys())
        
        self.end_demo()


    def singly_linked_list_demo(self):
        self.start_demo("Singly Linked List Demo")

        ll = LinkedList(14)

        ll.append(16)
        ll.append(20)

        ll.prepend(12)
        ll.prepend(10)

        ll.insert(0, 8)
        ll.insert(5, 18)
        ll.insert(9, 22)

        ll.remove(0)
        ll.remove(6)

        print("Linked List: ", ll)
        print("\nLinked List (Array): ", ll.listify())
        
        self.end_demo()


    def doubly_linked_list_demo(self):
        self.start_demo("Doubly Linked List Demo")

        dll = DoublyLinkedList(5)

        dll.append(7)

        dll.prepend(3)

        dll.insert(0, 1)
        dll.insert(5, 9)

        dll.remove(4)

        print("Doubly Linked List: ", dll)
        print("\nDoubly Linked List (Array): ", dll.listify())
        
        self.end_demo()


    def stack_demo(self):
        self.start_demo("Stack Demo")

        stk = Stack()

        print(f"Is the stack empty? {stk.is_empty()}")

        stk.push(3)
        stk.push(2)
        stk.push(1)
        stk.push(8)
        stk.push(5)

        print("\nPushed 5 items")
        print("\nStack: ", stk)
        print("\nStack (Array): ", stk.listify())
        
        stk.pop()
        stk.pop()

        print("\nPopped 2 items")
        print("\nStack: ", stk)
        print("\nStack (Array): ", stk.listify())

        print(f"\nPeek: {stk.peek()}")
        print(f"\nIs the stack empty? {stk.is_empty()}")
        
        self.end_demo()


    def queue_demo(self):
        self.start_demo("Queue Demo")

        q = Queue()

        print(f"Is the queue empty? {q.is_empty()}")

        q.enqueue(1)
        q.enqueue(2)
        q.enqueue(3)
        q.enqueue(4)
        q.enqueue(5)

        print("\nEnqueued 5 items")
        print("\nQueue: ", q)
        print("\nQueue (Array): ", q.listify())
        
        q.dequeue()
        q.dequeue()

        print("\nDequeued 2 items")
        print("\nQueue: ", q)
        print("\nQueue (Array): ", q.listify())

        print(f"\nPeek: {q.peek()}")
        print(f"\nIs the queue empty? {q.is_empty()}")

        self.end_demo()


    def bst_demo(self):
        self.start_demo("Binary Search Tree")

        print("BSTs aren't implemented accurately yet.")
        
        bt = BST()

        bt.insert(20)
        bt.insert(4)
        bt.insert(9)
        bt.insert(1)
        bt.insert(170)
        bt.insert(6)
        bt.insert(15)

        print("\nBinary Search Tree: ", bt)

        self.end_demo()


    def graph_demo(self):
        self.start_demo("Graph Demo")

        g = Graph()

        g.add_vertex("0")
        g.add_vertex("1")
        g.add_vertex("2")
        g.add_vertex("3")
        g.add_vertex("4")
        g.add_vertex("5")
        g.add_vertex("6")

        g.add_edge("3", "1")
        g.add_edge("3", "4")
        g.add_edge("4", "2")
        g.add_edge("4", "5")
        g.add_edge("1", "2")
        g.add_edge("1", "0")
        g.add_edge("0", "2")
        g.add_edge("6", "5")

        g.show_adjacency_list()

        self.end_demo()
        
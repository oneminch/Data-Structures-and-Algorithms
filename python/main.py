from data_structure_demos import DataStructureDemos
from algorithm_demos import AlgorithmDemos

if __name__ == "__main__":
    prompt = f"""
    Which data structure / algorithm would you like to check out next?
    \n--- DATA STRUCTURES --------\n
    a) Array
    b) Binary Search Tree
    c) Doubly Linked List
    d) Hash Table
    e) Queue
    f) Singly Linked List
    g) Stack
    h) Graph
    \n--- ALGORITHMS --------\n
    i) Binary Search
    j) Bubble Sort
    k) Selection Sort
    """

    algo = AlgorithmDemos()
    ds = DataStructureDemos()

    fn_mappings = {
        "a": ds.array_demo,
        "b": ds.bst_demo,
        "c": ds.doubly_linked_list_demo,
        "d": ds.hash_table_demo,
        "e": ds.queue_demo,
        "f": ds.singly_linked_list_demo,
        "g": ds.stack_demo,
        "h": ds.graph_demo,
        "i": algo.binary_search_demo,
        "j": algo.bubble_sort_demo,
        "k": algo.selection_sort_demo,
        "q": None
    }

    choices = sorted([letter for letter in fn_mappings])

    while True:
        print(prompt)
        choice = input(f"Choose a letter between 'a' and '{choices[-2]}' to continue and 'q' to quit: ")

        if choice not in fn_mappings:
            continue

        if choice == "q":
            print(f"\n{'-'*25} Goodbye {'-'*25}")
            break
        else:
            fn_mappings[choice]()


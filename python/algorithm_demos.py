from dsa.algorithms import Algorithms

class AlgorithmDemos:
    def __init__(self) -> None:
        self.algo = Algorithms()
        
    
    def start_demo(self, title):
        print(f"\n========== {title} ==========\n")


    def end_demo(self):
        print(f"\n=============================\n")

    
    def binary_search_demo(self) -> None:
        self.start_demo("Binary Search Demo")

        lst_1 = [1, 2, 3, 5, 6, 7, 9, 11, 34, 56, 67]
        target_1 = 1
        print(f"Is {target_1} in {lst_1}? ", self.algo.binary_search(lst_1, target_1))

        lst_2 = ["ab", "cd", "ef", "gh", "ij", "kl"]
        target_2 = "ij"
        print(f"\nIs {target_2} in {lst_2}? ", self.algo.binary_search(lst_2, target_2))

        self.end_demo()


    def bubble_sort_demo(self) -> None:
        self.start_demo("Bubble Sort Demo")

        lst = [99, 2, 35, 5, 46, 7, 19, 11, 34, 5, 67]

        print(f"List to sort: {lst}")
        
        self.algo.bubble_sort(lst)
        
        print(f"\nSorted list: {lst}")

        self.end_demo()
        

    def selection_sort_demo(self) -> None:
        self.start_demo("Selection Sort Demo")

        lst = [99, 2, 35, 5, 46, 7, 19, 11, 34, 5, 67]

        print(f"List to sort: {lst}")
        
        self.algo.selection_sort(lst)
        
        print(f"\nSorted list: {lst}")

        self.end_demo()
        
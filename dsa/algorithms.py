class Algorithms:
    def __init__(self) -> None:
        pass


    def binary_search(self, sorted_list: list, target: int) -> bool:
        if len(sorted_list) == 1:
            return target == sorted_list[0]

        midpoint = len(sorted_list)//2

        if target == sorted_list[midpoint]:
            return True
        elif target > sorted_list[midpoint]:
            return self.binary_search(sorted_list[midpoint:], target)
        else:
            return self.binary_search(sorted_list[:midpoint], target)
        
    
    def bubble_sort(self, array: list) -> None:
        for i in range(len(array) - 1):
            for j in range(len(array) - 1):
                if array[j] > array[j+1]:
                    temp = array[j]
                    array[j] = array[j+1]
                    array[j+1] = temp

    
    def selection_sort(self, array: list) -> None:
        for i in range(len(array[:-1])):
            smallestIndex = i    
            for j, n in enumerate(array[i+1:]):
                if n < array[smallestIndex]:
                    smallestIndex = j+i+1

            if smallestIndex != i:
                array[i], array[smallestIndex] = array[smallestIndex], array[i]
            
- Collection (It is the interace which consists of most of the collection)
    - List
        - `ArrayList`
        - `LinkedList`
    - Set
        - Set
            - `HashSet`
        - SortedSet
            - `TreeSet`
    - Queue
        - Queue
            - `PriorityQueue`
        - Deque
            - `LinkedList`
            - `ArrayDeque`

- Map 
    - Map
        - `HashMap`
    - Sorted Map
        - `TreeMap`


- Above listed data structures are the interfaces, which can be implemented by the classes to give them definitions . `Map` does not extend the `Collection` interface. 

- `Collection` interface itself extends the `Iterable` interface. This interface allows to create object `Iterator` which lets us loop over the elements within a Java Collection


### List

- ArrayList
    - Read operation are good since arraylist indexed.
    - It is not quite performant when it comes to addition of the element it. if it runs out of the initial capacity then it starts doubling in size and then you have to copy the old elements to the new and allocate the new ones as well
    - Since this is linearly allocated in the memory, it becomes easier for CPU cache to fetch the memory address easily since it prefetches linearly array location. This makes Arraylist `CPU sympathetic`. LinkedList is based on the pointer, it becomes very hard for the CPU to predict next memory location, this results in performance drop.

- LinkedList 
    - LinkedList in java are actually Doubly Linked List
    - Less CPU cache friendly

    ![List](https://user-images.githubusercontent.com/36666451/116467581-77481580-a88d-11eb-97c7-6addae4ff605.PNG)

    
### Map
- Map does not implement the Collection Interface


- `get()` and `containsKey()` methods on a map uses map implementation to lookup into the map, whereas `containsValue()` has different implementation, it might have to go through all the values 

- Views
    - keySet()
    - values()
    - entrySet()


- General Purpose Implementations
    - `HashMap`
        - General Purpose implementation of the Map
        ![Screenshot_2021-05-12_00-58-26](https://user-images.githubusercontent.com/36666451/117873564-8e3f2c80-b2bd-11eb-8da9-a61dd36059e5.png)

    - `TreeMap`
        - Has defined sort order and adds functionality
        ![treemap](https://user-images.githubusercontent.com/36666451/117873929-fb52c200-b2bd-11eb-8c86-9e367e9b4163.png)


    - Performance Comparison
    ![Performance_comparson_maps](https://user-images.githubusercontent.com/36666451/117874484-a6fc1200-b2be-11eb-9714-b259c242bb0f.png)

    - Hashmap may have to re expand the backing array and relocate all the N items to new array, it can take O(N) for the worst case otherwise it is  amortized O(1)
    - In the case pf TreeMap, worst case scenario seems to O(log(N)) since Log(N) is the height of the
    Red / Black tree (Self balancing tree, sorted in such a way that values lesser than node goes to left and others goes to right)


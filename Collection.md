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

    
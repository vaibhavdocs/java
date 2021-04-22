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
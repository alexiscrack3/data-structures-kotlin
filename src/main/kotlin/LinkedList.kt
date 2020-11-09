class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var count = 0

    val first: Node<T>?
        get() = head

    val last: Node<T>?
        get() = tail

    val size: Int
        get() = count

    fun add(value: T) {
        val node = Node(value)
        if (head == null && tail == null) {
            head = node
        } else {
            tail?.next = node
        }
        tail = node
        count++
    }
}

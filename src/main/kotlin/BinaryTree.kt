import nodes.TreeNode

class BinaryTree<T> where T : Comparable<T> {
    var root: TreeNode<T>? = null

    fun insert(value: T) {
        val node = TreeNode(value)
        if (root == null) {
            root = node
        } else {
            insert(root, value)
        }
    }

    private fun insert(current: TreeNode<T>?, value: T): TreeNode<T>? {
        var node: TreeNode<T>? = null
        if (current == null) {
            node = TreeNode(value)
        } else if (value < current.value) {
            current.left = insert(current.left, value)
        } else {
            current.right = insert(current.right, value)
        }
        return node
    }
}

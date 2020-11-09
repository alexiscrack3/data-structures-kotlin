package nodes

data class TreeNode<T>(
    val value: T
) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null
}

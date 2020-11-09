import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BinaryTreeTest {

    @Test
    fun `root should not be null when first node is added`() {
        val testObject = BinaryTree<Int>()

        testObject.insert(10)

        assertThat(testObject.root, not(nullValue()))
    }

    @Test
    fun `left node should not be null when second node is added`() {
        val testObject = BinaryTree<Int>()
        testObject.insert(10)
        testObject.insert(5)

        assertThat(testObject.root?.left, not(nullValue()))
    }

    @Test
    fun `right node should not be null when second node is added`() {
        val testObject = BinaryTree<Int>()
        testObject.insert(10)
        testObject.insert(20)

        assertThat(testObject.root?.right, not(nullValue()))
    }
}
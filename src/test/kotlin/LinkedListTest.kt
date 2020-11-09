import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class LinkedListTest {

    @Test
    fun `size should be one when first node is added`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)
//        val list = java.util.LinkedList<Int>()

        val actual = testObject.size

        assertThat(actual, equalTo(1))
    }

    @Test
    fun `size should be two when second node is added`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)
        testObject.add(20)

        val actual = testObject.size

        assertThat(actual, equalTo(2))
    }

    @Test
    fun `first should not be null when first node is added`() {
        val testObject = LinkedList<Int>()

        testObject.add(10)

        assertThat(testObject.first, `is`(notNullValue()))
    }

    @Test
    fun `last should not be null when first node is added`() {
        val testObject = LinkedList<Int>()

        testObject.add(10)

        assertThat(testObject.last, `is`(notNullValue()))
    }

    @Test
    fun `first and last should be equal when first node is added`() {
        val testObject = LinkedList<Int>()

        testObject.add(10)

        assertThat(testObject.first, equalTo(testObject.last))
    }

    @Test
    fun `first and last should not be equal when second node is added`() {
        val testObject = LinkedList<Int>()

        testObject.add(10)
        testObject.add(20)

        assertThat(testObject.first, not(equalTo(testObject.last)))
    }
}

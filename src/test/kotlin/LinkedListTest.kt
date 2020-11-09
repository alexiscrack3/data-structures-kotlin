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
    fun `size should be zero when nodes are cleared`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)

        testObject.clear()

        assertThat(testObject.size, equalTo(0))
    }

    @Test
    fun `first should be null when nodes are cleared`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)

        testObject.clear()

        assertThat(testObject.first, `is`(nullValue()))
    }

    @Test
    fun `last should be null when nodes are cleared`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)

        testObject.clear()

        assertThat(testObject.last, `is`(nullValue()))
    }

    @Test
    fun `first should not be null when first node is added`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)

        val actual = testObject.first

        assertThat(actual, `is`(notNullValue()))
    }

    @Test
    fun `last should not be null when first node is added`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)

        val actual = testObject.last

        assertThat(actual, `is`(notNullValue()))
    }

    @Test
    fun `first and last should be equal when first node is added`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)

        val (first, last) = testObject

        assertThat(first, equalTo(last))
    }

    @Test
    fun `first and last should not be equal when second node is added`() {
        val testObject = LinkedList<Int>()
        testObject.add(10)
        testObject.add(20)

        val (first, last) = testObject

        assertThat(first, not(equalTo(last)))
    }
}

1. Reverse an array of characters in place
Just a code snippet is fine here.
- src/main/groovy/reversearray.groovy

2. Count the number of occurrences of a substring within a string
Again, a code snippet is fine.
- src/main/groovy/findstring.groovy

3. Count the number of occurrences of a substring within a string using
recursion
A code snippet is fine here.
- src/main/groovy/findstring.groovy

4. Object Oriented Principles
Implement the E-commerce problem defined in Appendix 1.
- src/main/java/com/example

5. SQL Query #1
Assuming the classes you implemented in the E-commerce problem above get persisted
in a database, write a SQL statement to retrieve the order number of all orders containing
items with “JAZZY” in the name. Assume any table/field names within reason.
- src/main/groovy/db.groovy

6. SQL Query #2
Assuming the classes you implemented in the E-commerce problem above get persisted
in a database, write a SQL statement to retrieve the order number of all orders priced over
$100.00. Assume any table/field names within reason

APPENDIX 1 – E-commerce problem
This is a very simple coding example, no complicated algorithms. Our intent is to collect an
example of your design and code so that we can discuss your approach to fulfilling the
requirements. The purpose is to generate further discussion and explore your grasp of OO
concepts and knowledge of the JDK. Present your response as you see fit.

Program requirements:
You are working on a team developing an e-commerce application. One of your tasks is to
complete the implementation of the Order class that an intern has started along with any other
class or classes on which it depends.

The Order constructor requires an array of OrderItems. The business rules dictate that there are
two types of order items required, service and material. There is one distinction between them,
only material items are taxable. An instance of an OrderItem is only required to contain an Item
and a quantity.

An Order, once constructed, is immutable (no one should be able to change it).

The Order object also needs to be Serializable as it will be distributed across multiple VM’s.
It is critical that the method that returns the order-total returns accurately to the nearest penny.
There is an expected future requirement that Items be used as keys in a Hashtable so address this
issue now.

Make any changes needed to the Order object to meet the requirements stated above, although
you should not have to add any more public methods. This API will be used by many developers
so implement all common methods.
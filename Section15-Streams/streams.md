# JAVA STREAMS 


Java Streams brings functional programming to Java (since Java 8).

**Advantages:**

- efficient Java code
- heavy use of lambda expressions
- ParallelStreams easy to multi-thread 


**Stream Pipeline** consists of:

1. **source**

can be created from Collections, Lists, Sets, Arrays, lines of a file, ints, longs, doubles

2. **intermediate operations (zero or more )**

such as filter, map, sort return steam so we can chain multiple intermediate operations
order matters (performance vise) better to first filter than map
for big datasets use ParallelStream to enable multiple threads

3. **terminal operation**

only one terminal operation is allowed 
return either void or return a non-stream result
forEach - applies the same function to each element
collect - saves the elements into a collection
reduce - reduces the stream to a singule summary element


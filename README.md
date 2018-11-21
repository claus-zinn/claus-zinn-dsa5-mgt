# Assignment 5: Undirected graphs

## The assignment

In this assignment, you are going to implement a graph class, a symbol table,
and some programs to answer questions about co-authorship of scientific papers.
Two files are provided:

* [coauthorship.txt](coauthorship.txt): a graph of authors that coauthored a paper.
  Each vertex is an author, each edge implies coauthorship.
* [authors.txt](authors.txt): a mapping from vertex numbers to authors.

## Assignment 5.1

Implement a *Graph* class with the following methods:

~~~java
public class Graph {
    public Graph(int V);
    public static Graph readGraph(BufferedReader reader) throws IOException;
    public void addEdge(int v, int w);
    public Iterable<Integer> adj(int v);
    public int degree(int v);
    public int E();
    public int V();
}
~~~

The class should use the *Adjacency-matrix graph representation* (discussed
in class), where the matrix should be implemented using
a [BitSet](https://docs.oracle.com/javase/7/docs/api/java/util/BitSet.html).
Although a `BitSet` is one-dimensional, it can be used to represent
an adjacency matrix using a set of size $V^2$.

The constructor that takes a `BufferedReader` can expect input in the
following format:

~~~
number_of_vertices
vertex_1 vertex_2
...
~~~

For example:

~~~
3
0 1
1 2
2 0
~~~

Defines a graph with three vertices connected as a cycle.

It is best to write some unit tests to check that your implementation is
correct.

## Assignment 5.2:

We've have added the class for connected components provided by the Algorithms textbook
to your project (CC.java).

Use the *CC* class, your graph class and the dataset *coauthorship.txt* to
answer the following questions:

* How many components does the dataset have?
* What is the size of the largest component(s)?
* What is the smallest component(s)?
* What is the average component size?

## Assignment 5.3

Implement a class *Authors* with (at least) the following methods:

~~~java
public class Authors {
    public static Authors readAuthors(BufferedReader reader) throws IOException;
    public Integer authorToVertex(String author);
    public String vertexToAuthor(int vertex);
}
~~~

The `readAuthors` method should read vertices and the corresponding authors
from *authors.txt*. The methods should convert from author name to vertex ID
and vice versa.

## Assignment 5.4

Use the classes implemented in 5.1 and 5.3 to answer the following
question:

Which authors are in the same component as 'WHITE, H'?

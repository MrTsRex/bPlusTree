JCC=javac
JFLAGS=-g

default:genericNode.class innerNode.class leaf.class bPlusTree.class treesearch.class myDict.class

myDict.class:myDict.java
	$(JCC) $(JFLAGS) myDict.java

genericNode.class:genericNode.java
	$(JCC) $(JFLAGS) genericNode.java

innerNode.class:innerNode.java
	$(JCC) $(JFLAGS) innerNode.java

leaf.class:leaf.java
	$(JCC) $(JFLAGS) leaf.java

bPlusTree.class:bPlusTree.java
	$(JCC) $(JFLAGS) bPlusTree.java

treesearch.class:treesearch.java
	$(JCC) $(JFLAGS) treesearch.java

clean:  
	find . -type f | xargs touch
	rm -rf *.class

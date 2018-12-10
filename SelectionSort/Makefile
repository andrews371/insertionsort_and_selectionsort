JFLAGS = -g
JC = javac
OPT = -O3
#OPT = -g
WARN = -Wall


SelectionSort: SelectionSort.class
	java SelectionSort

SelectionSort.class: SelectionSort.java
	$(JC) $(JFLAGS) SelectionSort.java

clean:
	$(RM) SelectionSort.class

clobber:
	$(RM) SelectionSort.class



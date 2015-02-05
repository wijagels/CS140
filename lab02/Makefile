# Adapted from http://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
JFLAGS = -d .
JC = javac
JD = javadoc
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Lab02A.java \
	Lab02B.java \
	Lab02BTest.java \
	Assig2A.java

default: classes

classes: $(CLASSES:.java=.class)

docs:
	$(JD) -d docs/ *.java

clean:
	$(RM) *.class *.html *.css *.js package-list
	$(RM)r lab01/

all:	classes	docs
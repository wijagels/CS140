# Adapted from http://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
JFLAGS = -d .
JC = javac
JD = javadoc
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Bunny.java \
	Driver.java \
	BunnyFarm.java \
	Person.java \
	Negotiator.java

default: classes

classes: $(CLASSES:.java=.class)

docs:
	$(JD) -d docs/ *.java

clean:
	$(RM) *.class *.html *.css *.js package-list
	$(RM)r lab03/
	$(RM)r assignment03/

all:	classes test

test:
	$(JC) -d . -cp .:junit.jar:hamcrest.jar Tester.java
	java -cp .:junit.jar:hamcrest.jar org.junit.runner.JUnitCore lab03.Tester
	$(JC) -d . -cp .:junit.jar:hamcrest.jar TesterA.java
	java -cp .:junit.jar:hamcrest.jar org.junit.runner.JUnitCore assignment03.TesterA

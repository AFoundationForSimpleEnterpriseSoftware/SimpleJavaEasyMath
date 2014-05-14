# SimpleJavaEasyMath
# Core Makefile

test: build-test
	java sesf.simplejavaeasymath.tests.SJEMTestSuiteRunner

build-test: build-sjem
	javac @tests.flist

build-sjem:
	javac @core.flist

clean:
	rm sesf/simplejavaeasymath/*.class
	rm sesf/simplejavaeasymath/tests/*.class

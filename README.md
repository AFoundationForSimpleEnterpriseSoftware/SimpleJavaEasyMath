SimpleJavaEasyMath
==================

SimpleJavaEasyMath is a library to abstract away all the difficulties of the
traditional way of doing math in Java. It offers classes and methods to support
the object-oriented programming paradigm.

The basic workflow of SimpleJavaEasyMath goes something like this:

1. Create as many SimpleNumbers as you need.
2. Add them to a SimpleNumberCollection.
3. Create a new SimpleOperator.
4. Call the operator's `calculate` method.
5. Call the returned SimpleResult's getNumber.
6. Using the returned SimpleNumber, get its double or integer value using
   `getDoubleValue()` or `getIntegerValue()`.

That's it! There are also wrapper methods in `SimpleCalculationRunner` which
allow you to use a shorthand form if you're performing an operation on one,
two, three, or four numbers:

```java
double onePlusTwo = SimpleCalculationRunner.runTwo(new SimpleAddition(), new SimpleDouble(1.0), new SimpleDouble(2.0)).getNumber().getDoubleValue();
```

Simple, isn't it? SimpleJavaEasyMath is currently available at version 0.0.1.

## Building
`make build-sjem` will build the project. `make test` will test the project.

## For Developers
Make sure to keep `core.flist` and `tests.flist` up-to-date. They should be in
order with respect to file dependencies. Run `make clean` followed by
`make test` to check that.

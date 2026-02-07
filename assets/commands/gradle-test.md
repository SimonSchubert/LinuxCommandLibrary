# TAGLINE

Gradle unit test runner

# TLDR

**Run all tests**

```gradle test```

**Run with wrapper**

```./gradlew test```

**Run specific test class**

```gradle test --tests [SomeTestClass]```

**Run specific test method**

```gradle test --tests [SomeTestClass.testMethod]```

**Run tests matching pattern**

```gradle test --tests '*Test'```

**Force re-run all tests**

```gradle cleanTest test```

**Run tests with continue on failure**

```gradle test --continue```

**Dry run without executing**

```gradle test --test-dry-run```

# SYNOPSIS

**gradle** **test** [**--tests** _pattern_] [_options_]

# PARAMETERS

**--tests** _pattern_
> Run tests matching pattern (class, method, or wildcard).

**--continue**
> Continue on test failure.

**--test-dry-run**
> Simulate without executing tests.

**--info**
> Show more test output.

**--rerun-tasks**
> Force re-run even if up-to-date.

**-x** _task_
> Exclude a task.

# DESCRIPTION

**gradle test** runs the unit test suite for a Gradle project. It compiles test sources, runs tests, and generates reports. Use **--tests** to run specific tests by class name, method name, or wildcard pattern. Multiple **--tests** options can be combined. By default, Gradle skips tests that passed previously unless sources changed.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-build](/man/gradle-build)(1)

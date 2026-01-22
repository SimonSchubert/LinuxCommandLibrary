# TLDR

**Run tests**

```lit [tests/]```

**Run specific test**

```lit [test.py]```

**Verbose output**

```lit -v [tests/]```

**Show all output**

```lit -a [tests/]```

**Parallel execution**

```lit -j [4] [tests/]```

**Filter tests**

```lit --filter [pattern] [tests/]```

# SYNOPSIS

**lit** [_options_] _tests_

# PARAMETERS

_TESTS_
> Test files or directories.

**-v**
> Verbose output.

**-a**
> Show all output.

**-j** _N_
> Number of parallel jobs.

**--filter** _PATTERN_
> Run matching tests only.

**--no-progress-bar**
> Disable progress bar.

**--help**
> Display help information.

# DESCRIPTION

**lit** is LLVM's integrated tester. It runs test suites with configurable execution and output.

The tool supports multiple test formats and parallel execution. It's used throughout LLVM projects.

lit runs LLVM test suites.

# CAVEATS

Primarily for LLVM projects. Requires test configuration. Python-based.

# HISTORY

lit was developed as part of the **LLVM** project to provide a flexible, fast testing framework for compiler tests.

# SEE ALSO

[llvm-lit](/man/llvm-lit)(1), [pytest](/man/pytest)(1), [make](/man/make)(1)


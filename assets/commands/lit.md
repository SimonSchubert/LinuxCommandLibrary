# TAGLINE

LLVM's integrated tester

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

**lit** (LLVM Integrated Tester) is a portable test execution framework designed for running compiler and tool test suites. It discovers test files in directory trees, executes them according to configurable test formats, and reports results with support for parallel execution across multiple threads. Tests are typically small scripts with embedded RUN lines that specify the commands to execute and CHECK lines that define expected output patterns.

The framework supports multiple test formats including ShTest (shell-script-style tests interpreted by lit itself), GoogleTest binaries, and custom formats defined through Python configuration files. Each test directory contains a `lit.cfg` or `lit.cfg.py` file that specifies the test format, available substitutions, and environment configuration. Although lit was built for LLVM's own test infrastructure, it is a general-purpose tool that can be used to test any command-line program.

# CAVEATS

Primarily for LLVM projects. Requires test configuration. Python-based.

# HISTORY

lit was developed as part of the **LLVM** project to provide a flexible, fast testing framework for compiler tests.

# SEE ALSO

[llvm-lit](/man/llvm-lit)(1), [pytest](/man/pytest)(1), [make](/man/make)(1)


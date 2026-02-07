# TAGLINE

CMake test driver program

# TLDR

**Run all tests**

```ctest```

**Run tests with verbose output**

```ctest -V```

**Run specific test by name**

```ctest -R [test_name_pattern]```

**Exclude tests by name**

```ctest -E [exclude_pattern]```

**Run tests in parallel**

```ctest -j [4]```

**Run with timeout**

```ctest --timeout [60]```

**List available tests**

```ctest -N```

**Rerun failed tests**

```ctest --rerun-failed```

# SYNOPSIS

**ctest** [_options_]

# PARAMETERS

**-V**, **--verbose**
> Verbose output.

**-R** _regex_
> Run tests matching regex.

**-E** _regex_
> Exclude tests matching regex.

**-j** _n_
> Run tests in parallel.

**--timeout** _seconds_
> Per-test timeout.

**-N**
> List tests without running.

**--rerun-failed**
> Only run previously failed tests.

**-L** _label_
> Run tests with specific label.

**--output-on-failure**
> Show output only for failed tests.

# DESCRIPTION

**ctest** is CMake's test driver program that discovers and runs tests defined in CMake projects. It executes tests defined via CMake's **add_test()** command and provides detailed reporting of pass/fail status.

The tool supports parallel test execution, filtering by name or label, timeout enforcement, and rerunning failed tests. It integrates with CMake's build system and can be run from build directories after compilation.

ctest is commonly used in CI/CD pipelines for automated testing, and its output can be formatted for various continuous integration systems. It handles test dependencies, fixture setup/teardown, and can export results to various formats including JUnit XML.

# CAVEATS

Must be run from a CMake build directory containing CTestTestfile.cmake. Tests must be defined in CMakeLists.txt using add_test(). Resource limits and timeouts apply per-test, not globally.

# HISTORY

ctest was introduced as part of **CMake** by **Kitware** and has been part of the CMake suite since the early 2000s. It evolved alongside CMake to provide comprehensive testing infrastructure for cross-platform builds.

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1)

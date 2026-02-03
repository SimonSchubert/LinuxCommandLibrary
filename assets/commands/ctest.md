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

**ctest** is CMake's test driver program. It runs tests defined in a CMake project and reports results. Tests are typically defined using CMake's **add_test()** command.

# SEE ALSO

[cmake](/man/cmake)(1), [make](/man/make)(1)

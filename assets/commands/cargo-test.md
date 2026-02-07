# TAGLINE

Run unit and integration tests

# TLDR

**Run all tests**

```cargo test```

**Run specific test**

```cargo test [test_name]```

**Run tests in module**

```cargo test [module_name]::**```

**Run ignored tests**

```cargo test -- --ignored```

**Show output from passing tests**

```cargo test -- --show-output```

**Run documentation tests only**

```cargo test --doc```

**Run tests without stopping on failure**

```cargo test -- --no-fail-fast```

**Compile without running**

```cargo test --no-run```

# SYNOPSIS

**cargo test** [_options_] [_testname_] [-- _test-options_]

# DESCRIPTION

**cargo test** compiles and runs the test suite for a Rust project. It discovers unit tests (functions annotated with `#[test]` in `src/`), integration tests (files in `tests/`), documentation tests (code blocks in doc comments), and benchmark tests. A test name filter can be provided to run only matching tests.

Arguments after `--` are passed directly to the test harness rather than to Cargo. This allows controlling test execution behavior such as thread count, output capture, and whether ignored tests should run. Tests run in parallel by default; use `--test-threads=1` for sequential execution when tests have shared state.

# PARAMETERS

**--no-run**
> Compile without running

**--no-fail-fast**
> Run all tests regardless of failures

**--doc**
> Run documentation tests only

**--lib**
> Test library only

**--bins**
> Test all binaries

**--tests**
> Test all test targets

**--benches**
> Test all benchmarks

**--all-targets**
> Test all targets

**-p**, **--package** _spec_
> Test specified packages

**--workspace**
> Test all workspace members

**-j**, **--jobs** _n_
> Parallel build jobs

**--release**
> Test with release profile

**--features** _features_
> Enable features

**--all-features**
> Enable all features

# TEST BINARY OPTIONS

**-- --ignored**
> Run ignored tests

**-- --show-output**
> Show stdout from passing tests

**-- --test-threads** _n_
> Number of parallel test threads

**-- --nocapture**
> Don't capture test output

# CAVEATS

Tests run in parallel by default. Use --test-threads=1 for sequential execution.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-bench](/man/cargo-bench)(1)

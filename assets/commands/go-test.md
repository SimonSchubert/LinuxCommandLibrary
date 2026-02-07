# TAGLINE

Go package testing framework

# TLDR

**Run tests in current package**

```go test```

**Run tests with verbose output**

```go test -v```

**Run specific tests by pattern**

```go test -run [TestName]```

**Run benchmarks**

```go test -bench .```

**Run with race detector**

```go test -race```

**Run with coverage**

```go test -cover```

**Generate coverage profile**

```go test -coverprofile=[coverage.out]```

**Run tests in all packages**

```go test ./...```

# SYNOPSIS

**go** **test** [_build/test flags_] [_packages_] [_flags for test binary_]

# PARAMETERS

**-v**
> Verbose output.

**-run** _regexp_
> Run only tests matching pattern.

**-bench** _regexp_
> Run benchmarks matching pattern.

**-cover**
> Enable coverage analysis.

**-coverprofile** _file_
> Write coverage to file.

**-race**
> Enable race detector.

**-count** _n_
> Run each test n times.

**-timeout** _d_
> Test timeout (default 10m).

**-short**
> Tell tests to shorten long operations.

**-parallel** _n_
> Max parallel test execution.

**-json**
> Output results as JSON.

# DESCRIPTION

**go test** automates testing of Go packages. It compiles and runs test files (*_test.go) containing functions named Test*, Benchmark*, and Example*. Tests can run in parallel, include race detection, and generate coverage reports.

The command recompiles packages as needed and caches successful test results. It supports subtests, table-driven tests, and fuzz testing for comprehensive validation.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)

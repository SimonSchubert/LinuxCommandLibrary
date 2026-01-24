# TLDR

**Run all tests**

```pest```

**Run specific test**

```pest --filter [test_name]```

**Run with coverage**

```pest --coverage```

**Run in parallel**

```pest --parallel```

**Stop on first failure**

```pest --bail```

**Watch for changes**

```pest --watch```

**Show test list**

```pest --list-tests```

**Run specific file**

```pest [tests/Feature/ExampleTest.php]```

# SYNOPSIS

**pest** [_--filter pattern_] [_--parallel_] [_--coverage_] [_options_] [_files_]

# PARAMETERS

**--filter** _PATTERN_
> Filter tests by name.

**--parallel**
> Run in parallel.

**--coverage**
> Generate coverage report.

**--bail**
> Stop on first failure.

**--watch**
> Watch mode.

**--list-tests**
> List available tests.

**--min** _PERCENT_
> Minimum coverage.

**--group** _NAME_
> Run test group.

**--exclude-group** _NAME_
> Exclude test group.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**pest** is an elegant PHP testing framework. It provides a clean, expressive syntax built on PHPUnit.

Tests use a describe/it syntax similar to JavaScript testing frameworks. Expectations chain fluently for readable assertions.

Parallel execution speeds up large test suites. Processes are distributed across available cores.

Coverage reports show code coverage percentage. HTML and other formats are available.

Watch mode reruns tests on file changes. Failed tests rerun first for faster feedback.

# CAVEATS

Requires PHP 8.1 or higher. Built on PHPUnit. Some PHPUnit features accessed differently.

# HISTORY

**Pest** was created by **Nuno Maduro** in **2020**. It brings a modern, expressive syntax to PHP testing while maintaining full PHPUnit compatibility.

# SEE ALSO

[phpunit](/man/phpunit)(1), [php](/man/php)(1), [composer](/man/composer)(1)

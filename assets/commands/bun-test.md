# TAGLINE

Built-in Jest-compatible test runner

# TLDR

**Run all tests**

```bun test```

**Run tests in specific file**

```bun test [path/to/test.ts]```

**Run tests matching pattern**

```bun test --test-name-pattern "[pattern]"```

**Run tests in watch mode**

```bun test --watch```

**Update snapshots**

```bun test --update-snapshots```

**Run with coverage**

```bun test --coverage```

**Output JUnit XML report**

```bun test --reporter=junit --reporter-outfile=[results.xml]```

**Run with timeout**

```bun test --timeout [5000]```

# SYNOPSIS

**bun test** [_options_] [_files_]

# DESCRIPTION

**bun test** is Bun's built-in test runner with a Jest-compatible API. It provides TypeScript and JSX support, snapshot testing, mocks, lifecycle hooks, and watch mode out of the box.

Tests execute with the Bun runtime, providing significantly improved performance over traditional JavaScript test runners.

# PARAMETERS

**--watch**
> Re-run tests on file changes

**--update-snapshots**
> Update snapshot files

**--coverage**
> Enable code coverage reporting

**--test-name-pattern** _pattern_
> Only run tests matching pattern

**--timeout** _ms_
> Test timeout in milliseconds

**--reporter** _type_
> Output format (default, junit, etc.)

**--reporter-outfile** _file_
> Write reporter output to file

**--bail** _n_
> Stop after n test failures

**--rerun-each** _n_
> Run each test n times

# TEST FILE PATTERNS

The test runner searches for files matching:
- *.test.{js,jsx,ts,tsx}
- *_test.{js,jsx,ts,tsx}
- *.spec.{js,jsx,ts,tsx}
- *_spec.{js,jsx,ts,tsx}

# API

Tests use **describe**, **test/it**, **expect**, **beforeAll**, **beforeEach**, **afterEach**, **afterAll**, and **mock** functions from bun:test module.

# CAVEATS

While aiming for Jest compatibility, not all Jest features are implemented. GitHub Actions annotations are automatically enabled when running in CI. Some Jest-specific plugins may not work.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [jest](/man/jest)(1), [vitest](/man/vitest)(1)

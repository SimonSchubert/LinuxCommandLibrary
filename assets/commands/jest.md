# TAGLINE

JavaScript testing framework with focus on simplicity

# TLDR

**Run all tests**

```jest```

**Run specific test file**

```jest [path/to/test.js]```

**Run tests matching pattern**

```jest -t "[pattern]"```

**Run in watch mode**

```jest --watch```

**Generate coverage report**

```jest --coverage```

**Update snapshots**

```jest -u```

**Run tests in parallel**

```jest --maxWorkers=[4]```

**Run only changed tests**

```jest --onlyChanged```

# SYNOPSIS

**jest** [_options_] [_files_...]

# DESCRIPTION

**jest** is a JavaScript testing framework with focus on simplicity. It provides test runners, assertions, mocking, and code coverage in a single package.

The tool features snapshot testing, parallel execution, and intelligent test selection. It works with React, Vue, Node.js, and most JavaScript projects.

# PARAMETERS

**--watch**
> Watch mode for changed files.

**--watchAll**
> Watch all files.

**--coverage**
> Collect code coverage.

**-t** _pattern_
> Run matching test names.

**-u**, **--updateSnapshot**
> Update snapshots.

**--maxWorkers** _n_
> Max parallel workers.

**--onlyChanged**
> Run only changed tests.

**--bail**
> Stop on first failure.

**--verbose**
> Display individual test results.

**--config** _file_
> Configuration file.

**--ci**
> CI mode settings.

# CAVEATS

Default test regex may miss files. Snapshots need review. Coverage may miss edge cases. Memory usage high with many tests.

# HISTORY

**Jest** was created by **Facebook** (Meta), initially for testing React applications. Released around **2014**, it evolved from Jasmine roots to become one of the most popular JavaScript testing frameworks, known for its zero-configuration approach.

# SEE ALSO

[npm](/man/npm)(1), [mocha](/man/mocha)(1), [vitest](/man/vitest)(1), [playwright](/man/playwright)(1)

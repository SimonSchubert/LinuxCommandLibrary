# TAGLINE

JavaScript testing framework with focus on simplicity

# TLDR

**Run all tests**

```npx jest```

**Run specific test files** (argument is a regex matched against paths)

```npx jest [path/to/test.js]```

**Run tests whose name matches a pattern**

```npx jest -t "[pattern]"```

**Run in watch mode** (only files changed since last commit)

```npx jest --watch```

**Generate coverage report**

```npx jest --coverage```

**Update snapshots**

```npx jest -u```

**Run tests serially** in the current process (useful for debugging)

```npx jest --runInBand```

**Run tests related to changed source files**

```npx jest --findRelatedTests [src/file.js]```

**Re-run only the tests that failed last time**

```npx jest --onlyFailures```

**Run in CI** with a fixed number of workers

```npx jest --ci --maxWorkers=[4]```

# SYNOPSIS

**jest** [_options_] [_regexForTestFiles_...]

# DESCRIPTION

**jest** is a JavaScript testing framework with focus on simplicity. It provides a test runner, assertions, mocking, and code coverage in a single package.

The tool features snapshot testing, parallel execution in worker processes, and intelligent test selection based on changed files. It works with React, Vue, Node.js, TypeScript, and most JavaScript projects. Configuration lives in **jest.config.js**/**.ts**/**.json** or the **jest** key of **package.json**.

# PARAMETERS

**--watch**
> Watch files and rerun tests related to changed files (requires git or hg).

**--watchAll**
> Watch files and rerun all tests when something changes.

**--coverage**
> Collect code coverage.

**-t**, **--testNamePattern** _regex_
> Run only tests whose name matches.

**--testPathPatterns** _regex_
> Run only test files whose path matches (was **--testPathPattern** before Jest 30).

**-u**, **--updateSnapshot**
> Re-record failing snapshots.

**-w**, **--maxWorkers** _n_|_percent_
> Max parallel workers (e.g. 4 or 50%).

**-i**, **--runInBand**
> Run all tests serially in the current process.

**-o**, **--onlyChanged**
> Run only tests related to files changed since the last commit.

**-f**, **--onlyFailures**
> Run only tests that failed in the previous run.

**--changedSince** _branch_
> Run tests related to changes since the given branch or commit.

**--findRelatedTests** _files_...
> Run tests covering the given source files.

**-b**, **--bail**[=_n_]
> Stop after the first (or _n_) failing test suites.

**--verbose**
> Display individual test results with the test hierarchy.

**--silent**
> Suppress console output from tests.

**-c**, **--config** _file_
> Configuration file.

**--ci**
> CI mode: new snapshots fail instead of being written automatically.

**--listTests**
> Print the test files that would run and exit.

**--detectOpenHandles**
> Report handles that prevent Jest from exiting.

**--passWithNoTests**
> Exit successfully when no tests are found.

**--shard** _n_/_total_
> Run only one shard of the test suite.

**--json**
> Print results as JSON (with **--outputFile** to write to a file).

# CAVEATS

Positional arguments are regex patterns, not exact paths. Native ES modules still require **--experimental-vm-modules**. TypeScript needs a transformer such as **babel-jest** or **ts-jest**. Snapshots need review before being committed. Memory usage can be high with many workers; lower **--maxWorkers** in constrained CI environments.

# HISTORY

**Jest** was created at **Facebook** (Meta) in **2014**, initially for testing React applications, and evolved from Jasmine roots into one of the most popular JavaScript testing frameworks. In **2022** Meta transferred it to the **OpenJS Foundation**. **Jest 30** (2025) dropped support for older Node.js versions and renamed **--testPathPattern** to **--testPathPatterns**.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [mocha](/man/mocha)(1), [vitest](/man/vitest)(1), [playwright](/man/playwright)(1)

# RESOURCES

```[Source code](https://github.com/jestjs/jest)```

```[Homepage](https://jestjs.io/)```

```[Documentation](https://jestjs.io/docs/cli)```

<!-- verified: 2026-09-29 -->

# TAGLINE

Markdown-based API test specification runner

# TLDR

**Run a single test specification** file

```cotton [spec.md]```

**Run all specs in a directory** (files ending in .spec.md)

```cotton [tests/]```

**Run specs matching a glob**

```cotton "[tests/*.spec.md]"```

**Stop on the first failure**

```cotton -f [tests/]```

**Enable debug** logging

```cotton -d [spec.md]```

**Set the HTTP timeout** in milliseconds

```cotton --timeout [10000] [tests/]```

Run **quietly** and rely on the exit code

```cotton -q [tests/]```

Write a **JSON report**

```cotton --json-report [report.json] [tests/]```

# SYNOPSIS

**cotton** [_options_] _file|directory|glob_...

# PARAMETERS

**-d**
> Enable debug logging.

**-q**
> Silence execution, reporting only through the exit code.

**-m**
> Monochrome logging.

**-f**
> Fail fast: stop on the first failure.

**--timeout** _ms_
> HTTP timeout in milliseconds (default 30000, maximum 60000).

**--json-report** _file_
> Generate a JSON report.

**--html-report** _file_
> Reserved for an HTML report; not yet implemented.

**-v**
> Show version and exit.

# DESCRIPTION

**cotton** is a command-line test runner that executes RESTful API tests written in Markdown format. Test specifications are Markdown files containing HTTP request descriptions and expected response assertions, making tests human-readable as living documentation.

Cotton reads each Markdown spec, extracts HTTP request definitions and expectations, executes the requests against the target API, and reports pass/fail results. Each argument can be a single Markdown file, a directory searched recursively for **.spec.md** files, or a glob pattern.

Variables are declared in the spec, as immediate values or JSON paths into the response, and referenced using `{{ variable_name }}` syntax. Expectations use GJSON paths such as `$.data.id` with comparison and regex operators. Markdown links before the first code fence run as setup, links after it as teardown. Specs with expectations are test cases, those without are executables.

# CAVEATS

Tests are written in a specific Markdown dialect; see the project documentation for the spec format. Options must come before file arguments. A variable with no value at substitution time aborts the spec with an error. Command-line options changed between major releases, so older examples may not work with version 2.

# SEE ALSO

[curl](/man/curl)(1), [hurl](/man/hurl)(1)

# RESOURCES

```[Source code](https://github.com/chonla/cotton)```

<!-- verified: 2026-11-09 -->

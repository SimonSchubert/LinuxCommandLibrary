# TAGLINE

Markdown-based API test specification runner

# TLDR

**Run a single test specification** file

```cotton [spec.md]```

**Run all specs in a directory**

```cotton [tests/]```

**Run with a custom base URL**

```cotton -u [https://api.example.com] [tests/]```

**Run in detail mode** (verbose output)

```cotton -d [spec.md]```

**Inject a predefined variable**

```cotton -p [token=abc123] [spec.md]```

**Stop on the first failure**

```cotton -s [tests/]```

**Watch for changes** and rerun automatically

```cotton -w [tests/]```

# SYNOPSIS

**cotton** [_-u baseurl_] [_-i_] [_-d_] [_-w_] [_-s_] [_-p name=value_] _test-cases_

# PARAMETERS

**-u** _url_
> Base URL for all requests (default: http://localhost:8080).

**-i**
> Insecure mode: disable TLS certificate verification.

**-d**
> Detail mode: print comprehensive output for each test.

**-w**
> Watch mode: rerun tests automatically when files change.

**-s**
> Panic mode: halt execution on the first failure.

**-p** _name=value_
> Inject a predefined variable into test specs (repeatable).

**-h**
> Display help information.

**-v**
> Display version information.

# DESCRIPTION

**cotton** is a command-line test runner that executes RESTful API tests written in Markdown format. Test specifications are Markdown files containing HTTP request descriptions and expected response assertions, making tests human-readable as living documentation.

Cotton reads each Markdown spec, extracts HTTP request definitions and expectations, executes the requests against the target API, and reports pass/fail results. The `_test-cases_` argument can be a single Markdown file, a directory of Markdown files, or a glob pattern.

Variables can be injected with **-p** and referenced inside specs using `{{ variable_name }}` syntax. Cotton supports setup and teardown operations within spec files, and distinguishes between test cases (with assertions) and executables (without).

# CAVEATS

Tests are written in a specific Markdown dialect; see the project documentation for the spec format. TLS verification is enabled by default; use `-i` only in development. The base URL defaults to http://localhost:8080 and must be overridden for remote APIs.

# SEE ALSO

[curl](/man/curl)(1)

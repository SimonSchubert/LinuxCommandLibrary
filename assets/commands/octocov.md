# TAGLINE

Toolkit for collecting code coverage and metrics

# TLDR

**Run octocov** using configuration in the current directory

```octocov```

**Generate a coverage badge**

```octocov badge```

**Compare two coverage reports**

```octocov diff [report_a] [report_b]```

**View file-level coverage** for a specific file

```octocov view [file]```

**List all files** tracked in the coverage report

```octocov ls-files```

**Generate a default configuration file**

```octocov init```

# SYNOPSIS

**octocov** [_command_] [_options_]

# PARAMETERS

**init**
> Generate a default `.octocov.yml` configuration file in the current directory.

**ls-files**
> List all source files recorded in the coverage report.

**view**, **cat**
> Display file-level coverage details for a given source file.

**diff** [_report_a_] [_report_b_]
> Compare two coverage reports and show the differences.

**badge**
> Generate a coverage badge image based on the current report.

# DESCRIPTION

**octocov** is a toolkit for collecting code metrics including code coverage, code-to-test ratio, and test execution time. It works both as a local CLI tool and as a CI tool integrated with GitHub Actions.

Features include support for multiple coverage report formats (Go, Ruby, Python, Clover, LCOV, and more), badge generation, pull request commenting, and report storage in GitHub, S3, or BigQuery. It can aggregate reports from multiple repositories for centralized monitoring. Configuration is defined in `.octocov.yml`.

# CAVEATS

Coverage report format support depends on the language and test framework used. CI features such as pull request commenting require GitHub Actions configuration.

# HISTORY

**octocov** was created by **k1LoW** and is written in **Go**. It is available as a GitHub Action via `k1LoW/octocov-action`.

# SEE ALSO

[go-test](/man/go-test)(1)

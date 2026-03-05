# TAGLINE

Toolkit for collecting code coverage and metrics

# TLDR

**View code coverage** in the terminal

```octocov```

**Generate a coverage badge**

```octocov badge```

**Compare coverage** between branches

```octocov diff```

# SYNOPSIS

**octocov** [_command_] [_options_]

# DESCRIPTION

**octocov** is a toolkit for collecting code metrics including code coverage, code-to-test ratio, and test execution time. It works both as a CLI tool for terminal viewing and as a CI tool integrated with GitHub Actions.

Features include support for multiple coverage report formats, badge generation, pull request commenting, and report storage in GitHub, S3, or BigQuery. It can aggregate reports from multiple repositories for centralized monitoring.

# CAVEATS

Coverage report format support depends on the language and test framework used. CI features require GitHub Actions configuration.

# HISTORY

**octocov** was created by **k1LoW** and is written in **Go**.

# SEE ALSO

[go-test](/man/go-test)(1)

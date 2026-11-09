# TAGLINE

Toolkit for collecting code coverage and metrics

# TLDR

**Run octocov** using configuration in the current directory

```octocov```

**Generate a coverage badge**

```octocov badge coverage --out [coverage.svg]```

**Compare two coverage reports**

```octocov diff [report_a] [report_b]```

**View file-level coverage** for a specific file

```octocov view [file]```

**List all files** tracked in the coverage report

```octocov ls-files```

**Generate a default configuration file**

```octocov init```

**Dump the report** using a specific coverage file

```octocov dump --report [coverage.out]```

# SYNOPSIS

**octocov** [_command_] [_options_]

# PARAMETERS

**init**
> Generate a default `.octocov.yml` configuration file in the current directory.

**ls-files**
> List all source files recorded in the coverage report.

**view**, **cat** _file_...
> Display file-level coverage details for the given source files.

**diff**, **compare** [_report_a_] [_report_b_]
> Compare two coverage reports or octocov report.json files. **--patch** also shows coverage of changed lines through the GitHub API.

**badge** _coverage|ratio|time_
> Generate a coverage, code-to-test ratio, or test execution time badge. **--out** sets the output file.

**dump**
> Dump the report.

**migrate-bq-table**
> Migrate the BigQuery table of the code metrics datastore.

**--config** _path_
> Config file path.

**-r**, **--report** _path_
> Coverage report file path.

# DESCRIPTION

**octocov** is a toolkit for collecting code metrics including code coverage, code-to-test ratio, and test execution time. It works both as a local CLI tool and as a CI tool integrated with GitHub Actions.

Features include support for multiple coverage report formats (Go coverage, LCOV, SimpleCov, Clover, Cobertura, and JaCoCo), badge generation, pull request commenting, and report storage in GitHub repositories, GitHub Actions artifacts, S3, GCS, BigQuery, or local paths. It can aggregate reports from multiple repositories for centralized monitoring. Configuration is defined in `.octocov.yml`.

# CAVEATS

Coverage report format support depends on the language and test framework used. CI features such as pull request commenting require GitHub Actions configuration.

# HISTORY

**octocov** was created by **k1LoW** and is written in **Go**. It is available as a GitHub Action via `k1LoW/octocov-action`.

# SEE ALSO

[go-test](/man/go-test)(1), [gcov](/man/gcov)(1), [lcov](/man/lcov)(1)

# RESOURCES

```[Source code](https://github.com/k1LoW/octocov)```

```[Homepage](https://octocov.dev)```

<!-- verified: 2026-11-09 -->

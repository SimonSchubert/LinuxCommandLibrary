# TAGLINE

Go source code security scanner

# TLDR

**Scan** the current package and everything below it

```gosec ./...```

**Scan** a specific package or directory

```gosec [path/to/package]```

**Write a report** in a given format (json, yaml, csv, html, sarif, ...)

```gosec -fmt [format] -out [path/to/report] ./...```

**Run only** specific rules by ID

```gosec -include [G101,G201] ./...```

**Exclude** specific rules by ID

```gosec -exclude [G104] ./...```

**Skip** one or more directories

```gosec -exclude-dir [vendor] ./...```

**Filter** findings by severity and confidence

```gosec -severity [medium] -confidence [medium] ./...```

**Include** test files in the scan

```gosec -tests ./...```

# SYNOPSIS

**gosec** [_options_] _package_...

# DESCRIPTION

**gosec** (Go Security Checker) inspects Go source code for security problems by analyzing the abstract syntax tree (AST) of each package against a set of built-in rules. Each rule has an identifier of the form **Gnnn** (for example **G101** for hardcoded credentials or **G401** for use of weak cryptographic primitives) and reports the file, line, severity, and confidence of every match.

It is designed to run in continuous-integration pipelines: results can be emitted in machine-readable formats such as JSON, YAML, CSV, SARIF, and JUnit XML, and the exit status can be made non-zero when issues are found. Rule selection, severity and confidence thresholds, directory exclusions, and inline **#nosec** annotations let you tune the signal to a project's needs.

# PARAMETERS

**-fmt** _format_

> Set the output format: text (default), json, yaml, csv, junit-xml, html, sonarqube, golint, sarif.

**-out** _file_

> Write the report to the given file instead of standard output.

**-include** _ids_

> Comma-separated list of rule IDs to run exclusively.

**-exclude** _ids_

> Comma-separated list of rule IDs to skip.

**-exclude-dir** _dir_

> Exclude a directory from the scan; may be repeated.

**-severity** _level_

> Report only issues at the given severity or higher (low, medium, high).

**-confidence** _level_

> Report only issues at the given confidence or higher (low, medium, high).

**-tests**

> Include Go test files (**_test.go**) in the analysis.

**-no-fail**

> Always exit with status 0, even when issues are found.

# CAVEATS

gosec performs static analysis and can produce false positives; use **#nosec** comments or rule exclusions to silence findings you have reviewed. It complements, but does not replace, runtime testing and dependency vulnerability scanning such as govulncheck.

# HISTORY

gosec started life as **gas** (Go AST Scanner) and was later renamed. It is maintained by the **securego** community project and is widely integrated into Go CI tooling, including golangci-lint.

# SEE ALSO

[golangci-lint](/man/golangci-lint)(1), [staticcheck](/man/staticcheck)(1), [semgrep](/man/semgrep)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/securego/gosec)```

<!-- verified: 2026-06-16 -->

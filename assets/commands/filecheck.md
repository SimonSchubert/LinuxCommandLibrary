# TAGLINE

LLVM pattern-matching testing tool

# TLDR

**Run FileCheck on** file

```FileCheck [check-file] < [input]```

**Check with patterns** from stdin

```FileCheck --input-file=[input] [check-file]```

**Enable verbose output**

```FileCheck -v [check-file] < [input]```

**Require full line matches**

```FileCheck --match-full-lines [check-file] < [input]```

# SYNOPSIS

**FileCheck** [_options_] _check-file_

# PARAMETERS

_CHECK-FILE_
> File containing CHECK directives.

**--input-file** _FILE_
> Input file to verify.

**-v**, **--verbose**
> Print good matches.

**--match-full-lines**
> Require full line matches.

**--strict-whitespace**
> Strict whitespace matching.

**--check-prefix** _PREFIX_
> Use custom check prefix (default: CHECK).

**--check-prefixes** _PREFIXES_
> Comma-separated list of check prefixes.

**-vv**
> Print information useful for diagnostic analysis.

**--dump-input** _MODE_
> Dump annotated input on failure (help, always, fail, never).

**--allow-empty**
> Allow the check file to be empty.

**--help**
> Display help information.

# DESCRIPTION

**FileCheck** is an LLVM testing tool that verifies text output matches specified patterns. It reads a file containing CHECK directives and verifies they match against input, commonly compiler output.

The tool supports various check types: CHECK for sequential matching, CHECK-NEXT for consecutive lines, CHECK-NOT for absence, CHECK-SAME for same-line matches, CHECK-DAG for unordered matches, CHECK-LABEL for scoping, and CHECK-EMPTY for blank lines.

FileCheck is essential for LLVM and compiler testing, validating generated code matches expected patterns.

# CAVEATS

Pattern syntax uses a subset of regular expressions with LLVM-specific extensions like variable captures (`[[VAR:regex]]`). Whitespace is canonicalized by default (multiple spaces match one). Primarily designed for LLVM/compiler testing but usable for any text verification.

# HISTORY

FileCheck was developed as part of **LLVM's testing infrastructure**. It provides a flexible pattern-matching system for validating compiler output in regression tests.

# SEE ALSO

[grep](/man/grep)(1), [diff](/man/diff)(1)

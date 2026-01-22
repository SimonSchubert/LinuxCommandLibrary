# TLDR

**Run FileCheck on** file

```FileCheck [check-file] < [input]```

**Check with patterns** from stdin

```FileCheck --input-file=[input] [check-file]```

**Enable verbose output**

```FileCheck -v [check-file] < [input]```

**Match with regex**

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
> Use custom check prefix.

**--help**
> Display help information.

# DESCRIPTION

**FileCheck** is an LLVM testing tool that verifies text output matches specified patterns. It reads a file containing CHECK directives and verifies they match against input, commonly compiler output.

The tool supports various check types: CHECK for sequential matching, CHECK-NEXT for consecutive lines, CHECK-NOT for absence, and CHECK-SAME for same-line matches.

FileCheck is essential for LLVM and compiler testing, validating generated code matches expected patterns.

# CAVEATS

Pattern syntax differs from standard regex. Whitespace handling can be tricky. Primarily designed for LLVM testing.

# HISTORY

FileCheck was developed as part of **LLVM's testing infrastructure**. It provides a flexible pattern-matching system for validating compiler output in regression tests.

# SEE ALSO

[llvm-lit](/man/llvm-lit)(1), [grep](/man/grep)(1), [diff](/man/diff)(1)

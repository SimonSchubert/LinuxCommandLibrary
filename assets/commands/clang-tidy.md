# TAGLINE

Clang-based C++ linter and static analyzer

# TLDR

**Run checks on file**

```clang-tidy [file.cpp] -- -I[include/path]```

**List enabled checks**

```clang-tidy --list-checks```

**List all available checks**

```clang-tidy --list-checks -checks='*'```

**Run specific checks**

```clang-tidy -checks='-*,modernize-*' [file.cpp]```

**Apply automatic fixes**

```clang-tidy --fix [file.cpp]```

**Export fixes to file**

```clang-tidy --export-fixes=[fixes.yaml] [file.cpp]```

**Dump configuration**

```clang-tidy --dump-config```

# SYNOPSIS

**clang-tidy** [_options_] _file_ [_-- compile_options_]

# DESCRIPTION

**clang-tidy** is a clang-based C++ linter tool for diagnosing and fixing typical programming errors including style violations, interface misuse, and bugs detectable via static analysis. It is part of the LLVM/Clang extra tools.

The tool provides hundreds of checks organized into categories such as bugprone, modernize, performance, readability, and cppcoreguidelines. Many checks can automatically apply fixes to source code, making it useful for large-scale code modernization (e.g., migrating to modern C++ idioms).

clang-tidy uses a **.clang-tidy** configuration file for project-level settings and supports inline suppression with NOLINT comments. For large projects, **run-clang-tidy.py** provides parallel execution across multiple files.

# PARAMETERS

**-checks**=_list_
> Comma-separated list of checks (+/- prefixed globs)

**--list-checks**
> List enabled checks

**--fix**
> Apply suggested fixes

**--fix-errors**
> Apply fixes even if errors occur

**--export-fixes**=_file_
> Write fixes to YAML file

**--dump-config**
> Dump configuration to stdout

**--warnings-as-errors**=_list_
> Treat specified warnings as errors

**-p** _path_
> Path to compilation database

**--config-file**=_file_
> Path to .clang-tidy config

# CHECK CATEGORIES

**bugprone-***
> Bug-prone patterns

**modernize-***
> C++ modernization

**performance-***
> Performance issues

**readability-***
> Code readability

**cppcoreguidelines-***
> C++ Core Guidelines

# CONFIGURATION

Create **.clang-tidy** in project root:

```yaml
Checks: '-*,modernize-*,bugprone-*'
WarningsAsErrors: '*'
```

# SUPPRESSION

Use comments: NOLINT, NOLINTNEXTLINE, NOLINTBEGIN/NOLINTEND

# CAVEATS

Requires compilation database for complex projects. Use run-clang-tidy.py for parallel execution.

# SEE ALSO

[clang](/man/clang)(1), [clang-format](/man/clang-format)(1)

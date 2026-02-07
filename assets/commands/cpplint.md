# TAGLINE

Google C++ style guide checker

# TLDR

**Check single file**

```cpplint [file.cpp]```

**Check multiple files**

```cpplint [file1.cpp] [file2.cpp]```

**Recursive directory check**

```cpplint --recursive [src/]```

**Filter specific categories**

```cpplint --filter=-whitespace,+build [file.cpp]```

**Set line length**

```cpplint --linelength=[120] [file.cpp]```

**Output in different format**

```cpplint --output=[vs7] [file.cpp]```

# SYNOPSIS

**cpplint** [_options_] _files_

# DESCRIPTION

**cpplint** is a static code checker for C++ that verifies code against Google's C++ style guide. It checks for style errors, formatting issues, and common programming mistakes to enforce consistent code standards across projects.

The tool examines source files for compliance with naming conventions, spacing rules, comment formatting, header guard patterns, and many other style requirements. It helps teams maintain uniform code style and catch common errors before code review.

Originally developed by Google for internal use, cpplint is now maintained as an open-source project. While designed specifically for Google's style guide, its rules can be filtered and customized for projects with different conventions.

# PARAMETERS

**--recursive**
> Check files in subdirectories recursively

**--filter**=_-/+categories_
> Enable/disable specific warning categories

**--linelength**=_length_
> Maximum line length (default 80)

**--extensions**=_list_
> File extensions to process

**--headers**=_list_
> Header file extensions

**--output**=_format_
> Output format: emacs, vs7, eclipse, junit, sed, gsed

**--counting**=_type_
> Count errors: total, toplevel, detailed

**--root**=_dir_
> Project root for header guard paths

**--exclude**=_pattern_
> Exclude files matching pattern

# FILTER CATEGORIES

- **build**: Build-related issues
- **legal**: Copyright/license issues
- **readability**: Code readability
- **runtime**: Runtime issues
- **whitespace**: Spacing and formatting

Prefix with - to disable, + to enable.

# CONFIGURATION

**CPPLINT.cfg**
> Project-wide configuration file for filters, line length, root directory, and excluded paths.

# CAVEATS

Designed specifically for Google style guide compliance. Some rules may not apply to all projects. Use CPPLINT.cfg file for project-wide configuration.

# SEE ALSO

[clang-format](/man/clang-format)(1), [clang-tidy](/man/clang-tidy)(1), [cppcheck](/man/cppcheck)(1)

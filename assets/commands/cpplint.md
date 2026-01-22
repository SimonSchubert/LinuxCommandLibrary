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

**cpplint** is a static code checker for C++ that verifies code against Google's C++ style guide. It checks for style errors, formatting issues, and common programming mistakes.

Originally developed by Google, now maintained as an open-source project.

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

# CAVEATS

Designed specifically for Google style guide compliance. Some rules may not apply to all projects. Use CPPLINT.cfg file for project-wide configuration.

# SEE ALSO

[clang-format](/man/clang-format)(1), [clang-tidy](/man/clang-tidy)(1), [cppcheck](/man/cppcheck)(1)

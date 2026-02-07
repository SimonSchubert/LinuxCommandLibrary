# TAGLINE

C source code beautifier

# TLDR

**Beautify C code from a file**

```cb < [path/to/source.c] > [path/to/output.c]```

**Format using standard C style**

```cb -s < [path/to/source.c]```

**Set maximum line length**

```cb -l [80] < [path/to/source.c]```

**Join case labels onto single lines**

```cb -j < [path/to/source.c]```

**Use Kernighan & Ritchie style**

```cb -f k&r < [path/to/source.c]```

# SYNOPSIS

**cb** [**-s**] [**-j**] [**-l** _length_] [**-f** _type_]

# DESCRIPTION

**cb** (C Beautifier) is a classic Unix utility that reformats C source code for improved readability. It reads from standard input and writes beautified code to standard output, making it suitable for use in pipelines.

The tool performs lexical formatting without full syntactic analysis, adjusting indentation, spacing, and line breaks according to specified style conventions.

# PARAMETERS

**-s**
> Use standard C style (Bell Laboratories conventions)

**-l** _length_
> Set maximum line length. Lines exceeding this are broken (default: 79)

**-j**
> Join multiple case labels onto a single line

**-f** _type_
> Specify formatting style: all, k&r (Kernighan & Ritchie), indent, sysv

# CAVEATS

The **cb** command performs only lexical analysis and may produce incorrect formatting with complex preprocessor macros that alter code structure. It supports only C code, not C++ or other languages.

On modern Linux distributions, **cb** is often not installed by default and is considered largely obsolete.

# HISTORY

The **cb** command originated in early Unix systems at Bell Labs as a simple tool for standardizing C code formatting. It has since been superseded by more sophisticated formatters like **indent**, **astyle**, and **clang-format** that provide fuller syntactic understanding and greater configurability.

# SEE ALSO

[indent](/man/indent)(1), [clang-format](/man/clang-format)(1)

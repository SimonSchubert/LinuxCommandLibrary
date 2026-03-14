# TAGLINE

Fast recursive text search tool

# TLDR

**Search for a pattern recursively in the current directory**

```rg "[pattern]"```

**Search only in files of a specific type**

```rg -t [py] "[pattern]"```

**Search case-insensitively**

```rg -i "[pattern]"```

**Show context lines around matches**

```rg -C [3] "[pattern]"```

**List only file names containing matches**

```rg -l "[pattern]"```

**Search including hidden files and directories**

```rg --hidden "[pattern]"```

**Search for a literal string** (no regex)

```rg -F "[literal string]"```

**Count matches per file**

```rg -c "[pattern]"```

**Search with multiline matching**

```rg -U "[pattern]"```

**Replace matches with a string**

```rg "[pattern]" -r "[replacement]"```

# SYNOPSIS

**rg** [_options_] _pattern_ [_path_...]

# PARAMETERS

**-i**, **--ignore-case**
> Case-insensitive search.

**-s**, **--case-sensitive**
> Case-sensitive search (overrides -i).

**-S**, **--smart-case**
> Case-insensitive unless pattern contains uppercase.

**-t**, **--type** _TYPE_
> Only search files matching TYPE (e.g., py, js, rust).

**-T**, **--type-not** _TYPE_
> Exclude files matching TYPE.

**-C**, **--context** _NUM_
> Show NUM lines before and after each match.

**-A**, **--after-context** _NUM_
> Show NUM lines after each match.

**-B**, **--before-context** _NUM_
> Show NUM lines before each match.

**-l**, **--files-with-matches**
> Print only file paths containing matches.

**-c**, **--count**
> Print count of matches per file.

**-F**, **--fixed-strings**
> Treat pattern as a literal string, not a regex.

**-w**, **--word-regexp**
> Match whole words only.

**-x**, **--line-regexp**
> Match entire lines only.

**--hidden**
> Search hidden files and directories.

**-g**, **--glob** _GLOB_
> Include or exclude files matching glob (prefix with ! to exclude).

**-u**, **--unrestricted**
> Reduce filtering. Repeat (-uu or -uuu) for more.

**-U**, **--multiline**
> Enable multiline matching.

**-P**, **--pcre2**
> Use PCRE2 regex engine for advanced patterns.

**-r**, **--replace** _STRING_
> Replace matches with STRING (supports capture groups).

**-n**, **--line-number**
> Show line numbers (default when connected to terminal).

**-N**, **--no-line-number**
> Suppress line numbers.

**--no-ignore**
> Do not respect .gitignore and other ignore files.

**--type-list**
> List all built-in file types.

# DESCRIPTION

**ripgrep** (rg) is a line-oriented search tool that recursively searches directories for regex patterns, optimized for speed through a Rust implementation and parallel directory traversal. It is typically several times faster than traditional grep, ag, or ack for searching large codebases.

Smart defaults make it productive out of the box: it automatically respects .gitignore rules, skips binary files and hidden directories, and provides colored output with line numbers. These defaults eliminate the need for complex exclude patterns that are common with recursive grep usage. The **--hidden** flag includes hidden files, and **-u** flags progressively disable filters: **-u** searches ignored files, **-uu** also searches hidden files, and **-uuu** also searches binary files.

Ripgrep supports full Unicode-aware regex syntax, PCRE2 patterns via **-P**, literal string matching with **-F**, and word boundary matching with **-w**. File type filters (**-t**) cover dozens of common programming languages and can be customized. Use **--type-list** to see all available types.

# CAVEATS

Regex syntax defaults to Rust's regex crate, which differs from POSIX or PCRE in some areas (e.g., no backreferences without **-P**). The **-u** flag must be repeated for cumulative effect. By default, ripgrep does not search files listed in .gitignore, which can be surprising when searching outside of Git repositories with a global gitignore.

# HISTORY

**ripgrep** was created by **Andrew Gallant** in **2016**. It combines speed with smart defaults, becoming one of the most popular grep alternatives in modern development workflows.

# SEE ALSO

[grep](/man/grep)(1), [ag](/man/ag)(1), [ack](/man/ack)(1), [fd](/man/fd)(1)

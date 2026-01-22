# TLDR

**Search for a pattern** in current directory

```rg "[pattern]"```

**Search in specific files or directories**

```rg "[pattern]" [path]```

**Search case-insensitively**

```rg -i "[pattern]"```

**Search for whole words only**

```rg -w "[pattern]"```

**Show line numbers** with matches

```rg -n "[pattern]"```

**Show context lines** around matches

```rg -C [3] "[pattern]"```

**Search specific file types**

```rg -t [py] "[pattern]"```

**Search hidden files and directories**

```rg --hidden "[pattern]"```

**List files containing matches** (no content)

```rg -l "[pattern]"```

**Count matches per file**

```rg -c "[pattern]"```

# SYNOPSIS

**rg** [_options_] _pattern_ [_path_...]

# PARAMETERS

**-i**, **--ignore-case**
> Case-insensitive search

**-S**, **--smart-case**
> Case-insensitive unless pattern has uppercase

**-w**, **--word-regexp**
> Match whole words only

**-x**, **--line-regexp**
> Match whole lines only

**-c**, **--count**
> Show count of matches per file

**-l**, **--files-with-matches**
> Show only filenames with matches

**-L**, **--files-without-match**
> Show only filenames without matches

**-n**, **--line-number**
> Show line numbers (default when terminal)

**-H**, **--with-filename**
> Show filename with matches

**-A** _num_, **--after-context**
> Show num lines after match

**-B** _num_, **--before-context**
> Show num lines before match

**-C** _num_, **--context**
> Show num lines before and after match

**-t** _type_, **--type**
> Search only files of specified type

**-T** _type_, **--type-not**
> Exclude files of specified type

**-g** _glob_, **--glob**
> Include/exclude files matching glob

**--hidden**
> Search hidden files and directories

**-u**, **--unrestricted**
> Reduce filtering (repeatable: -uu, -uuu)

**-F**, **--fixed-strings**
> Treat pattern as literal string

**-e** _pattern_
> Specify pattern (allows multiple)

**-r** _replacement_, **--replace**
> Replace matches with text

**-o**, **--only-matching**
> Show only matched parts

# DESCRIPTION

**rg** (ripgrep) is a fast, recursive grep alternative that respects gitignore rules by default. It searches directories for regex patterns, automatically skipping hidden files, binary files, and ignored paths.

Ripgrep uses Rust's regex engine for speed and supports most Perl-compatible regex syntax. It's designed for searching codebases, automatically detecting and skipping binary files and respecting .gitignore patterns.

Multiple patterns can be specified with **-e**. File type filtering uses built-in definitions (use **rg --type-list** to see available types). Custom globs with **-g** provide flexible include/exclude patterns.

Output is colorized by default when writing to a terminal. Use **--color=never** for scripts or **--color=always** for piping to pagers.

# CAVEATS

By default, ripgrep skips hidden files, gitignored files, and binary files. Use **--hidden**, **--no-ignore**, or **-u** to search more comprehensively.

Ripgrep uses Rust regex syntax, which differs slightly from PCRE. Some advanced features like backreferences are not supported.

For very large result sets, consider **-l** (files only) or **-c** (counts) to reduce output volume.

# HISTORY

Ripgrep was created by **Andrew Gallant** (BurntSushi) and first released in **2016**. Written in Rust, it combines the usability of The Silver Searcher (ag) with the raw speed of GNU grep, while adding gitignore support. It has become one of the most popular grep alternatives.

# SEE ALSO

[grep](/man/grep)(1), [ag](/man/ag)(1), [ack](/man/ack)(1), [git-grep](/man/git-grep)(1)

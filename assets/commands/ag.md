# TAGLINE

Search code fast like ack but faster

# TLDR

**Search** for a pattern recursively

```ag [pattern]```

Search in **specific file types**

```ag --python [pattern]```

Search with **case insensitivity**

```ag -i [pattern]```

Show only **file names** containing matches

```ag -l [pattern]```

Search for **literal string** (no regex)

```ag -Q "[literal string]"```

Search with **context** lines

```ag -C [3] [pattern]```

# SYNOPSIS

**ag** [_options_] _pattern_ [_path_...]

# DESCRIPTION

**ag** (The Silver Searcher) is a code-searching tool similar to ack but faster. It searches through source code recursively, automatically ignoring files listed in .gitignore and .hgignore, and skipping hidden files and binary files.

The tool is optimized for speed, using multiple threads and memory-mapped I/O. It supports Perl-compatible regular expressions and provides colored output with context lines.

# PARAMETERS

**-i**, **--ignore-case**
> Case insensitive search

**-s**, **--case-sensitive**
> Case sensitive search (default)

**-v**, **--invert-match**
> Invert the match

**-w**, **--word-regexp**
> Match whole words only

**-l**, **--files-with-matches**
> Print only file names with matches

**-L**, **--files-without-matches**
> Print file names without matches

**-c**, **--count**
> Print count of matches per file

**-C** _n_, **--context=**_n_
> Print n lines of context

**-A** _n_, **--after=**_n_
> Print n lines after match

**-B** _n_, **--before=**_n_
> Print n lines before match

**-Q**, **--literal**
> Treat pattern as literal string

**--python**, **--js**, **--html**, etc.
> Search only specific file types

**-g** _pattern_
> Search file names matching pattern

**--hidden**
> Search hidden files

**-u**, **--unrestricted**
> Search all files (ignore .gitignore)

**-z**, **--search-zip**
> Search inside compressed files

# CONFIGURATION

**~/.agignore**
> Global file patterns to ignore during searches.

**.agignore**
> Per-project file patterns to ignore, similar to .gitignore syntax.

# CAVEATS

Not as fast as **ripgrep** on very large codebases. Some regex features may differ from grep. File type detection is based on extensions, not content.

# HISTORY

**ag** was created by Geoff Greer and first released in **2011**. It was designed as a faster alternative to ack, achieving significant speed improvements through parallelization and smarter file filtering. It inspired later tools like ripgrep.

# SEE ALSO

[rg](/man/rg)(1), [ack](/man/ack)(1), [grep](/man/grep)(1), [git-grep](/man/git-grep)(1)

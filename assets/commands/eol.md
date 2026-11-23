# TAGLINE

report and convert end-of-line characters in text files

# TLDR

**Report line-ending style** of a file

```eol [file.txt]```

**Convert to Unix** (LF)

```eol -c LF [file.txt]```

**Convert to Windows** (CRLF) using an alias

```eol -c dos [file.bat]```

**Convert to the platform's native** style

```eol -c native [file.txt]```

**Recursively find files** with DOS line endings

```eol -r -f CRLF [path]```

**Find files with mixed** line endings

```eol -r -f mixed [path]```

**Skip a directory** while scanning

```eol -r -x .git [path]```

**Convert all files** in a directory tree to LF

```eol -r -x .git -c LF [path]```

# SYNOPSIS

**eol** [_options_] _path_...

# PARAMETERS

**-c**, **--convert** _NAME_
> Convert files to the given EOL style. _NAME_ is one of LF, CRLF, CR, NATIVE, or the aliases unix (LF), dos and windows (CRLF); case-insensitive.

**-f**, **--find** _NAME_
> List files that have the given EOL style. Accepts the same names as `-c` plus NONE and MIXED. Only one of `-c`, `-f` and `--test` may be given.

**-r**, **--recursive**
> Recurse into directories (off by default).

**-x**, **--skip** _PATTERN_
> Skip files or directories matching _PATTERN_ (e.g. `.git`, `*.pyc`). Repeatable.

**-v**, **--verbose**
> Show debug-level output.

**-q**, **--quiet**
> Only show warnings and errors.

**--test**
> Run the tool's self-tests and exit.

**--version**
> Print the version and exit.

**-h**, **--help**
> Show help.

# DESCRIPTION

**eol** is a command-line script (and Python module) for inspecting and converting end-of-line characters in text files. With no action flag it reports each file's detected EOL style (Unix/LF, Windows/CRLF, Mac Classic/CR, mixed, or none).

Use `-c` to rewrite files to a chosen style, or `-f` to locate files that already use a particular style. Directory traversal is off unless `-r` is given. Binary files (any file containing a null byte) are skipped. For mixed files the report also names the predominant style.

# CAVEATS

Conversion rewrites files in place; keep a backup or use version control. Files with mixed line endings are normalized to the target style on `-c`. Binary detection is a simple null-byte heuristic, so UTF-16 text files are treated as binary. This is the **trentm/eol** Python tool; other distributions ship unrelated programs also named _eol_.

# HISTORY

**eol** was written by **Trent Mick** at ActiveState (copyright 2005-2010) and is distributed on PyPI as the `eol` package. The latest release is 0.7.5, which added the unix/dos/windows aliases; the repository has seen little activity since 2022.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [mac2unix](/man/mac2unix)(1), [file](/man/file)(1), [tr](/man/tr)(1)

# RESOURCES

```[Source code](https://github.com/trentm/eol)```

<!-- verified: 2026-11-23 -->

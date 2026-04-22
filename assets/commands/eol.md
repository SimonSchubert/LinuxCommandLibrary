# TAGLINE

report and convert end-of-line characters in text files

# TLDR

**Report line-ending style** of a file

```eol [file.txt]```

**Convert to Unix** (LF)

```eol -c LF [file.txt]```

**Convert to Windows** (CRLF)

```eol -c CRLF [file.txt]```

**Convert to the platform's native** style

```eol -c native [file.txt]```

**Recursively find files** with DOS line endings

```eol -r -f dos [path]```

**Skip a directory** while scanning

```eol -r -x .git [path]```

# SYNOPSIS

**eol** [_options_] _path_...

# PARAMETERS

**-c**, **--convert** _NAME_
> Convert files to the given EOL style. _NAME_ is one of LF, CRLF, CR, NATIVE (aliases: unix, dos/windows, mac, native — case-insensitive).

**-f**, **--find** _NAME_
> List files that have the given EOL style. Accepts the same names as `-c` plus NONE and MIXED.

**-r**, **--recursive**
> Recurse into directories (off by default).

**-x**, **--skip** _PATTERN_
> Skip files or directories matching _PATTERN_ (e.g. `.git`, `*.pyc`).

**-v**, **--verbose**
> Show debug-level output.

**-q**, **--quiet**
> Only show warnings and errors.

**--test**
> Run the tool's self-tests and exit.

**-h**, **--help**
> Show help.

# DESCRIPTION

**eol** is a command-line script (and Python module) for inspecting and converting end-of-line characters in text files. With no action flag it reports each file's detected EOL style (Unix/LF, Windows/CRLF, Mac Classic/CR, mixed, or none).

Use `-c` to rewrite files to a chosen style, or `-f` to locate files that already use a particular style. Directory traversal is off unless `-r` is given. Binary files are detected and skipped by default.

# CAVEATS

Conversion rewrites files in place; keep a backup or use version control. Files with mixed line endings are normalized to the target style on `-c`. This is the **trentm/eol** Python tool; other distributions ship unrelated programs also named _eol_.

# HISTORY

**eol** was written by **Trent Mick** and is distributed on PyPI as the `eol` package. The project has been maintained on GitHub since the late 2000s.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [file](/man/file)(1), [tr](/man/tr)(1)

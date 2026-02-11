# TAGLINE

Remove symbols from object files

# TLDR

**Strip** all symbols from a file (in place)

```strip [path/to/file]```

Strip and save to **output file**

```strip [path/to/input] -o [path/to/output]```

Strip **debug symbols** only

```strip -d [path/to/file.o]```

Strip **unneeded** symbols

```strip --strip-unneeded [path/to/file]```

**Keep** specific symbols

```strip -K [symbol_name] [path/to/file]```

**Remove** specific section

```strip -R [section_name] [path/to/file]```

Keep only **debug** information

```strip --only-keep-debug [path/to/file]```

# SYNOPSIS

**strip** [_OPTIONS_] _objfile_...

# PARAMETERS

**-s, --strip-all**
> Remove all symbols (default)

**-g, -S, -d, --strip-debug**
> Remove debugging symbols only

**--strip-unneeded**
> Remove unneeded symbols for relocation

**--only-keep-debug**
> Keep only debugging sections

**-K, --keep-symbol** _name_
> Preserve specific symbol (repeatable)

**-N, --strip-symbol** _name_
> Remove specific symbol (repeatable)

**-R, --remove-section** _name_
> Remove named section (wildcards allowed)

**--keep-section** _pattern_
> Retain matching sections

**-x, --discard-all**
> Remove all non-global symbols

**-X, --discard-locals**
> Remove compiler-generated local symbols

**-o** _file_
> Write output to file (single input only)

**-p, --preserve-dates**
> Keep access/modification timestamps

**-D, --enable-deterministic-archives**
> Use zero for UID/GID/timestamps in archives

**-w, --wildcard**
> Allow regex in symbol names

**-v, --verbose**
> List processed files

**--help**
> Display help

**--version**
> Display version

# DESCRIPTION

**strip** removes symbols and other data from object files and executables, reducing file size and making reverse engineering more difficult. It modifies files in-place by default. Archives (.a files) can also be stripped.

Stripping debug symbols is common for release builds to reduce binary size while retaining functionality. The **--only-keep-debug** option creates separate debug files that can be used with debuggers while keeping production binaries small.

# CAVEATS

Stripping modifies files in place; back up originals if needed. Over-stripping can break dynamic linking or debugging capabilities. Use **--strip-debug** for libraries that may be linked against. Static analysis and debugging become difficult after stripping.

# HISTORY

**strip** is part of GNU **binutils**, the collection of binary tools maintained by the Free Software Foundation. The command originated in early Unix at Bell Labs in the **1970s** as a way to reduce executable size on systems with limited storage. GNU binutils provides the modern implementation used on Linux.

# SEE ALSO

[objcopy](/man/objcopy)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1), [nm](/man/nm)(1)

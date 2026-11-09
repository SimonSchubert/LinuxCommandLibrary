# TAGLINE

Process .so includes in roff source files

# TLDR

**Process .so requests in file**

```zsoelim [file.man]```

**Process from stdin**

```cat [file.man] | zsoelim```

**Process compressed man page**

```zcat [file.man.gz] | zsoelim```

# SYNOPSIS

**zsoelim** [**-CVh**] [_file_...]

# PARAMETERS

**-C**, **--compatible**
> Accepted for compatibility with other soelim programs. Enabling .so requests followed by something other than whitespace is already the default, so this flag is ignored

**-V**, **--version**
> Display version information

**-h**, **--help**
> Display help message

# DESCRIPTION

**zsoelim** processes **.so** requests in roff/man page source files. The **.so** directive includes the content of another file, similar to C's #include.

When man pages contain lines like **.so man3/other.3**, zsoelim reads and substitutes the referenced file's content. This is used in the man page system to avoid duplicating documentation for aliases.

The "z" prefix indicates support for gzip-compressed input files, typical of the man page system where sources may be stored compressed.

If a requested file cannot be opened, zsoelim also looks for it with a compression extension such as .gz, .Z or .z and decompresses it. Included files are processed recursively.

# CAVEATS

Primarily used as part of the man page processing pipeline, rarely invoked directly.

Paths in .so directives are usually relative to the top of a manual hierarchy, such as man3/other.3. When run directly, zsoelim tries the path as given, then looks in each manpath entry.

The tool expects roff/man page format input. It's not a general-purpose file includer.

# SEE ALSO

[soelim](/man/soelim)(1), [man](/man/man)(1), [groff](/man/groff)(1), [zcat](/man/zcat)(1), [nroff](/man/nroff)(1), [troff](/man/troff)(1)

# RESOURCES

```[Source code](https://gitlab.com/man-db/man-db)```

```[Homepage](https://man-db.gitlab.io/man-db/)```

<!-- verified: 2026-11-09 -->

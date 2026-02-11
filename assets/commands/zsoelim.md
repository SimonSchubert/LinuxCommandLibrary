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
> Operate in groff compatible mode

**-V**, **--version**
> Display version information

**-h**, **--help**
> Display help message

# DESCRIPTION

**zsoelim** processes **.so** requests in roff/man page source files. The **.so** directive includes the content of another file, similar to C's #include.

When man pages contain lines like **.so man3/other.3**, zsoelim reads and substitutes the referenced file's content. This is used in the man page system to avoid duplicating documentation for aliases.

The "z" prefix indicates support for gzip-compressed input files, typical of the man page system where sources may be stored compressed.

zsoelim searches for included files in the standard man page hierarchy and processes them recursively.

# CAVEATS

Primarily used as part of the man page processing pipeline, rarely invoked directly.

File paths in .so directives are relative to the man directory structure, not the current directory.

The tool expects roff/man page format input. It's not a general-purpose file includer.

# SEE ALSO

[soelim](/man/soelim)(1), [man](/man/man)(1), [groff](/man/groff)(1), [zcat](/man/zcat)(1)

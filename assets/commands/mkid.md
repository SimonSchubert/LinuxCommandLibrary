# TAGLINE

builds an identifier database for source code files, enabling fast searches

# TLDR

Build an **ID database** for the current directory

```mkid```

Build an ID database for **specific directories**

```mkid [path/to/directory1] [path/to/directory2]```

Build an ID database and **save to a specific file**

```mkid -o [path/to/database.id]```

Include only **specific languages**

```mkid -i "C C++"```

**Exclude named files or directories** from indexing

```mkid -p [.git]```

Display **statistics** after building the database

```mkid -s```

# SYNOPSIS

**mkid** [_options_] [_file_...]

# PARAMETERS

**-o**, **--output** _OUTFILE_
> Output database file; default is ID in the current directory

**-f**, **--file** _OUTFILE_
> Synonym for **--output**

**-i**, **--include** _LANGS_
> Include only these languages; default is "C C++ asm"

**-x**, **--exclude** _LANGS_
> Exclude these languages from indexing

**-l**, **--lang-option** _L:OPT_
> Pass OPT as a default for language L

**-m**, **--lang-map** _MAPFILE_
> Use MAPFILE to map file names onto source languages

**-d**, **--default-lang** _LANG_
> Make LANG the default source language

**-p**, **--prune** _NAMES_
> Exclude the named files and directories

**--files0-from** _FILE_
> Tokenize only the files named in FILE, NUL-terminated

**-v**, **--verbose**
> Report per-file statistics

**-s**, **--statistics**
> Report statistics at end of run

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**mkid** builds an identifier database for source code files, enabling fast searches with **lid**, **gid**, and other GNU idutils tools. It scans source files, extracts identifiers (function names, variables, macros), and stores them in a compact database.

The tool recursively processes directories, recognizing languages including C, C++, Java, assembly, Perl, Lisp and plain text. Each file argument may be a file or a directory; the current directory is searched by default.

# CAVEATS

The --include and --exclude options are mutually exclusive. The database must be rebuilt when source files change to reflect current identifiers.

# HISTORY

**Greg McGary** conceived the ID utilities in **1984** while working on the Unix kernel and first posted them to comp.sources.unix in **1987** under the name id. **Tom Horsley** released mkid version 2 in **1990**, and McGary returned in **1995** to develop mkid version 3, which is linear in time and space. The tools are distributed as **GNU idutils**.

# SEE ALSO

[lid](/man/lid)(1), [grep](/man/grep)(1), [ctags](/man/ctags)(1)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/idutils.git)```

```[Documentation](https://www.gnu.org/software/idutils/manual/idutils.html)```

<!-- verified: 2026-11-09 -->

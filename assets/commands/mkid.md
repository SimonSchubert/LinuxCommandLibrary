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

```mkid -i "[C C++ asm]"```

**Exclude specific directories** from indexing

```mkid -p [path/to/excluded_directory]```

Display **statistics** after building the database

```mkid -s```

# SYNOPSIS

**mkid** [**-o** _outfile_] [**-i** _langs_] [**-x** _langs_] [**-p** _names_] [**-s**] [**-v**] [_file_...]

# PARAMETERS

**-o, --output _outfile_**
> Specify output database file; default is ID in current directory

**-f, --file _outfile_**
> Alias for --output

**-i, --include _langs_**
> Include only specified languages; default is C, C++, asm

**-x, --exclude _langs_**
> Exclude specified languages from indexing

**-m, --lang-map _mapfile_**
> Use custom filename-to-language mapping

**-d, --default-lang _lang_**
> Set default language for unrecognized files

**-p, --prune _names_**
> Skip named files and directories during scanning

**--files0-from _file_**
> Read file list from specified file (NUL-terminated)

**-v, --verbose**
> Display per-file processing statistics

**-s, --statistics**
> Display summary statistics after completion

# DESCRIPTION

**mkid** builds an identifier database for source code files, enabling fast searches with **lid**, **gid**, and other GNU idutils tools. It scans source files, extracts identifiers (function names, variables, macros), and stores them in a compact database.

The tool recursively processes directories, recognizing multiple programming languages including C, C++, assembly, Perl, and plain text. The database format optimizes lookup speed for subsequent searches.

# CAVEATS

The --include and --exclude options are mutually exclusive. Large codebases may require significant time and memory for initial database creation. The database must be rebuilt when source files change to reflect current identifiers.

# HISTORY

**mkid** is part of **GNU idutils**, originally written by Greg McGary. The package provides tools for building and querying identifier databases, designed for large-scale software development. It has been part of the GNU project since the early 1990s.

# SEE ALSO

[lid](/man/lid)(1), [gid](/man/gid)(1), [fid](/man/fid)(1), [fnid](/man/fnid)(1)

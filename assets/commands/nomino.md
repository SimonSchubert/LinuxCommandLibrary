# TAGLINE

Batch rename utility for developers

# TLDR

**Rename files using a regex pattern**

```nomino -r "[regex]" "[output_pattern]"```

**Preview changes without renaming (test mode)**

```nomino -t -r "[regex]" "[output_pattern]"```

**Sort files and rename with ascending numbers**

```nomino -s asc "[output_pattern]"```

**Generate a JSON map of renames**

```nomino -g [map.json] -r "[regex]" "[output_pattern]"```

**Rename using a JSON map file**

```nomino -m [map.json]```

**Rename in a specific directory**

```nomino -d [/path/to/dir] -r "[regex]" "[output_pattern]"```

# SYNOPSIS

**nomino** [_options_] [[_source_] _output_]...

# PARAMETERS

**-r**, **--regex** _PATTERN_
> Regex pattern to match filenames.

**-s**, **--sort** _ORDER_
> Sort files naturally by name (asc or desc) and rename using enumerator.

**-m**, **--map** _PATH_
> Use a JSON map file for renaming files.

**-g**, **--generate** _PATH_
> Store a JSON map file after renaming.

**-d**, **--dir** _PATH_
> Set the working directory.

**-E**, **--no-extension**
> Do not preserve file extensions in sort and regex modes.

**-k**, **--mkdir**
> Recursively create parent directories of output if missing.

**-p**, **--print**
> Print the map table to stdout.

**-q**, **--quiet**
> Do not print the map table to stdout.

**-t**, **--test**
> Run in test mode without renaming actual files.

**-w**, **--overwrite**
> Overwrite output files. Otherwise a '_' is prepended to the filename.

**--depth** _DEPTH_
> Override inferred subdirectory depth in regex mode.

**--max-depth** _DEPTH_
> Set maximum subdirectory depth in regex mode.

# DESCRIPTION

**nomino** is a batch rename utility for developers. It supports regex-based pattern matching, natural sorting, JSON map generation, and directory creation for documenting and executing rename operations.

File extensions are preserved by default in sort and regex modes unless **-E** is used.

# CAVEATS

Always preview changes with **-t** (test mode) before executing. File extensions are preserved by default in sort and regex modes. Without **-w**, existing output files are not overwritten; a '_' is prepended instead.

# HISTORY

**nomino** was created by **yaa110** and is written in **Rust**.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [mmv](/man/mmv)(1)

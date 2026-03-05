# TAGLINE

Batch rename utility for developers

# TLDR

**Rename files using a regex pattern**

```nomino -r "[regex]" "[output_pattern]"```

**Dry run** to preview changes

```nomino -r "[regex]" "[output_pattern]" -p```

**Sort files and rename with ascending numbers**

```nomino -s "[sort_order]" "[output_pattern]"```

**Generate a JSON map** of renames

```nomino -r "[regex]" "[output_pattern]" -g [map.json]```

# SYNOPSIS

**nomino** [_options_] _output_ [_source_]

# PARAMETERS

**-r**, **--regex** _PATTERN_
> Regex pattern to match filenames (RE2 syntax).

**-s**, **--sort** _ORDER_
> Sort files naturally in ascending or descending order.

**-p**, **--print**
> Dry run — preview changes without renaming.

**-g**, **--generate** _FILE_
> Generate a JSON map of the rename operations.

**-e**, **--extension**
> Preserve file extensions during rename.

# DESCRIPTION

**nomino** is an async batch rename utility for developers. It supports regex-based pattern matching, natural sorting, file extension preservation, dry-run mode, and JSON map generation for documenting rename operations.

# CAVEATS

Uses RE2 regex syntax. Always use dry-run mode (**-p**) to preview changes before executing.

# HISTORY

**nomino** was created by **yaa110** and is written in **Rust**.

# SEE ALSO

[rename](/man/rename)(1), [mv](/man/mv)(1), [mmv](/man/mmv)(1)

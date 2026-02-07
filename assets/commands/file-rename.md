# TAGLINE

Perl regex-based file renaming

# TLDR

**Rename using Perl expression**

```file-rename 's/old/new/' [files]```

**Rename to lowercase**

```file-rename 'y/A-Z/a-z/' [files]```

**Dry run to preview changes**

```file-rename -n 's/pattern/replacement/' [files]```

**Replace spaces with underscores**

```file-rename 's/ /_/g' [files]```

**Add prefix to files**

```file-rename 's/^/prefix_/' [files]```

**Add extension**

```file-rename 's/$/.txt/' [files]```

# SYNOPSIS

**file-rename** [_options_] _expression_ [_files_...]

# PARAMETERS

**-n**, **--no-act**
> Dry run, show what would happen.

**-v**, **--verbose**
> Print names of files renamed.

**-f**, **--force**
> Overwrite existing files.

# DESCRIPTION

**file-rename** (also known as rename or prename) renames multiple files using Perl regular expressions, providing powerful pattern-based transformation capabilities. Unlike simple mv operations, it can apply complex substitutions, case conversions, and pattern matching across multiple filenames simultaneously.

The tool supports the full Perl regex syntax including capture groups, look-ahead/look-behind assertions, and transliteration operations. Common uses include batch renaming, removing or replacing characters, changing file extensions, and standardizing filename formats.

file-rename's dry-run mode (-n) allows preview of changes before execution, preventing accidental destructive operations. The force flag (-f) enables overwriting existing files when name collisions occur.

# CAVEATS

Multiple implementations of rename exist. This documents the Perl version (prename), not the util-linux version.

# SEE ALSO

[mv](/man/mv)(1), [mmv](/man/mmv)(1)


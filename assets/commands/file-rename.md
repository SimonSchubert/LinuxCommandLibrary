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

**file-rename** (also called rename or prename) renames files using Perl regular expressions. Provides powerful pattern-based renaming capabilities.

# CAVEATS

Multiple implementations of rename exist. This documents the Perl version (prename), not the util-linux version.

# SEE ALSO

[mv](/man/mv)(1), [mmv](/man/mmv)(1)


# TAGLINE

divides a change into multiple changes

# TLDR

**Split current change**

```jj split```

**Split specific revision**

```jj split -r [rev]```

**Split specific files**

```jj split [file1] [file2]```

**Interactive split**

```jj split -i```

# SYNOPSIS

**jj split** [_options_] [_paths_...]

# PARAMETERS

_PATHS_
> Files to split into first change.

**-r** _REV_
> Revision to split.

**-i**, **--interactive**
> Interactive hunk selection.

**--help**
> Display help information.

# DESCRIPTION

**jj split** divides a change into multiple changes. It separates modifications into logical units.

The command supports interactive hunk selection. Split changes share the original parent.

# CAVEATS

Subcommand of jj. Creates two changes from one. Interactive mode for fine control.

# HISTORY

jj split is part of **Jujutsu**, enabling flexible change management and history rewriting.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1), [jj-describe](/man/jj-describe)(1)

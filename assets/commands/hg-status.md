# TLDR

**Show all changed files**

```hg status```

**Show only modified files**

```hg status -m```

**Show only added files**

```hg status -a```

**Show untracked files**

```hg status -u```

**Show changes in specific revision**

```hg status --change [rev]```

**Show clean files**

```hg status -c```

# SYNOPSIS

**hg** **status** [_options_] [_file_...]

# PARAMETERS

**-m**, **--modified**
> Show only modified files.

**-a**, **--added**
> Show only added files.

**-r**, **--removed**
> Show only removed files.

**-d**, **--deleted**
> Show only deleted (missing) files.

**-c**, **--clean**
> Show only clean (unchanged) files.

**-u**, **--unknown**
> Show only untracked files.

**--change** _rev_
> Show changes in revision.

# DESCRIPTION

**hg status** displays the state of files in the working directory. Status codes: **M** (modified), **A** (added), **R** (removed), **C** (clean), **!** (missing), **?** (untracked), **I** (ignored). Use **hg diff** to see actual content changes.

# SEE ALSO

[hg](/man/hg)(1), [hg-diff](/man/hg-diff)(1), [hg-commit](/man/hg-commit)(1)


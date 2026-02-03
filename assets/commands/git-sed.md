# TLDR

**Find and replace in tracked files**

```git sed "[old]" "[new]"```

**Replace with flags**

```git sed -f [g] "[pattern]" "[replacement]"```

# SYNOPSIS

**git** **sed** [_options_] _pattern_ _replacement_

# PARAMETERS

**-f** _flags_
> Sed flags.

**-c**
> Commit changes.

# DESCRIPTION

**git sed** runs find and replace across all tracked files. Part of git-extras. Uses sed internally but only modifies Git-tracked files.

# SEE ALSO

[sed](/man/sed)(1), [git-grep](/man/git-grep)(1), [git-extras](/man/git-extras)(1)


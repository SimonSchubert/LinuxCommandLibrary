# TAGLINE

Find and replace across tracked files

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

**git sed** runs a find-and-replace operation across all Git-tracked files. Part of git-extras, it uses sed internally but limits changes to files under version control, avoiding untracked or ignored files.

# SEE ALSO

[sed](/man/sed)(1), [git-grep](/man/git-grep)(1), [git-extras](/man/git-extras)(1)

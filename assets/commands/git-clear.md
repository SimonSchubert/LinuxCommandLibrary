# TAGLINE

Reset and clean working directory

# TLDR

**Clear working directory**

```git clear```

**Clear with force**

```git clear -f```

# SYNOPSIS

**git** **clear** [_options_]

# PARAMETERS

**-f**, **--force**
> Force without confirmation.

# DESCRIPTION

**git clear** is a git-extras command that combines git reset --hard and git clean operations into a single convenience command. It removes all uncommitted changes, both tracked and untracked, returning the repository to a pristine state matching HEAD.

This command is useful when you want to completely abandon all local modifications and start fresh. It's more aggressive than git reset --hard alone, which only removes changes to tracked files, leaving untracked files intact.

The operation is destructive and cannot be undone, as it permanently deletes uncommitted work. The -f flag bypasses confirmation prompts, allowing automated scripts to clean repositories without user interaction. Use with caution in repositories containing valuable uncommitted work.

# SEE ALSO

[git-reset](/man/git-reset)(1), [git-clean](/man/git-clean)(1), [git-extras](/man/git-extras)(1)


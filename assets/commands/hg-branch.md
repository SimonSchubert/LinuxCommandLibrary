# TAGLINE

manages named branches in Mercurial

# TLDR

**Show current branch**

```hg branch```

**Create a new branch**

```hg branch [branch-name]```

**List all branches**

```hg branches```

**Switch to a branch**

```hg update [branch-name]```

**Close current branch**

```hg commit --close-branch -m "[message]"```

# SYNOPSIS

**hg** **branch** [_name_]

# PARAMETERS

**-f**, **--force**
> Set branch name even if shadowing an existing branch.

**-C**, **--clean**
> Reset branch name to parent branch name.

# DESCRIPTION

**hg branch** manages named branches in Mercurial. Without arguments, it shows the current branch name. With a name argument, it marks the working directory as being on a new branch, which takes effect on the next commit. Named branches are permanent parts of changeset history. For lightweight Git-style branches, use **hg bookmark** instead.

# SEE ALSO

[hg](/man/hg)(1), [hg-update](/man/hg-update)(1), [hg-bookmark](/man/hg-bookmark)(1)


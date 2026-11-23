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

**Reuse an existing branch name** (shadowing it)

```hg branch -f [branch-name]```

**Undo a pending branch change** (reset to the parent's branch)

```hg branch -C```

**Close current branch**

```hg commit --close-branch -m "[message]"```

# SYNOPSIS

**hg** **branch** [**-fC**] [_name_]

# PARAMETERS

**-f**, **--force**
> Set branch name even if shadowing an existing branch.

**-C**, **--clean**
> Reset branch name to parent branch name.

# DESCRIPTION

**hg branch** manages named branches in Mercurial. Without arguments, it shows the current branch name. With a name argument, it marks the working directory as being on a new branch, which takes effect on the next commit. Named branches are permanent parts of changeset history. For lightweight Git-style branches, use **hg bookmark** instead.

Unless **--force** is given, **hg branch** refuses to set a name that already exists. When all heads of a branch are closed with **hg commit --close-branch**, the branch is considered closed. Standard practice keeps primary development on the _default_ branch.

# SEE ALSO

[hg](/man/hg)(1), [hg-update](/man/hg-update)(1), [hg-commit](/man/hg-commit)(1)

# RESOURCES

```[Source code](https://repo.mercurial-scm.org/hg)```

```[Homepage](https://www.mercurial-scm.org)```

```[Documentation](https://www.mercurial-scm.org/help/commands/branch)```

<!-- verified: 2026-11-23 -->

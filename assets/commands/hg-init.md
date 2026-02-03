# TLDR

**Create repository in current directory**

```hg init```

**Create repository in new directory**

```hg init [project-name]```

# SYNOPSIS

**hg** **init** [_dest_]

# DESCRIPTION

**hg init** creates a new Mercurial repository in the specified directory or current directory if none given. It creates a **.hg** subdirectory containing all version control data. After initialization, use **hg add** to track files and **hg commit** to save changesets. The working directory contains the source files while **.hg** stores the repository history.

# SEE ALSO

[hg](/man/hg)(1), [hg-add](/man/hg-add)(1), [hg-commit](/man/hg-commit)(1), [hg-clone](/man/hg-clone)(1)


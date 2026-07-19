# TAGLINE

creates a new Mercurial repository in the specified directory or current

# TLDR

**Create repository in current directory**

```hg init```

**Create repository in new directory**

```hg init [project-name]```

# SYNOPSIS

**hg** **init** [_options_] [_dest_]

# PARAMETERS

_DEST_
> Directory to create the repository in; created if it doesn't exist. Defaults to the current directory.

**-e**, **--ssh** _CMD_
> Specify ssh command to use (for remote destinations).

**--remotecmd** _CMD_
> Specify hg command to run on the remote side.

**--insecure**
> Do not verify the server certificate.

**--help**
> Display help information.

# DESCRIPTION

**hg init** creates a new Mercurial repository in the specified directory or current directory if none given. It creates a **.hg** subdirectory containing all version control data. After initialization, use **hg add** to track files and **hg commit** to save changesets. The working directory contains the source files while **.hg** stores the repository history.

# CAVEATS

Fails if the destination already exists as a non-empty, non-repository directory. Initializing inside an existing repository creates a nested repo, which is usually unintended.

# HISTORY

Init is a core **Mercurial** command, present since the project's first release in 2005.

# SEE ALSO

[hg](/man/hg)(1), [hg-add](/man/hg-add)(1), [hg-commit](/man/hg-commit)(1), [hg-clone](/man/hg-clone)(1)

# RESOURCES

```[Source code](https://foss.heptapod.net/mercurial/mercurial-devel)```

```[Documentation](https://wiki.mercurial-scm.org/)```

<!-- verified: 2026-07-19 -->


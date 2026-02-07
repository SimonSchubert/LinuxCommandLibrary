# TAGLINE

Concurrent Versions System for version control

# TLDR

**Checkout a module** from the repository

```cvs checkout [module_name]```

**Update working copy** with latest changes

```cvs update```

**Commit changes** with a message

```cvs commit -m "[commit message]"```

**Add a new file** to version control

```cvs add [filename]```

**Show differences** from repository version

```cvs diff [filename]```

**View commit history** for a file

```cvs log [filename]```

**Create a branch**

```cvs tag -b [branch_name]```

# SYNOPSIS

**cvs** [_global-options_] _command_ [_command-options_] [_arguments_]

# PARAMETERS

**checkout** (co)
> Get a working copy from the repository.

**update** (up)
> Update working copy with repository changes.

**commit** (ci)
> Commit changes to the repository.

**add**
> Add files to version control.

**remove** (rm)
> Remove files from version control.

**diff**
> Show differences between versions.

**log**
> Show revision history.

**status**
> Show working copy status.

**tag**
> Add a symbolic tag to revisions.

**-d** _CVSROOT_
> Specify the repository root.

**-m** _MESSAGE_
> Commit message.

# DESCRIPTION

**CVS** (Concurrent Versions System) is a version control system that tracks changes to files over time. It enables multiple developers to work on the same codebase, managing merges and maintaining history of all changes.

CVS uses a client-server architecture where a central repository stores all versions. Developers checkout working copies, make changes locally, and commit them back. The system handles concurrent modifications through optimistic locking and merge resolution.

Operations include checking out code, updating to get others' changes, committing modifications, branching for parallel development, and tagging releases. CVS tracks changes at the file level, storing deltas efficiently.

# CAVEATS

CVS is considered legacy; Git and other distributed VCS are preferred for new projects. It cannot track directory operations well. Atomic commits are not guaranteed across multiple files. Branch and merge operations are more cumbersome than modern systems.

# HISTORY

CVS was developed by Dick Grune in **1986** and later enhanced by Brian Berliner. It was the dominant version control system throughout the 1990s, used by major open-source projects. It was largely superseded by Subversion and later Git in the 2000s.

# SEE ALSO

[svn](/man/svn)(1), [git](/man/git)(1), [rcs](/man/rcs)(1)

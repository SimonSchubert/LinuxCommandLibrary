# TAGLINE

Export Git commits to CVS repositories

# TLDR

**Export commit to CVS**

```git cvsexportcommit -c [commit]```

**Export without committing**

```git cvsexportcommit [commit]```

**Specify CVS module**

```git cvsexportcommit -w [cvs_workdir] [commit]```

# SYNOPSIS

**git** **cvsexportcommit** [_options_] _commit_

# PARAMETERS

**-c**
> Commit to CVS after exporting.

**-p**
> Generate patch file.

**-w** _dir_
> CVS working directory.

**-v**
> Verbose output.

# DESCRIPTION

**git cvsexportcommit** exports a Git commit to a CVS checkout, enabling migration of changes from Git to legacy CVS repositories. It applies a specific Git commit's changes to a CVS working directory, optionally committing them automatically.

The command handles file additions, modifications, and deletions, translating Git's commit semantics into equivalent CVS operations. It is particularly useful in hybrid environments where teams are transitioning from CVS to Git but must maintain synchronization with CVS-dependent systems.

# SEE ALSO

[git-cvsimport](/man/git-cvsimport)(1), [cvs](/man/cvs)(1)

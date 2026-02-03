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

**git cvsexportcommit** exports a Git commit to a CVS checkout. Used for migrating changes from Git to legacy CVS repositories.

# SEE ALSO

[git-cvsimport](/man/git-cvsimport)(1), [cvs](/man/cvs)(1)


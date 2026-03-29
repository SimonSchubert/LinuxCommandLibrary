# TAGLINE

Export a single Git commit to a CVS checkout

# TLDR

**Export a commit and automatically commit to CVS**

```git cvsexportcommit -v -c [commit]```

**Export a commit to a specific CVS working directory**

```git cvsexportcommit -v -w [path/to/cvs_workdir] [commit]```

**Export a commit with author information preserved**

```git cvsexportcommit -v -c -a [commit]```

**Force export even if CVS files are not up to date**

```git cvsexportcommit -f -c [commit]```

**Update CVS files before exporting and committing**

```git cvsexportcommit -u -v -c [commit]```

# SYNOPSIS

**git** **cvsexportcommit** [-h] [-u] [-v] [-c] [-P] [-p] [-a] [-d _cvsroot_] [-w _cvs-workdir_] [-W] [-f] [-m _msgprefix_] [-k] [_parent-commit_] _commit-id_

# PARAMETERS

**-c**
> Commit automatically if the patch applied cleanly. Will not commit if any hunks fail to apply or there were other problems.

**-p**
> Be pedantic (paranoid) when applying patches. Invokes patch with --fuzz=0.

**-a**
> Add authorship information. Adds Author line, and Committer (if different from Author) to the commit message.

**-d** _cvsroot_
> Set an alternative CVSROOT to use. Corresponds to the CVS -d parameter.

**-f**
> Force the merge even if the files are not up to date.

**-P**
> Force the parent commit, even if it is not a direct parent.

**-m** _msgprefix_
> Prepend the commit message with the provided prefix. Useful for patch series.

**-u**
> Update affected files from CVS repository before attempting export.

**-k**
> Reverse CVS keyword expansion (e.g., $Revision: 1.2.3.4$ becomes $Revision$) in the working CVS checkout before applying the patch.

**-w** _cvs-workdir_
> Specify the location of the CVS checkout to use for the export. The default is the value of cvsexportcommit.cvsdir.

**-W**
> Indicate that the current working directory is both a Git checkout and a CVS checkout. Git will reset the working directory to the parent commit before proceeding.

**-v**
> Verbose output.

# DESCRIPTION

**git cvsexportcommit** exports a single Git commit to a CVS checkout, enabling migration of changes from Git to legacy CVS repositories. It applies a specific Git commit's changes to a CVS working directory, optionally committing them automatically.

The command handles file additions, modifications, and deletions, translating Git's commit semantics into equivalent CVS operations. It is particularly useful in hybrid environments where teams are transitioning from CVS to Git but must maintain synchronization with CVS-dependent systems.

# SEE ALSO

[git](/man/git)(1), [cvs](/man/cvs)(1), [git-format-patch](/man/git-format-patch)(1)

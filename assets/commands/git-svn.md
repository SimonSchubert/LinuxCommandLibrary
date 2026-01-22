# TLDR

**Clone SVN repository**

```git svn clone [svn://server/repo]```

**Clone with standard layout**

```git svn clone -s [svn://server/repo]```

**Fetch SVN changes**

```git svn fetch```

**Rebase on SVN**

```git svn rebase```

**Commit to SVN**

```git svn dcommit```

# SYNOPSIS

**git svn** _command_ [_options_]

# PARAMETERS

**clone** _URL_
> Clone SVN repository.

**fetch**
> Fetch from SVN.

**rebase**
> Rebase on SVN commits.

**dcommit**
> Push commits to SVN.

**-s**, **--stdlayout**
> Standard trunk/branches/tags layout.

**-T** _PATH_
> Trunk path.

**-b** _PATH_
> Branches path.

**--help**
> Display help information.

# DESCRIPTION

**git svn** provides bidirectional operation between Git and Subversion. It allows using git locally while working with SVN repositories, enabling git workflows for SVN teams.

The command clones SVN repos to git, syncs changes, and commits back to SVN. It maps SVN structure to git branches and handles metadata translation.

git svn bridges Git and Subversion version control.

# CAVEATS

Some git features don't map to SVN. History rewriting breaks svn tracking. Slower than native git.

# HISTORY

git svn enables gradual migration from **Subversion** to Git, allowing teams to use git locally while maintaining SVN compatibility.

# SEE ALSO

[git](/man/git)(1), [svn](/man/svn)(1)

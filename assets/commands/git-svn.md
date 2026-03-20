# TAGLINE

Bidirectional bridge between Git and Subversion

# TLDR

**Clone SVN repository**

```git svn clone [svn://server/repo]```

**Clone with standard layout** (trunk/branches/tags)

```git svn clone -s [svn://server/repo]```

**Clone with author mapping**

```git svn clone -s --authors-file=[authors.txt] [svn://server/repo]```

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

**log**
> Show SVN-style log output.

**info**
> Show information about a file or directory similar to svn info.

**branch** _name_
> Create a new branch in SVN.

**create-ignore**
> Create .gitignore files from svn:ignore properties.

**show-ignore**
> Print svn:ignore properties to stdout.

**reset** **-r** _revision_
> Undo effects of fetch back to the specified revision.

**-s**, **--stdlayout**
> Standard trunk/branches/tags layout.

**-T** _PATH_
> Trunk path.

**-b** _PATH_
> Branches path.

**-t** _PATH_
> Tags path.

**--authors-file** _FILE_
> Map SVN usernames to Git authors.

**--prefix** _PREFIX_
> Prefix for SVN remote ref names.

**-r** _ARG_, **--revision** _ARG_
> Specify SVN revision (or range) to operate on.

**--ignore-paths** _REGEX_
> Perl regex of paths to skip during fetch.

# DESCRIPTION

**git svn** provides bidirectional operation between Git and Subversion repositories. It allows developers to use Git locally while working with an SVN server, enabling full Git workflows for teams still using Subversion.

The command clones SVN repos into Git, syncs changes in both directions, and maps SVN's trunk/branches/tags structure to Git branches.

# CAVEATS

Some git features don't map to SVN. History rewriting (rebase/amend) before dcommit breaks SVN tracking. Merges should be done with git svn rebase, not git merge. Operations are slower than native git due to SVN round-trips.

# HISTORY

git svn enables gradual migration from **Subversion** to Git, allowing teams to use git locally while maintaining SVN compatibility.

# SEE ALSO

[git](/man/git)(1), [svn](/man/svn)(1)

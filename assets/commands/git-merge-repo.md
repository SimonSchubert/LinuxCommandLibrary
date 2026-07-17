# TAGLINE

Merge repository into subdirectory

# TLDR

**Merge another repository**

```git merge-repo [repo-url] [branch] [directory]```

**Merge repo into subdirectory**

```git merge-repo [https://github.com/owner/repo.git] main [lib/]```

# SYNOPSIS

**git merge-repo** _url_ _branch_ _directory_

# PARAMETERS

_URL_
> Repository URL to merge.

_BRANCH_
> Branch to merge from.

_DIRECTORY_
> Target subdirectory.

**--help**
> Display help information.

# DESCRIPTION

**git merge-repo** merges another repository into a subdirectory while preserving its full commit history. It is a thin wrapper around `git subtree add -P <directory> <repo> <branch>`, so the incoming history is grafted in rather than squashed away.

Passing `.` as the directory is a special case: the repo is first added into a temporary subdirectory, then its files are moved up into the repository root (flattening it) instead of staying nested.

The command is useful for incorporating external libraries, consolidating multiple repositories into a monorepo, or absorbing a project that was previously maintained separately.

# CAVEATS

Part of git-extras package. Requires `git subtree` to be available. May need conflict resolution if paths collide.

# HISTORY

git merge-repo is part of **git-extras**, providing repository consolidation functionality for monorepo creation and library incorporation.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-subtree](/man/git-subtree)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-merge-repo)```

<!-- verified: 2026-07-17 -->

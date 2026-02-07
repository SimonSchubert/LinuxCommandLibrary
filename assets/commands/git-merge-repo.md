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

**git merge-repo** merges another repository into a subdirectory while preserving its full commit history. It handles the complex process of combining two separate repository histories with directory relocation.

The command is useful for incorporating external libraries, consolidating multiple repositories into a monorepo, or absorbing a project that was previously maintained separately.

# CAVEATS

Part of git-extras package. Complex operation. May need conflict resolution.

# HISTORY

git merge-repo is part of **git-extras**, providing repository consolidation functionality for monorepo creation and library incorporation.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-subtree](/man/git-subtree)(1)

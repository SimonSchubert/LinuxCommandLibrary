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

**git merge-repo** merges another repository into a subdirectory while preserving its history. It combines two repositories, placing the merged content in a specified directory.

The command handles the complex process of combining histories with directory relocation. It's useful for incorporating libraries or consolidating repositories.

git merge-repo enables repository consolidation with history.

# CAVEATS

Part of git-extras package. Complex operation. May need conflict resolution.

# HISTORY

git merge-repo is part of **git-extras**, providing repository consolidation functionality for monorepo creation and library incorporation.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-subtree](/man/git-subtree)(1)

# TLDR

**Count total commits**

```git count```

**Count commits by author**

```git count --all```

# SYNOPSIS

**git count** [_options_]

# PARAMETERS

**--all**
> Count commits per author.

**--help**
> Display help information.

# DESCRIPTION

**git count** shows the total number of commits in the repository. With the --all flag, it shows commit counts broken down by author.

The command provides a quick overview of repository activity and contributor participation. It's simpler than parsing git shortlog output.

git count offers quick commit statistics.

# CAVEATS

Part of git-extras package. Counts commits on current branch. Merge commits included.

# HISTORY

git count is part of **git-extras**, providing simple commit counting that complements git shortlog.

# SEE ALSO

[git-count-objects](/man/git-count-objects)(1), [git-shortlog](/man/git-shortlog)(1)

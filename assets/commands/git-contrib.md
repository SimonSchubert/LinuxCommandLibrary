# TLDR

**Show author contributions**

```git contrib [author-name]```

**Show contributions for email**

```git contrib "[email@example.com]"```

# SYNOPSIS

**git contrib** _author_

# PARAMETERS

_AUTHOR_
> Author name or email to search for.

**--help**
> Display help information.

# DESCRIPTION

**git contrib** displays a summary of commits by a specific author. It shows commit count and commit details, providing a quick overview of someone's contributions to the repository.

The command searches commits by author name or email pattern. It's useful for reviewing a contributor's work or generating contribution reports.

git contrib simplifies viewing individual contributor history.

# CAVEATS

Part of git-extras package. Author matching is substring-based. Shows commits reachable from current branch.

# HISTORY

git contrib is part of **git-extras**, created by **TJ Holowaychuk** to provide quick contributor summaries.

# SEE ALSO

[git-authors](/man/git-authors)(1), [git-shortlog](/man/git-shortlog)(1)

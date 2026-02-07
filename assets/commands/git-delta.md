# TAGLINE

List files that differ between branches

# TLDR

**List touched files**

```git delta [branch1] [branch2]```

**Compare with main**

```git delta main```

**Show added files**

```git delta [branch] --added```

# SYNOPSIS

**git delta** _branch1_ [_branch2_]

# PARAMETERS

_BRANCH1_
> First branch to compare.

_BRANCH2_
> Second branch (default: current).

**--added**
> Show only added files.

**--removed**
> Show only removed files.

**--help**
> Display help information.

# DESCRIPTION

**git delta** lists files that differ between two branches, providing a quick way to see which files have been added, modified, or removed between branch points. Unlike git diff, it shows only file names without content differences.

The command simplifies comparing branches for code review preparation or deployment planning. Part of the git-extras suite, it should not be confused with the separate "delta" project, which is a syntax-highlighting diff viewer.

# CAVEATS

Part of git-extras package. Shows files, not content. Also a popular diff viewer tool (different project).

# HISTORY

git delta in **git-extras** provides file-level branch diff. Note: There's also a separate **delta** project that's a syntax-highlighting diff viewer.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-log](/man/git-log)(1)

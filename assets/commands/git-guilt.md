# TLDR

**Show blame delta**

```git guilt [branch1] [branch2]```

**Blame delta from origin/main**

```git guilt origin/main HEAD```

**Show guilt for directory**

```git guilt HEAD~10 HEAD [src/]```

# SYNOPSIS

**git guilt** _since_ _until_ [_path_]

# PARAMETERS

_SINCE_
> Starting commit.

_UNTIL_
> Ending commit.

_PATH_
> Limit to path.

**--help**
> Display help information.

# DESCRIPTION

**git guilt** shows the delta in blame between two commits. It calculates which authors gained or lost lines of code between the specified revisions.

The output shows net line changes per author. Positive numbers indicate lines added, negative indicate lines removed. This reveals who is actively modifying which areas.

git guilt tracks authorship changes over time.

# CAVEATS

Part of git-extras package. Blame-based analysis can be slow. Measures lines, not complexity.

# HISTORY

git guilt is part of **git-extras**, providing blame-based change tracking named for the act of assigning "guilt" for code.

# SEE ALSO

[git-blame](/man/git-blame)(1), [git-effort](/man/git-effort)(1)

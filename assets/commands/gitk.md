# TAGLINE

Graphical Git repository browser

# TLDR

**Start gitk**

```gitk```

**Show all branches**

```gitk --all```

**Show specific file history**

```gitk [file.txt]```

**Show specific range**

```gitk [v1.0..v2.0]```

**Show since date**

```gitk --since="[2 weeks ago]"```

# SYNOPSIS

**gitk** [_options_] [_revision-range_] [_--_] [_path_]

# PARAMETERS

_REVISION-RANGE_
> Commits to display.

_PATH_
> Limit to specific paths.

**--all**
> Show all branches.

**--since** _DATE_
> Show commits since date.

**--until** _DATE_
> Show commits until date.

**--help**
> Display help information.

# DESCRIPTION

**gitk** is a graphical repository browser for Git. It displays commit history in a visual graph, showing branches, merges, and commit details in a GUI window.

The interface shows the commit graph, file changes, and diff content. It supports search, filtering, and visual exploration of repository history.

# CAVEATS

Requires Tcl/Tk. Interface is dated. May not be installed by default.

# HISTORY

gitk was written by **Paul Mackerras** and is one of the original **Git** GUI tools, providing visual history browsing since Git's early days.

# SEE ALSO

[git-gui](/man/git-gui)(1), [tig](/man/tig)(1), [git-log](/man/git-log)(1)

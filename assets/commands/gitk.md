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

**Select a specific commit on load**

```gitk --select-commit=[HEAD]```

**Trace the history of a function**

```gitk -L:[function_name]:[file.c]```

# SYNOPSIS

**gitk** [_options_] [_revision-range_] [_--_] [_path_...]

# PARAMETERS

_REVISION-RANGE_
> Commits to display (e.g. `v1.0..v2.0`).

_PATH_...
> Limit to commits touching the given paths.

**--all**
> Show all refs (branches, tags, etc.) as if listed on the command line.

**--branches**[=_PATTERN_]
> Show all branches, optionally limited to a glob pattern.

**--tags**[=_PATTERN_]
> Show all tags, optionally limited to a glob pattern.

**--remotes**[=_PATTERN_]
> Show all remote-tracking branches, optionally limited to a glob pattern.

**--since** _DATE_
> Show commits more recent than the given date.

**--until** _DATE_
> Show commits older than the given date.

**--date-order**
> Sort commits by date rather than topologically.

**--merge**
> After a conflicted merge, show commits that modify the conflicted files on both branches.

**--left-right**
> Mark commits with `<` or `>` to indicate which side of a symmetric difference they come from.

**--full-history**
> Don't prune history when filtering by path.

**--simplify-merges**
> Used with **--full-history** to remove needless merges from the result.

**-L** _start_,_end_:_file_ / **-L**:_funcname_:_file_
> Trace the evolution of a line range or function within a file.

**--argscmd** _COMMAND_
> Command run each time gitk refreshes the revision range; its output lists additional revisions to show.

**--select-commit** _REF_
> Select the given commit after loading the graph (default `HEAD`).

**--help**
> Display help information.

# DESCRIPTION

**gitk** is a graphical repository browser for Git. It displays commit history in a visual graph, showing branches, merges, and commit details in a GUI window.

The interface shows the commit graph, file changes, and diff content. It supports search, filtering, and visual exploration of repository history.

# CAVEATS

Requires Tcl/Tk. Interface is dated. May not be installed by default.

# HISTORY

gitk was written by **Paul Mackerras** and is one of the original **Git** GUI tools, providing visual history browsing since Git's early days.

# INSTALL

```dnf: sudo dnf install gitk```

```apk: sudo apk add git-gitk```

```zypper: sudo zypper install gitk```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-gui](/man/git-gui)(1), [tig](/man/tig)(1), [git-log](/man/git-log)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/gitk)```

<!-- verified: 2026-07-17 -->

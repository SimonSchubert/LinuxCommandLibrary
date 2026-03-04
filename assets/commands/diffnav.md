# TAGLINE

Git diff pager with file tree UI

# TLDR

**View** git diffs with an interactive file tree

```diffnav```

**View** diffs for a specific commit

```diffnav [commit_hash]```

**View** diffs between two commits

```diffnav [commit1] [commit2]```

**View** diffs for specific files only

```diffnav -- [file1] [file2]```

# SYNOPSIS

**diffnav** [_options_] [_commit_range_]

# PARAMETERS

**-d, --diff** _MODE_
> Diff mode: unified, context, or side-by-side

**-w, --width** _N_
> Set display width for side-by-side view

**--no-color**
> Disable colored output

**-h, --help**
> Display help and exit

**-v, --version**
> Display version and exit

# DESCRIPTION

**diffnav** is a git diff pager that provides an interactive file tree interface for navigating code changes. It combines the functionality of traditional diff viewers with a visual file explorer, making it easier to browse large changesets across multiple files.

The tool integrates with git to show file-by-file differences with syntax highlighting, collapsible sections, and keyboard navigation. It's particularly useful when reviewing pull requests or browsing commits that touch many files.

# KEYBINDINGS

**↑/↓**
> Navigate through files in the tree

**Enter**
> View diff for selected file

**Space**
> Toggle file expansion/collapse

**n/p**
> Jump to next/previous file with changes

**/**
> Search within diffs

**q**
> Quit

# CAVEATS

Requires git to be installed and accessible in PATH. Large repositories may experience slower loading times. Syntax highlighting depends on file extension detection. Some terminal emulators may have limited color support.

# HISTORY

**diffnav** was developed to improve the git diff browsing experience by adding a visual file tree component to the traditional pager interface, making it easier to understand the scope of changes across multiple files.

# SEE ALSO

[git](/man/git)(1), [diff](/man/diff)(1), [less](/man/less)(1), [difftastic](/man/difftastic)(1)
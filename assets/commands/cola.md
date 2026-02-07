# TAGLINE

graphical Git interface

# TLDR

**Launch Git Cola**

```cola```

**Open a specific repository**

```cola --repo [/path/to/repo]```

**Open in amend mode**

```cola --amend```

# SYNOPSIS

**cola** [_options_] [_repository_]

# PARAMETERS

**--repo** _path_
> Open a specific Git repository.

**--amend**
> Start with the amend option enabled.

**--prompt**
> Prompt for a repository.

# DESCRIPTION

**cola** launches Git Cola, a powerful graphical user interface for Git built with Python and Qt. It provides a visual, keyboard-driven interface for staging changes, creating commits, managing branches, viewing history, and performing other Git operations without requiring command-line expertise.

The interface emphasizes the Git staging workflow with a three-pane view showing unstaged changes, staged changes, and commit message composition. Interactive staging allows selecting individual lines or hunks to stage, providing fine-grained control over commits. The diff viewer provides syntax highlighting and side-by-side comparison modes.

Git Cola is cross-platform, running on Linux, macOS, and Windows. It integrates with system editors and diff tools, supports keyboard shortcuts for efficient workflows, and provides both beginner-friendly and power-user features. The tool is open source and actively maintained, offering an alternative to command-line Git and other GUI clients.

# SEE ALSO

[git](/man/git)(1), [git-cola](/man/git-cola)(1), [gitk](/man/gitk)(1), [tig](/man/tig)(1)

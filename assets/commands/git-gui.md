# TAGLINE

Tcl/Tk graphical interface for Git

# TLDR

**Start git gui**

```git gui```

**Open blame viewer**

```git gui blame [file.txt]```

**Open blame at specific line**

```git gui blame --line=[100] [file.txt]```

**Browse repository tree at branch**

```git gui browser [branch]```

**Open citool for a single commit**

```git gui citool```

**Amend the last commit with citool**

```git gui citool --amend```

# SYNOPSIS

**git gui** [_command_] [_arguments_]

# PARAMETERS

**blame** _FILE_
> Open blame viewer for file.

**browser** _REVISION_
> Browse tree at revision.

**citool**
> Start git gui and make exactly one commit before exiting.

**version**
> Show the currently running version of git gui.

**--line=**_NUMBER_
> (blame) Scroll blame view to center on line NUMBER.

**--amend**
> (citool) Enter Amend Last Commit mode automatically.

**--nocommit**
> (citool) Exit with zero status without making a commit.

# DESCRIPTION

**git gui** is a Tcl/Tk graphical interface for Git. It provides visual tools for committing, browsing history, and viewing blame annotations.

The interface shows staged and unstaged changes, allowing selective staging and commit message composition. The blame viewer shows line-by-line attribution with interactive navigation through the commit history.

# CAVEATS

Requires Tcl/Tk installed. Interface is dated compared to modern GUI tools. May not be installed by default.

# HISTORY

git gui was created by **Shawn O. Pearce** as the official Tcl/Tk GUI for Git, providing graphical operations since Git's early days.

# SEE ALSO

[git](/man/git)(1), [git-commit](/man/git-commit)(1), [git-blame](/man/git-blame)(1), [gitk](/man/gitk)(1), [tig](/man/tig)(1)

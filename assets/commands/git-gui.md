# TLDR

**Start git gui**

```git gui```

**Open blame viewer**

```git gui blame [file.txt]```

**Browse repository**

```git gui browser [branch]```

**Open citool for commits**

```git gui citool```

# SYNOPSIS

**git gui** [_command_] [_arguments_]

# PARAMETERS

**blame** _FILE_
> Open blame viewer for file.

**browser** _REVISION_
> Browse tree at revision.

**citool**
> Open commit tool.

**version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**git gui** is a Tcl/Tk graphical interface to git. It provides visual tools for committing, browsing history, and viewing blame annotations.

The interface shows staged and unstaged changes, allowing selective staging and commit message composition. The blame viewer shows line-by-line attribution with interactive navigation.

git gui offers graphical git operations for those preferring GUI tools.

# CAVEATS

Requires Tcl/Tk installed. Interface is dated compared to modern GUI tools. May not be installed by default.

# HISTORY

git gui was created by **Shawn O. Pearce** as the official Tcl/Tk GUI for Git, providing graphical operations since Git's early days.

# SEE ALSO

[git](/man/git)(1), [gitk](/man/gitk)(1), [tig](/man/tig)(1)

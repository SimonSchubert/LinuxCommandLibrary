# TLDR

**Open the repository browser** (main view)

```tig```

**Show commit log** view

```tig log```

**Show status** of working directory

```tig status```

**Show blame** for a file

```tig blame [path/to/file]```

**Show stash** view

```tig stash```

**Browse commits** for a specific file

```tig [path/to/file]```

**Browse commits** in a range

```tig [commit1]..[commit2]```

**Use as pager** for git output

```git log --pretty=raw | tig --pretty=raw```

# SYNOPSIS

**tig** [_options_] [_revisions_] [**--**] [_paths_]

# SUBCOMMANDS

**log**
> Start in log view displaying git log output

**show**
> Open diff view using git show options

**blame** _file_
> Show file annotated with commit information

**grep**
> Open grep view; supports git grep options

**refs**
> Start in refs view showing branches and tags

**stash**
> Start in stash view

**status**
> Start in status view showing working directory state

# PARAMETERS

**+**_number_
> Show first view with specified line number selected

**-v**, **--version**
> Show version and exit

**-h**, **--help**
> Show help message and exit

**--stdin**
> Read git command output from stdin (pager mode)

**--pretty=raw**
> Process stdin formatted as git log --pretty=raw output

# DESCRIPTION

**tig** is an ncurses-based text interface for Git. It serves as a repository browser for exploring commit history, viewing diffs, and managing staging. It can also function as a pager for git command output.

The main view shows commit history with author, date, and message. Pressing **Enter** opens the diff view for the selected commit. Use **j/k** or arrow keys to navigate, **/** to search, and **q** to quit or go back.

In status view, you can stage changes at the file or chunk level. Press **u** to stage/unstage files, and navigate into files to stage individual hunks. This provides a visual alternative to **git add -p**.

Configuration is read from **~/.config/tig/config** or **~/.tigrc**. Colors, keybindings, and views can be customized. Press **h** in tig to display the help menu with all keybindings.

# KEY BINDINGS

**j/k** or arrows
> Navigate up/down

**Enter**
> Open selected item

**q**
> Quit or close current view

**/**
> Search forward

**n/N**
> Next/previous search result

**u**
> Stage/unstage file or hunk (in status view)

**h**
> Show help

# CAVEATS

tig accepts most git-log and git-diff options, but some complex git commands may not display as expected. Large repositories with many commits may experience slower navigation. Custom color schemes require terminal support.

# HISTORY

**tig** was created by **Jonas Fonseca** and first released in **2006**. The name is "git" spelled backwards. Written in C using ncurses, it was designed to provide a visual interface for Git without leaving the terminal, inspired by tools like gitk but for text-mode environments.

# SEE ALSO

[git](/man/git)(1), [git-log](/man/git-log)(1), [git-diff](/man/git-diff)(1), [gitk](/man/gitk)(1), [lazygit](/man/lazygit)(1)

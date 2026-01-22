# TLDR

**Start GitUI**

```gitui```

**Start in specific directory**

```gitui -d [path]```

**Use custom theme**

```gitui --theme [theme.ron]```

# SYNOPSIS

**gitui** [_options_]

# PARAMETERS

**-d** _PATH_, **--directory** _PATH_
> Repository directory.

**--theme** _FILE_
> Theme file.

**--polling**
> Enable polling for changes.

**-l** _FILE_, **--logging** _FILE_
> Log file path.

**--help**
> Display help information.

# DESCRIPTION

**gitui** is a fast terminal UI for git. It provides a keyboard-driven interface for staging, committing, branching, and viewing diffs, all within the terminal.

Written in Rust, GitUI is lightweight and fast. It displays status, log, diff, and staging information in a split-pane interface with vim-like key bindings.

gitui offers a fast TUI alternative to graphical git clients.

# CAVEATS

Terminal UI needs appropriate terminal. Some features limited compared to full GUI. Themes require RON format.

# HISTORY

gitui was created by **Stephan Dilly** as a fast, keyboard-centric terminal UI for git written in Rust.

# SEE ALSO

[tig](/man/tig)(1), [lazygit](/man/lazygit)(1), [git-gui](/man/git-gui)(1)

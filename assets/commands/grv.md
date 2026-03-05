# TAGLINE

Terminal interface for viewing Git repositories

# TLDR

**Open the current repository** in grv

```grv```

**Open a specific repository**

```grv -repoFilePath [path/to/repo]```

**Open with a specific log level**

```grv -logLevel [DEBUG|INFO|WARN|ERROR]```

# SYNOPSIS

**grv** [**-repoFilePath** _path_] [**-logFile** _path_] [**-logLevel** _level_]

# DESCRIPTION

**GRV** (Git Repository Viewer) is a terminal-based interface for viewing Git repositories. It allows refs, commits, and diffs to be viewed, searched, and filtered using **Vi/Vim-like key bindings**. The interface provides multiple views including a ref view for branches and tags, a commit view for browsing history, and a diff view for inspecting changes.

GRV reads the repository directly rather than shelling out to git commands, resulting in fast navigation even in large repositories. The behaviour and style can be customised through a **.grvrc** configuration file.

# KEY BINDINGS

**j/k** — Move down/up
**Enter** — Select item / open view
**q** — Close view / quit
**/** — Search
**n/N** — Next/previous search match
**Tab** — Switch between views
**1-5** — Jump to specific view

# CAVEATS

GRV is no longer actively maintained. It reads git repository data directly, so very large repositories may use significant memory. Custom themes and key bindings require editing the **.grvrc** file. Does not support write operations like committing or pushing.

# HISTORY

**GRV** was created by **Robert Burke** and written in **Go**. It was designed as a lightweight alternative to graphical Git clients, providing a fast terminal-based workflow for inspecting repository history and diffs.

# SEE ALSO

[git](/man/git)(1), [tig](/man/tig)(1), [gitui](/man/gitui)(1), [lazygit](/man/lazygit)(1)

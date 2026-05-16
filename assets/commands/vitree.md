# TAGLINE

Vim file browser that runs in a separate terminal

# TLDR

**Start vitree** in the current directory (requires a Vim server running)

```vitree```

**Start Vim with a server name** so vitree can communicate with it

```vim --servername vim```

**Open vitree in a specific directory**

```vitree [path/to/directory]```

**Cycle filter modes** (default → changed only → show all) from within vitree

```f```

**Show the keybinding help** inside vitree

```?```

# SYNOPSIS

**vitree** [_path_]

# DESCRIPTION

**vitree** is a terminal-based file browser designed to be used alongside **Vim**. Instead of running the file tree inside the editor (and forcing you to learn another set of bindings for resizing, splitting, and focus), it runs in a separate terminal window managed by your usual window manager or terminal multiplexer.

It connects to a running Vim instance through Vim's **--servername** mechanism, so selecting a file in vitree opens it in the connected Vim. The interface is an asynchronous TUI with automatic tree refresh, Vim-like navigation keybindings, mouse support, and ANSI color output.

By default, files matched by **.gitignore** are hidden and Git status markers are shown for tracked files. Pressing **f** toggles between filter modes (default → changed only → show all), and **?** displays the full keybinding reference.

# PARAMETERS

**_path_**
> Directory to open. Defaults to the current working directory.

# CONFIGURATION

vitree expects a Vim instance started with a server name so it can send file-open commands to it:

```vim --servername vim```

Once Vim is running, launching **vitree** in another terminal connects automatically. Git integration uses the repository found at or above the opened directory; **.gitignore** rules are honored for filtering.

# CAVEATS

Requires Vim built with **+clientserver** support and an active Vim server (start Vim with **--servername**). Without a running server, file selection in vitree has no editor to send to. The project is third-party software (not part of a standard Linux distribution) and is distributed via Homebrew, Go install, or prebuilt binaries from the GitHub releases page.

# HISTORY

**vitree** was written by **hoffa** and published on GitHub in **2024** under the MIT license. It is written in **Go** and intended as a lightweight alternative to in-editor file trees such as NERDTree or nvim-tree.

# SEE ALSO

[vim](/man/vim)(1), [nnn](/man/nnn)(1), [ranger](/man/ranger)(1), [lf](/man/lf)(1), [broot](/man/broot)(1)

# TAGLINE

TUI client for the aria2 download manager

# TLDR

**Launch aria2tui** (connects to configured aria2c daemon)

```aria2tui```

**Show help** with available keybindings

```Press ? inside aria2tui```

# SYNOPSIS

**aria2tui**

# DESCRIPTION

**aria2tui** is a terminal user interface (TUI) client for the **aria2c** download utility. It communicates with an aria2c daemon over RPC, providing an interactive interface for managing downloads, torrents, and queues without leaving the terminal.

Features include bulk downloading and torrent management, queue control and download prioritization, fine-tuning of download options such as piece length, user-agent, maximum speed, and proxy settings, as well as real-time monitoring of active transfers. The interface supports multiple aria2c daemon instances, switchable with **{** and **}**.

On first launch, aria2tui presents a configuration form where users enter the aria2c daemon URL, port, and authentication token. This creates a configuration file at **~/.config/aria2tui/config.toml**.

Key navigation controls include **?** to view all keybindings, **'** to toggle the right sidebar, **"** to cycle sidebar views, and **Ctrl-L** to redraw the screen. A pin cursor mode (toggled via backtick then typing **pc**) keeps the cursor fixed at its position while downloads reorder. Auto-refresh can be disabled via the settings menu (**~**) to preserve selections during bulk operations.

# CONFIGURATION

**~/.config/aria2tui/config.toml**
> Main configuration file created on first launch. Stores the aria2c daemon URL, port, and RPC authentication token.

# CAVEATS

Requires a running **aria2c** daemon with RPC enabled. Changing download options for an active or paused task will most likely restart that download. External tools are needed for full functionality: **yazi** for torrent file selection, **neovim** for editing download options and adding URIs, **plotille** for graph visualization, and **pyperclip** for clipboard integration. Runs only on Unix-based operating systems.

# HISTORY

**aria2tui** was created by **Grim** (grimandgreedy) and is written in Python using the curses library. It is available on PyPI and installable via **pip**. The project is licensed under the MIT license.

# SEE ALSO

[aria2c](/man/aria2c)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)

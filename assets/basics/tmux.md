# Tmux

## Getting Started
Tmux is a terminal multiplexer: it runs multiple terminal sessions inside a single window and keeps them alive after you disconnect. It is organized in three layers: **sessions** contain **windows**, and windows contain **panes**.
```[tmux](/man/tmux)```
```[tmux](/man/tmux) new -s mysession```

All keybindings start with the **prefix** key, which is **Ctrl+b** by default. Press the prefix, release it, then press the command key.

## Sessions
A session is a collection of windows that keeps running in the background after you detach or your connection drops. Reattach later to pick up exactly where you left off.

| Key | Description |
|-----|-------------|
| **Ctrl+b d** | Detach from current session |
| **Ctrl+b s** | List all sessions and switch |
| **Ctrl+b $** | Rename current session |
| **Ctrl+b (** | Switch to previous session |
| **Ctrl+b )** | Switch to next session |

```[tmux](/man/tmux) ls```
```[tmux](/man/tmux) attach -t mysession```
```[tmux](/man/tmux) new -d -s mysession```
```[tmux](/man/tmux) rename-session -t old new```
```[tmux](/man/tmux) kill-session -t mysession```
```[tmux](/man/tmux) kill-server```

> **tmux attach** without **-t** attaches to the most recently used session. **kill-server** stops tmux entirely, including all sessions.

## Windows
Windows are like tabs within a session. Each window runs its own shell and is numbered, starting at 0 by default.

| Key | Description |
|-----|-------------|
| **Ctrl+b c** | Create a new window |
| **Ctrl+b n** | Switch to the next window |
| **Ctrl+b p** | Switch to the previous window |
| **Ctrl+b 0-9** | Switch to window by number |
| **Ctrl+b l** | Switch to the last active window |
| **Ctrl+b w** | List all windows and select one |
| **Ctrl+b ,** | Rename current window |
| **Ctrl+b .** | Move current window to another number |
| **Ctrl+b &** | Close current window (with confirmation) |

## Panes
Panes split a window into multiple terminal areas. Each pane runs its own independent shell.

| Key | Description |
|-----|-------------|
| **Ctrl+b %** | Split into left and right panes |
| **Ctrl+b "** | Split into top and bottom panes |
| **Ctrl+b Arrow** | Move to the pane in that direction |
| **Ctrl+b o** | Cycle to the next pane |
| **Ctrl+b ;** | Jump to the last active pane |
| **Ctrl+b z** | Toggle zoom on current pane (full window) |
| **Ctrl+b x** | Close current pane (with confirmation) |
| **Ctrl+b {** | Swap current pane with the previous one |
| **Ctrl+b }** | Swap current pane with the next one |
| **Ctrl+b Space** | Cycle through pane layouts |
| **Ctrl+b q** | Show pane numbers (press a number to jump there) |
| **Ctrl+b !** | Break current pane out into a new window |

## Resizing Panes
Press the prefix, then an arrow key combined with a modifier. Keep the modifier held to repeat the resize without pressing the prefix again.

| Key | Description |
|-----|-------------|
| **Ctrl+b Ctrl+Arrow** | Resize pane by 1 cell in that direction |
| **Ctrl+b Alt+Arrow** | Resize pane by 5 cells in that direction |

The same works from the command prompt, with **-D**, **-U**, **-L**, **-R** for down, up, left, right.
```[tmux](/man/tmux) resize-pane -D 10```
```[tmux](/man/tmux) resize-pane -R 10```

## Copy Mode
Copy mode lets you scroll through output, search it, and copy text. Press **Ctrl+b [** to enter it (or **Ctrl+b PgUp** to enter it scrolled up one page).

By default tmux uses Emacs-style keys in copy mode. Most users switch to vi-style keys, which the table below assumes.
```[echo](/man/echo) "setw -g mode-keys vi" >> ~/.tmux.conf```

| Key | Description |
|-----|-------------|
| **q** | Exit copy mode |
| **h j k l** | Move left, down, up, right |
| **w / b** | Move forward / back one word |
| **g / G** | Jump to the top / bottom of the history |
| **Ctrl+u / Ctrl+d** | Scroll up / down half a page |
| **/** | Search forward |
| **?** | Search backward |
| **n / N** | Next / previous search match |
| **Space** | Start selection |
| **Enter** | Copy selection and exit copy mode |

Outside copy mode, paste the most recently copied text.

| Key | Description |
|-----|-------------|
| **Ctrl+b ]** | Paste the copied text |

## Command Mode
Press **Ctrl+b :** to open the tmux command prompt. Every keybinding is a shortcut for one of these commands, and any of them can be run here directly.
```new-window -n mywin```
```split-window -h```
```swap-window -t 0```
```select-layout even-horizontal```
```setw synchronize-panes on```

> **synchronize-panes** sends your typing to all panes in the window at once. Handy for running the same command on several servers. Turn it off with **setw synchronize-panes off**.

## Configuration
Tmux reads **~/.tmux.conf** at server start. Useful options to add:
```set -g mouse on```
```set -g history-limit 50000```
```set -g base-index 1```
```setw -g pane-base-index 1```

> **mouse on** enables clicking panes, dragging borders to resize, and scrolling with the wheel. **base-index 1** numbers windows from 1 instead of 0, matching the keyboard layout.

Apply changes to a running server without restarting.
```[tmux](/man/tmux) source-file ~/.tmux.conf```

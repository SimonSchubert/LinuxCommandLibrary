# Tmux

## Getting Started
Tmux is a terminal multiplexer — it lets you run multiple terminal sessions inside a single window and keep them alive after disconnecting. It is organized into three layers: **sessions** contain **windows**, and windows contain **panes**.
```[tmux](/man/tmux)```
```[tmux](/man/tmux) new -s mysession```

All keybindings start with the **prefix** key, which is **Ctrl+b** by default. Press the prefix, release it, then press the command key.

## Sessions
A session is a collection of windows that persists even after you detach or close the terminal. You can reattach later to pick up where you left off.

| Key | Description |
|-----|-------------|
| **Ctrl+b d** | Detach from current session |
| **Ctrl+b s** | List all sessions and switch |
| **Ctrl+b $** | Rename current session |
| **Ctrl+b (** | Switch to previous session |
| **Ctrl+b )** | Switch to next session |

```[tmux](/man/tmux) ls```
```[tmux](/man/tmux) attach -t mysession```
```[tmux](/man/tmux) kill-session -t mysession```
```[tmux](/man/tmux) rename-session -t old new```

## Windows
Windows are like tabs within a session. Each window runs its own shell.

| Key | Description |
|-----|-------------|
| **Ctrl+b c** | Create a new window |
| **Ctrl+b n** | Switch to the next window |
| **Ctrl+b p** | Switch to the previous window |
| **Ctrl+b 0-9** | Switch to window by number |
| **Ctrl+b ,** | Rename current window |
| **Ctrl+b &** | Close current window (with confirmation) |
| **Ctrl+b w** | List all windows and select one |
| **Ctrl+b l** | Switch to the last active window |

## Panes
Panes split a window into multiple terminal areas. Each pane runs independently.

| Key | Description |
|-----|-------------|
| **Ctrl+b %** | Split pane vertically (left/right) |
| **Ctrl+b "** | Split pane horizontally (top/bottom) |
| **Ctrl+b Arrow** | Move to the pane in that direction |
| **Ctrl+b o** | Cycle to the next pane |
| **Ctrl+b z** | Toggle zoom on current pane (full window) |
| **Ctrl+b x** | Close current pane (with confirmation) |
| **Ctrl+b {** | Swap current pane with the previous one |
| **Ctrl+b }** | Swap current pane with the next one |
| **Ctrl+b Space** | Cycle through pane layouts |
| **Ctrl+b q** | Show pane numbers briefly |
| **Ctrl+b !** | Convert current pane into a new window |

## Resizing Panes
Hold the prefix and use modifier keys with arrows to resize the active pane.

| Key | Description |
|-----|-------------|
| **Ctrl+b Ctrl+Arrow** | Resize pane by 1 cell in that direction |
| **Ctrl+b Alt+Arrow** | Resize pane by 5 cells in that direction |

You can also resize from command mode.
```[tmux](/man/tmux) resize-pane -D 10```
```[tmux](/man/tmux) resize-pane -U 10```
```[tmux](/man/tmux) resize-pane -L 10```
```[tmux](/man/tmux) resize-pane -R 10```

## Copy Mode
Copy mode lets you scroll through output and copy text. Tmux uses **vi-style** keys by default when `mode-keys` is set to vi.

Press **Ctrl+b [** to enter copy mode and **q** to exit.

| Key | Description |
|-----|-------------|
| **Ctrl+b [** | Enter copy mode |
| **q** | Exit copy mode |
| **h j k l** | Move left, down, up, right |
| **w** | Move forward one word |
| **b** | Move back one word |
| **/** | Search forward |
| **?** | Search backward |
| **n** | Next search match |
| **N** | Previous search match |
| **Space** | Start selection |
| **Enter** | Copy selection and exit copy mode |
| **Ctrl+b ]** | Paste the copied text |

To enable vi-style keys, add this to your config file.
```[echo](/man/echo) "setw -g mode-keys vi" >> ~/.tmux.conf```

## Command Mode
Press **Ctrl+b :** to open the tmux command prompt. From here you can run any tmux command directly.
```new-window -n mywin```
```split-window -h```
```swap-window -t 0```
```select-layout even-horizontal```
```source-file ~/.tmux.conf```

Useful configuration options to add to **~/.tmux.conf**.
```set -g mouse on```
```set -g history-limit 10000```
```set -g base-index 1```
```setw -g pane-base-index 1```

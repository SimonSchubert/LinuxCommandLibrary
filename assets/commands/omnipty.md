# TAGLINE

GPU-rendered terminal emulator with built-in splits, workspaces, and a file tree

# TLDR

**Start OmniPTY** at the current directory

```omnipty```

Open at a **specific directory**

```omnipty [~/Code]```

Run a **program** in the first pane instead of the shell

```omnipty -e [btop]```

Set the **Wayland app-id / X11 class** (for window rules and `xdg-terminal-exec`)

```omnipty --app-id [org.omarchy.btop] -e [btop]```

Restore pinned workspaces **without running their startup commands**

```omnipty --no-startup-commands```

Print the **version** and exit

```omnipty -V```

# SYNOPSIS

**omnipty** [_directory_] [_options_] [**-e** _command_ [_args_...]]

# PARAMETERS

_directory_
> Open the first pane in this directory. Defaults to the current working directory. A missing path is ignored rather than failing the launch.

**-e** _command_ [_args_...]
> Run this program in the first pane instead of the shell. Everything after **-e** is the command, untouched, so `omnipty -e vim --help` runs vim's help. The pane closes when the program exits cleanly; a failure keeps its output on screen. Pinned workspaces are not restored on a **-e** launch.

**--app-id** _id_
> Wayland app-id / X11 window class. Default is **omnipty**. Also accepted as **--app-id=**_id_. This is what `xdg-terminal-exec` passes so OmniPTY can be the desktop's default terminal.

**--no-startup-commands**
> Restore pinned workspaces' layout without running their saved startup commands. Holding Shift at launch does the same.

**-V**, **--version**
> Print the version (`omnipty X.Y.Z`) and exit.

**-h**, **--help**
> Print usage and exit.

# DESCRIPTION

**omnipty** is a GPU-rendered terminal emulator for Linux (Wayland or X11, x86_64) and macOS, written in Rust. It uses GPUI (Zed's UI framework) for the window and Alacritty's PTY and VT parser (`alacritty_terminal`), so vim, htop, and tmux still work.

The tools often bolted onto a terminal are built in: nested splits and named workspaces that reopen with the same layout, a vim-navigable file tree that follows the focused pane's `cd`, copy mode with vim keys on the scrollback, a native git-aware status bar, optional powerline prompt and OSC 133 shell integration (zsh and bash), and inline images via the kitty, iTerm2, and sixel protocols. Configuration is one TOML file that reloads when you save it.

On Linux, `omnipty` is the binary itself. It holds the terminal you launched it from until the window closes, the way alacritty and kitty do. Use `omnipty . &` to get the prompt back, or put `scripts/omnipty-cli` ahead of it on `PATH` for detached behaviour. Closing the last window quits. The `.desktop` entry declares **-e** and **--app-id**, so putting `omnipty.desktop` first in `~/.config/xdg-terminals.list` makes OmniPTY the terminal the desktop opens.

The app does not write to shell dotfiles. Shells see `$OMNIPTY_SESSION` and `$OMNIPTY_VERSION`; the former names `$OXIDE_SESSION` and `$OXIDE_VERSION` stay exported through 0.9.x.

# CONFIGURATION

**~/.config/omnipty/config.toml**
> Main configuration file. A fully commented default is written on first launch. Open it from inside the app with ctrl-, (Linux) or cmd-, (macOS), which opens `$EDITOR` in the focused pane. Set **OMNIPTY_CONFIG** to use another path (the pre-rename **OXIDE_CONFIG** is still honoured when **OMNIPTY_CONFIG** is unset). OmniPTY watches the file's directory and reloads on save. Unknown keys are an error rather than a silent no-op; a malformed file keeps the last good config and shows a toast.

**~/.cache/omnipty**
> Generated scripts, pinned workspaces, and window state.

**[font]**
> `family` (default JetBrainsMono Nerd Font Mono, bundled in the binary), `size`, `line_height`, `weight`, `ligatures`.

**[window]**
> `padding`, `opacity`, `blur`, `inactive_pane_opacity`, `new_tab_directory` (`pwd` or `home`).

**[shell]**
> `program` (unset means `$SHELL`), `args` (default `["-l"]`), `scrollback` (default 10000), `integration` (OSC 133 hooks).

**[colors]**
> `preset` (one of 25 built-in themes, including `omnipty`, `catppuccin-mocha`, `gruvbox-dark`, `tokyonight`, `dracula`, `nord`, and the Omarchy set), optional per-colour hex overrides, and `follow_system` with `preset_dark` / `preset_light`.

**[keymap]**
> Flat keystroke-to-action map. Context subtables: `terminal`, `terminal_vi`, `file_tree`, `workspaces`, `overlay`. Set a binding to `""` to unbind.

**[[ssh.hosts]]**
> Glob `match` plus `accent` colour for panes whose foreground process is `ssh`.

**[prompt]**, **[tree]**, **[status_bar]**, **[tabs]**, **[cursor]**, **[notifications]**, **[commands]**, **[editor]**, **[markdown]**, **[images]**, **[workspaces]**
> Optional prompt segments, file-tree drawer, native status/tab bars, cursor, desktop notifications via `notify-send`, command history from OSC 133, editor/markdown/image preview targets, and pinned-workspace restore (`run_startup_commands`, `startup_timeout`).

# CAVEATS

Linux needs glibc 2.35 or newer (Ubuntu 22.04, Debian 12, Fedora 36 and later), a Vulkan driver, and `notify-send` (libnotify) for desktop notifications. Official Linux binaries are x86_64 only.

On Linux the command blocks the launching terminal until the window closes. A **-e** launch that fails keeps the pane open with the program's output.

A startup command that wedges the app can be skipped with **--no-startup-commands** or by holding Shift at launch.

# HISTORY

OmniPTY is written in Rust. It was called **Oxide** until **0.9.0** (10 October 2026); the rename avoided a clash with an unrelated company. First launch of a renamed build copies `config.toml`, themes, and pinned workspaces from `~/.config/oxide` and `~/.cache/oxide` into the `omnipty` directories and leaves the originals in place. `theme = "oxide"` still selects the same palette, now also called `omnipty`.

# SEE ALSO

[alacritty](/man/alacritty)(1), [kitty](/man/kitty)(1), [wezterm](/man/wezterm)(1), [ghostty](/man/ghostty)(1), [foot](/man/foot)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/omnipty-terminal/omnipty)```

```[Homepage](https://omnipty.com)```

```[Documentation](https://omnipty.com/docs/)```

<!-- verified: 2026-10-19 -->

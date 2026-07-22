# TAGLINE

GPU-accelerated terminal emulator

# TLDR

**Start** Alacritty

```alacritty```

Open with **specific working directory**

```alacritty --working-directory [/path/to/dir]```

Execute a **command**

```alacritty -e [htop]```

Open with **custom config**

```alacritty --config-file [~/.config/alacritty/custom.toml]```

Set **window title**

```alacritty --title "[My Terminal]"```

**Migrate** an old YAML config to TOML

```alacritty migrate```

# SYNOPSIS

**alacritty** [_options_] [**-e** _command_ ...]

**alacritty** _subcommand_ [_options_]

# DESCRIPTION

**alacritty** is a modern, GPU-accelerated terminal emulator focused on simplicity and performance. It leverages OpenGL for rendering, providing smooth scrolling and low latency input handling.

Configuration is done through a TOML or YAML file (depending on version), supporting customization of colors, fonts, keybindings, and behavior. It aims to have sensible defaults while remaining configurable.

# PARAMETERS

**-e**, **--command** _command_ _args_
> Execute command and arguments instead of the default shell (must be the last argument).

**--working-directory** _path_
> Start the shell in the specified working directory.

**--config-file** _file_
> Use an alternate configuration file.

**-T**, **--title** _title_
> Set the window title.

**--class** _class_
> Set the window class hint on Linux/BSD (X11 only).

**-o**, **--option** _key=value_
> Override configuration file options.

**--hold**
> Keep the window open after the child process exits.

**--daemon**
> Do not spawn an initial window (run in the background for IPC).

**--embed** _id_
> X11 window ID to embed Alacritty within.

**--socket** _path_
> Path for the IPC socket creation.

**-V**, **--version**
> Display version information.

**-q**, **-v**
> Decrease (**-q**, **-qq**) or increase (**-v**, **-vv**, **-vvv**) verbosity.

**--print-events**
> Print all events to stdout for debugging.

**migrate**
> Subcommand that converts an existing YAML configuration file to TOML.

**msg**
> Subcommand to send IPC messages (for example **create-window**, **config**) to a running daemon instance.

# CONFIGURATION

**~/.config/alacritty/alacritty.toml**
> Main configuration file for colors, fonts, keybindings, window settings, and shell behavior.

**~/.config/alacritty/alacritty.yml**
> Legacy YAML configuration file used in versions before 0.13.

# CAVEATS

Requires GPU with OpenGL 3.3+ support. No tabs or splits (use tmux/screen). Configuration format changed from YAML to TOML in version 0.13. Some features may require recent graphics drivers.

# HISTORY

**alacritty** was created by Joe Wilm and first released in **2017**. It was the first major GPU-accelerated terminal emulator, inspiring similar projects and becoming popular for its performance and minimal design.

# INSTALL

```apt: sudo apt install alacritty```

```dnf: sudo dnf install alacritty```

```pacman: sudo pacman -S alacritty```

```apk: sudo apk add alacritty```

```zypper: sudo zypper install alacritty```

```nix: nix profile install nixpkgs#alacritty```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [kitty](/man/kitty)(1)

# RESOURCES

```[Source code](https://github.com/alacritty/alacritty)```

```[Homepage](https://alacritty.org/)```

<!-- verified: 2026-06-11 -->

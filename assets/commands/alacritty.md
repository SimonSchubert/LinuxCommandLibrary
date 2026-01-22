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

# SYNOPSIS

**alacritty** [_-e command_] [_--working-directory dir_] [_--config-file file_] [_options_]

# DESCRIPTION

**alacritty** is a modern, GPU-accelerated terminal emulator focused on simplicity and performance. It leverages OpenGL for rendering, providing smooth scrolling and low latency input handling.

Configuration is done through a TOML or YAML file (depending on version), supporting customization of colors, fonts, keybindings, and behavior. It aims to have sensible defaults while remaining configurable.

# PARAMETERS

**-e** _command_
> Execute command instead of default shell

**--working-directory** _path_
> Set initial working directory

**--config-file** _file_
> Use alternate configuration file

**--title** _title_
> Set window title

**--class** _class_
> Set window class (X11/Wayland)

**-o** _options_
> Override config file options

**--hold**
> Keep window open after command exits

**-v**, **--version**
> Display version information

**--print-events**
> Print all events for debugging

# CAVEATS

Requires GPU with OpenGL 3.3+ support. No tabs or splits (use tmux/screen). Configuration format changed from YAML to TOML in version 0.13. Some features may require recent graphics drivers.

# HISTORY

**alacritty** was created by Joe Wilm and first released in **2017**. It was the first major GPU-accelerated terminal emulator, inspiring similar projects and becoming popular for its performance and minimal design.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [kitty](/man/kitty)(1)

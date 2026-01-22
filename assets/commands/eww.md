# TLDR

Start the **daemon**

```eww daemon```

**Open** a widget

```eww [-c|--config] [path/to/source_code_directory] open [window_name]```

**Close** a widget

```eww [-c|--config] [path/to/source_code_directory] close [window_name]```

**Reload** configuration

```eww reload```

**Kill** the daemon

```eww kill```

Print and **watch logs**

```eww logs```

# SYNOPSIS

**eww** [_options_] _command_ [_arguments_]

# DESCRIPTION

**eww** (ElKowar's Wacky Widgets) creates custom desktop widgets for any window manager. It uses a configuration language to define widgets with dynamic content and styling.

Popular for creating status bars, sidebars, and other desktop elements.

# PARAMETERS

**daemon**
> Start the daemon process

**open** _window_
> Open a widget window

**close** _window_
> Close a widget window

**reload**
> Reload configuration files

**kill**
> Stop the daemon

**logs**
> Display and watch logs

**-c, --config** _path_
> Specify config directory

# CAVEATS

Requires configuration files in eww format. Daemon must be running for widgets to display. Works with X11 and Wayland.

# SEE ALSO

[polybar](/man/polybar)(1), [conky](/man/conky)(1)

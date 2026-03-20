# TAGLINE

custom desktop widget system

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

**Get** the value of a variable

```eww get [variable_name]```

**Update** a variable

```eww update [variable_name]="[value]"```

Print and **watch logs**

```eww logs```

# SYNOPSIS

**eww** [_options_] _command_ [_arguments_]

# PARAMETERS

**daemon**
> Start the daemon process.

**open** _window_
> Open a widget window.

**open-many** _windows..._
> Open multiple widget windows at once.

**close** _window_
> Close a widget window.

**close-all**
> Close all open widget windows.

**reload**
> Reload configuration files.

**kill**
> Stop the daemon.

**logs**
> Display and watch logs.

**get** _variable_
> Print the current value of a variable.

**update** _var=value_
> Update a variable value.

**state**
> Display the current state of all variables.

**inspect**
> Open the GTK debugger.

**shell-completions** _shell_
> Generate shell completions (bash, fish, zsh).

**-c**, **--config** _path_
> Specify config directory.

**--no-daemonize**
> Don't fork the daemon process to the background.

# DESCRIPTION

**eww** (ElKowar's Wacky Widgets) creates custom desktop widgets for any window manager. It uses a configuration language to define widgets with dynamic content and styling.

Popular for creating status bars, sidebars, and other desktop elements.

# CONFIGURATION

**~/.config/eww/eww.yuck**
> Widget definitions and structure written in the eww configuration language.

**~/.config/eww/eww.scss**
> Widget styling using CSS/SCSS syntax.

# CAVEATS

Requires configuration files in eww format. Daemon must be running for widgets to display. Works with X11 and Wayland.

# SEE ALSO

[polybar](/man/polybar)(1), [conky](/man/conky)(1), [waybar](/man/waybar)(1)

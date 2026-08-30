# TAGLINE

custom desktop widget system

# TLDR

Start the daemon that hosts the widgets

```eww daemon```

Start it against a **specific configuration directory**

```eww --config [path/to/config] daemon```

**Open** a window defined in the configuration

```eww open [window_name]```

Open **several windows** at once

```eww open-many [bar] [sidebar]```

**Close** a window

```eww close [window_name]```

Close **every open window**

```eww close-all```

**Reload** the configuration after editing it

```eww reload```

**Read** a variable's current value

```eww get [variable_name]```

**Set** a variable, which is how scripts drive the widgets

```eww update [variable_name]=[value]```

Dump **every variable** and its value

```eww state```

List the **windows the configuration defines**

```eww list-windows```

Open the **widget inspector** to debug layout

```eww inspector```

Print the **widget tree** as a graph

```eww graph```

Follow the **logs**

```eww logs```

**Stop** the daemon

```eww kill```

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

# INSTALL

```zypper: sudo zypper install eww```

```nix: nix profile install nixpkgs#eww```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[polybar](/man/polybar)(1), [conky](/man/conky)(1), [waybar](/man/waybar)(1)

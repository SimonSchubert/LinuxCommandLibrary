# TAGLINE

command-line control utility for Hyprland, a dynamic tiling Wayland compositor

# TLDR

**Reload** Hyprland configuration

```hyprctl reload```

Return the **active window** name

```hyprctl activewindow```

List all connected **input devices**

```hyprctl devices```

List all **workspaces** with properties

```hyprctl workspaces```

Call a **dispatcher**

```hyprctl dispatch [dispatcher]```

Set a **configuration keyword** dynamically

```hyprctl keyword [keyword] [value]```

Display **version**

```hyprctl version```

# SYNOPSIS

**hyprctl** [_command_] [_arguments_]

# PARAMETERS

**reload**
> Reload Hyprland configuration

**activewindow**
> Show active window information

**devices**
> List input devices

**workspaces**
> List workspaces

**monitors**
> List monitors and properties

**clients**
> List all windows/clients

**dispatch** _DISPATCHER_ [_ARGS_]
> Execute a dispatcher (window actions, workspace changes)

**keyword** _KEY_ _VALUE_
> Set configuration option at runtime

**setcursor** _THEME_ _SIZE_
> Set cursor theme and size

**switchxkblayout** _DEVICE_ _CMD_
> Switch keyboard layout

**--batch**
> Execute multiple commands separated by semicolons

**-j**
> Output in JSON format

# DESCRIPTION

**hyprctl** is the command-line control utility for Hyprland, a dynamic tiling Wayland compositor. It provides runtime control over window management, configuration, and system queries.

Dispatchers control actions like moving windows, changing workspaces, and executing programs. Common dispatchers include: **exec**, **killactive**, **workspace**, **movewindow**, **fullscreen**, **togglefloating**.

Configuration changes made with **keyword** are temporary and reset on reload. For persistent changes, edit the config file.

# CAVEATS

Only works when Hyprland is running. Some commands require appropriate permissions. Changes via keyword don't persist across restarts or reloads.

# HISTORY

hyprctl is part of the Hyprland project, a modern Wayland compositor created by Vaxry. Hyprland gained popularity starting in **2022** for its smooth animations, dynamic tiling, and extensive customization options.

# SEE ALSO

[hyprpaper](/man/hyprpaper)(1), [hyprshot](/man/hyprshot)(1), [swaymsg](/man/swaymsg)(1)

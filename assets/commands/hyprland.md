# TAGLINE

dynamic tiling Wayland compositor with smooth animations, eye-candy

# TLDR

**Start Hyprland**

```Hyprland```

**Reload configuration**

```hyprctl reload```

**List windows**

```hyprctl clients```

**Dispatch keybind action**

```hyprctl dispatch [workspace] [3]```

**Get active window**

```hyprctl activewindow```

**Show monitors**

```hyprctl monitors```

# SYNOPSIS

**Hyprland** [_options_]

**hyprctl** [_command_] [_args_]

# PARAMETERS

**hyprctl dispatch** _action_ [_args_]
> Execute dispatcher action.

**hyprctl keyword** _option_ _value_
> Set config option at runtime.

**hyprctl reload**
> Reload configuration.

**hyprctl clients**
> List windows.

**hyprctl monitors**
> List monitors.

**hyprctl activewindow**
> Show active window info.

**hyprctl workspaces**
> List workspaces.

**hyprctl version**
> Show version.

# DESCRIPTION

**Hyprland** is a dynamic tiling Wayland compositor with smooth animations, eye-candy effects, and extensive customization. It provides a modern desktop experience with features like window animations, blur, shadows, and workspace management.

Configuration is done through ~/.config/hypr/hyprland.conf with a custom syntax for bindings, decorations, and layout settings.

# CONFIGURATION EXAMPLE

```
monitor=,preferred,auto,1
exec-once = waybar
bind = SUPER, Return, exec, kitty
bind = SUPER, Q, killactive
bind = SUPER, 1, workspace, 1
windowrule = float, ^(pavucontrol)$
```

# CAVEATS

Wayland only. Requires compatible graphics drivers. Some X11 apps need XWayland. Configuration syntax differs from other WMs.

# HISTORY

Hyprland was created by **vaxerski** in **2022** as a feature-rich Wayland compositor. It quickly gained popularity for its aesthetics and performance, becoming a leading choice for Wayland tiling WM users.

# SEE ALSO

[sway](/man/sway)(1), [waybar](/man/waybar)(1), [wlroots](/man/wlroots)(7)

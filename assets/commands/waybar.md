# TAGLINE

Customizable status bar for Wayland

# TLDR

**Start waybar**

```waybar```

**Start with specific config**

```waybar -c [~/.config/waybar/config]```

**Start with specific style**

```waybar -s [~/.config/waybar/style.css]```

**Start on specific bar**

```waybar -b [bar-0]```

**Log to file**

```waybar -l [/tmp/waybar.log]```

# SYNOPSIS

**waybar** [_-c config_] [_-s style_] [_-b bar_] [_-l log_] [_options_]

# PARAMETERS

**-c** _FILE_
> Config file.

**-s** _FILE_
> Style file (CSS).

**-b** _BAR_
> Bar name.

**-l** _FILE_
> Log file.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# DESCRIPTION

**waybar** is a customizable status bar for Wayland compositors. It works with Sway, Hyprland, and other wlroots-based compositors.

Configuration is JSON/JSON5. Modules define content: workspaces, clock, battery, network, CPU, memory, and many more.

Styling uses CSS. Colors, fonts, padding, and layout are customizable. Different styles can apply to different modules.

Built-in modules cover common needs. Custom modules execute scripts for specialized information.

Click actions on modules run commands. Right-click, middle-click, and scroll actions are configurable.

The bar updates reactively. System changes trigger updates without polling where possible.

# CAVEATS

Wayland only - doesn't work on X11. Some modules are compositor-specific. CSS can get complex for advanced styling.

# HISTORY

**Waybar** was created by **Alex D.** (Alexays) around **2018** for Sway and other wlroots compositors. It became the standard status bar for Wayland, similar to polybar's role on X11.

# SEE ALSO

[sway](/man/sway)(1), [polybar](/man/polybar)(1), [i3status](/man/i3status)(1), [hyprland](/man/hyprland)(1)

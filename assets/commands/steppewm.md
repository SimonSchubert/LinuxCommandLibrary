# TAGLINE

small stacking Wayland compositor in the IceWM style

# TLDR

Start the **compositor**

```steppewm```

Start with a custom **Lua** config

```steppewm -c [path/to/config.lua]```

# SYNOPSIS

**steppewm** [**-c** _config.lua_]

# PARAMETERS

**-c** _file_
> Config path. Default is `$XDG_CONFIG_HOME/steppewm/config.lua` (`~/.config/steppewm/config.lua`).

# DESCRIPTION

**steppewm** is a stacking (not tiling) wlroots compositor: overlapping windows, titlebars, a taskbar, Alt-Tab, workspaces, snapping, a system tray, layer-shell, session lock, and multi-monitor. It ships a set of classic IceWM pixmap themes and Lua configuration.

Build with Meson against wlroots 0.18–0.20, wayland, xkbcommon, libinput, lua 5.4, pixman, and cairo. Optional: libpulse (volume OSD), sdbus-c++ (tray), librsvg. Arch: AUR **steppewm-git**.

XWayland is optional via **xwayland-satellite**. Wallpaper, idle, and output tools are the usual wlr stack (**swaybg**, **swayidle**, **wlr-randr**, **wlopm**).

# CONFIGURATION

Copy the example **config.lua** from the source tree. Theming and the IceWM theme converter are documented in **doc/steppewm.md**. A `.desktop` session file is installed as **steppewm.desktop**.

# CAVEATS

Wayland only. Needs a working GPU/GBM stack like other wlroots compositors. Not a drop-in X11 IceWM replacement; X11 apps need xwayland-satellite. Pre-1.0; config keys can still change.

# HISTORY

Written by uncognic to fill the gap of a small IceWM-like compositor on Wayland.

# INSTALL

```aur: yay -S steppewm```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[hyprland](/man/hyprland)(1), [sway](/man/sway)(1), [niri](/man/niri)(1)

# RESOURCES

```[Source code](https://github.com/uncognic/steppewm)```

<!-- verified: 2026-08-26 -->

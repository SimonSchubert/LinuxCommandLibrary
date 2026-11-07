# TAGLINE

Show, hide, and reload a Wayland crosshair overlay

# TLDR

Start the overlay daemon (it stays hidden until you show it)

```wlcrosshair```

**Show** the crosshair

```wlcrosshairctl show```

**Hide** the crosshair

```wlcrosshairctl hide```

**Toggle** visibility

```wlcrosshairctl toggle```

Reread `~/.config/wlcrosshair/config.toml`

```wlcrosshairctl reload```

Stop the daemon

```wlcrosshairctl quit```

# SYNOPSIS

**wlcrosshairctl** **show** | **hide** | **toggle** | **reload** | **quit**

# PARAMETERS

**show**

> Make the overlay visible

**hide**

> Hide the overlay. The daemon keeps running

**toggle**

> Switch between shown and hidden

**reload**

> Read the configuration file again without restarting the daemon

**quit**

> Stop the **wlcrosshair** process

# DESCRIPTION

**wlcrosshairctl** talks to the **wlcrosshair** daemon, which draws an image on a Wayland layer-shell surface. The image is not a pointer and does not take clicks. A build produces one executable, **wlcrosshair**, and a **wlcrosshairctl** symlink. The program chooses daemon or client behavior from the name it was started with.

The daemon does nothing useful until `~/.config/wlcrosshair/config.toml` exists and names a PNG. On startup the crosshair is hidden. Show it with **show** or **toggle**. After you edit the file, **reload** applies the new image, size, output, and opacity.

Any compositor that implements wlr-layer-shell can host the overlay, including Hyprland, Sway and other wlroots compositors, COSMIC, niri, and KDE Plasma on Wayland. GNOME does not implement that protocol. The overlay does not run on X11.

# CONFIGURATION

**~/.config/wlcrosshair/config.toml**

> **path** (required) is the crosshair PNG. **output** selects a monitor by name (for example `DP-2` or `eDP-1`). With no **output**, the only connected display is used, or, when several are connected, the name that sorts first. **size** sets both width and height in pixels and wins over **width** and **height**. An omitted dimension uses the PNG's own size. **opacity** is from 0.0 to 1.0 and multiplies the image alpha. The default is 1.0.

Output names come from the compositor (`hyprctl monitors`, `swaymsg -t get_outputs`, and the equivalents on Plasma, COSMIC, and niri). They can change when you move a cable or a dock.

# CAVEATS

**wlcrosshair** must already be running. The control commands do not start it. Start it from the compositor's autostart or a user service.

The config path uses a directory name with no extra suffix. If **path** is missing, or the PNG cannot be read, the daemon has nothing to draw. **reload** does not create the file.

GNOME and X11 sessions are unsupported.

# HISTORY

**wlcrosshair** is a MIT-licensed Wayland overlay by marzeq. The author treats the feature set as complete. The control client is the same binary, invoked through the **wlcrosshairctl** name.

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [swaymsg](/man/swaymsg)(1)

# RESOURCES

```[Source code](https://github.com/marzeq/wlcrosshair)```

```[Homepage](https://marzeq.github.io/wlcrosshair/)```

<!-- verified: 2026-11-07 -->

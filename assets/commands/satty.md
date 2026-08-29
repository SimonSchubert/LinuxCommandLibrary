# TAGLINE

Wayland screenshot annotation tool

# TLDR

**Annotate** an image file

```satty --filename [screenshot.png]```

**Annotate** a region captured with grim and slurp

```grim -g "$(slurp)" -t ppm - | satty --filename -```

**Fullscreen** editor, save under a timestamped name

```satty -f - --fullscreen -o ~/Pictures/Screenshots/satty-%Y-%m-%d_%H:%M:%S.png```

**Copy** to the clipboard via **wl-copy**

```satty -f - --copy-command wl-copy```

# SYNOPSIS

**satty** [**--filename** _file_|**-**] [_options_]

# DESCRIPTION

**satty** is a GTK4/Adwaita screenshot annotation tool for Wayland (Sway, Hyprland, River, and other wlroots compositors). It is inspired by Swappy and Flameshot: simple tools plus fullscreen annotation and post-capture cropping, with OpenGL rendering.

Typical use is a pipeline: **slurp** selects a region, **grim** captures it, **satty** edits. **--filename -** reads stdin. Save with Ctrl+S, copy with Ctrl+C (or **--copy-command wl-copy**). Config is **~/.config/satty/config.toml**; CLI flags override the file.

Omarchy ships **satty** in its base package list as part of the screenshot stack.

# PARAMETERS

**-f**, **--filename** _FILE_
> Input image, or **-** for stdin. Required.

**-o**, **--output-filename** _FILE_
> Save path (strftime specifiers and **~** allowed), or **-** for stdout.

**--fullscreen** [**all**|**current-screen**]
> Start fullscreen.

**--initial-tool** _TOOL_
> Startup tool: pointer, crop, line, arrow, rectangle, ellipse, text, marker, blur, highlight, brush.

**--copy-command** _CMD_
> Command used on copy (typically **wl-copy**).

**--early-exit** [_triggers_...]
> Exit after copy/save/save-as (or **all**).

**-c**, **--config** _FILE_
> Config file (default **~/.config/satty/config.toml**).

**--man**
> Print the man page (pipe to **man -l -**).

# CONFIGURATION

**~/.config/satty/config.toml**
> Tools, copy command, output filename, keybinds, font, and color palette. CLI options always win over the file.

# CAVEATS

Wayland-first; compositor support for fullscreen and CSD/SSD varies. Needs GTK4 and libadwaita. For Hyprland, escape **#** in slurp colors as **##**.

# INSTALL

```pacman: sudo pacman -S satty```

```apk: sudo apk add satty```

```nix: nix profile install nixpkgs#satty```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[grim](/man/grim)(1), [slurp](/man/slurp)(1), [wl-copy](/man/wl-copy)(1), [flameshot](/man/flameshot)(1)

# RESOURCES

```[Source code](https://github.com/Satty-org/Satty)```

<!-- verified: 2026-08-29 -->

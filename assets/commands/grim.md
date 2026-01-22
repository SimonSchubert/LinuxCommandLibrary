# TLDR

**Screenshot** all outputs

```grim```

Screenshot a **specific output**

```grim -o [output_name]```

Screenshot a **specific region**

```grim -g "[x],[y] [width]x[height]"```

**Select** a region and screenshot it (using slurp)

```grim -g "$(slurp)"```

Use a **custom filename**

```grim "[path/to/file.png]"```

Screenshot and **copy to clipboard**

```grim - | wl-copy```

# SYNOPSIS

**grim** [_options_] [_output_]

# PARAMETERS

**-g** _GEOMETRY_
> Capture specific region (x,y widthxheight format)

**-o** _OUTPUT_
> Capture specific Wayland output (monitor)

**-s** _FACTOR_
> Set scale factor

**-t** _TYPE_
> Output format: png, jpeg, or ppm

**-q** _QUALITY_
> JPEG quality (1-100)

**-l** _LEVEL_
> PNG compression level (0-9)

**-c**
> Include cursor in screenshot

# DESCRIPTION

**grim** (grab image) is a Wayland-native screenshot tool. It captures images directly from the Wayland compositor, making it compatible with Sway, GNOME on Wayland, and other Wayland-based environments.

For region selection, grim is commonly paired with **slurp**, which allows interactive selection of screen areas. Output to stdout (**-**) enables piping to clipboard managers like **wl-copy**.

The tool supports multiple output formats and quality settings for different use cases.

# CAVEATS

Wayland-only; does not work on X11 (use scrot or maim instead). Requires a compatible Wayland compositor with screencopy protocol support. Some compositors may need additional configuration to enable screenshots.

# HISTORY

grim was created by Simon Ser (emersion) as part of the Wayland ecosystem tooling for the Sway window manager. It provides functionality similar to X11 tools like scrot but designed specifically for Wayland's security model.

# SEE ALSO

[slurp](/man/slurp)(1), [wl-copy](/man/wl-copy)(1), [scrot](/man/scrot)(1), [maim](/man/maim)(1)

# TLDR

**Select a region** and print it to stdout

```slurp```

Select a region while **displaying dimensions**

```slurp -d```

Select a **single point** instead of a region

```slurp -p```

Select an **output** and print its name

```slurp -o -f '%o'```

Select a region and take a **borderless screenshot** with grim

```grim -g "$(slurp -w 0)"```

Select a region and **record video** with wf-recorder

```wf-recorder -g "$(slurp -w 0)"```

# SYNOPSIS

**slurp** [_options_]

# PARAMETERS

**-d**
> Display dimensions of selection

**-p**
> Select a single point instead of region

**-o**
> Select an entire output (display)

**-r**
> Require selection to be inside a single output

**-b** _color_
> Set selection box background color

**-c** _color_
> Set selection box border color

**-s** _color_
> Set selection color

**-w** _width_
> Set selection border width (0 for no border)

**-f** _format_
> Output format string (%x, %y, %w, %h, %o)

**-a** _ratio_
> Force aspect ratio (e.g., 16:9)

# DESCRIPTION

**slurp** allows users to select a region on a Wayland compositor interactively. It outputs the selected region coordinates in a format that can be used by other tools like **grim** for screenshots or **wf-recorder** for screen recording.

The tool renders a translucent overlay and lets users click and drag to select a rectangular region. It's designed to be combined with other Wayland-native tools through shell command substitution.

# CAVEATS

Wayland only; requires a compositor that supports the layer-shell protocol. Does not capture images itself; use with **grim** for screenshots. Color values use #RRGGBBAA format.

# HISTORY

Written by **Simon Ser** (emersion) as part of the sway/wlroots ecosystem for Wayland. Provides the region selection functionality that **scrot -s** provides on X11, adapted for Wayland's security model.

# SEE ALSO

[grim](/man/grim)(1), [wf-recorder](/man/wf-recorder)(1), [scrot](/man/scrot)(1)

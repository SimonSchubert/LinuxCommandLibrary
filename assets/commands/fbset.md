# TAGLINE

configure framebuffer device settings

# TLDR

Show current **framebuffer settings**

```sudo fbset [-i|--info]```

Set a framebuffer **mode** from fb.modes

```sudo fbset "[800]x[600]-[60]"```

Set **arbitrary** framebuffer mode

```sudo fbset [-g|--geometry] [TTY_horizontal] [TTY_vertical] [monitor_horizontal] [monitor_vertical] [color_depth]```

# SYNOPSIS

**fbset** [_options_] [_mode_]

# DESCRIPTION

**fbset** shows and modifies Linux framebuffer device settings. It can change resolution, color depth, timing, and other display parameters.

Used for configuring console display on systems using framebuffer.

# PARAMETERS

**-i, --info**
> Show framebuffer information

**-g, --geometry** _params_
> Set geometry (xres, yres, vxres, vyres, depth)

**-t, --timings** _params_
> Set display timings

**-fb** _device_
> Use specified framebuffer device

# CONFIGURATION

**/etc/fb.modes**
> Defines predefined video modes with resolution, timing, and color depth settings.

# CAVEATS

Requires framebuffer support in kernel. May require root privileges. Incorrect settings can cause display issues.

# SEE ALSO

[fbi](/man/fbi)(1), [fbterm](/man/fbterm)(1)

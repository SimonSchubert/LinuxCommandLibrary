# TLDR

**Display current gamma values**

```xgamma```

**Set gamma for all channels**

```xgamma -gamma [1.2]```

**Set individual channel gamma**

```xgamma -rgamma [1.1] -ggamma [1.0] -bgamma [0.9]```

**Set gamma on specific display**

```xgamma -display [:0] -gamma [1.2]```

**Set gamma on specific screen**

```xgamma -screen [0] -gamma [1.1]```

# SYNOPSIS

**xgamma** [_options_]

# PARAMETERS

**-gamma** _value_
> Set gamma for all color channels.

**-rgamma** _value_
> Set red channel gamma.

**-ggamma** _value_
> Set green channel gamma.

**-bgamma** _value_
> Set blue channel gamma.

**-display** _name_
> X display to use.

**-screen** _num_
> Screen number to adjust.

**-quiet**
> Suppress normal output.

# DESCRIPTION

**xgamma** queries and sets gamma correction values for X11 displays. Gamma affects mid-tone brightness; values below 1.0 increase contrast while values above 1.0 decrease it.

The tool adjusts the video lookup table (LUT) through the X server. Default gamma is 1.0. Separate control of red, green, and blue channels allows color temperature adjustment.

Settings are temporary and reset on X server restart. For persistence, add xgamma commands to ~/.xinitrc or ~/.xprofile, or configure in xorg.conf.

# CAVEATS

X11 only; no effect on Wayland. Settings don't persist across reboots without scripting. May conflict with color management tools like Redshift. Hardware support varies.

# HISTORY

**xgamma** is part of the X.Org utility collection, providing simple gamma correction since early X11 implementations. While largely superseded by xrandr for display configuration, xgamma remains useful for quick gamma adjustments.

# SEE ALSO

[xrandr](/man/xrandr)(1), [redshift](/man/redshift)(1), [xcalib](/man/xcalib)(1), [xbrightness](/man/xbrightness)(1)

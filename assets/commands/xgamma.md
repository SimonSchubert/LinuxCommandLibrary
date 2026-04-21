# TAGLINE

Adjust X11 display gamma correction

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

**-help**
> Show usage summary and exit.

# DESCRIPTION

**xgamma** queries and alters the gamma correction of a monitor via the XFree86-VidModeExtension. Gamma affects mid-tone brightness; values below 1.0 increase contrast while values above 1.0 decrease it.

When invoked without gamma arguments, xgamma prints the current red, green, and blue gamma values to standard output. Gamma values are transmitted to the X server with three decimal places of precision. Separate control of red, green, and blue channels allows color temperature adjustment.

Settings are temporary and reset on X server restart. For persistence, add xgamma commands to ~/.xinitrc or ~/.xprofile, or configure in xorg.conf. The **DISPLAY** environment variable provides the default host and display number.

# CAVEATS

X11 only; no effect on Wayland. Settings don't persist across reboots without scripting. May conflict with color management tools like Redshift. Hardware support varies.

# HISTORY

**xgamma** is part of the X.Org utility collection and was originally authored by **Kaleb Keithley** and **David Dawes**. It relies on the XFree86-VidModeExtension, which is considered obsolete; modern setups should prefer **xrandr** with the RandR 1.2+ gamma properties.

# SEE ALSO

[xrandr](/man/xrandr)(1), [redshift](/man/redshift)(1)

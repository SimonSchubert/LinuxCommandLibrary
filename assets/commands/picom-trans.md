# TAGLINE

sets window transparency for the picom compositor

# TLDR

**Set window transparency**

```picom-trans -w [window_id] [75]```

**Set by clicking**

```picom-trans -c [75]```

**Set by window name**

```picom-trans -n [firefox] [90]```

**Reset transparency**

```picom-trans -w [window_id] -d```

**Toggle transparency**

```picom-trans -c -t```

**Set opacity (0-100)**

```picom-trans -c [50]```

# SYNOPSIS

**picom-trans** [_-w id_] [_-n name_] [_-c_] [_-t_] [_-d_] _opacity_

# PARAMETERS

**-w** _ID_
> Window ID.

**-n** _NAME_
> Window name/class.

**-c**
> Click to select window.

**-t**
> Toggle transparency.

**-d**
> Delete/reset transparency.

**-o** _OPACITY_
> Set opacity (0-100).

**-s**
> Select focused window.

# DESCRIPTION

**picom-trans** sets window transparency for the picom compositor. It adjusts individual window opacity.

Window selection by click enables interactive use. Click any window to modify its transparency.

Opacity values range from 0 (invisible) to 100 (opaque). Values like 75 give subtle transparency.

Toggle mode switches between transparent and opaque. Useful for temporary visibility changes.

Resets remove custom transparency. Windows return to default compositor settings.

# CAVEATS

Requires picom compositor running. Some windows may not support transparency. GPU compositing needed.

# HISTORY

**picom-trans** is part of **picom**, a compositor forked from compton. It provides command-line control over window transparency for X11 desktops.

# SEE ALSO

[picom](/man/picom)(1), [xdotool](/man/xdotool)(1), [xwininfo](/man/xwininfo)(1)

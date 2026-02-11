# TAGLINE

X11 mouse-tracking eyes demo

# TLDR

**Launch** xeyes

```xeyes```

Launch on **remote** display

```xeyes -display [remote_host]:[0].[0]```

# SYNOPSIS

**xeyes** [_OPTIONS_]

# PARAMETERS

**-display** _HOST:DISPLAY.SCREEN_
> X display to connect to

**-geometry** _WxH+X+Y_
> Window size and position

**-fg** _COLOR_
> Foreground color

**-bg** _COLOR_
> Background color

**-center** _COLOR_
> Pupil center color

# DESCRIPTION

**xeyes** displays a pair of eyes on the screen that follow the mouse cursor. It's a classic X11 demo application used to verify X11 display connectivity.

The eyes track the mouse pointer position across the entire screen.

# HISTORY

**xeyes** is one of the original X11 demo programs, dating back to the 1980s. It has been included with X Window System distributions as a simple test and novelty application.

# CAVEATS

X11 only. Limited practical use beyond testing display connections.

# SEE ALSO

[xclock](/man/xclock)(1), [xlogo](/man/xlogo)(1)

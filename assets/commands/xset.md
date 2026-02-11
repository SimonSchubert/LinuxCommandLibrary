# TAGLINE

Configure X server preferences

# TLDR

**Disable** screensaver

```xset s off```

**Disable** bell sound

```xset b off```

Set screensaver **timeout**

```xset s 3600 3600```

**Disable** DPMS

```xset -dpms```

**Enable** DPMS

```xset +dpms```

**Query** current settings

```xset q```

Set **keyboard repeat** rate

```xset r rate 200 30```

Set **LED** state

```xset led 3```

# SYNOPSIS

**xset** [_-display display_] [_options_]

# DESCRIPTION

**xset** is a user preference utility for X. It allows setting various user preference options for the X server, including keyboard, mouse, screen saver, and DPMS (Energy Star) settings.

# PARAMETERS

**s [timeout [cycle]]**
> Set screen saver timeout and cycle time in seconds

**s on|off|default**
> Enable, disable, or reset screen saver

**s blank|noblank**
> Set screen saver to blank or pattern mode

**s expose|noexpose**
> Allow/disallow screen exposure events

**-dpms**
> Disable DPMS (Display Power Management Signaling)

**+dpms**
> Enable DPMS

**dpms standby suspend off**
> Set DPMS timeouts in seconds

**dpms force on|standby|suspend|off**
> Force DPMS state immediately

**b [volume [pitch [duration]]]**
> Set bell parameters

**b on|off**
> Enable or disable bell

**r [keycode] on|off**
> Enable or disable auto-repeat for keys

**r rate [delay [rate]]**
> Set keyboard repeat delay (ms) and rate (per second)

**led [on|off]**
> Set all LEDs on or off

**led N**
> Turn LED N on

**-led N**
> Turn LED N off

**fp= path,...**
> Set font path

**fp default**
> Reset font path to default

**q**
> Query current settings

**-display display**
> Specify X display

# CAVEATS

Settings are temporary and reset when X restarts. For persistent settings, add xset commands to ~/.xprofile or session startup scripts. DPMS settings may be overridden by desktop environment power management.

# HISTORY

**xset** is part of the core X.Org utilities, providing command-line access to X server preferences that were historically set through X resources or window manager configurations.

# SEE ALSO

[xrandr](/man/xrandr)(1), [setxkbmap](/man/setxkbmap)(1), [xmodmap](/man/xmodmap)(1)

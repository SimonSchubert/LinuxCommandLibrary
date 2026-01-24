# TLDR

**Hide cursor after idle**

```unclutter```

**Custom timeout**

```unclutter -idle [3]```

**Ignore window**

```unclutter -not [window-name]```

**Run in background**

```unclutter -b```

**Don't touch root window**

```unclutter -noevents```

# SYNOPSIS

**unclutter** [_-idle seconds_] [_-b_] [_options_]

# PARAMETERS

**-idle** _SEC_
> Seconds before hide.

**-b**
> Background daemon.

**-not** _NAME_
> Ignore window.

**-noevents**
> No root events.

**-display** _DPY_
> X display.

# DESCRIPTION

**unclutter** hides mouse cursor. It removes idle pointer.

Automatic hiding. After inactivity.

Reappears on movement. Transparent to user.

Window exclusions. Keep visible.

X11 utility. Desktop environment.

# CAVEATS

X11 only. Multiple versions exist. May conflict with apps.

# HISTORY

**unclutter** was created to hide the mouse cursor when it's not being used, cleaning up the X11 display.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xsetroot](/man/xsetroot)(1)

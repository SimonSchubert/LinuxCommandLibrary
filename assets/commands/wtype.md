# TLDR

**Type** text

```wtype "[Hello World]"```

Type specific **key**

```wtype -k [Left]```

**Press** modifier

```wtype -M [shift|ctrl]```

**Release** modifier

```wtype -m [ctrl]```

**Delay** between keystrokes

```wtype -d [500] -- "[text]"```

Read from **stdin**

```echo "[text]" | wtype -```

# SYNOPSIS

**wtype** [_OPTIONS_] [_TEXT_]

# PARAMETERS

**-k** _KEY_
> Type specific key by name

**-M** _MOD_
> Press modifier key

**-m** _MOD_
> Release modifier key

**-d** _MS_
> Delay between keystrokes in milliseconds

**-**
> Read text from stdin

# DESCRIPTION

**wtype** simulates keyboard input on Wayland compositors, similar to xdotool type for X11. It can type text, press specific keys, and manage modifier states.

The tool is useful for automation, testing, and scripting on Wayland systems.

# CAVEATS

Wayland only. Requires appropriate permissions for input simulation. Some applications may not receive simulated input due to security restrictions.

# SEE ALSO

[ydotool](/man/ydotool)(1), [xdotool](/man/xdotool)(1)

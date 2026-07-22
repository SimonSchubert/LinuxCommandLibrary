# TAGLINE

displays a notification bar for the i3 window manager

# TLDR

**Display a warning message**

```i3-nagbar -t warning -m "[message]"```

**Display error message**

```i3-nagbar -t error -m "[message]"```

**Add button with terminal action**

```i3-nagbar -m "[message]" -b "[button text]" "[command]"```

**Add button with direct action**

```i3-nagbar -m "[message]" -B "[button text]" "[command]"```

**Show on primary monitor**

```i3-nagbar -p -m "[message]"```

**Specify font**

```i3-nagbar -f "[pango:monospace 10]" -m "[message]"```

# SYNOPSIS

**i3-nagbar** [_options_]

# PARAMETERS

**-m** _message_
> Message to display.

**-t** _type_
> Type: warning or error.

**-b** _button_ _action_
> Button that runs action in terminal.

**-B** _button_ _action_
> Button that runs action directly.

**-f** _font_
> Font specification.

**-p**
> Show on primary monitor.

**-v**
> Verbose mode.

# DESCRIPTION

**i3-nagbar** displays a notification bar for the i3 window manager. Used by i3 to report configuration errors and for user-defined warnings or confirmations. Supports buttons that execute shell commands either in a terminal or directly.

# INSTALL

```apt: sudo apt install i3-wm```

```pacman: sudo pacman -S i3-wm```

```apk: sudo apk add i3wm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[i3](/man/i3)(1), [i3-msg](/man/i3-msg)(1)


# TAGLINE

allows mouse cursor control using the keyboard

# TLDR

**Start keynav**

```keynav```

**Start with custom config**

```keynav "[loadconfig ~/.keynavrc]"```

**Daemonize**

```keynav daemonize```

# SYNOPSIS

**keynav** [_commands_]

# PARAMETERS

_commands_
> Keynav commands to execute.

**daemonize**
> Run in background.

# DESCRIPTION

**keynav** allows mouse cursor control using the keyboard. It recursively divides the screen into sections, allowing quick navigation to any point using keyboard shortcuts.

The default binding activates keynav with Ctrl+semicolon, then uses h/j/k/l or arrows to cut the screen, narrowing down to the desired position.

# DEFAULT BINDINGS

```
ctrl+semicolon  Start keynav
h, Left         Cut left
j, Down         Cut down
k, Up           Cut up
l, Right        Cut right
shift+h         Move left
shift+j         Move down
shift+k         Move up
shift+l         Move right
space, Enter    Click
semicolon       Click and end
Escape          Cancel
```

# CONFIGURATION

```
# ~/.keynavrc
clear
ctrl+semicolon start
h cut-left
l cut-right
k cut-up
j cut-down
space warp,click 1,end
```

# CAVEATS

X11 only (no Wayland support). Requires practice to use efficiently. May conflict with other keybindings.

# HISTORY

keynav was created by **Jordan Sissel** to enable mouseless computing. It follows the Unix philosophy of doing one thing well—allowing precise cursor positioning via keyboard.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xbindkeys](/man/xbindkeys)(1), [warpd](/man/warpd)(1)

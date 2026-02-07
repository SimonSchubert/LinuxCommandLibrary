# TAGLINE

Control the bspwm tiling window manager

# TLDR

Define **virtual desktops**

```bspc monitor -d [desktop_name1] [desktop_name2]```

**Focus** a specific desktop

```bspc desktop -f [number]```

**Close** the selected window

```bspc node -c```

**Send** a node to a desktop

```bspc node -d [number]```

Toggle **fullscreen** mode

```bspc node -t ~fullscreen```

**Set** a configuration value

```bspc config [setting_name] [value]```

# SYNOPSIS

**bspc** _domain_ _command_ [_arguments_]

# DESCRIPTION

**bspc** is the control program for bspwm (Binary Space Partitioning Window Manager). It sends commands to the window manager to manipulate windows, desktops, monitors, and configuration settings.

The tool uses a domain-command structure where domains include node (windows), desktop, monitor, and config.

# DOMAINS

**node**
> Manipulate window nodes (focus, move, resize, close, state)

**desktop**
> Manage desktops (focus, rename, remove)

**monitor**
> Configure monitors and their desktops

**config**
> Get or set configuration options

**rule**
> Manage window rules

**query**
> Query tree state

**subscribe**
> Subscribe to events

# PARAMETERS

**-d, --to-desktop** _name_
> Send node to specified desktop

**-f, --focus** _selector_
> Focus the selected node/desktop

**-c, --close**
> Close the selected node

**-t, --state** _state_
> Set node state (tiled, floating, fullscreen)

# SEE ALSO

[bspwm](/man/bspwm)(1), [sxhkd](/man/sxhkd)(1)

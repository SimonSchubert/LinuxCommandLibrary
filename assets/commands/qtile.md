# TLDR

**Start** the window manager

```qtile start```

**Check** configuration file for errors

```qtile check```

Show **resource usage** information

```qtile top --force```

**Run command** on specific group

```qtile run-cmd --group groupname --float xterm```

**Restart** the window manager

```qtile cmd-obj --object cmd --function restart```

Execute a **shell command**

```qtile shell -c "lazy.spawn('xterm')"```

# SYNOPSIS

**qtile** _command_ [_options_]

# DESCRIPTION

**qtile** is a full-featured, hackable tiling window manager written and configured in Python. It provides a dynamic tiling layout system with extensive customization through Python configuration.

# PARAMETERS

**start**
> Start the window manager (run from .xsession or similar)

**check**
> Check configuration file for errors (default: ~/.config/qtile/config.py)

**top**
> Show current resource usage information

**run-cmd**
> Launch a program with specific options

**cmd-obj**
> Execute a command object method

**shell**
> Open interactive Python shell for qtile control

**--group GROUP**
> Specify the group (workspace) for run-cmd

**--float**
> Launch window as floating

**--object OBJECT**
> Specify object for cmd-obj

**--function FUNCTION**
> Specify function to call for cmd-obj

# CAVEATS

Configuration is done in Python at ~/.config/qtile/config.py. Always run qtile check after modifying configuration to verify syntax. Qtile requires X11 or Wayland (via qtile start --backend wayland).

# HISTORY

**qtile** was created as a highly configurable tiling window manager that uses Python for configuration, allowing complex customizations and scripting capabilities.

# SEE ALSO

[i3](/man/i3)(1), [bspwm](/man/bspwm)(1), [awesome](/man/awesome)(1)

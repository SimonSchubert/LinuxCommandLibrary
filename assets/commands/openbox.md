# TAGLINE

lightweight, highly configurable window manager

# TLDR

**Start Openbox**

```openbox```

**Start as session manager**

```openbox-session```

**Reconfigure without restart**

```openbox --reconfigure```

**Restart Openbox**

```openbox --restart```

**Exit Openbox**

```openbox --exit```

**Replace the currently running window manager**

```openbox --replace```

# SYNOPSIS

**openbox** [_options_]

# PARAMETERS

**--reconfigure**
> Reload configuration.

**--restart**
> Restart Openbox.

**--replace**
> Replace running WM.

**--exit**
> Exit the running Openbox instance.

**--config-file** _file_
> Specify the path to the configuration file to use.

**--sm-disable**
> Do not connect to the session manager.

**--startup** _cmd_
> Run the specified command after startup.

**--debug**
> Display debugging output.

**--debug-focus**
> Display debugging output for focus handling.

**--version**
> Show the version and exit.

**--help**
> Show command line options summary and exit.

# DESCRIPTION

**Openbox** is a lightweight, highly configurable window manager. It's known for its minimal resource usage, standards compliance, and extensive customization through XML configuration.

Openbox can run standalone or as the window manager for desktop environments like LXDE.

# CONFIGURATION FILES

```
~/.config/openbox/
├── rc.xml        # Main config
├── menu.xml      # Right-click menu
├── autostart     # Startup applications
└── environment   # Environment variables
```

# KEY BINDINGS EXAMPLE

```xml
<!-- rc.xml -->
<keybind key="A-Tab">
  <action name="NextWindow"/>
</keybind>
```

# CAVEATS

No built-in panel or taskbar. Requires manual configuration. Use with panel (tint2, polybar) for full desktop.

# HISTORY

Openbox was originally a fork of Blackbox, rewritten by **Dana Jansens** starting in **2002** to provide a modern, standards-compliant window manager.

# SEE ALSO

[i3](/man/i3)(1), [polybar](/man/polybar)(1), [feh](/man/feh)(1), [nitrogen](/man/nitrogen)(1)

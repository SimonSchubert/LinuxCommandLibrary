# TLDR

**Start Openbox**

```openbox```

**Start as session manager**

```openbox-session```

**Reconfigure without restart**

```openbox --reconfigure```

**Restart Openbox**

```openbox --restart```

**Check configuration**

```openbox --debug```

# SYNOPSIS

**openbox** [_options_]

# PARAMETERS

**--reconfigure**
> Reload configuration.

**--restart**
> Restart Openbox.

**--replace**
> Replace running WM.

**--config-file** _file_
> Use config file.

**--debug**
> Debug output.

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

[obconf](/man/obconf)(1), [tint2](/man/tint2)(1), [lxde](/man/lxde)(1), [i3](/man/i3)(1)

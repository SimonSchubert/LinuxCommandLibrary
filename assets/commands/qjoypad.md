# TAGLINE

Map gamepad input to keyboard and mouse

# TLDR

**Start** QJoyPad

```qjoypad```

Specify **device directory**

```qjoypad --device=[path/to/directory]```

Start **without tray** icon

```qjoypad --notray```

**Force** tray icon

```qjoypad --force-tray```

**Update** device list

```qjoypad --update```

Load specific **layout**

```qjoypad "[layout_name]"```

# SYNOPSIS

**qjoypad** [**--device** _path_] [**--notray**] [**--force-tray**] [**--update**] [_layout_]

# PARAMETERS

**--device _path_**
> Directory to look for devices

**--notray**
> Don't show system tray icon

**--force-tray**
> Force window manager to use tray icon

**--update**
> Update running instance's device list

**layout**
> Layout name to load

# DESCRIPTION

**qjoypad** maps gamepad and joystick input to keyboard keystrokes and mouse actions. It allows using gamepads in applications that don't natively support them.

The tool provides a graphical interface for creating and managing input mappings. Layouts can be saved and loaded for different games or applications.

# CAVEATS

Requires evdev or joystick input devices. Some games may conflict with remapping. Layouts stored per-user. May need udev rules for device access.

# HISTORY

**qjoypad** was created to enable gamepad use in Linux applications lacking native support. It's particularly useful for emulators and games that only support keyboard input.

# SEE ALSO

[antimicrox](/man/antimicrox)(1), [xboxdrv](/man/xboxdrv)(1), [jstest](/man/jstest)(1)

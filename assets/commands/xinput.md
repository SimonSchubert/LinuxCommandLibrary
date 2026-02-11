# TAGLINE

Manage X11 input devices

# TLDR

**List** all input devices

```xinput list```

**Disable** an input device

```xinput disable id```

**Enable** an input device

```xinput enable id```

**List properties** of a device

```xinput list-props id```

**Set property** value for device

```xinput set-prop id property value```

**Detach** device from its master

```xinput float id```

**Reattach** device to a master

```xinput reattach id master_id```

**Test** input events from device

```xinput test id```

# SYNOPSIS

**xinput** [_COMMAND_] [_OPTIONS_] [_DEVICE_]

# DESCRIPTION

**xinput** is a utility to list available input devices, query information about a device, and change input device settings in the X Window System. It provides control over keyboard, mouse, touchpad, and other input devices.

# PARAMETERS

**list**
> List all input devices with their IDs

**enable ID**
> Enable the input device

**disable ID**
> Disable the input device

**list-props ID**
> List configurable properties of a device

**set-prop ID PROPERTY VALUE**
> Set property value (supports 8, 16, or 32-bit formats)

**watch-props ID**
> Monitor property changes in real-time

**query-state ID**
> Query the current state of a device

**set-mode ID MODE**
> Set device mode to ABSOLUTE or RELATIVE

**set-button-map ID MAP**
> Remap physical buttons to logical buttons

**map-to-output ID OUTPUT**
> Restrict device to specific display output

**float ID**
> Detach a slave device from its master

**reattach ID MASTER_ID**
> Reattach a slave device to a different master

**create-master NAME**
> Create a new master device pair

**remove-master ID**
> Remove a master device and its paired device

**test ID**
> Register for extended events and display data

# CAVEATS

On Xwayland, xinput only affects X11 clients connected to that Xwayland instance, not Wayland-native applications. Configuration changes may not persist across sessions; use system configuration files for permanent changes.

# HISTORY

**xinput** is part of the X.Org input utilities, providing command-line management of XInput extension devices.

# SEE ALSO

[xrandr](/man/xrandr)(1), [xset](/man/xset)(1), [xmodmap](/man/xmodmap)(1), [setxkbmap](/man/setxkbmap)(1)

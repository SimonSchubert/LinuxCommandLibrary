# TLDR

Show the **battery icon** in the system tray

```cbatticon```

Set the **update interval** to 20 seconds

```cbatticon -u [20]```

List available **icon types**

```cbatticon -t```

Show with a **specific icon type**

```cbatticon -i [standard|notification|symbolic]```

List available **power supplies**

```cbatticon -p```

Show icon for a **specific battery**

```cbatticon [BAT0]```

Set **critical level** command

```cbatticon -r [5] -c [poweroff]```

# SYNOPSIS

**cbatticon** [_options_] [_battery_]

# DESCRIPTION

**cbatticon** is a lightweight battery indicator for the system tray. It displays battery status with configurable icons and can execute commands when battery reaches critical levels.

The tool is designed for minimal window managers and desktop environments that don't include battery monitoring.

# PARAMETERS

**-u, --update-interval** _seconds_
> Update interval in seconds

**-i, --icon-type** _type_
> Icon style: standard, notification, or symbolic

**-t, --list-icon-types**
> List available icon types

**-p, --list-power-supplies**
> List available power supplies

**-r, --critical-level** _percent_
> Set critical battery level percentage

**-c, --command-critical-level** _cmd_
> Command to run at critical level

**-l, --low-level** _percent_
> Set low battery level percentage

# CAVEATS

Requires a system tray to display. May not work with Wayland compositors that lack tray support. Critical level commands run with user privileges.

# SEE ALSO

[upower](/man/upower)(1), [acpi](/man/acpi)(1)

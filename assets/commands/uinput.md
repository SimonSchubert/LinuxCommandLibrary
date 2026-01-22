# TLDR

**Preview** device description (dry-run)

```uinput -p```

Merge **YAML** device descriptions

```sudo uinput -c [path/to/device1.yaml] [path/to/device2.yaml]```

Merge from **device** nodes

```sudo uinput -d [/dev/input/eventX] [/dev/input/eventY]```

# SYNOPSIS

**uinput** [_OPTIONS_]

# PARAMETERS

**-p**
> Show resulting YAML device description and exit

**-c** _FILE..._
> Merge YAML device description files

**-d** _DEVICE..._
> Merge device description from device nodes

# DESCRIPTION

**uinput** intercepts input events and writes them to a virtual keyboard device using /dev/uinput. It is part of the Interception Tools suite for advanced input event processing.

The tool creates virtual input devices from YAML descriptions or by cloning existing device capabilities, enabling event transformation pipelines.

# CAVEATS

Requires root privileges. Access to /dev/uinput is needed. Part of the Interception Tools project. Incorrect configuration can affect input handling.

# SEE ALSO

[udevmon](/man/udevmon)(1)

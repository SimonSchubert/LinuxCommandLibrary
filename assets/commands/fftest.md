# TLDR

Open fftest on an **event device**

```fftest [/dev/input/eventX]```

# SYNOPSIS

**fftest** _device_

# DESCRIPTION

**fftest** tests force-feedback devices like game controllers with rumble functionality. It sends various force-feedback effects to the device to verify they work correctly.

Part of the linuxconsole package for input device testing.

# PARAMETERS

_device_
> Input event device to test (e.g., /dev/input/event0)

# CAVEATS

Requires appropriate permissions on input device. Device must support force-feedback. Use evtest to identify the correct event device.

# SEE ALSO

[evtest](/man/evtest)(1), [jstest](/man/jstest)(1)

# TAGLINE

force-feedback device testing utility

# TLDR

Open fftest on an **event device**

```fftest [/dev/input/eventX]```

# SYNOPSIS

**fftest** _device_

# DESCRIPTION

**fftest** tests force-feedback devices like game controllers, steering wheels, and joysticks with rumble or haptic feedback functionality. It sends various force-feedback effects to the device including constant forces, periodic effects, ramps, and spring conditions to verify they work correctly.

The tool is part of the linuxconsole package for input device testing. It interacts with Linux input event devices through the force-feedback API, allowing users to diagnose hardware issues and verify driver support.

fftest requires appropriate device permissions and is primarily used for troubleshooting gaming peripherals and testing driver implementations.

# PARAMETERS

_device_
> Input event device to test (e.g., /dev/input/event0)

# CAVEATS

Requires appropriate permissions on input device. Device must support force-feedback. Use evtest to identify the correct event device.

# SEE ALSO

[evtest](/man/evtest)(1), [jstest](/man/jstest)(1)

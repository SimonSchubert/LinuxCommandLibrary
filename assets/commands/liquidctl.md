# TAGLINE

controls liquid coolers and RGB devices

# TLDR

**List devices**

```liquidctl list```

**Initialize device**

```liquidctl initialize```

**Set pump speed**

```liquidctl set pump speed [50]```

**Set fan curve**

```liquidctl set fan speed 20 30 30 50 40 70 50 100```

**Set LED color**

```liquidctl set led color fixed [ff0000]```

**Show device status**

```liquidctl status```

# SYNOPSIS

**liquidctl** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**list**
> List supported devices.

**initialize**
> Initialize device.

**status**
> Show device status.

**set** _CHANNEL_ _MODE_ _VALUE_
> Configure device settings.

**--match** _PATTERN_
> Match specific device.

**--help**
> Display help information.

# DESCRIPTION

**liquidctl** controls liquid coolers and RGB devices. It manages pump speed, fan curves, and LED lighting.

The tool supports many AIO coolers and RGB controllers from various manufacturers.

# CAVEATS

Requires root or udev rules. Device support varies. Some features hardware-specific.

# HISTORY

liquidctl was created to provide open source control for AIO liquid coolers and RGB peripherals on Linux.

# SEE ALSO

[sensors](/man/sensors)(1), [fancontrol](/man/fancontrol)(1)


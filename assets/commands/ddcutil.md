# TAGLINE

DDC/CI monitor control via I2C

# TLDR

**List** all compatible displays

```ddcutil detect```

**Set brightness** to 50%

```ddcutil -d [1] setvcp 10 [50]```

**Increase contrast** by 5%

```ddcutil -d [1] setvcp 12 + [5]```

**Read** all display settings

```ddcutil -d [1] getvcp ALL```

# SYNOPSIS

**ddcutil** [_options_] _command_ [_arguments_]

# DESCRIPTION

**ddcutil** queries and modifies display settings using the DDC/CI (Display Data Channel Command Interface) protocol over I2C bus communication. It can control brightness, contrast, input source, color temperature, and many other monitor parameters that would normally require physical button presses or OSD navigation.

The tool communicates with monitors through the I2C bus interface, which requires the i2c-dev kernel module. Each monitor exposes a set of VCP (Virtual Control Panel) features that can be read or written. Different monitors support different features, and ddcutil can query capabilities to discover what a specific monitor supports.

Common use cases include scripting brightness adjustments based on time of day, switching monitor inputs automatically, and saving/restoring monitor configurations. This is particularly valuable for multi-monitor setups where manual adjustment would be tedious, or for accessibility scenarios requiring programmatic control of display properties. The tool also enables remote monitor management over SSH for headless systems.

# PARAMETERS

**detect**
> List connected DDC-capable displays

**getvcp** _feature_
> Read a VCP feature value

**setvcp** _feature_ _value_
> Set a VCP feature value

**-d, --display** _num_
> Select display number

**vcpinfo** _feature_
> Show VCP feature information

**capabilities**
> Query display capabilities

# VCP FEATURES

**0x10**
> Brightness

**0x12**
> Contrast

**0x60**
> Input source

**ALL**
> All supported features

# CAVEATS

Requires the i2c-dev module: `modprobe i2c-dev`. May need to add user to i2c group. Not all monitors support DDC/CI. Some features may be read-only.

# SEE ALSO

[xrandr](/man/xrandr)(1), [modprobe](/man/modprobe)(8)

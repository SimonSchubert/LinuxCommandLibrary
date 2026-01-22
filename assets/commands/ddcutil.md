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

**ddcutil** queries and modifies display settings using the DDC/CI protocol over I2C. It can control brightness, contrast, input source, and many other monitor parameters.

Requires the i2c-dev kernel module to be loaded.

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

# TLDR

Run a **v4l2 program** within PipeWire

```pw-v4l2 program```

Display **help**

```pw-v4l2 -h```

# SYNOPSIS

**pw-v4l2** [_options_] _program_ [_arguments_...]

# PARAMETERS

**-h**
> Display help message

# DESCRIPTION

**pw-v4l2** runs V4L2 (Video4Linux2) programs within PipeWire. It provides a compatibility layer that allows applications using the V4L2 API to access camera devices managed by PipeWire.

This enables video applications to benefit from PipeWire's permission system and device sharing capabilities.

# CAVEATS

Not all V4L2 features may be fully supported. Some applications may require native PipeWire support for full functionality.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Extends PipeWire's device abstraction to video capture devices.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [v4l2-ctl](/man/v4l2-ctl)(1)

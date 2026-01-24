# TLDR

**Start GDB server**

```st-util```

**Custom port**

```st-util -p [4242]```

**Verbose mode**

```st-util -v```

**Multi mode**

```st-util -m```

**Specify serial**

```st-util --serial [serial-number]```

# SYNOPSIS

**st-util** [_-p port_] [_-v_] [_-m_] [_options_]

# PARAMETERS

**-p** _PORT_
> GDB server port.

**-v**
> Verbose output.

**-m**
> Multi-target mode.

**--serial** _SN_
> Device serial.

**--semihosting**
> Enable semihosting.

**-n**
> No reset on connect.

# DESCRIPTION

**st-util** runs GDB server. It connects ST-Link to GDB.

Remote debugging. GDB protocol.

Connects to STM32. Via ST-Link.

Semihosting support. Printf to debugger.

Standard GDB port. Connect with arm-gdb.

# CAVEATS

ST-Link required. One device by default. Port must be free.

# HISTORY

**st-util** is part of **stlink**, providing a GDB server for debugging STM32 microcontrollers via ST-Link.

# SEE ALSO

[st-flash](/man/st-flash)(1), [st-info](/man/st-info)(1), [gdb](/man/gdb)(1), [openocd](/man/openocd)(1)

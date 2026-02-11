# TAGLINE

STM32 GDB server via ST-Link

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

**st-util** starts a GDB server that bridges the GNU Debugger (GDB) to STM32 microcontrollers through an ST-Link programmer/debugger. It implements the GDB remote serial protocol, allowing standard GDB commands for setting breakpoints, stepping through code, and inspecting memory and registers.

By default, the server listens on port 4242 for GDB connections. Multi-target mode (**-m**) supports debugging multiple ST-Link devices simultaneously. Semihosting enables the target firmware to perform I/O operations (such as printf) through the debug connection. It is part of the open-source stlink toolset.

# CAVEATS

ST-Link required. One device by default. Port must be free.

# HISTORY

**st-util** is part of **stlink**, providing a GDB server for debugging STM32 microcontrollers via ST-Link.

# SEE ALSO

[st-flash](/man/st-flash)(1), [st-info](/man/st-info)(1), [gdb](/man/gdb)(1), [openocd](/man/openocd)(1)

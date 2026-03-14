# TAGLINE

STM32 GDB server via ST-Link

# TLDR

**Start GDB server**

```st-util```

**Start on a specific port**

```st-util -p [4242]```

**Start with verbose output**

```st-util -v```

**Start in multi-target mode**

```st-util -m```

**Connect to a specific ST-Link by serial number**

```st-util --serial [serial-number]```

**Start with semihosting enabled**

```st-util --semihosting```

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

Requires an ST-Link programmer/debugger connected via USB. Only one ST-Link device is supported by default; use **-m** or **--serial** for multiple devices. The default port (4242) must not be in use by another process. Root or udev rules may be needed for USB access.

# HISTORY

**st-util** is part of the **stlink** open-source toolset, originally created by **texane** and now maintained by the stlink-org community.

# SEE ALSO

[st-flash](/man/st-flash)(1), [st-info](/man/st-info)(1), [gdb](/man/gdb)(1), [openocd](/man/openocd)(1)

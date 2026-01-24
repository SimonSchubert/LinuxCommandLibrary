# TLDR

**Start with config file**

```openocd -f [interface/stlink.cfg] -f [target/stm32f4x.cfg]```

**Program flash**

```openocd -f [interface.cfg] -f [target.cfg] -c "program [firmware.elf] verify reset exit"```

**Start with specific interface**

```openocd -f [interface/jlink.cfg] -f [board/stm32f4discovery.cfg]```

**Start telnet server only**

```openocd -f [config.cfg] -c "init"```

**Dump flash memory**

```openocd -f [config.cfg] -c "init" -c "dump_image [output.bin] 0x08000000 0x10000"```

**Debug output**

```openocd -d3 -f [interface.cfg] -f [target.cfg]```

# SYNOPSIS

**openocd** [_-f config_] [_-c command_] [_-d level_] [_options_]

# PARAMETERS

**-f** _FILE_
> Configuration file.

**-c** _CMD_
> Run command.

**-s** _DIR_
> Search directory.

**-d** _LEVEL_
> Debug level (0-3).

**-l** _FILE_
> Log to file.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**openocd** (Open On-Chip Debugger) provides debugging and programming for embedded systems. It interfaces with JTAG and SWD debug adapters to access microcontrollers.

Configuration files define the debug adapter (interface) and target device. Many boards and adapters have predefined configurations in the installation.

Programming mode flashes firmware to microcontrollers. Verify confirms the write succeeded. Reset starts the new firmware.

When running as a server, OpenOCD provides GDB server (port 3333) and telnet interface (port 4444). GDB connects for source-level debugging.

The telnet interface allows direct commands: halt, resume, step, memory read/write, register access, and breakpoint management.

Multiple targets can be debugged simultaneously. JTAG chains with several devices are supported.

# CAVEATS

Requires appropriate adapter hardware. Target configuration must match device. Some features are adapter-specific. Debug permissions may need udev rules.

# HISTORY

**OpenOCD** was started by **Dominic Rath** as a university project in **2005**. It became the standard open-source on-chip debugger, supporting hundreds of target devices and debug adapters. Development continues under community governance.

# SEE ALSO

[gdb](/man/gdb)(1), [arm-none-eabi-gdb](/man/arm-none-eabi-gdb)(1), [stlink](/man/stlink)(1), [avrdude](/man/avrdude)(1)

# TAGLINE

Debug bare-metal ARM firmware interactively.

# TLDR

**Start debugging an ARM firmware binary**

```arm-none-eabi-gdb [firmware.elf]```

**Connect to a remote target** via OpenOCD

```arm-none-eabi-gdb -ex "target remote localhost:3333" [firmware.elf]```

**Start with a command script**

```arm-none-eabi-gdb -x [commands.gdb] [firmware.elf]```

**Load and run firmware on target**

```arm-none-eabi-gdb -ex "target remote :3333" -ex "load" -ex "continue" [firmware.elf]```

**Start in TUI mode** with source display

```arm-none-eabi-gdb -tui [firmware.elf]```

# SYNOPSIS

**arm-none-eabi-gdb** [_options_] [_executable_]

# PARAMETERS

**-ex** _command_
> Execute a GDB command after loading the program.

**-x** _file_
> Execute commands from a script file.

**-tui**
> Start in Text User Interface mode with source window.

**-q**, **--quiet**
> Suppress introductory and copyright messages.

**-batch**
> Run in batch mode for non-interactive use.

**-cd** _directory_
> Change to directory before running.

**-s** _file_
> Read symbols from the specified file.

**--args**
> Pass remaining arguments to the program.

# COMMON GDB COMMANDS

**target remote** _host:port_
> Connect to remote debug server (OpenOCD, J-Link, etc.)

**load**
> Download program to target flash/RAM.

**monitor reset halt**
> Reset target and halt at start.

**break** _location_
> Set breakpoint at function or address.

**continue** / **c**
> Continue execution.

**step** / **next**
> Step into / Step over source lines.

**stepi** / **nexti**
> Step by single instructions.

**info registers**
> Display CPU register contents.

**x** _address_
> Examine memory at address.

# DESCRIPTION

**arm-none-eabi-gdb** is the GNU Debugger configured for bare-metal ARM targets (Cortex-M, Cortex-A without OS). It enables source-level debugging of firmware running on microcontrollers and embedded systems through JTAG/SWD debug probes.

The debugger connects to hardware targets via debug servers like OpenOCD, J-Link GDB Server, or ST-Link utilities. These servers provide the bridge between GDB's remote protocol and the physical debug interface on the microcontroller.

With an ELF file containing debug symbols, arm-none-eabi-gdb provides full source-level debugging: setting breakpoints, inspecting variables, stepping through code, and examining memory and registers. It supports ARM-specific features like viewing special registers and peripheral memory regions.

# CONFIGURATION

**~/.gdbinit**
> GDB initialization commands executed at startup, such as target connection settings and custom macros.

# CAVEATS

Requires a debug probe (J-Link, ST-Link, CMSIS-DAP) and debug server (OpenOCD, pyOCD) connected to the target. The ELF file must match the firmware on target exactly for symbols to align correctly. Hardware breakpoints are limited in number on most Cortex-M devices (typically 4-6). Optimized code may have confusing debug behavior due to reordering and inlining.

# HISTORY

The GNU Debugger (GDB) originated in **1986** as part of the GNU Project. ARM cross-compilation toolchains have included GDB builds targeting bare-metal ARM since the early **2000s**, supporting the growing embedded systems market. The **arm-none-eabi** prefix denotes the ARM architecture with no operating system (bare metal) using the Embedded ABI.

# SEE ALSO

[openocd](/man/openocd)(1), [gdb](/man/gdb)(1), [arm-none-eabi-gcc](/man/arm-none-eabi-gcc)(1)

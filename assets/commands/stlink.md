# TAGLINE

Open-source STM32 programming toolset

# TLDR

**Flash firmware to STM32**

```st-flash write [firmware.bin] 0x08000000```

**Read flash memory to file**

```st-flash read [output.bin] 0x08000000 [size]```

**Erase flash memory**

```st-flash erase```

**Display programmer and MCU information**

```st-info --probe```

**Flash with reset after programming**

```st-flash --reset write [firmware.bin] 0x08000000```

**Read option bytes**

```st-flash read [option_bytes.bin] 0x1FFF7800 4```

# SYNOPSIS

**st-flash** [_options_] {read|write|erase} [_file_] [_address_] [_size_]

**st-info** [_options_]

# PARAMETERS

**--reset**
> Reset the MCU after flashing.

**--connect-under-reset**
> Connect to target while held in reset.

**--hot-plug**
> Connect to target without reset.

**--format** _format_
> File format: binary or ihex (Intel HEX).

**--flash** _size_
> Override detected flash size (in bytes with optional k/M suffix).

**--serial** _serial_
> Use specific ST-LINK by serial number.

**--freq** _khz_
> Set SWD frequency in kHz.

**--debug**
> Enable debug output.

**--version**
> Display version information.

**--probe** (st-info)
> Display information about connected programmer and target.

**--chipid** (st-info)
> Display chip ID of connected target.

**--descr** (st-info)
> Display description of connected target.

# DESCRIPTION

**stlink** is an open source toolset for programming and debugging STM32 microcontrollers using ST-LINK programmers. It provides command-line utilities that work with ST-LINK/V1, V2, V2-1, V3, and compatible clone programmers.

The toolset includes **st-flash** for reading and writing flash memory, and **st-info** for querying programmer and target information. It communicates with the STM32 target via SWD (Serial Wire Debug) or JTAG protocols.

The tools support binary and Intel HEX file formats. Flash operations can target the main flash memory, option bytes, or other memory regions. The **--connect-under-reset** option helps with targets that have problematic firmware or locked debug access.

# CAVEATS

Requires appropriate udev rules on Linux for non-root access. Some ST-LINK clones may have compatibility issues. The V1 programmer has limited functionality compared to V2/V3. Option byte manipulation can brick devices if done incorrectly. For complex programming needs, consider STM32CubeProgrammer CLI.

# HISTORY

The **stlink** project was created as an open source alternative to STMicroelectronics' proprietary ST-LINK Utility. It originated from the texane/stlink repository and is now maintained by the stlink-org community on GitHub. The project enables STM32 development on Linux and macOS where official tools had limited support.

# SEE ALSO

[openocd](/man/openocd)(1), [avrdude](/man/avrdude)(1), [dfu-util](/man/dfu-util)(1)

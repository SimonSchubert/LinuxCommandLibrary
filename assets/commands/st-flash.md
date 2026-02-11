# TLDR

**Flash binary**

```st-flash write [firmware.bin] [0x8000000]```

**Read flash**

```st-flash read [output.bin] [0x8000000] [0x1000]```

**Erase flash**

```st-flash erase```

**Reset device**

```st-flash reset```

**Verify write**

```st-flash --verify write [firmware.bin] [0x8000000]```

# SYNOPSIS

**st-flash** [_--verify_] _command_ [_file_] [_address_] [_size_]

# PARAMETERS

**write**
> Write to flash.

**read**
> Read from flash.

**erase**
> Erase all flash.

**reset**
> Reset chip.

**--verify**
> Verify after write.

**--reset**
> Reset after operation.

**--serial** _SN_
> Device serial.

# DESCRIPTION

**st-flash** is a command-line tool for reading, writing, and erasing the flash memory of STM32 microcontrollers through an ST-Link programmer/debugger. It is part of the open-source stlink toolset.

The tool works with raw binary files and requires explicit memory addresses for read and write operations. The flash base address for most STM32 devices is **0x8000000**. Write verification can be enabled with **--verify** to confirm the programmed data matches the input file. The erase command clears the entire flash memory, and reset restarts the microcontroller after programming.

# CAVEATS

ST-Link required. STM32 specific. Correct address needed.

# HISTORY

**st-flash** is part of **stlink**, an open-source toolset for programming STM32 microcontrollers via ST-Link.

# SEE ALSO

[st-info](/man/st-info)(1), [st-util](/man/st-util)(1), [openocd](/man/openocd)(1)

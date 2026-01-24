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

**st-flash** programs STM32. It uses ST-Link debugger.

Flash memory operations. Read, write, erase.

Direct binary flashing. No ELF headers.

Address specification. Memory map aware.

Part of stlink tools. Open source.

# CAVEATS

ST-Link required. STM32 specific. Correct address needed.

# HISTORY

**st-flash** is part of **stlink**, an open-source toolset for programming STM32 microcontrollers via ST-Link.

# SEE ALSO

[st-info](/man/st-info)(1), [st-util](/man/st-util)(1), [openocd](/man/openocd)(1)

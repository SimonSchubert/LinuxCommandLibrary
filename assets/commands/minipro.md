# TAGLINE

open-source programmer for TL866II+, TL866A, and TL866CS devices

# TLDR

**Read chip to file**

```minipro -p [AT24C256] -r [output.bin]```

**Write file to chip**

```minipro -p [AT24C256] -w [firmware.bin]```

**Erase chip**

```minipro -p [AT24C256] -E```

**Verify chip contents**

```minipro -p [AT24C256] -m [firmware.bin]```

**List supported chips**

```minipro -l```

**Search for chip**

```minipro -L [AT24]```

**Read with Intel HEX format**

```minipro -p [ATmega328P] -r [output.hex] -f ihex```

**Write without verify**

```minipro -p [AT24C256] -w [firmware.bin] -y```

# SYNOPSIS

**minipro** [_-p device_] [_-r file_] [_-w file_] [_-E_] [_-f format_] [_options_]

# PARAMETERS

**-p** _DEVICE_
> Specify chip/device.

**-r** _FILE_
> Read chip to file.

**-w** _FILE_
> Write file to chip.

**-E**
> Erase chip.

**-m** _FILE_
> Verify against file.

**-l**
> List all supported devices.

**-L** _PATTERN_
> Search devices by pattern.

**-f** _FORMAT_
> File format (raw, ihex, srec).

**-y**
> Skip verification after write.

**-c** _CONFIG_
> Config file for chip settings.

**-s**
> Skip chip detection.

**-v**
> Verbose output.

**-e**
> Skip erase before write.

# DESCRIPTION

**minipro** is an open-source programmer for TL866II+, TL866A, and TL866CS devices. It programs EEPROMs, flash memory, microcontrollers, and other programmable chips.

The tool supports thousands of devices including Atmel AVR, Microchip PIC, EPROMs, EEPROMs, and various flash memory chips. The device database is community-maintained.

Read operations dump chip contents to files. Write operations program chips from binary or hex files. Verification confirms successful programming.

Erase is typically automatic before write but can be performed separately. Some chips require specific erase procedures or unlock sequences.

Intel HEX and Motorola S-Record formats are supported for microcontroller firmware. Raw binary works for data storage chips.

# CAVEATS

Requires compatible TL866 programmer hardware. Not all chips in database tested. Some chips need specific adapter sockets. USB permissions may need configuration on Linux.

# HISTORY

**minipro** was created as an open-source alternative to the proprietary Windows software for TL866 programmers. Development began around **2014**, enabling Linux and macOS support for this popular affordable programmer.

# SEE ALSO

[avrdude](/man/avrdude)(1), [flashrom](/man/flashrom)(8), [stm32flash](/man/stm32flash)(1)

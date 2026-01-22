# TLDR

**Upload** firmware to Arduino

```avrdude -p [atmega328p] -c [arduino] -P [/dev/ttyUSB0] -U flash:w:[firmware.hex]```

**Read** flash memory

```avrdude -p [atmega328p] -c [usbasp] -U flash:r:[backup.hex]:i```

Set **fuse bits**

```avrdude -p [atmega328p] -c [usbasp] -U lfuse:w:[0xE2]:m```

**Verify** without writing

```avrdude -p [atmega328p] -c [arduino] -P [/dev/ttyUSB0] -U flash:v:[firmware.hex]```

# SYNOPSIS

**avrdude** -p _partno_ -c _programmer_ [_options_]

# DESCRIPTION

**avrdude** (AVR Downloader Uploader) is a utility for programming Atmel AVR microcontrollers. It supports numerous programmers and can read/write flash, EEPROM, fuse bits, and lock bits.

The tool is essential for Arduino development and embedded systems work with AVR chips.

# PARAMETERS

**-p** _partno_
> Specify AVR device (e.g., atmega328p, attiny85)

**-c** _programmer_
> Programmer type (arduino, usbasp, avrisp2)

**-P** _port_
> Communication port (/dev/ttyUSB0, COM3)

**-U** _memtype:op:file:format_
> Memory operation (flash:w:file.hex:i)

**-b** _baudrate_
> Override baud rate

**-B** _bitclock_
> Bit clock period

**-v**
> Verbose output

**-n**
> Dry run (no writes)

**-F**
> Force (override signature check)

# MEMORY OPERATIONS

**flash**
> Program memory

**eeprom**
> Data memory

**lfuse**, **hfuse**, **efuse**
> Configuration fuses

**lock**
> Lock bits

Operations: **r** (read), **w** (write), **v** (verify)

# CAVEATS

Incorrect fuse settings can brick the device. Requires proper permissions for serial ports. Wrong programmer selection causes failures. Always backup fuses before modification. USB connection issues common on some platforms.

# HISTORY

**avrdude** was created by Brian Dean in **2003** as an open-source alternative to Atmel's proprietary programming tools. It has become the standard tool for AVR programming.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [platformio](/man/platformio)(1), [minicom](/man/minicom)(1)

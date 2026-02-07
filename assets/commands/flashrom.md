# TAGLINE

flash chip reading, writing, and verification

# TLDR

**Probe** the chip to ensure wiring is correct

```flashrom -p [programmer]```

**Read** flash contents and save to a file

```flashrom -p [programmer] -r [path/to/backup.bin]```

**Write** a file to the flash chip

```flashrom -p [programmer] -w [path/to/firmware.bin]```

**Verify** flash contents against a file

```flashrom -p [programmer] -v [path/to/file.bin]```

**Erase** the flash chip

```flashrom -p [programmer] -E```

Probe using **Raspberry Pi** SPI

```flashrom -p linux_spi:dev=/dev/spidev0.0```

Write only a **specific region** from a layout file

```flashrom -p [programmer] -l [layout.txt] -i [region_name] -w [file.bin]```

# SYNOPSIS

**flashrom** [**-p** _programmer_] [**-r**|**-w**|**-v**|**-E**] [_file_] [_options_]

# PARAMETERS

**-p, --programmer** _name[:params]_
> Specify programmer device (required for chip access)

**-r, --read** _file_
> Read flash ROM contents and save to file

**-w, --write** _file_
> Write file contents to flash ROM

**-v, --verify** _file_
> Verify flash ROM contents against file

**-E, --erase**
> Erase the entire flash chip

**-c, --chip** _name_
> Probe only for a specific flash chip model

**-l, --layout** _file_
> Read ROM layout from file for partial flashing

**-i, --include** _region_
> Only read, write, or verify specified region

**-f, --force**
> Override safety checks (use with caution)

**-n, --noverify**
> Skip automatic verification after writing

**--flash-name**
> Display detected flash chip name

**--flash-size**
> Display detected flash chip size

# DESCRIPTION

**Flashrom** is a utility for identifying, reading, writing, verifying, and erasing flash chips. It supports BIOS/EFI firmware flashing directly on the motherboard (in-system programming) as well as external programmers connected via USB, SPI, or parallel port.

The tool supports over 500 flash chips and 40+ programmer types including internal motherboard access, USB devices (CH341A, Dediprog), SPI programmers (Raspberry Pi, Bus Pirate), and network card-based programmers.

# CAVEATS

**Always create a backup** before writing new firmware with **-r**. Incorrect flashing can brick your device. Laptop internal flashing is particularly risky and requires explicit **-f** flags. Some operations need root privileges. Verify programmer compatibility with your specific flash chip before attempting writes.

# HISTORY

Flashrom originated from the **LinuxBIOS** (now coreboot) project around **2005** as a tool to flash open-source firmware. It evolved into a standalone project supporting a wide range of hardware. The project is community-maintained and has become essential for firmware development, coreboot installations, and chip recovery operations.

# SEE ALSO

[dd](/man/dd)(1), [hexdump](/man/hexdump)(1), [coreboot](https://coreboot.org)

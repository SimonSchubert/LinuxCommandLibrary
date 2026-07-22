# TAGLINE

decode and display RAM SPD EEPROM information

# TLDR

Display **DIMM information**

```decode-dimms```

Display DIMMs **side-by-side** for comparison

```decode-dimms --side-by-side```

Decode even if **checksum fails**

```decode-dimms -c```

Read from **hexdump files** instead of live system

```decode-dimms -x```

Display **help**

```decode-dimms -h```

# SYNOPSIS

**decode-dimms** [_options_]

# DESCRIPTION

**decode-dimms** decodes and displays information stored in the SPD (Serial Presence Detect) EEPROM of RAM modules. This includes memory type, speed, manufacturer, size, and timing information.

Useful for identifying installed memory specifications and verifying RAM compatibility.

# PARAMETERS

**-h**, **--help**
> Display usage summary.

**-c**, **--checksum**
> Decode completely even if checksum fails.

**-f**, **--format**
> Print output in HTML format.

**-b**, **--bodyonly**
> Don't print HTML header (useful for postprocessing).

**--side-by-side**
> Display all DIMMs side-by-side if possible.

**-x**
> Read data from hexdump files instead of the running system.

**-X**
> Same as -x but treat multibyte hex data as little endian.

# CAVEATS

Requires the eeprom, at24, or ee1004 (for DDR4) kernel module loaded. May need i2c kernel modules. Requires root privileges or proper permissions on i2c devices. Part of the i2c-tools package.

# INSTALL

```apt: sudo apt install i2c-tools```

```dnf: sudo dnf install i2c-tools```

```pacman: sudo pacman -S i2c-tools```

```apk: sudo apk add i2c-tools```

```zypper: sudo zypper install i2c-tools```

```brew: brew install i2c-tools```

```nix: nix profile install nixpkgs#i2c-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dmidecode](/man/dmidecode)(8), [lshw](/man/lshw)(1), [free](/man/free)(1), [i2cdetect](/man/i2cdetect)(8)

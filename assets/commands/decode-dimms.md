# TLDR

Display **DIMM information**

```decode-dimms```

Display **help**

```decode-dimms -h```

# SYNOPSIS

**decode-dimms** [_options_]

# DESCRIPTION

**decode-dimms** decodes and displays information stored in the SPD (Serial Presence Detect) EEPROM of RAM modules. This includes memory type, speed, manufacturer, size, and timing information.

Useful for identifying installed memory specifications and verifying RAM compatibility.

# PARAMETERS

**-h, --help**
> Display help

**-c**
> Check for SPD checksum errors

# CAVEATS

Requires the eeprom or at24 kernel module loaded. May need i2c kernel modules. Requires root privileges or proper permissions on i2c devices. Part of i2c-tools package.

# SEE ALSO

[dmidecode](/man/dmidecode)(8), [lshw](/man/lshw)(1), [free](/man/free)(1)

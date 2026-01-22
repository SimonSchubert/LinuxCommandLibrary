# TLDR

**Display all BIOS information**

```sudo biosdecode```

**Decode BIOS from a binary dump**

```sudo biosdecode --from-dump [bios.bin]```

**Display version information**

```biosdecode --version```

# SYNOPSIS

**biosdecode** [_options_]

# DESCRIPTION

**biosdecode** parses the BIOS memory and displays information about various BIOS data structures including SMBIOS (System Management BIOS), DMI (Desktop Management Interface), and other firmware tables.

The tool reads from system memory to extract manufacturer information, hardware configuration, and BIOS capabilities. It provides a lower-level view compared to **dmidecode**.

# PARAMETERS

**--from-dump** _file_
> Read BIOS data from a binary dump file instead of live memory

**--version**
> Display version information and exit

**--help**
> Display help message

# CAVEATS

Requires root privileges to access /dev/mem where BIOS data is stored. On modern Linux systems, **dmidecode** is preferred as it provides more comprehensive and detailed output. Some systems with restricted memory access may not allow biosdecode to function properly.

# HISTORY

biosdecode is part of the **dmidecode** package, originally written by **Alan Cox** and maintained by **Jean Delvare**. It was created to provide a simple tool for extracting BIOS information on Linux systems, predating the more feature-rich dmidecode utility.

# SEE ALSO

[dmidecode](/man/dmidecode)(1), [lshw](/man/lshw)(1), [hwinfo](/man/hwinfo)(1)

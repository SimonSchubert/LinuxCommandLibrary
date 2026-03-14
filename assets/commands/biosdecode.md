# TAGLINE

Decode and display BIOS data structures

# TLDR

**Display all BIOS information**

```sudo biosdecode```

**Read BIOS data from a binary dump file**

```sudo biosdecode --dev-mem [bios.bin]```

**Display version information**

```biosdecode --version```

# SYNOPSIS

**biosdecode** [_options_]

# DESCRIPTION

**biosdecode** parses the BIOS memory and prints information about all structures it knows of, including SMBIOS (System Management BIOS), DMI (Desktop Management Interface), ACPI, PNP (Plug and Play), BIOS32, PIR (PCI IRQ Routing), and vendor-specific structures (Compaq, IBM, Fujitsu, Sony).

For more detailed SMBIOS/DMI output, use **dmidecode** instead.

# PARAMETERS

**-d**, **--dev-mem** _FILE_
> Read memory from device FILE instead of default /dev/mem

**-V**, **--version**
> Display version information and exit

**-h**, **--help**
> Display help message

# CAVEATS

Requires root privileges to access /dev/mem where BIOS data is stored. On modern Linux systems, **dmidecode** is preferred as it provides more comprehensive and detailed output. Some systems with restricted memory access may not allow biosdecode to function properly.

# HISTORY

biosdecode is part of the **dmidecode** package, originally written by **Alan Cox** and maintained by **Jean Delvare**. It was created to provide a simple tool for extracting BIOS information on Linux systems, predating the more feature-rich dmidecode utility.

# SEE ALSO

[dmidecode](/man/dmidecode)(1), [lshw](/man/lshw)(1), [hwinfo](/man/hwinfo)(1)

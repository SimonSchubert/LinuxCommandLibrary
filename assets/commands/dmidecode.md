# TLDR

Show all **DMI table** contents

```sudo dmidecode```

Show the **BIOS version**

```sudo dmidecode -s bios-version```

Show the system's **serial number**

```sudo dmidecode -s system-serial-number```

Show **BIOS** information

```sudo dmidecode -t bios```

Show **CPU** information

```sudo dmidecode -t processor```

Show **memory** information

```sudo dmidecode -t memory```

Show **system** information

```sudo dmidecode -t system```

# SYNOPSIS

**dmidecode** [_-s string_] [_-t type_] [_--dump-bin file_] [_--from-dump file_]

# DESCRIPTION

**dmidecode** reads the DMI (Desktop Management Interface) table, also known as SMBIOS (System Management BIOS), and displays hardware information in a human-readable format. This includes details about the BIOS, system, baseboard, chassis, processor, memory, and other components.

# PARAMETERS

**-s, --string keyword**
> Only display the value of a specific DMI string (bios-version, system-serial-number, processor-version, etc.)

**-t, --type type**
> Only display entries of specified type (bios, system, baseboard, chassis, processor, memory, cache, connector, slot)

**-q, --quiet**
> Less verbose output

**-u, --dump**
> Show raw DMI data

**--dump-bin file**
> Dump DMI data to a binary file

**--from-dump file**
> Read DMI data from a binary file

**-h, --help**
> Display help

**-V, --version**
> Display version

# CAVEATS

Requires root privileges. Information accuracy depends on the BIOS/firmware implementation by the manufacturer.

# HISTORY

Developed to provide a standardized way to access system hardware information on x86 and x86_64 systems through the SMBIOS standard.

# SEE ALSO

[lshw](/man/lshw)(1), [lscpu](/man/lscpu)(1), [hwinfo](/man/hwinfo)(8)

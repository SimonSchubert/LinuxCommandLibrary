# TAGLINE

DMI/SMBIOS hardware information decoder

# TLDR

Dump the **whole DMI table**

```sudo dmidecode```

Read a **single value** by keyword

```sudo dmidecode --string system-serial-number```

List the **keywords** that can be read this way

```dmidecode --list-strings```

Show one **table type** by name

```sudo dmidecode --type memory```

Show the **installed DIMMs**, with size and speed

```sudo dmidecode --type 17```

List the **type names and numbers** available

```dmidecode --list-types```

Show the **BIOS** vendor, version and release date

```sudo dmidecode --type bios```

Show **several types** in one run

```sudo dmidecode --type baseboard --type chassis```

Look up a single structure by its **handle**

```sudo dmidecode --handle [0x1000]```

Drop the banner and handle lines, for **scripting**

```sudo dmidecode --quiet --type system```

**Save the raw table** for analysis elsewhere

```sudo dmidecode --dump-bin [path/to/dmi.bin]```

Read a **saved dump**, which needs no root

```dmidecode --from-dump [path/to/dmi.bin]```

Show the **raw hex** beside the decoded output

```sudo dmidecode --dump```

# SYNOPSIS

**dmidecode** [**-s** _keyword_] [**-t** _type_] [**--dump-bin** _file_] [**--from-dump** _file_]

# DESCRIPTION

**dmidecode** reads the DMI (Desktop Management Interface) table, also known as SMBIOS (System Management BIOS), and displays hardware information in a human-readable format. This includes details about the BIOS, system, baseboard, chassis, processor, memory, cache, connectors, and slots.

The DMI data is read from /dev/mem or sysfs, depending on system availability.

# PARAMETERS

**-s**, **--string** _keyword_
> Only display the value of a specific DMI string (e.g., bios-vendor, bios-version, system-serial-number, system-uuid, processor-version, processor-frequency).

**--list-strings**
> List all valid string keywords for use with -s.

**-t**, **--type** _type_
> Only display entries of specified type. Can be a number, comma-separated list, or keyword (bios, system, baseboard, chassis, processor, memory, cache, connector, slot).

**--list-types**
> List all valid type keywords for use with -t.

**-H**, **--handle** _handle_
> Only display the entry matching the specified 16-bit handle value.

**-q**, **--quiet**
> Less verbose output; suppresses unknown, inactive, and OEM-specific entries.

**-u**, **--dump**
> Show raw DMI data as hexadecimal.

**--dump-bin** _file_
> Dump DMI data to a binary file for later use with --from-dump.

**--from-dump** _file_
> Read DMI data from a previously saved binary dump file.

**--no-quirks**
> Decode table contents precisely without applying workarounds for common firmware bugs.

**--no-sysfs**
> Do not attempt to read DMI data from sysfs files.

**-d**, **--dev-mem** _file_
> Read memory from a device file other than /dev/mem.

**--oem-string** _N_
> Display OEM string number N, or use "count" to show the total.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# CAVEATS

Requires root privileges. Information accuracy depends on the BIOS/firmware implementation. Only works on x86 and x86_64 systems with SMBIOS-compliant firmware. The options **-s**, **-t**, and **--dump-bin** are mutually exclusive.

# HISTORY

**dmidecode** was written by **Alan Cox** and is currently maintained by **Jean Delvare**. It provides a standardized way to access system hardware information through the SMBIOS standard on x86 and x86_64 systems.

# INSTALL

```apt: sudo apt install dmidecode```

```dnf: sudo dnf install dmidecode```

```pacman: sudo pacman -S dmidecode```

```apk: sudo apk add dmidecode```

```zypper: sudo zypper install dmidecode```

```nix: nix profile install nixpkgs#dmidecode```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lshw](/man/lshw)(1), [lscpu](/man/lscpu)(1), [hwinfo](/man/hwinfo)(8), [biosdecode](/man/biosdecode)(8), [lspci](/man/lspci)(8)

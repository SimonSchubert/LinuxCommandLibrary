# TAGLINE

Collect SteamOS system diagnostics

# TLDR

**Dump all system information**

```sudo steamos-dump-info```

**List available sections**

```steamos-dump-info --list-sections```

**Dump with verbose output**

```sudo steamos-dump-info --verbose```

**Dump without compressing output**

```sudo steamos-dump-info --no-compress```

**Dump only a specific section**

```sudo steamos-dump-info --section [network]```

# SYNOPSIS

**steamos-dump-info** [_options_]

# PARAMETERS

**-h**, **--help**
> Display help message.

**-L**, **--list-sections**
> List all available sections that can be dumped individually.

**--section** _NAME_
> Dump only the specified section. Can be used multiple times.

**-V**, **--version**
> Display version information.

**-v**, **--verbose**
> Enable verbose output with more detail about the collection process.

**-q**, **--quiet**
> Suppress most output, showing only critical messages.

**--no-compress**
> Create an uncompressed directory instead of a compressed archive.

# DESCRIPTION

**steamos-dump-info** collects comprehensive system diagnostics from a SteamOS installation into a compressed archive. The output includes system logs (journalctl, /var/log), hardware information (lspci, lsusb, /proc entries), network configuration, Steam client logs, Xorg logs, and system configuration files.

The resulting archive is commonly requested by Valve support for troubleshooting Steam Deck and SteamOS issues, and can be uploaded to bug trackers or support tickets.

# CAVEATS

Requires root privileges for full system information. Specific to SteamOS (Steam Deck and other Valve devices). The output archive may contain sensitive system information.

# HISTORY

**steamos-dump-info** is part of the SteamOS system tools developed by **Valve** for the Steam Deck and other SteamOS-based devices.

# SEE ALSO

[uname](/man/uname)(1), [lshw](/man/lshw)(1), [dmidecode](/man/dmidecode)(8), [steamos-finalize-install](/man/steamos-finalize-install)(1)

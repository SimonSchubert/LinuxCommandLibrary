# TAGLINE

Decode hex-encoded strings in AppArmor logs

# TLDR

**Decode** a single hex-encoded string

```aa-decode [hexstring]```

Decode hex-encoded paths in a **log file** via stdin

```aa-decode < [/var/log/audit/audit.log]```

Pipe **kernel logs** through aa-decode

```cat /var/log/kern.log | aa-decode```

Decode the **current journal** AppArmor entries

```journalctl -k | aa-decode```

# SYNOPSIS

**aa-decode** [_option_] _HEX_STRING_

# DESCRIPTION

**aa-decode** decodes hexadecimal-encoded strings found in AppArmor log output. It processes audit logs from standard input and converts any hex-encoded AppArmor entries to human-readable format on standard output.

AppArmor encodes certain characters (like spaces and special characters) in hexadecimal format within log entries to prevent parsing issues. This utility converts those back to readable text.

# PARAMETERS

**--help**
> Displays usage information

# CAVEATS

The utility only decodes hexadecimal strings in the specific format used by AppArmor logs. Other hex-encoded data may not be decoded correctly.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-logprof](/man/aa-logprof)(8), [aa-notify](/man/aa-notify)(8), [aa-status](/man/aa-status)(8), [apparmor](/man/apparmor)(7)

# RESOURCES

```[Source code](https://gitlab.com/apparmor/apparmor)```

```[Homepage](https://apparmor.net/)```

```[Documentation](https://gitlab.com/apparmor/apparmor/-/wikis/home)```

<!-- verified: 2026-06-10 -->

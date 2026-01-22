# TLDR

**Decode** a hex string

```aa-decode [hexstring]```

Decode a **log file**

```sudo aa-decode [logfile]```

Decode logs from **stdin**

```sudo aa-decode - < [logfile]```

Pipe kernel logs through **aa-decode**

```cat /var/log/kern.log | aa-decode```

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

[aa-status](/man/aa-status)(8), [aa-notify](/man/aa-notify)(8), [apparmor](/man/apparmor)(7)

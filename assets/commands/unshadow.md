# TLDR

Combine **system** passwd and shadow

```sudo unshadow /etc/passwd /etc/shadow```

Combine **arbitrary** files

```sudo unshadow [path/to/passwd] [path/to/shadow]```

# SYNOPSIS

**unshadow** _PASSWD_FILE_ _SHADOW_FILE_

# DESCRIPTION

**unshadow** combines /etc/passwd and /etc/shadow files to create a traditional Unix password file format. This unified format is required by password cracking tools like John the Ripper.

The utility is part of the John the Ripper project and is used in authorized password security auditing to prepare password hashes for analysis.

# CAVEATS

Requires root privileges to read shadow file. Should only be used for authorized security testing. Output contains sensitive password hashes.

# HISTORY

**unshadow** was developed as part of the **John the Ripper** password cracker project to handle modern Unix systems that separate password hashes into the shadow file.

# SEE ALSO

[john](/man/john)(8), [passwd](/man/passwd)(5), [shadow](/man/shadow)(5)

# TLDR

**Lock** current console

```vlock```

Lock **current** via flag

```vlock -c```

Lock **all** consoles

```vlock -a```

Display **help**

```vlock -h```

Display **version**

```vlock -v```

# SYNOPSIS

**vlock** [_OPTIONS_]

# PARAMETERS

**-c, --current**
> Lock only the current virtual console

**-a, --all**
> Lock all virtual consoles

**-h, --help**
> Display help information

**-v, --version**
> Display version information

# DESCRIPTION

**vlock** locks virtual console sessions, requiring a password to unlock. It can lock either the current console or all virtual consoles on the system.

This provides physical security for text-mode console sessions, similar to screen locking in graphical environments.

# CAVEATS

Locking all consoles prevents access to any console without the password. Root can still unlock. Works only on virtual consoles, not pseudo-terminals.

# SEE ALSO

[physlock](/man/physlock)(1)

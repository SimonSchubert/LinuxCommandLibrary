# TLDR

**Connect to SSH server**

```putty -ssh [user@host]```

**Connect with specific port**

```putty -ssh -P [2222] [user@host]```

**Load saved session**

```putty -load "[session_name]"```

**Connect via serial**

```putty -serial [/dev/ttyUSB0]```

**Use private key**

```putty -ssh -i [key.ppk] [user@host]```

# SYNOPSIS

**putty** [_options_] [_host_]

# PARAMETERS

_HOST_
> Target hostname.

**-ssh**
> SSH connection.

**-telnet**
> Telnet connection.

**-serial**
> Serial connection.

**-P** _PORT_
> Port number.

**-i** _KEY_
> Private key file.

**-load** _SESSION_
> Load saved session.

# DESCRIPTION

**putty** is SSH and Telnet client. Cross-platform terminal emulator.

The tool provides secure connections. Popular Windows SSH client.

putty connects remotely.

# CAVEATS

Uses PPK key format. Also available on Linux.

# HISTORY

PuTTY was created by **Simon Tatham** for Windows SSH connections.

# SEE ALSO

[ssh](/man/ssh)(1), [plink](/man/plink)(1), [pscp](/man/pscp)(1)


# TAGLINE

SSH and Telnet terminal emulator

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

**PuTTY** is a free terminal emulator and network file transfer application supporting SSH, Telnet, SCP, and serial connections. Originally developed for Windows where no built-in SSH client existed, it has become one of the most widely used remote access tools and is also available on Linux and macOS.

PuTTY stores connection profiles as saved sessions, allowing quick access to frequently used servers with preconfigured settings for port, protocol, key authentication, and terminal appearance. It uses its own **PPK** key format, though keys can be converted to and from OpenSSH format using the companion **puttygen** tool. The PuTTY suite includes **plink** for command-line connections, **pscp** and **psftp** for file transfer, and **pageant** for SSH agent key management.

# CONFIGURATION

**~/.putty/sessions/**
> Saved session profiles containing connection settings, port, protocol, key file path, and terminal configuration.

**~/.putty/sshhostkeys**
> Cache of SSH host keys for known servers, used to detect man-in-the-middle attacks.

**~/.putty/sshkeys/**
> Directory for private key files in PPK format used for public key authentication.

# CAVEATS

Uses PPK key format. Also available on Linux.

# HISTORY

PuTTY was created by **Simon Tatham** for Windows SSH connections.

# SEE ALSO

[ssh](/man/ssh)(1), [plink](/man/plink)(1), [pscp](/man/pscp)(1)


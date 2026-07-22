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
> Use the SSH protocol.

**-telnet**
> Use the Telnet protocol.

**-serial**
> Open a serial connection.

**-raw**
> Use raw TCP (no protocol-level processing).

**-rlogin**
> Use the Rlogin protocol.

**-l** _USER_
> Specify login username.

**-pw** _PASSWORD_
> Provide password on the command line (insecure; prefer **-pwfile**).

**-pwfile** _FILE_
> Read password from the first line of _FILE_.

**-P** _PORT_
> Port number.

**-i** _KEY_
> Private key file (PPK format).

**-load** _SESSION_
> Load a saved session by name.

**-X** / **-x**
> Enable / disable X11 forwarding.

**-A** / **-a**
> Enable / disable agent forwarding.

**-C**
> Enable compression.

**-L** _local:host:port_
> Forward a local port to a remote destination.

**-R** _remote:host:port_
> Forward a remote port back to the local machine.

**-D** _port_
> Open a SOCKS dynamic-port-forwarding listener.

**-m** _FILE_
> Execute the contents of _FILE_ on the remote host instead of an interactive shell.

**-N**
> Do not start a shell or command (useful for port-forwarding only).

**-nc** _host:port_
> Make a TCP connection through the SSH server instead of a shell.

**-t** / **-T**
> Force / suppress pseudo-terminal allocation.

**-agent** / **-noagent**
> Enable / disable Pageant authentication.

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

Uses the PPK key format; convert OpenSSH keys with **puttygen**. The **-pw** flag exposes the password to anyone who can read the process list — prefer **-pwfile** or key-based auth. PuTTY is also available on Linux and macOS.

# HISTORY

PuTTY was created by **Simon Tatham** and first released in **1999**. It became the standard SSH client on Windows, where no built-in SSH client was available until Windows 10 (2018).

# INSTALL

```apt: sudo apt install putty```

```dnf: sudo dnf install putty```

```pacman: sudo pacman -S putty```

```apk: sudo apk add putty```

```zypper: sudo zypper install putty```

```brew: brew install putty```

```nix: nix profile install nixpkgs#putty```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ssh](/man/ssh)(1), [plink](/man/plink)(1), [pscp](/man/pscp)(1)


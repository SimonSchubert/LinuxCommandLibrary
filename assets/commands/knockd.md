# TLDR

Start knockd as a **daemon**

```knockd -d```

Use a **specific configuration** file

```knockd -c [path/to/knockd.conf]```

# SYNOPSIS

**knockd** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as a daemon in the background

**-c**, **--config** _FILE_
> Use specified configuration file

**-i**, **--interface** _IF_
> Network interface to listen on

**-D**, **--debug**
> Output debug messages

**-l**, **--lookup**
> Lookup DNS names for log entries

# DESCRIPTION

**knockd** is the server component of port knocking. It listens for specific sequences of connection attempts and executes commands when a valid sequence is detected.

Configuration in /etc/knockd.conf defines sequences and corresponding commands. Typical use cases include opening firewall ports for SSH access after receiving the correct knock sequence.

Example configuration opens SSH:
```
[openSSH]
sequence = 7000,8000,9000
command = /sbin/iptables -A INPUT -s %IP% -p tcp --dport 22 -j ACCEPT
```

# CAVEATS

Sequences can potentially be sniffed if not using encrypted protocols. Single-packet authentication (SPA) tools like fwknop may be more secure. Configuration must be protected from unauthorized access.

# HISTORY

Port knocking was introduced as a security-through-obscurity technique in the early **2000s**. knockd remains one of the most popular implementations, though more advanced techniques like SPA have emerged.

# SEE ALSO

[knock](/man/knock)(1), [iptables](/man/iptables)(8), [fwknop](/man/fwknop)(8)

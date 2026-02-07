# TAGLINE

lightweight SSH server

# TLDR

**Start SSH server**

```dropbear```

**Start on specific port**

```dropbear -p [2222]```

**Start in foreground**

```dropbear -F```

**Start with specific host key**

```dropbear -r [/etc/dropbear/dropbear_rsa_host_key]```

**Disable password auth**

```dropbear -s```

**Enable root login**

```dropbear -g```

# SYNOPSIS

**dropbear** [_options_]

# DESCRIPTION

**dropbear** is a lightweight SSH server designed for embedded systems and resource-constrained environments. It implements SSH 2 protocol with support for public key and password authentication.

Despite its small size, dropbear provides essential SSH functionality including remote login, port forwarding, and scp/sftp. It's commonly found in routers, embedded Linux, and initramfs.

# PARAMETERS

**-p** _[addr:]port_
> Listen on port (multiple allowed).

**-F**
> Run in foreground.

**-E**
> Log to stderr instead of syslog.

**-r** _keyfile_
> Use specific host key file.

**-s**
> Disable password authentication.

**-g**
> Disable root password auth.

**-B**
> Allow blank passwords.

**-w**
> Disallow root login.

**-j**
> Disable local port forwarding.

**-k**
> Disable remote port forwarding.

**-I** _seconds_
> Idle timeout.

**-P** _pidfile_
> PID file location.

# CAVEATS

Fewer features than OpenSSH. No sftp-server included (use external). Key format differs from OpenSSH. Limited algorithm support in older versions.

# HISTORY

**dropbear** was created by **Matt Johnston** in **2003** as a minimal SSH implementation for embedded systems. It fills the need for SSH in environments where OpenSSH is too large, such as routers running OpenWrt and rescue systems.

# SEE ALSO

[dbclient](/man/dbclient)(1), [dropbearkey](/man/dropbearkey)(1), [sshd](/man/sshd)(1), [scp](/man/scp)(1)

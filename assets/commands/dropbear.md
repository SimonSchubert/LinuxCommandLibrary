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

```dropbear -r [/etc/dropbear/dropbear_ed25519_host_key]```

**Disable password logins** entirely (keys only)

```dropbear -s```

**Disallow root logins** completely

```dropbear -w```

**Generate host keys** automatically if missing

```dropbear -R```

**Run in the foreground, logging to stderr** (for debugging)

```dropbear -F -E```

# SYNOPSIS

**dropbear** [_options_]

# DESCRIPTION

**dropbear** is a small SSH server for systems where OpenSSH would not fit: routers, embedded Linux, initramfs images, and rescue environments. It speaks SSH 2 and supports public-key and password authentication, TCP port forwarding, and, through the companion `scp` binary, file transfer.

The whole point is size. A stripped Dropbear binary is on the order of a couple of hundred kilobytes, an order of magnitude smaller than OpenSSH's sshd, which is why it is the SSH server in OpenWrt and in most consumer routers that offer SSH at all.

It is normally started as a daemon at boot, but it can equally be run from **inetd** with **-i**, which suits systems that expect only occasional connections and would rather not keep a process resident.

# PARAMETERS

**-p** [_address_:]_port_
> Listen on this address and port. May be given several times. Defaults to port 22.

**-F**
> Run in the foreground rather than daemonising.

**-E**
> Log to standard error rather than syslog.

**-r** _keyfile_
> Use this host key file. May be repeated for several key types.

**-R**
> Generate host keys automatically as they are needed.

**-s**
> Disable password logins, leaving public-key authentication only.

**-g**
> Disable password logins **for root only**. Other users may still use passwords.

**-w**
> Disallow root logins altogether.

**-B**
> Allow blank passwords.

**-T** _attempts_
> Maximum authentication attempts per connection. Defaults to 10.

**-a**
> Allow remote hosts to connect to forwarded ports.

**-j** / **-k**
> Disable local port forwarding (including unix stream forwards), or remote port forwarding.

**-b** _banner_
> Display the contents of this file before the user logs in.

**-m**
> Do not display the message of the day.

**-c** _command_
> Run this command instead of whatever the user requested.

**-I** _seconds_
> Disconnect a session after this many seconds of inactivity.

**-K** _seconds_
> Send keepalive traffic at this interval.

**-P** _pidfile_
> Where to write the PID when running as a daemon.

**-i**
> Run from inetd rather than as a standalone daemon.

# CAVEATS

**-g** and **-w** are easily confused: **-g** only stops root from using a *password* (root can still log in with a key), whereas **-w** blocks root entirely. If the intent is to lock root out, **-w** is the option.

Dropbear stores host and user keys in **its own format**, not OpenSSH's. Keys must be converted with `dropbearconvert` to move between the two, and `~/.ssh/authorized_keys` is the one place where the OpenSSH public-key format is used unchanged.

There is **no built-in SFTP server**. Dropbear will run an external `sftp-server` binary if one is present and configured, but on a minimal system there usually is not one, so `sftp` fails while `scp` works. Some builds also omit `scp` to save space.

Being small means being selective: the cipher and key-exchange lists are shorter than OpenSSH's, and old vendor firmware often ships an ancient Dropbear with algorithms modern clients have since dropped, which is why connecting to a router can require explicitly re-enabling a legacy key exchange on the client.

# HISTORY

**dropbear** was written by **Matt Johnston** and first released in **2003**, when the alternative on a small device was either no SSH at all or a painfully stripped OpenSSH. It quickly became standard in embedded Linux, and OpenWrt's adoption made it, by installed count, one of the most widely deployed SSH servers in existence, running on millions of routers whose owners have never heard of it.

# INSTALL

```apt: sudo apt install dropbear-bin```

```dnf: sudo dnf install dropbear```

```pacman: sudo pacman -S dropbear```

```apk: sudo apk add dropbear```

```brew: brew install dropbear```

```nix: nix profile install nixpkgs#dropbear```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dbclient](/man/dbclient)(1), [dropbearkey](/man/dropbearkey)(1), [dropbearconvert](/man/dropbearconvert)(1), [sshd](/man/sshd)(8), [ssh](/man/ssh)(1), [scp](/man/scp)(1)

# RESOURCES

```[Source code](https://github.com/mkj/dropbear)```

```[Homepage](https://matt.ucc.asn.au/dropbear/dropbear.html)```

<!-- verified: 2026-07-14 -->


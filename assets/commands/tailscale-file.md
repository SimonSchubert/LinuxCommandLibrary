# TAGLINE

Transfer files between Tailscale devices

# TLDR

**Send file to device**

```tailscale file cp [file] [device]:```

**Receive files**

```tailscale file get [directory]```

**List pending files**

```tailscale file get --wait=false .```

# SYNOPSIS

**tailscale** **file** _command_ [_options_]

# PARAMETERS

**cp** _file_ _target_
> Send file to device.

**get** _directory_
> Receive pending files.

**--wait**
> Wait for files.

# DESCRIPTION

**tailscale file** transfers files between devices on your Tailscale network using the Taildrop feature. Files are sent directly from one device to another over encrypted WireGuard connections, without passing through cloud storage or third-party servers.

The **cp** subcommand sends files to a target device, specified by its Tailscale hostname followed by a colon. The **get** subcommand receives pending files into a local directory. By default, the receiver waits for incoming transfers; the **--wait=false** flag lists pending files without blocking. Transfers work across platforms including Linux, macOS, Windows, iOS, and Android.

# SEE ALSO

[tailscale](/man/tailscale)(1)


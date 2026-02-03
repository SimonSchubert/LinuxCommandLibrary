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

**tailscale file** transfers files between Tailscale devices. Direct device-to-device transfer without cloud storage. Taildrop feature for secure file sharing.

# SEE ALSO

[tailscale](/man/tailscale)(1)


# TLDR

**Start a profile**

```sudo netctl start [profile]```

**Stop a profile**

```sudo netctl stop [profile]```

**Enable profile at boot**

```sudo netctl enable [profile]```

**List all profiles**

```netctl list```

**Check profile status**

```netctl status [profile]```

**Switch profile**

```sudo netctl switch-to [profile]```

# SYNOPSIS

**netctl** _command_ [_profile_]

# PARAMETERS

**start** _profile_
> Start network profile.

**stop** _profile_
> Stop network profile.

**enable** _profile_
> Enable at boot.

**disable** _profile_
> Disable at boot.

**list**
> List all profiles.

**status** _profile_
> Show profile status.

**switch-to** _profile_
> Switch to profile.

# DESCRIPTION

**netctl** is Arch Linux's network profile manager. It manages network configurations through profile files, supporting wired, wireless, bridges, bonds, and VLANs.

netctl uses systemd and can work alongside NetworkManager (but typically not simultaneously).

# PROFILE EXAMPLE

```
# /etc/netctl/ethernet-static
Interface=eth0
Connection=ethernet
IP=static
Address=('192.168.1.10/24')
Gateway='192.168.1.1'
DNS=('8.8.8.8')
```

# PROFILE LOCATION

```
/etc/netctl/
/etc/netctl/examples/
```

# CAVEATS

Arch Linux specific. One profile per interface. Don't use with NetworkManager simultaneously.

# HISTORY

netctl was developed for **Arch Linux** as a replacement for netcfg, using systemd integration for network management.

# SEE ALSO

[networkctl](/man/networkctl)(1), [ip](/man/ip)(8), [NetworkManager](/man/NetworkManager)(8), [systemd-networkd](/man/systemd-networkd)(8)

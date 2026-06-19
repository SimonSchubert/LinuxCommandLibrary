# TAGLINE

Manage Thunderbolt device authorization

# TLDR

List **connected and authorized** devices

```boltctl```

List connected devices including **unauthorized** ones

```boltctl list```

**Authorize** a device temporarily

```boltctl authorize [device_uuid]```

**Authorize and remember** a device

```boltctl enroll [device_uuid]```

**Enroll** a device with automatic authorization on every connect

```boltctl enroll --policy auto [device_uuid]```

**Revoke** a previously authorized device

```boltctl forget [device_uuid]```

Show **detailed information** about a device

```boltctl info [device_uuid]```

**Monitor** the daemon for device changes

```boltctl monitor```

# SYNOPSIS

**boltctl** [_command_] [_options_] [_device_uuid_]

# DESCRIPTION

**boltctl** manages Thunderbolt devices and their security levels. It controls which Thunderbolt devices are authorized to connect to the system, providing protection against malicious devices (Thunderclap attacks).

The tool works with the boltd daemon to enforce security policies for Thunderbolt/USB4 ports.

# SUBCOMMANDS

**list**
> List all connected devices

**authorize**
> Temporarily authorize a device for this session

**enroll**
> Authorize and remember a device for future connections. Accepts **--policy** (_default_, _auto_, or _manual_) to control how the device is authorized on later connects, and **--chain** to authorize parent devices if necessary.

**forget**
> Remove a device from the authorized list (revoke a stored key)

**info**
> Display detailed device information

**monitor**
> Listen for and print device and daemon state changes

**config**
> Get or set device and global daemon configuration values

**domains**
> List the Thunderbolt domains (controllers) known to the daemon

**power**
> Control force power state

# CAVEATS

Thunderbolt security levels are set in BIOS/UEFI. Not all systems support all security levels. Unauthorized devices may have limited or no functionality.

# HISTORY

Thunderbolt security became important with the discovery of DMA attacks through Thunderbolt ports. The bolt project was developed to provide user-space security controls for Linux systems.

# SEE ALSO

[boltd](/man/boltd)(8), [udevadm](/man/udevadm)(8)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/bolt/bolt)```

```[Documentation](https://man.archlinux.org/man/boltctl.1)```

<!-- verified: 2026-06-19 -->


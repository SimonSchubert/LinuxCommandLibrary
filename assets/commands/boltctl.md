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

**Revoke** a previously authorized device

```boltctl forget [device_uuid]```

Show **detailed information** about a device

```boltctl info [device_uuid]```

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
> Authorize and remember a device for future connections

**forget**
> Remove a device from the authorized list

**info**
> Display detailed device information

**power**
> Control force power state

# CAVEATS

Thunderbolt security levels are set in BIOS/UEFI. Not all systems support all security levels. Unauthorized devices may have limited or no functionality.

# HISTORY

Thunderbolt security became important with the discovery of DMA attacks through Thunderbolt ports. The bolt project was developed to provide user-space security controls for Linux systems.

# SEE ALSO

[boltd](/man/boltd)(8), [udevadm](/man/udevadm)(8)

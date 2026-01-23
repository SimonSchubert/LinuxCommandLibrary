# TLDR

**Start the bolt daemon**

```boltd```

**Start in foreground** with debug output

```boltd --replace```

**Check bolt daemon version**

```boltctl --version```

**List connected Thunderbolt devices**

```boltctl list```

**Authorize a device**

```boltctl authorize [device_uuid]```

# SYNOPSIS

**boltd** [_options_]

# DESCRIPTION

**boltd** is the system daemon that manages Thunderbolt 3 and USB4 devices on Linux. It handles device authorization, security policies, and stores information about known devices to enable automatic authorization on reconnection.

Thunderbolt security levels range from allowing all connections to requiring user authorization for each device. boltd interfaces with the kernel's Thunderbolt subsystem and provides a D-Bus API for device management.

The daemon is typically started automatically by systemd. Users interact with it through **boltctl**, the command-line interface for managing Thunderbolt devices.

# PARAMETERS

**--replace**
> Replace existing daemon instance.

**--version**
> Show version information.

# CAVEATS

Requires appropriate kernel support for Thunderbolt. Security level is set in BIOS/UEFI and may restrict what boltd can authorize. Devices must be physically connected before authorization. Some systems may need Thunderbolt enabled in BIOS.

# HISTORY

**boltd** was developed by **Christian Kellner** at **Red Hat** starting in **2017** to provide Thunderbolt device management on Linux. It was created in response to the introduction of Thunderbolt 3 and its security model that requires explicit device authorization. The project is part of the freedesktop.org ecosystem and has been integrated into major Linux distributions.

# SEE ALSO

[boltctl](/man/boltctl)(1), [thunderbolt](/man/thunderbolt)(7), [udevadm](/man/udevadm)(8)

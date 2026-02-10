# TAGLINE

creates device files in /dev

# TLDR

**Create standard devices**

```MAKEDEV std```

**Create specific device**

```MAKEDEV [sda]```

**Create all devices**

```MAKEDEV generic```

**Create console devices**

```MAKEDEV console```

**Create tty devices**

```MAKEDEV tty```

# SYNOPSIS

**MAKEDEV** [_options_] _device_

# PARAMETERS

_DEVICE_
> Device name or group.

**std**
> Standard devices.

**generic**
> Generic device set.

**console**
> Console devices.

**-d** _DIR_
> Device directory.

**--help**
> Display help information.

# DESCRIPTION

**MAKEDEV** creates device files in /dev. It sets up device nodes with correct permissions and types.

The tool is largely obsolete with udev. Used in static /dev setups or initial ramdisks.

# CAVEATS

Obsolete with udev/devtmpfs. Requires root. Static device creation only.

# HISTORY

MAKEDEV was the traditional way to create device files before **udev** automated device management.

# SEE ALSO

[mknod](/man/mknod)(1), [udev](/man/udev)(7), [udevadm](/man/udevadm)(8)


# TAGLINE

Userspace Xbox controller driver

# TLDR

**Start driver for connected controller**

```sudo xboxdrv```

**Run as daemon**

```sudo xboxdrv --daemon --detach```

**Run with PID file**

```sudo xboxdrv --daemon --detach --pid-file [/var/run/xboxdrv.pid]```

**Use configuration file**

```sudo xboxdrv -c [/etc/default/xboxdrv]```

**Silent mode**

```sudo xboxdrv --silent```

**List connected controllers**

```sudo xboxdrv --list-controller```

# SYNOPSIS

**xboxdrv** [_options_]

# PARAMETERS

**-D**, **--daemon**
> Run as daemon, listening for USB events.

**--detach**
> Detach from terminal when daemonizing.

**--pid-file** _file_
> Write PID to file.

**-c**, **--config** _file_
> Use configuration file.

**--silent**
> Suppress normal output.

**--list-controller**
> List connected controllers.

**-l**, **--led** _num_
> Set LED status (0-off, 1-4 player number).

**--deadzone** _value_
> Set analog stick deadzone.

**--trigger-as-button**
> Map triggers as buttons.

# DESCRIPTION

**xboxdrv** is a userspace driver for Xbox and Xbox 360 controllers on Linux. It provides an alternative to the xpad kernel driver with additional features like button remapping, deadzone configuration, and multiple controller support.

The driver creates virtual input devices through uinput, making controllers work with games and applications. Daemon mode automatically handles controller connection/disconnection events.

Configuration files allow per-controller settings and complex mappings. The driver supports wired USB controllers and wireless controllers with the Xbox 360 wireless receiver.

# CAVEATS

Deprecated in favor of kernel xpad driver (Linux 6.1+). Requires uinput kernel module. Needs root or udev rules for USB access. May conflict with xpad kernel module.

# HISTORY

**xboxdrv** was created when Linux kernel support for Xbox controllers was incomplete. It provided features the kernel driver lacked. As kernel support improved, xboxdrv development was discontinued, with users encouraged to use the kernel driver instead.

# SEE ALSO

[jstest](/man/jstest)(1), [evtest](/man/evtest)(1), [udevadm](/man/udevadm)(8)

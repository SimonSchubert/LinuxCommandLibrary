# TAGLINE

Linux udev device manager administration

# TLDR

**Monitor** all device events

```sudo udevadm monitor```

**Print** uevents sent by the kernel

```sudo udevadm monitor -k```

**Print** device events after being processed by udev

```sudo udevadm monitor -u```

**List** attributes of a device

```sudo udevadm info -a [/dev/sda]```

**Reload** all udev rules

```sudo udevadm control -R```

**Trigger** all udev rules to run

```sudo udevadm trigger```

**Test** an event run by simulating device loading

```sudo udevadm test [/dev/sda]```

# SYNOPSIS

**udevadm** [_command_] [_options_]

# PARAMETERS

**monitor**
> Monitor kernel uevents and udev events

**info**
> Query device information

**control**
> Control the udev daemon

**trigger**
> Request device events from the kernel

**settle**
> Wait for pending udev events

**test**
> Simulate a udev event

**-k, --kernel**
> Print kernel uevents

**-u, --udev**
> Print udev events

**-a, --attribute-walk**
> Show all device attributes

**-R, --reload**
> Reload udev rules

# DESCRIPTION

**udevadm** is the Linux udev management tool for querying and controlling the udev device manager. It can monitor device events, query device attributes, reload rules, and trigger rule processing.

The tool is essential for debugging udev rules, understanding device properties, and managing hot-plug device handling.

# CAVEATS

Requires root privileges for most operations. The **test** command simulates events without actually running them. Rule changes require **control --reload** to take effect. Part of the systemd/udev suite.

# SEE ALSO

[udev](/man/udev)(7), [systemd-udevd](/man/systemd-udevd)(8), [udev.rules](/man/udev.rules)(7)

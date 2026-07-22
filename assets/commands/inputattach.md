# TAGLINE

attach a serial line to an input-layer device

# TLDR

Attach a **Pulse8 CEC** adapter

```sudo inputattach --pulse8-cec /dev/ttyACM0```

Attach a **Wacom W8001** pen-only tablet at 19200 baud

```sudo inputattach --baud 19200 --w8001 /dev/ttyS0```

Attach an **ELO touchscreen** and fork into the background

```sudo inputattach --daemon --elo /dev/ttyS0```

Attach a **Microsoft serial mouse**

```sudo inputattach --microsoft /dev/ttyS0```

List **supported devices**

```inputattach --help```

# SYNOPSIS

**inputattach** [_options_] _mode_ _device_

# PARAMETERS

**--daemon**
> Fork into the background after attaching.

**--always**
> Ignore initialization failures and keep the device attached.

**--noinit**
> Skip device initialization.

**--baud** _RATE_
> Override the default serial baud rate.

**--help**
> Display help and list all supported device modes.

Mode flags (select one):

**--microsoft**, **--mouseman**, **--intellimouse**, **--mousesystems**
> Common serial mouse protocols.

**--elo**, **--mtouch**, **--touchit213**, **--fujitsu**
> Serial touchscreen protocols.

**--w8001**, **--wacom_iv**, **--wacom_v**
> Wacom serial tablet protocols.

**--pulse8-cec**, **--rainshadow-cec**
> HDMI-CEC adapters that present as serial devices.

**--magellan**, **--spaceorb**, **--spaceball**
> 6-DOF serial input devices.

**--sunkbd**, **--lkkbd**, **--stowaway**
> Serial keyboard protocols.

# DESCRIPTION

**inputattach** attaches a serial line to the Linux input subsystem. It reads raw bytes from the named serial device, decodes them according to the chosen protocol, and feeds the resulting events into the kernel where they appear as standard input devices under `/dev/input/`.

The program is part of the **linuxconsoletools** package. After attaching, devices can be used with libinput, evdev, X.Org, or any other consumer of the Linux input layer. With **--daemon**, inputattach detaches from the controlling terminal so it can be started from rc scripts or systemd units.

For Wacom W8001 hardware, the default rate of 38400 bps covers pen-and-touch and touch-only devices. Pen-only devices need **--baud 19200**.

# CAVEATS

Usually requires root or write access to the serial node. The mode flag must match the connected hardware; the wrong protocol will produce no events or garbage. Once attached, the device remains owned by inputattach until the process exits.

# HISTORY

inputattach is maintained as part of **linuxconsoletools** (formerly joyutils). The Wacom variants are also distributed by the **linuxwacom** project for use with serial Wacom tablets.

# INSTALL

```apt: sudo apt install inputattach```

```dnf: sudo dnf install linuxconsoletools```

```apk: sudo apk add linuxconsoletools```

```zypper: sudo zypper install linuxconsoletools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[evtest](/man/evtest)(1), [libinput](/man/libinput)(1)

# TAGLINE

subcommand of iw for manipulating wireless network interfaces

# TLDR

Set device to **monitor mode** (interface must be down)

```sudo iw dev [wlp] set type monitor```

Set device to **managed mode** (interface must be down)

```sudo iw dev [wlp] set type managed```

Set device **channel**

```sudo iw dev [wlp] set channel [channel_number]```

Set device **frequency** in MHz

```sudo iw dev [wlp] set freq [freq_in_mhz]```

Show all **station information**

```iw dev [wlp] station dump```

Create **virtual interface** in monitor mode

```sudo iw dev [wlp] interface add "[vif_name]" type monitor addr [12:34:56:aa:bb:cc]```

**Delete** virtual interface

```sudo iw dev "[vif_name]" del```

# SYNOPSIS

**iw dev** _interface_ _command_ [_parameters_]

# PARAMETERS

**set type** _MODE_
> Set interface mode: managed, monitor, ibss, mesh, etc.

**set channel** _NUM_
> Set wireless channel number

**set freq** _MHZ_
> Set wireless frequency in MHz

**station dump**
> Show connected station information

**interface add** _NAME_ **type** _MODE_
> Create virtual interface

**del**
> Delete interface

**scan**
> Trigger scan for networks

# DESCRIPTION

**iw dev** is a subcommand of iw for manipulating wireless network interfaces. It controls interface modes, channels, frequencies, and manages virtual interfaces.

Monitor mode allows passive packet capture. Managed mode is for normal client connections. The interface typically must be brought down (ip link set down) before changing modes.

# CAVEATS

Requires root privileges for most operations. Interface must be down before changing type. Not all wireless drivers support all modes. Monitor mode capabilities vary by hardware.

# HISTORY

iw is the modern replacement for the deprecated wireless-tools (iwconfig, iwlist). It was developed to support the nl80211/cfg80211 wireless stack introduced in Linux kernel 2.6.22 (**2007**).

# SEE ALSO

[iw](/man/iw)(8), [ip-link](/man/ip-link)(8), [iwconfig](/man/iwconfig)(8)

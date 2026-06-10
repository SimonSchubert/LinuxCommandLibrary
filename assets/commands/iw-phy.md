# TAGLINE

Show and configure wireless PHY (physical device) settings

# TLDR

**List capabilities** of all wireless devices

```iw phy```

**Show detailed info** for a specific PHY

```iw phy [phy0] info```

**Set the channel** on a PHY

```iw phy [phy0] set channel [6]```

**Set a fixed transmit power** (in mBm)

```iw phy [phy0] set txpower fixed [1500]```

**Add a virtual interface** of a given type

```iw phy [phy0] interface add [mon0] type [monitor]```

**Rename** a wireless PHY

```iw phy [phy0] set name [newname]```

# SYNOPSIS

**iw** **phy** [_phyname_] _command_

# DESCRIPTION

**iw phy** operates on a wireless PHY, the physical radio device that one or more network interfaces are built on. With no arguments it lists every wiphy and its capabilities: supported bands and channels, bitrates, ciphers, antenna configuration, and which interface modes and features the hardware allows.

Targeting a named PHY (for example **phy0**) lets you query it with **info** or change radio-wide settings such as the operating channel, transmit power, retry limits, and antenna mask. The **interface add** form creates additional virtual interfaces (managed, monitor, AP, mesh, and so on) on top of the same radio.

# PARAMETERS

**info**
> Print the full capability listing for the PHY.

**set channel** _N_ _[HT/VHT]_
> Set the operating channel, optionally with a width specifier.

**set freq** _FREQ_
> Set the operating frequency directly.

**set txpower** _auto_|_fixed_|_limit_ _[mBm]_
> Control transmit power, fixed or capped at the given level.

**set name** _NAME_
> Rename the wireless PHY.

**set antenna** _TX_ _RX_
> Configure the TX and RX antenna bitmasks.

**interface add** _NAME_ **type** _TYPE_
> Create a new virtual interface of _TYPE_ on this PHY.

# CAVEATS

Most **set** operations require root privileges, and some can only be applied while the interface is down or unused. The exact set of supported channels, powers, and interface types depends on the driver and the active regulatory domain.

# SEE ALSO

[iw](/man/iw)(8), [iwconfig](/man/iwconfig)(8), [nmcli](/man/nmcli)(1)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/linux/kernel/git/jberg/iw.git)```

```[Documentation](https://wireless.wiki.kernel.org/en/users/documentation/iw)```

<!-- verified: 2026-06-10 -->

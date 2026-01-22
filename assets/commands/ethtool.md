# TLDR

Show **settings**

```ethtool eth0```

Show **driver** info

```ethtool -i eth0```

Show **features**

```ethtool -k eth0```

Show **statistics**

```ethtool -S eth0```

**Blink** LEDs

```ethtool -p eth0 10```

Set **speed** and duplex

```ethtool -s eth0 speed 1000 duplex full autoneg off```

# SYNOPSIS

**ethtool** [_OPTIONS_] _device_

# DESCRIPTION

**ethtool** displays and modifies Network Interface Controller (NIC) parameters. It can query driver information, link status, hardware features, and configure settings like speed, duplex, and offload features.

# PARAMETERS

**-i, --driver**
> Display driver information

**-k, --show-features**
> Show offload and other features

**-K, --features**
> Change offload and other features

**-S, --statistics**
> Show NIC and driver statistics

**-p, --identify** _seconds_
> Blink device LEDs for identification

**-s, --change**
> Change device settings

**speed** _10|100|1000|10000_
> Set link speed in Mbps

**duplex** _half|full_
> Set duplex mode

**autoneg** _on|off_
> Enable/disable auto-negotiation

# CAVEATS

Not all options are supported by all drivers. Changing settings may temporarily disrupt connectivity. Some settings require the interface to be down.

# HISTORY

**ethtool** is the standard Linux utility for examining and tuning Ethernet-based network interfaces.

# SEE ALSO

[ip](/man/ip)(8), [mii-tool](/man/mii-tool)(8), [tc](/man/tc)(8)

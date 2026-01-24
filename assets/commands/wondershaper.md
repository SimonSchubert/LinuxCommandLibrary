# TLDR

**Limit bandwidth**

```wondershaper [eth0] [1024] [512]```

**Clear limits**

```wondershaper clear [eth0]```

**Show current limits**

```wondershaper [eth0]```

**Using long options**

```wondershaper -a [eth0] -d [1024] -u [512]```

# SYNOPSIS

**wondershaper** [_-a interface_] [_-d down_] [_-u up_] | _interface_ _down_ _up_

# PARAMETERS

**-a** _IFACE_
> Interface name.

**-d** _KBPS_
> Download limit.

**-u** _KBPS_
> Upload limit.

**clear**
> Remove limits.

# DESCRIPTION

**wondershaper** limits bandwidth. It shapes traffic.

Download/upload limits. Set in kbps.

Interface-based. Per network device.

Simple interface. Easy bandwidth control.

Script-based. Uses tc commands.

# CAVEATS

Root required. Script around tc. Values in kbps.

# HISTORY

**wondershaper** was created as a simple script to limit network bandwidth using Linux traffic control.

# SEE ALSO

[tc](/man/tc)(8), [iptables](/man/iptables)(8), [trickle](/man/trickle)(1)

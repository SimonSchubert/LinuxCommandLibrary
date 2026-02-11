# TAGLINE

Simple network bandwidth limiter

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

**wondershaper** is a simple shell script that limits network bandwidth on a per-interface basis using Linux traffic control. It provides an easy way to set download and upload speed limits in kilobits per second without needing to understand the complex tc command syntax directly.

The tool works by applying traffic shaping rules to the specified network interface. Limits can be displayed, set, or cleared with straightforward commands. It is commonly used for testing applications under bandwidth-constrained conditions or for preventing a single machine from saturating a shared network connection.

# CAVEATS

Root required. Script around tc. Values in kbps.

# HISTORY

**wondershaper** was created as a simple script to limit network bandwidth using Linux traffic control.

# SEE ALSO

[tc](/man/tc)(8), [iptables](/man/iptables)(8), [trickle](/man/trickle)(1)

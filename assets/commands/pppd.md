# TLDR

**Start PPP connection**

```pppd [device] [speed]```

**Connect with options**

```pppd call [provider]```

**Debug mode**

```pppd debug [device] [speed]```

**Specify authentication**

```pppd user [username] password [password]```

# SYNOPSIS

**pppd** [_options_] [_device_] [_speed_]

# PARAMETERS

_DEVICE_
> Serial device.

_SPEED_
> Baud rate.

**call** _PROVIDER_
> Use provider config.

**debug**
> Enable debugging.

**user** _NAME_
> Username for auth.

**password** _PASS_
> Password for auth.

**noauth**
> Don't require auth.

# DESCRIPTION

**pppd** is the Point-to-Point Protocol daemon. Manages PPP connections.

The tool handles dial-up and DSL. Core PPP implementation.

pppd manages PPP links.

# CAVEATS

Requires root privileges. Complex configuration.

# HISTORY

pppd is the **standard PPP daemon** for Linux networking.

# SEE ALSO

[pon](/man/pon)(1), [poff](/man/poff)(1), [pppconfig](/man/pppconfig)(8)


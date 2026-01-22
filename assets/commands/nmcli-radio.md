# TLDR

Show **status of Wi-Fi**

```nmcli radio wifi```

Turn **Wi-Fi on or off**

```nmcli radio wifi [on|off]```

Show **status of WWAN** (mobile broadband)

```nmcli radio wwan```

Turn **WWAN on or off**

```nmcli radio wwan [on|off]```

Show **status of both** switches

```nmcli radio```

Turn **both switches** on or off

```nmcli radio all [on|off]```

# SYNOPSIS

**nmcli radio** [_switch_] [_on_|_off_]

# PARAMETERS

**wifi, w**
> Control or show Wi-Fi radio status

**wwan, ww**
> Control or show WWAN (mobile broadband) radio status

**all, a**
> Control all radio switches simultaneously

**on**
> Enable the specified radio

**off**
> Disable the specified radio

# DESCRIPTION

**nmcli radio** controls the software radio switches for wireless interfaces managed by NetworkManager. This is equivalent to airplane mode functionality, allowing Wi-Fi and mobile broadband radios to be enabled or disabled independently.

Disabling a radio switch turns off the corresponding hardware transmitter, preventing any wireless communication. This is different from just disconnecting—the radio itself is turned off.

Without an on/off argument, the command displays the current state of the specified radio(s).

# CAVEATS

Software radio control depends on hardware and driver support. Some laptops have physical radio switches that override software control. Enabling the radio doesn't automatically connect to networks; it just makes the hardware available for connections.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-networking](/man/nmcli-networking)(1), [rfkill](/man/rfkill)(8), [NetworkManager](/man/NetworkManager)(8)

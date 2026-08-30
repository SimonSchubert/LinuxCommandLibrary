# TAGLINE

controls the software radio switches for wireless interfaces managed

# TLDR

Show **both radio switches**

```nmcli radio```

Show only the **Wi-Fi** switch

```nmcli radio wifi```

Turn Wi-Fi **off**

```nmcli radio wifi off```

Turn Wi-Fi **back on**

```nmcli radio wifi on```

Show the **mobile broadband** switch

```nmcli radio wwan```

Turn mobile broadband off

```nmcli radio wwan off```

Turn **every radio off** at once

```nmcli radio all off```

Read a switch's state in a **script-friendly** form

```nmcli --terse radio wifi```

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

Disabling a radio switch turns off the corresponding hardware transmitter, preventing any wireless communication. This is different from just disconnecting: the radio itself is turned off.

Without an on/off argument, the command displays the current state of the specified radio(s).

# CAVEATS

Software radio control depends on hardware and driver support. Some laptops have physical radio switches that override software control. Enabling the radio doesn't automatically connect to networks; it just makes the hardware available for connections.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-networking](/man/nmcli-networking)(1), [rfkill](/man/rfkill)(8), [NetworkManager](/man/NetworkManager)(8)

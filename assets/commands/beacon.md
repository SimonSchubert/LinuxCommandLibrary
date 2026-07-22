# TAGLINE

Transmit periodic messages on an AX.25 port

# TLDR

**Send a beacon** every 30 minutes (default) on a port

```beacon [port] "[message text]"```

**Set a custom interval** in minutes between transmissions

```beacon -t [interval] [port] "[message text]"```

**Send the message once** and exit

```beacon -s [port] "[message text]"```

**Specify a source callsign** instead of the interface default

```beacon -c [src_call] [port] "[message text]"```

**Set the destination callsign** (and optional digipeaters)

```beacon -d "[dest_call] [digi1] [digi2]" [port] "[message text]"```

**Run in the foreground** without daemonising

```beacon -f [port] "[message text]"```

**Send a one-shot mail beacon** (destination set to MAIL)

```beacon -m [port] "[message text]"```

# SYNOPSIS

**beacon** [_-c src_call_] [_-d dest_call[digi ..]_] [_-f_] [_-l_] [_-m_] [_-s_] [_-t interval_] [_-v_] _port_ "_message_"

# PARAMETERS

**-c** _src_call_
> Configure the source callsign for the beacon. Defaults to the AX.25 callsign of the interface.

**-d** _dest_call_
> Configure the destination callsign. Defaults to **IDENT**. Digipeaters may follow, separated by spaces, when the argument is quoted.

**-f**
> Do not fork into the background; keep the process attached to the terminal.

**-l**
> Enable logging of errors to the system log. Disabled by default.

**-m**
> Send the message once with destination address set to **MAIL** instead of **IDENT**.

**-s**
> Send the message text only once and exit.

**-t** _interval_
> Time interval between transmissions, in minutes. Default is **30**.

**-v**
> Display version information.

_port_
> Name of the AX.25 port as defined in **/etc/ax25/axports**.

_message_
> Text to transmit. Quote the string so spaces and special characters are passed unchanged.

# DESCRIPTION

**beacon** is part of the **ax25-tools** suite for amateur packet radio on Linux. It periodically transmits a UI (Unnumbered Information) frame containing a user-supplied text message on a configured AX.25 port. Beacons announce a station's presence, advertise services, or publish APRS-style position and status data on packet networks.

By default the destination address is **IDENT** and the message is sent every 30 minutes; both can be overridden. The program normally daemonises itself so it can keep running in the background while the operator continues other work. The **-s** and **-m** options turn it into a one-shot transmitter.

The named _port_ must be a configured AX.25 interface (commonly a KISS TNC, a soundmodem, or a kernel AX.25 device) listed in **/etc/ax25/axports**.

# EXAMPLES

Announce a BBS every 15 minutes:

```beacon -t 15 radio "Welcome to AB1CDE BBS, telnet bbs.example.org"```

Send a single MAIL beacon and exit:

```beacon -m radio "QSL via email ab1cde@example.org"```

Beacon through two digipeaters:

```beacon -d "APRS WIDE1-1 WIDE2-1" radio "!4807.38N/01131.00E>Test station"```

# CONFIGURATION

AX.25 ports are defined in **/etc/ax25/axports** with one line per port:

```
# portname callsign  baudrate  paclen  window description
radio      AB1CDE-1  1200      256     2      VHF packet on 144.39 MHz
```

The port name passed to **beacon** must match the first column. The AX.25 networking stack and a TNC (kernel KISS, **kissattach**, **soundmodem**, or similar) must be active before invoking **beacon**.

# CAVEATS

Requires the AX.25 kernel stack and an attached AX.25 interface; **beacon** will not start without a valid port. Frequent beaconing wastes shared radio channel capacity and is widely discouraged in amateur packet networks. Many operators recommend intervals of 30 minutes or longer outside of APRS use cases. Running **beacon** typically requires privileges that allow opening the AX.25 socket (often root or membership in an appropriate group).

# HISTORY

**beacon** ships with **ax25-tools**, the userspace utilities for the Linux AX.25 protocol stack. The Linux AX.25 implementation was started in the early **1990s** by **Alan Cox** and others to bring amateur packet radio to Linux, and **ax25-tools** has been maintained by the Linux AX.25 project ever since. The utility has remained largely unchanged for decades because the AX.25 link-layer protocol itself has been stable since its original 1984 specification.

# INSTALL

```apt: sudo apt install ax25-tools```

```dnf: sudo dnf install ax25-tools```

```aur: yay -S ax25-tools```

```apk: sudo apk add ax25-tools```

```zypper: sudo zypper install ax25-tools```

```nix: nix profile install nixpkgs#ax25-tools```

<!-- packages: 2026-07-22 -->
# SEE ALSO


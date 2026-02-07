# TAGLINE

automated WEP key recovery tool

# TLDR

**Start with interface**

```sudo easside-ng -i [wlan0]```

**Specify source MAC**

```sudo easside-ng -i [wlan0] -m [00:11:22:33:44:55]```

**Target specific channel**

```sudo easside-ng -i [wlan0] -c [6]```

**Specify buddy server**

```sudo easside-ng -i [wlan0] -s [buddy_ip]```

# SYNOPSIS

**easside-ng** [_options_] **-i** _interface_

# PARAMETERS

**-i** _interface_
> Wireless interface to use.

**-m** _mac_
> Source MAC address.

**-c** _channel_
> Target channel.

**-s** _ip_
> Buddy server IP address.

**-v**
> Verbose mode.

**-h**
> Display help.

# DESCRIPTION

**easside-ng** is a tool from the Aircrack-ng suite designed for automated WEP key recovery. It communicates with an external "buddy" server to decrypt packets without needing the WEP key, enabling network access.

The tool automates the attack process against WEP-encrypted networks, exploiting known vulnerabilities in the WEP protocol.

# CAVEATS

Requires wireless card supporting monitor mode and packet injection. WEP is deprecated and rarely used. Only for authorized security testing. Requires buddy-ng server running on the internet. May be illegal without proper authorization.

# HISTORY

easside-ng is part of the **Aircrack-ng** suite, developed from the original Aircrack project. The tool was created to demonstrate WEP vulnerabilities and for legitimate security testing. WEP attacks helped drive the adoption of WPA/WPA2.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [buddy-ng](/man/buddy-ng)(1)

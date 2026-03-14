# TAGLINE

automated WEP key recovery tool

# TLDR

**Start with interface** and buddy server

```sudo easside-ng -f [wlan0] -s [buddy_ip]```

**Target a specific BSSID**

```sudo easside-ng -f [wlan0] -s [buddy_ip] -v [00:11:22:33:44:55]```

**Lock to a specific channel**

```sudo easside-ng -f [wlan0] -s [buddy_ip] -c [6]```

**Determine Internet IP** only

```sudo easside-ng -f [wlan0] -s [buddy_ip] -n```

# SYNOPSIS

**easside-ng** [_options_] **-f** _interface_ **-s** _buddy_ip_

# PARAMETERS

**-f** _interface_
> Wireless interface to use (mandatory).

**-s** _ip_
> Buddy-ng server IP address (mandatory).

**-v** _mac_
> Victim BSSID (target access point MAC address).

**-m** _mac_
> Source MAC address.

**-i** _ip_
> Source IP address.

**-r** _ip_
> Router IP address.

**-c** _channel_
> Lock card to this channel.

**-n**
> Determine Internet IP only.

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

# TLDR

**Brute-force** the WPS pin of an access point

```bully -b "[mac]" -c "[channel]" -B "[interface]"```

Display **help**

```bully -h```

# SYNOPSIS

**bully** [_options_] _interface_

# DESCRIPTION

**bully** is a WPS (Wi-Fi Protected Setup) brute-force attack tool that exploits vulnerabilities in the WPS protocol to recover the WPA/WPA2 passphrase. It attempts to crack the 8-digit WPS PIN through systematic guessing.

Before using bully, network information must be gathered using tools like **airmon-ng** and **airodump-ng** to identify the target's MAC address and channel.

# PARAMETERS

**-b, --bssid** _mac_
> Target access point MAC address

**-c, --channel** _channel_
> Target wireless channel

**-B, --bruteforce**
> Enable brute-force mode

**-h, --help**
> Display help information

# CAVEATS

Only use on networks you own or have explicit authorization to test. WPS attacks are detectable and may trigger lockouts. Many modern routers have WPS protections that limit attack effectiveness. Unauthorized use is illegal.

# SEE ALSO

[reaver](/man/reaver)(1), [airmon-ng](/man/airmon-ng)(8), [airodump-ng](/man/airodump-ng)(8)

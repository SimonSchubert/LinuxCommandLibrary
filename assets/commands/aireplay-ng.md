# TAGLINE

Inject packets into wireless networks for security testing

# TLDR

**Deauthenticate** a client

```sudo aireplay-ng -0 [5] -a [AP_BSSID] -c [CLIENT_MAC] [wlan0mon]```

**Fake authentication** to AP

```sudo aireplay-ng -1 0 -a [AP_BSSID] -e [SSID] [wlan0mon]```

**ARP replay** attack for WEP

```sudo aireplay-ng -3 -b [AP_BSSID] [wlan0mon]```

**Inject packets** interactively

```sudo aireplay-ng -2 -b [AP_BSSID] -r [capture.cap] [wlan0mon]```

**Fragmentation** attack

```sudo aireplay-ng -5 -b [AP_BSSID] [wlan0mon]```

# SYNOPSIS

**aireplay-ng** _attack-mode_ [_-a bssid_] [_-c client_] [_-e essid_] [_options_] _interface_

# DESCRIPTION

**aireplay-ng** is a packet injection tool for wireless networks. It can generate traffic to increase data capture for WEP cracking, force clients to disconnect (enabling handshake capture), and perform various wireless attacks.

The tool requires a wireless interface in monitor mode with injection capability.

# PARAMETERS

**-0** _count_
> Deauthentication attack (0 = continuous)

**-1** _delay_
> Fake authentication attack

**-2**
> Interactive packet replay

**-3**
> ARP request replay attack

**-4**
> KoreK chopchop attack

**-5**
> Fragmentation attack

**-6**
> Caffe-Latte attack (capture WEP key from a client)

**-7**
> Client-oriented fragmentation attack (cfrag)

**-9**
> Injection test

**-a** _bssid_
> Access point MAC address (filter or replay)

**-b** _bssid_
> Access point MAC address (attack-specific, e.g. ARP replay and fragmentation)

**-c** _client_
> Target client MAC

**-e** _essid_
> Target network name

**-h** _mac_
> Source MAC address (your interface or a connected client)

**-x** _pps_
> Number of packets per second to inject

**-D**
> Disable AP detection (do not wait for the AP to be seen)

**-r** _file_
> Read packets to inject from a capture file

# CAVEATS

For authorized penetration testing only. Requires interface with injection support. Deauthentication attacks are detectable by WIDS. Some attacks only work against WEP networks.

# HISTORY

**aireplay-ng** is a core component of the aircrack-ng suite, first released in **2006**. It consolidated various wireless attack techniques into a single tool.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [airmon-ng](/man/airmon-ng)(1), [airbase-ng](/man/airbase-ng)(1)

# RESOURCES

```[Source code](https://github.com/aircrack-ng/aircrack-ng)```

```[Homepage](https://www.aircrack-ng.org/)```

```[Documentation](https://www.aircrack-ng.org/documentation.html)```

<!-- verified: 2026-06-11 -->

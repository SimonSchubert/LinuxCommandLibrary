# TLDR

**Scan** all wireless networks

```sudo airodump-ng [wlan0mon]```

Capture packets on **specific channel**

```sudo airodump-ng -c [6] --bssid [00:11:22:33:44:55] -w [capture] [wlan0mon]```

Scan only **5GHz** networks

```sudo airodump-ng --band a [wlan0mon]```

Scan with **manufacturer info**

```sudo airodump-ng --manufacturer [wlan0mon]```

Scan showing **WPS** information

```sudo airodump-ng --wps [wlan0mon]```

# SYNOPSIS

**airodump-ng** [_-c channel_] [_--bssid mac_] [_-w prefix_] [_--band band_] [_options_] _interface_

# DESCRIPTION

**airodump-ng** is a wireless packet capture and network discovery tool. It displays detected access points and clients in real-time, capturing packets to files for later analysis with aircrack-ng.

The tool shows network names, encryption types, signal strength, channel, MAC addresses, and associated clients, making it essential for wireless reconnaissance.

# PARAMETERS

**-c** _channel_
> Lock to specific channel

**--bssid** _mac_
> Filter by access point MAC

**-w** _prefix_
> Output file prefix (creates .cap, .csv, .kismet.csv, .kismet.netxml)

**--band** _band_
> Band: a (5GHz), b (2.4GHz), g (2.4GHz)

**-a**
> Filter unassociated clients

**--write-interval** _seconds_
> Time between file writes

**--manufacturer**
> Show manufacturer from OUI

**--wps**
> Show WPS information

**--output-format** _formats_
> Output formats: pcap, ivs, csv, gps, kismet, netxml

**-r** _file_
> Read from capture file instead of live capture

# CAVEATS

For authorized security testing only. Requires monitor mode interface. Capture files can become very large. Some information requires being on the correct channel.

# HISTORY

**airodump-ng** is a core component of the aircrack-ng suite, first released in **2006**. It replaced the original airodump with improved features and stability.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [aireplay-ng](/man/aireplay-ng)(1), [airmon-ng](/man/airmon-ng)(1), [wireshark](/man/wireshark)(1)

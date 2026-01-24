# TLDR

**Start automated WEP key recovery** on an interface

```sudo wesside-ng -i [wlan0mon]```

**Target a specific network** (BSSID)

```sudo wesside-ng -i [wlan0mon] -v [00:11:22:33:44:55]```

**Specify network IP address**

```sudo wesside-ng -i [wlan0mon] -n [192.168.1.0]```

**Set maximum channel to scan**

```sudo wesside-ng -i [wlan0mon] -f [13]```

**Gather PRGA without cracking**

```sudo wesside-ng -i [wlan0mon] -c```

# SYNOPSIS

**wesside-ng** **-i** _interface_ [**-v** _bssid_] [**-n** _netip_] [**-m** _myip_] [**-a** _mymac_] [**-c**] [**-p** _minprga_] [**-t** _threshold_] [**-f** _maxchan_]

# PARAMETERS

**-i** _interface_
> Wireless interface to use (required). Must be in monitor mode.

**-v** _bssid_
> Target victim BSSID (MAC address of access point).

**-n** _netip_
> Network IP address to use.

**-m** _myip_
> Source IP address to use for injected packets.

**-a** _mymac_
> Source MAC address to use.

**-c**
> Collect PRGA data but do not crack the key.

**-p** _minprga_
> Minimum bytes of PRGA (pseudo-random generation algorithm) data to gather.

**-t** _threshold_
> Cracking threshold value.

**-f** _maxchan_
> Highest channel to scan. Default is 11.

**-k** _txnum_
> Ignore acknowledgments and transmit txnum times.

**-h**
> Display help message.

# DESCRIPTION

**wesside-ng** is an automated WEP key recovery tool from the Aircrack-ng suite. It performs a complete attack sequence without user intervention: network identification, association, PRGA data collection, IP scheme determination, ARP request injection, and WEP key cracking.

The tool exploits weaknesses in WEP encryption by injecting packets to generate traffic containing IVs (initialization vectors) needed for key recovery. It uses the fragmentation attack technique to obtain PRGA data, then reinjects ARP requests to accelerate IV collection.

wesside-ng requires a wireless adapter capable of packet injection in monitor mode. The interface must be set to monitor mode before running the tool (typically using airmon-ng).

# CAVEATS

WEP is obsolete and should not be used for wireless security. This tool is for authorized security testing and educational purposes only. Unauthorized network access is illegal. Requires compatible wireless hardware with injection support. May not work reliably on all networks or with all hardware.

# HISTORY

**wesside-ng** was originally written by **Andrea Bittau** as a proof-of-concept for research papers "The Fragmentation Attack in Practice" and "The Final Nail in WEP's Coffin" (co-authored with Mark Handley and Joshua Lockey). It was incorporated into the **Aircrack-ng** suite to demonstrate practical WEP vulnerabilities. The tool's relevance has diminished as networks migrated to WPA/WPA2/WPA3.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airmon-ng](/man/airmon-ng)(8), [aireplay-ng](/man/aireplay-ng)(8), [airodump-ng](/man/airodump-ng)(8), [easside-ng](/man/easside-ng)(8)

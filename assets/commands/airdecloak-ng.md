# TAGLINE

Remove WEP cloaking from wireless capture files

# TLDR

**Remove cloaking** from a capture file filtered by BSSID

```airdecloak-ng -i [capture.cap] --bssid [00:11:22:33:44:55]```

**Filter by ESSID** (network name)

```airdecloak-ng -i [capture.cap] --ssid [MyNetwork]```

**Specify output** file for cleaned packets

```airdecloak-ng -i [capture.cap] -o [output.pcap] --bssid [00:11:22:33:44:55]```

**Treat null packets** as potentially cloaked

```airdecloak-ng -i [capture.cap] --bssid [00:11:22:33:44:55] --null-packets```

# SYNOPSIS

**airdecloak-ng** -i _input_ [--bssid _bssid_ | --ssid _essid_] [_options_]

# DESCRIPTION

**airdecloak-ng** filters out WEP cloaking techniques from wireless capture files. Some access points implement cloaking by injecting fake or corrupted packets to confuse WEP cracking tools.

This tool identifies and removes these cloaking packets, producing a cleaner capture file that can be more effectively analyzed or cracked.

# PARAMETERS

**-i** _file_
> Input capture file (pcap format).

**-o** _file_
> Output file for valid (cleaned) packets. Default: _<src>_-filtered.pcap.

**-c** _file_
> Output file for cloaked packets. Default: _<src>_-cloaked.pcap.

**-u** _file_
> Output file for unknown/ignored packets. Default: invalid_status.pcap.

**--bssid** _mac_
> Filter by access point MAC address.

**--ssid** _essid_
> Filter by network ESSID.

**--filters** _list_
> Apply filtering methods in order (signal, duplicate_sn, duplicate_sn_ap, duplicate_sn_client, consecutive_sn, duplicate_iv, signal_dup_consec_sn).

**--null-packets**
> Treat null packets as potentially cloaked.

**--disable-base-filter**
> Skip base filtering logic.

**--drop-frag**
> Remove fragmented packets.

# CAVEATS

Only useful for captures from access points using WEP cloaking. Modern networks using WPA/WPA2 don't use these cloaking techniques. May remove legitimate packets if cloaking detection is too aggressive.

# HISTORY

**airdecloak-ng** was added to the aircrack-ng suite to counter specific WEP protection mechanisms that some access point vendors implemented in the late **2000s**.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1)

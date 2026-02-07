# TAGLINE

Remove WEP cloaking from wireless capture files

# TLDR

**Remove cloaking** from a capture file

```airdecloak-ng -i [capture.cap] --drop```

**Filter by BSSID**

```airdecloak-ng -i [capture.cap] --bssid [00:11:22:33:44:55] --drop```

**Specify output file**

```airdecloak-ng -i [capture.cap] -o [output.cap] --drop```

# SYNOPSIS

**airdecloak-ng** -i _input_ [_-o output_] [_--bssid bssid_] _--drop_|_--disable_

# DESCRIPTION

**airdecloak-ng** filters out WEP cloaking techniques from wireless capture files. Some access points implement cloaking by injecting fake or corrupted packets to confuse WEP cracking tools.

This tool identifies and removes these cloaking packets, producing a cleaner capture file that can be more effectively analyzed or cracked.

# PARAMETERS

**-i** _file_
> Input capture file

**-o** _file_
> Output capture file

**--bssid** _mac_
> Filter by access point MAC address

**--drop**
> Drop cloaking frames

**--disable**
> Mark cloaking frames as invalid (keep them)

# CAVEATS

Only useful for captures from access points using WEP cloaking. Modern networks using WPA/WPA2 don't use these cloaking techniques. May remove legitimate packets if cloaking detection is too aggressive.

# HISTORY

**airdecloak-ng** was added to the aircrack-ng suite to counter specific WEP protection mechanisms that some access point vendors implemented in the late **2000s**.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1)

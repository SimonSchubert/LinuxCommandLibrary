# TLDR

**Scan for WPS-enabled access points** using wash

```wash -i [wlan0mon]```

**Start WPS brute force attack**

```reaver -i [wlan0mon] -b [AA:BB:CC:DD:EE:FF] -c [channel] -vv```

**Attack with Pixie Dust** (offline attack)

```reaver -i [wlan0mon] -b [AA:BB:CC:DD:EE:FF] -c [channel] -K -vv```

**Resume a previous session**

```reaver -i [wlan0mon] -b [AA:BB:CC:DD:EE:FF] -s [session_file]```

**Attack with custom delay** between attempts

```reaver -i [wlan0mon] -b [AA:BB:CC:DD:EE:FF] -d [5] -vv```

# SYNOPSIS

**reaver** **-i** _interface_ **-b** _bssid_ [**-c** _channel_] [**-K**] [**-vv**] [_options_]

# PARAMETERS

**-i** _interface_
> Wireless interface in monitor mode

**-b** _bssid_
> Target access point MAC address

**-c** _channel_
> Channel of target access point

**-K**
> Perform Pixie Dust offline attack

**-vv**
> Verbose output (use multiple v for more detail)

**-d** _seconds_
> Delay between PIN attempts (default: 1)

**-l** _seconds_
> Lock delay after WPS lock detected (default: 60)

**-s** _file_
> Save/restore session to/from file

**-p** _pin_
> Use specified 4 or 8 digit WPS pin

**-N**
> Do not send NACK packets when errors occur

**-T** _seconds_
> M5/M7 timeout period (default: 0.20)

**-t** _seconds_
> Receive timeout period (default: 5)

# DESCRIPTION

**reaver** performs brute force attacks against Wi-Fi Protected Setup (WPS) to recover WPA/WPA2 passphrases. WPS uses an 8-digit PIN that can be attacked in two halves, reducing the maximum attempts to approximately 11,000 combinations.

The attack exploits a design flaw in WPS where the access point validates the PIN in two stages, allowing an attacker to determine when the first half is correct before attempting the second half.

The **Pixie Dust** attack (**-K**) is an offline attack that exploits weak random number generation in certain chipsets (Ralink, Broadcom, Realtek), potentially recovering the PIN in seconds without brute forcing.

The companion tool **wash** scans for WPS-enabled access points and identifies potential targets, including those vulnerable to Pixie Dust.

# CAVEATS

**Authorization required**: Only use against networks you own or have explicit written permission to test. Unauthorized access is illegal.

The interface must be in monitor mode before running reaver. Use **airmon-ng start wlan0** to enable monitor mode.

Many modern access points implement WPS lockout after failed attempts, significantly slowing attacks. Some may lock out permanently or disable WPS entirely.

Rate limiting and lock detection (**-l** option) are essential to avoid permanent lockouts. Some access points may require device reboot to clear WPS locks.

# HISTORY

Reaver was developed after security researcher **Stefan Viehböck** published his paper "Brute forcing Wi-Fi Protected Setup" in December **2011**, demonstrating the fundamental weakness in WPS design. The tool quickly became a standard component of wireless security testing toolkits. The Pixie Dust attack was added later to exploit implementation flaws in specific chipsets.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [wash](/man/wash)(1), [airmon-ng](/man/airmon-ng)(8), [wifite](/man/wifite)(1)

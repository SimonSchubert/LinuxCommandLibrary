# TAGLINE

crack Bluetooth Low Energy encryption

# TLDR

**Crack BLE encryption** from pcap file

```crackle -i [capture.pcap]```

**Crack with specific LTK**

```crackle -i [capture.pcap] -l [ltk_hex]```

**Output decrypted traffic**

```crackle -i [capture.pcap] -o [decrypted.pcap]```

# SYNOPSIS

**crackle** [_options_] **-i** _input.pcap_

# PARAMETERS

**-i** _file_
> Input pcap file with BLE traffic.

**-o** _file_
> Output file for decrypted traffic.

**-l** _ltk_
> Long Term Key in hexadecimal.

# DESCRIPTION

**crackle** cracks Bluetooth Low Energy (BLE) encryption. It exploits weaknesses in the BLE pairing process to recover encryption keys and decrypt captured traffic.

Requires captured BLE packets including the pairing exchange. Works with BLE Legacy Pairing.

# CAVEATS

Only effective against BLE Legacy Pairing (Bluetooth 4.0/4.1). LE Secure Connections (4.2+) are not vulnerable. Use only for authorized security testing.

# SEE ALSO

[wireshark](/man/wireshark)(1), [btlejack](/man/btlejack)(1)

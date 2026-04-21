# TAGLINE

cracks MIFARE Classic cards

# TLDR

**Recover keys and dump card contents**

```mfoc -O [output.mfd]```

**Try an additional candidate key** (may be repeated)

```mfoc -k [FFFFFFFFFFFF] -O [output.mfd]```

**Increase sector probe attempts**

```mfoc -P [50] -O [output.mfd]```

**Set distance tolerance** (half range; total is 2 x NUM)

```mfoc -T [40] -O [output.mfd]```

**Show help**

```mfoc -h```

# SYNOPSIS

**mfoc** [**-h**] [**-k** _KEY_]... [**-P** _NUM_] [**-T** _NUM_] [**-O** _FILE_]

# PARAMETERS

**-O** _FILE_
> Dump card contents to FILE (MFD format).

**-k** _KEY_
> Initially try KEY (12 hex digits) in addition to the default keys. May be specified multiple times.

**-P** _NUM_
> Probe each sector up to NUM times. Default is 20.

**-T** _NUM_
> Set half the range for the distance tolerance to NUM. Default is 20 (total range of 40).

**-h**
> Show summary of options.

# DESCRIPTION

**mfoc** is an open source implementation of the "offline nested" attack originally described by Nethemba. It exploits weaknesses in the Crypto1 cipher of MIFARE Classic cards to recover sector authentication keys, then dumps the full card contents to a file.

At least one sector key (default or user-supplied with **-k**) must already be known; mfoc uses it as a bootstrap to recover the remaining keys via nested authentication. The resulting .mfd dump can be written back to a blank card with tools such as **nfc-mfclassic**.

# CAVEATS

Requires a libnfc-compatible NFC reader (e.g. ACR122U, PN532). Does not work against MIFARE Classic cards with hardened nonces (EV1, Plus in SL1); use mfcuk or mfoc-hardnested for those. Intended strictly for authorized security research on cards you own.

# HISTORY

mfoc (MIFARE Classic Offline Cracker) was released through the nfc-tools project and implements the 2009 nested attack by Nethemba against Crypto1. It is commonly distributed alongside **libnfc** and **mfcuk**.

# SEE ALSO

[mfterm](/man/mfterm)(1)


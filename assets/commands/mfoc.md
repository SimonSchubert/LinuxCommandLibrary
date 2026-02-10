# TAGLINE

cracks MIFARE Classic cards

# TLDR

**Recover keys**

```mfoc -O [output.mfd]```

**Use known keys**

```mfoc -f [keys.txt] -O [output.mfd]```

**Specify reader**

```mfoc -r [0] -O [output.mfd]```

**Verbose output**

```mfoc -v -O [output.mfd]```

**Set probe key**

```mfoc -k [FFFFFFFFFFFF] -O [output.mfd]```

# SYNOPSIS

**mfoc** [_options_] -O _output_

# PARAMETERS

**-O** _FILE_
> Output dump file.

**-f** _FILE_
> Key file to use.

**-k** _KEY_
> Try specific key.

**-r** _NUM_
> Reader number.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mfoc** cracks MIFARE Classic cards. It recovers encryption keys using the nested authentication attack.

The tool is for security research. It dumps card contents after key recovery.

# CAVEATS

Security research tool. Legal use only. Requires NFC reader.

# HISTORY

mfoc (MIFARE Classic Offline Cracker) exploits cryptographic weaknesses in **MIFARE Classic** cards.

# SEE ALSO

[mfterm](/man/mfterm)(1), [nfc-list](/man/nfc-list)(1), [libnfc](/man/libnfc)(1)


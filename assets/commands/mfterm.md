# TLDR

**Start interactive terminal**

```mfterm```

**Load dump file**

```mfterm -l [dump.mfd]```

**Load keys**

```mfterm -k [keys.txt]```

**Read card**

```mfterm -r```

**Write to card**

```mfterm -w [dump.mfd]```

# SYNOPSIS

**mfterm** [_options_]

# PARAMETERS

**-l** _FILE_
> Load dump file.

**-k** _FILE_
> Load key file.

**-r**
> Read card.

**-w** _FILE_
> Write dump to card.

**--help**
> Display help information.

# DESCRIPTION

**mfterm** is an interactive MIFARE terminal. It reads, writes, and manipulates MIFARE Classic cards.

The tool provides commands for sector operations, key management, and data analysis.

mfterm manages MIFARE cards.

# CAVEATS

Security research tool. Requires NFC reader. Legal use only.

# HISTORY

mfterm provides interactive **MIFARE Classic** card manipulation for security research purposes.

# SEE ALSO

[mfoc](/man/mfoc)(1), [nfc-list](/man/nfc-list)(1), [libnfc](/man/libnfc)(1)


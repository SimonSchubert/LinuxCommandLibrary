# TLDR

**List readers**

```opensc-tool --list-readers```

**Show card info**

```opensc-tool --info```

**Show ATR (Answer To Reset)**

```opensc-tool --atr```

**List card files**

```opensc-tool --list-files```

**Send APDU command**

```opensc-tool --send-apdu [00:A4:04:00:00]```

**Verbose output**

```opensc-tool -v --info```

# SYNOPSIS

**opensc-tool** [_options_]

# PARAMETERS

**-l**, **--list-readers**
> List available readers.

**-i**, **--info**
> Card information.

**-a**, **--atr**
> Show ATR.

**-s**, **--send-apdu** _apdu_
> Send APDU.

**--list-files**
> List files on card.

**-r** _reader_
> Use specific reader.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**opensc-tool** is a diagnostic tool for smart cards. It can query card readers, retrieve card information, and send raw APDU commands for testing and debugging.

Part of the OpenSC project for smart card support on Unix systems.

# EXAMPLE

```bash
# Check for card
opensc-tool --list-readers
# Reader 0: Alcor Micro AU9540

# Get card info
opensc-tool --info
# Card type: PIV-II
```

# CAVEATS

Requires PC/SC daemon (pcscd). Card must be inserted. Some commands require PIN.

# HISTORY

OpenSC was started to provide open-source smart card support on Unix systems, supporting PKCS#11 and cryptographic operations.

# SEE ALSO

[pkcs15-tool](/man/pkcs15-tool)(1), [pkcs11-tool](/man/pkcs11-tool)(1), [pcscd](/man/pcscd)(8)

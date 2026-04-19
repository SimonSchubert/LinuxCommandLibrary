# TAGLINE

diagnostic tool for smart cards

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
> List all configured readers.

**-i**, **--info**
> Print information about OpenSC (version and enabled components).

**-a**, **--atr**
> Print the Answer To Reset (ATR) of the card in hex.

**-s** _apdu_, **--send-apdu** _apdu_
> Send an arbitrary APDU command to the card.

**-f**, **--list-files**
> Recursively list all files stored on the card.

**--list-algorithms**
> List algorithms supported by the card.

**-r** _reader_, **--reader** _reader_
> Use a specific reader (by number or ATR).

**-n**, **--name**
> Print the name of the inserted card driver.

**--serial**
> Print the card serial number in hex.

**-D**, **--list-drivers**
> List all installed card drivers.

**-c** _driver_, **--card-driver** _driver_
> Use the specified card driver (use '?' to list).

**--reset**
> Reset the card (cold or warm).

**-G** _section:name:key_, **--get-conf-entry**
> Retrieve an opensc.conf configuration value.

**-S** _section:name:key:value_, **--set-conf-entry**
> Set an opensc.conf configuration value.

**-w**, **--wait**
> Wait for a card to be inserted.

**-v**, **--verbose**
> Verbose output (may be specified multiple times for debug).

**--version**
> Display OpenSC package version.

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

[pkcs11-tool](/man/pkcs11-tool)(1)

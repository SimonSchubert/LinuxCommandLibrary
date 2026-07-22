# TAGLINE

manages pairing with iOS devices

# TLDR

**Pair with device**

```idevicepair pair```

**Check pair status**

```idevicepair validate```

**Unpair device**

```idevicepair unpair```

**List paired devices**

```idevicepair list```

**Target specific device**

```idevicepair -u [udid] pair```

# SYNOPSIS

**idevicepair** [_options_] _command_

# PARAMETERS

_COMMAND_
> Operation (pair, validate, unpair, list).

**pair**
> Pair with device.

**validate**
> Check pairing status.

**unpair**
> Remove pairing.

**list**
> List paired devices.

**-u** _UDID_
> Target device.

**--help**
> Display help information.

# DESCRIPTION

**idevicepair** manages pairing with iOS devices. Pairing establishes trust between computer and device.

The tool handles the trust dialog workflow. Pairing is required before most device operations work.

# CAVEATS

Requires device trust approval. Part of libimobiledevice. USB connection needed.

# HISTORY

idevicepair is part of **libimobiledevice** for establishing trusted connections with iOS devices.

# INSTALL

```apt: sudo apt install libimobiledevice-utils```

```dnf: sudo dnf install libimobiledevice-utils```

```apk: sudo apk add libimobiledevice-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [ideviceinfo](/man/ideviceinfo)(1), [idevicename](/man/idevicename)(1)

# TLDR

**Attach** (open) encrypted volume

```systemd-cryptsetup attach [mapping_name] [/dev/sdXY]```

Attach with **options**

```systemd-cryptsetup attach [mapping_name] [/dev/sdXY] none [crypttab_options]```

Attach with **keyfile**

```systemd-cryptsetup attach [mapping_name] [/dev/sdXY] [/path/to/keyfile] [options]```

**Detach** (close) mapping

```systemd-cryptsetup detach [mapping_name]```

# SYNOPSIS

**systemd-cryptsetup** attach _VOLUME_ _DEVICE_ [_KEY_] [_OPTIONS_]

**systemd-cryptsetup** detach _VOLUME_

# DESCRIPTION

**systemd-cryptsetup** creates or removes decrypted mappings of encrypted LUKS volumes. It is the systemd equivalent of `cryptsetup open` and `cryptsetup close`.

Arguments follow the same format as `/etc/crypttab` entries. This tool is primarily used internally by systemd to unlock encrypted devices during boot based on crypttab configuration.

# CAVEATS

Typically called by systemd automatically, not manually. The mapping appears at `/dev/mapper/<name>`. Supports all crypttab options like luks, discard, etc.

# HISTORY

**systemd-cryptsetup** integrates encrypted volume management with systemd's boot process, enabling automatic unlocking based on `/etc/crypttab` configuration.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [crypttab](/man/crypttab)(5), [systemd-cryptenroll](/man/systemd-cryptenroll)(1)

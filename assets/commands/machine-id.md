# TAGLINE

File containing a unique machine identifier

# TLDR

**View machine ID**

```cat /etc/machine-id```

**Initialize machine ID if missing or empty**

```sudo systemd-machine-id-setup```

**Print the machine ID**

```systemd-id128 machine-id```

**Derive an application-specific ID** (safe to expose)

```systemd-id128 machine-id --app-specific=[app_uuid]```

**Check if ID exists**

```test -f /etc/machine-id && echo "exists"```

**Compare machine IDs**

```diff /etc/machine-id /var/lib/dbus/machine-id```

# SYNOPSIS

**/etc/machine-id**

# DESCRIPTION

**machine-id** is a file containing a unique machine identifier established during installation or first boot. It's a single newline-terminated, 32-character lowercase hexadecimal string without hyphens (a 128-bit value, which may not be all zeros).

The ID is used by systemd, D-Bus, and other services to uniquely identify the system. It should be stable across reboots but unique per machine.

# FILE LOCATIONS

```
/etc/machine-id          - Primary location
/var/lib/dbus/machine-id - D-Bus machine ID (commonly a symlink to /etc/machine-id)
```

# GENERATION

```bash
# Regenerate (for cloned systems). Remove the D-Bus copy too,
# otherwise systemd-machine-id-setup reuses it
rm -f /etc/machine-id /var/lib/dbus/machine-id
systemd-machine-id-setup

# Or manually
dbus-uuidgen --ensure=/etc/machine-id
```

# CAVEATS

Should be unique per machine. Clone VMs need new IDs. Images used on multiple machines should ship the file empty or missing, so an ID is generated at boot; a missing file also marks the boot as a first boot. Some software uses it for licensing. The ID is confidential and must not be exposed on untrusted networks: derive an application-specific ID with a keyed hash instead.

# HISTORY

machine-id was introduced by **systemd** to provide a standard machine identification mechanism, replacing various distribution-specific solutions.

# SEE ALSO

[systemd-machine-id-setup](/man/systemd-machine-id-setup)(1), [systemd-id128](/man/systemd-id128)(1), [systemd-firstboot](/man/systemd-firstboot)(1), [hostnamectl](/man/hostnamectl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/machine-id.html)```

<!-- verified: 2026-11-09 -->

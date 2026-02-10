# TAGLINE

file containing a unique machine identifier established during

# TLDR

**View machine ID**

```cat /etc/machine-id```

**Generate new machine ID**

```systemd-machine-id-setup```

**Check if ID exists**

```test -f /etc/machine-id && echo "exists"```

**Compare machine IDs**

```diff /etc/machine-id /var/lib/dbus/machine-id```

# SYNOPSIS

**/etc/machine-id**

# DESCRIPTION

**machine-id** is a file containing a unique machine identifier established during installation or first boot. It's a 32-character lowercase hexadecimal string without hyphens.

The ID is used by systemd, D-Bus, and other services to uniquely identify the system. It should be stable across reboots but unique per machine.

# FILE LOCATIONS

```
/etc/machine-id          - Primary location
/var/lib/dbus/machine-id - D-Bus symlink
```

# GENERATION

```bash
# Regenerate (for cloned systems)
rm /etc/machine-id
systemd-machine-id-setup

# Or manually
dbus-uuidgen --ensure=/etc/machine-id
```

# CAVEATS

Should be unique per machine. Clone VMs need new IDs. Some software uses it for licensing. Not suitable as cryptographic secret.

# HISTORY

machine-id was introduced by **systemd** to provide a standard machine identification mechanism, replacing various distribution-specific solutions.

# SEE ALSO

[systemd-machine-id-setup](/man/systemd-machine-id-setup)(1), [dbus-uuidgen](/man/dbus-uuidgen)(1), [hostnamectl](/man/hostnamectl)(1)

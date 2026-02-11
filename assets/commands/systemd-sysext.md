# TAGLINE

Manage system extension images

# TLDR

**List** extension images

```systemd-sysext list```

**Merge** extensions into /usr and /opt

```systemd-sysext merge```

Check **status**

```systemd-sysext status```

**Unmerge** all extensions

```systemd-sysext unmerge```

**Refresh** (unmerge and merge)

```systemd-sysext refresh```

# SYNOPSIS

**systemd-sysext** [_OPTIONS_] _COMMAND_

# COMMANDS

**list**
> List installed extension images

**merge**
> Overlay extension images onto /usr and /opt

**unmerge**
> Remove extension overlays

**status**
> Show current merge status

**refresh**
> Unmerge then merge (reload extensions)

# DESCRIPTION

**systemd-sysext** manages system extension images that overlay files onto `/usr/` and `/opt/`. Extensions are read-only images (DDI format) that add software to the base system without modifying the root filesystem.

Extensions are stored in `/var/lib/extensions/` or `/run/extensions/` and are merged using overlayfs.

# CAVEATS

Extensions must match the host OS version. The base /usr must be immutable or read-only for overlay to work. Changes require refresh to take effect.

# HISTORY

**systemd-sysext** enables modular system composition, supporting immutable base images with layered extensions for additional software.

# SEE ALSO

[systemd-confext](/man/systemd-confext)(8), [systemd.sysext](/man/systemd.sysext)(5)

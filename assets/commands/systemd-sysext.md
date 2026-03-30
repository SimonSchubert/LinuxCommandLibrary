# TAGLINE

Manage system extension images

# TLDR

**Show current merge status**

```systemd-sysext status```

**List** installed extension images

```systemd-sysext list```

**Merge** extensions into /usr and /opt

```systemd-sysext merge```

**Unmerge** all extensions

```systemd-sysext unmerge```

**Refresh** (unmerge then merge)

```systemd-sysext refresh```

**Merge ignoring version compatibility checks**

```systemd-sysext merge --force```

# SYNOPSIS

**systemd-sysext** [_OPTIONS_] _COMMAND_

# COMMANDS

**status**
> Show current merge status. Default when invoked without a command.

**list**
> List installed extension images.

**merge**
> Overlay extension images onto /usr and /opt using overlayfs.

**unmerge**
> Remove extension overlays.

**refresh**
> Unmerge then merge (reload extensions after installing or removing images).

# PARAMETERS

**--root=** _PATH_
> Operate relative to the specified root directory.

**--force**
> Ignore version incompatibilities when merging.

**--mutable=** _MODE_
> Set mutability mode (disabled, auto, yes, import, ephemeral, ephemeral-import).

**--no-reload**
> Do not reload daemon after merge, unmerge, or refresh.

**--no-pager**
> Do not pipe output into a pager.

**--no-legend**
> Do not print column headers and footer hints.

**--json=** _MODE_
> Output as JSON (short, pretty, or off).

# DESCRIPTION

**systemd-sysext** manages system extension images that overlay files onto `/usr/` and `/opt/`. Extensions are read-only images (DDI format) that add software to the base system without modifying the root filesystem.

Extensions are stored in `/var/lib/extensions/` or `/run/extensions/` and are merged using overlayfs.

# CAVEATS

Extensions must match the host OS version. The base /usr must be immutable or read-only for overlay to work. Changes require refresh to take effect.

# HISTORY

**systemd-sysext** enables modular system composition, supporting immutable base images with layered extensions for additional software.

# SEE ALSO

[systemd-confext](/man/systemd-confext)(8), [systemctl](/man/systemctl)(1), [portablectl](/man/portablectl)(1), [machinectl](/man/machinectl)(1)

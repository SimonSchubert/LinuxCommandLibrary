# TAGLINE

Hybrid image and package system for immutable OS

# TLDR

Show **deployment status**

```rpm-ostree status```

**Preview** available upgrades

```rpm-ostree upgrade --preview```

**Upgrade** and reboot

```rpm-ostree upgrade -r```

**Rollback** to previous deployment

```rpm-ostree rollback -r```

**Install** package and reboot

```rpm-ostree install [package] -r```

**Install** package and apply **live** without reboot

```rpm-ostree install -A [package]```

**Rebase** to a different image or OS variant

```rpm-ostree rebase [ostree-remote:branch]```

# SYNOPSIS

**rpm-ostree** [**status**|**upgrade**|**rollback**|**install**|**uninstall**] [**-r**] [_options_]

# COMMANDS

**status**
> Show current deployments

**upgrade**
> Download and prepare upgrade

**rollback**
> Switch to previous deployment

**install**
> Layer package on base image

**uninstall**
> Remove layered package

**rebase**
> Switch to different base image

**override** _subcommand_
> Override base packages: `replace`, `remove`, `reset`

**deploy**
> Create new deployment from a specific version/branch/commit

**kargs**
> Manage kernel boot arguments

**initramfs**
> Handle client-side initramfs regeneration

**cleanup**
> Remove pending deployments and cached data

**db** _subcommand_
> RPM database operations (diff, list, version)

**cancel**
> Stop a pending transaction

**apply-live**
> Apply changes to the booted deployment without reboot

**usroverlay**
> Create a transient writable overlay over /usr for temporary testing

# PARAMETERS

**-r, --reboot**
> Reboot after operation

**--preview**
> Show what would be upgraded

**--check**
> Check for updates only

**--cache-only**
> Use only cached data

**--idempotent**
> Skip operation if the request is already applied

**--allow-inactive**
> Permit packages that are already in the base layer

**--apply-live**, **-A**
> Apply changes to the booted deployment without reboot (install/uninstall only)

**--force-replacefiles**
> Allow overwriting files owned by other packages when installing

**--download-only**
> Fetch packages without deploying

**-n**, **--dry-run**
> Preview changes without executing

**--json**
> Output in JSON format (status command)

# DESCRIPTION

**rpm-ostree** combines OSTree image-based deployment with RPM package layering. It manages immutable base images while allowing package customization, used by Fedora Silverblue, CoreOS, and similar systems.

Changes create new deployments rather than modifying the running system. Multiple deployments can coexist, enabling easy rollback to previous states.

# CAVEATS

Changes require reboot to take effect. Base system is immutable. Package layering has overhead. Some packages may conflict with immutable model.

# HISTORY

**rpm-ostree** was developed by Red Hat to combine the reliability of OSTree image deployment with the flexibility of RPM package management for container-focused and immutable desktop distributions.

# SEE ALSO

[ostree](/man/ostree)(1), [rpm](/man/rpm)(8), [flatpak](/man/flatpak)(1)

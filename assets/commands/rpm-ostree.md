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

**override**
> Override base packages

# PARAMETERS

**-r, --reboot**
> Reboot after operation

**--preview**
> Show what would be upgraded

**--check**
> Check for updates only

**--cache-only**
> Use only cached data

# DESCRIPTION

**rpm-ostree** combines OSTree image-based deployment with RPM package layering. It manages immutable base images while allowing package customization, used by Fedora Silverblue, CoreOS, and similar systems.

Changes create new deployments rather than modifying the running system. Multiple deployments can coexist, enabling easy rollback to previous states.

# CAVEATS

Changes require reboot to take effect. Base system is immutable. Package layering has overhead. Some packages may conflict with immutable model.

# HISTORY

**rpm-ostree** was developed by Red Hat to combine the reliability of OSTree image deployment with the flexibility of RPM package management for container-focused and immutable desktop distributions.

# SEE ALSO

[ostree](/man/ostree)(1), [rpm](/man/rpm)(8), [flatpak](/man/flatpak)(1)

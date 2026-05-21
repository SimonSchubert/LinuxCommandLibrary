# TAGLINE

DNF plugin for offline Fedora major-version upgrades

# TLDR

**Download** all packages for the target release

```sudo dnf system-upgrade download --releasever=[40]```

**Reboot** and apply the staged upgrade

```sudo dnf system-upgrade reboot```

**Allow erasing** packages blocking dependency resolution (e.g. stale third-party repos)

```sudo dnf system-upgrade download --releasever=[40] --allowerasing```

**Cancel** a staged upgrade and clean cached data

```sudo dnf system-upgrade clean```

**Check the status** of a pending upgrade

```dnf system-upgrade status```

**View logs** of a previous upgrade attempt

```sudo dnf system-upgrade log --number=[-1]```

# SYNOPSIS

**dnf system-upgrade** _subcommand_ [_options_]

# PARAMETERS

**download**
> Download all packages needed for the upgrade and stage them for the next boot.

**reboot**
> Trigger a reboot into the offline upgrade environment that performs the transaction.

**clean**
> Remove cached packages and the saved transaction state.

**status**
> Print the state of the current pending upgrade (no upgrade, download complete, etc).

**log**
> List previous upgrade attempts; with **--number** _N_ show journal output for that boot (commonly **-1** for the last).

**--releasever=**_VER_
> Set the Fedora release version to upgrade to (e.g. **40**, **41**).

**--allowerasing**
> Permit DNF to remove packages whose dependencies cannot be satisfied on the new release.

**--best**
> Try to use the best available package versions, failing if not possible.

**--nogpgcheck**
> Skip GPG signature verification (not recommended).

# DESCRIPTION

**dnf system-upgrade** is a DNF plugin used to perform major version upgrades of Fedora and other RPM-based distributions in an offline manner. Instead of upgrading the system while it runs, the plugin downloads every required package and then reboots into a dedicated systemd target where the transaction is applied with no user processes active.

The workflow is three stages: **download** stages packages and verifies dependencies; **reboot** restarts the machine into the offline upgrade environment; on completion the system reboots again into the new release. **clean** discards the staged transaction if the upgrade is aborted.

The plugin also exposes **offline-upgrade** and **offline-distrosync** subcommands which apply the same offline mechanism to ordinary updates and distro-syncs rather than to a release change.

# CAVEATS

The reboot phase rewrites the live root filesystem; the machine must be on stable power and not interrupted, or the system may be left unbootable. Third-party repositories often lag a release behind, so **--allowerasing** is frequently required. The plugin only supports going forward; downgrades between releases are not safe. Skipping a release (e.g. 39 to 41) is officially unsupported, even when it appears to work.

# HISTORY

The plugin originated as **fedup** in **2012** for Fedora 18, providing the first supported in-place upgrade path. It was rewritten as **dnf-plugin-system-upgrade** in **2015** for Fedora 23 to integrate with DNF, and folded into **dnf-plugins-extras**. In **2024** the plugin became a first-class component of **dnf5** shipping with Fedora 41.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [systemctl](/man/systemctl)(1), [rpm](/man/rpm)(8)

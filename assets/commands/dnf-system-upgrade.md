# TAGLINE

Offline Fedora major-version upgrades with DNF

# TLDR

**Update the current release** first (recommended)

```sudo dnf --refresh upgrade```

**Download** all packages for the target release

```sudo dnf system-upgrade download --releasever=[45]```

**Reboot** and apply the staged upgrade

```sudo dnf system-upgrade reboot```

**Allow erasing** packages blocking dependency resolution (e.g. stale third-party repos)

```sudo dnf system-upgrade download --releasever=[45] --allowerasing```

**Cancel** a staged upgrade and clean cached data

```sudo dnf system-upgrade clean```

**Check the status** of a pending upgrade (dnf5)

```dnf offline status```

**Power off** instead of rebooting after the upgrade completes (dnf5)

```sudo dnf system-upgrade reboot --poweroff```

**View logs** of a previous upgrade attempt

```sudo dnf system-upgrade log --number=[-1]```

# SYNOPSIS

**dnf system-upgrade** _subcommand_ [_options_]

# PARAMETERS

**download**
> Download all packages needed for the upgrade and stage them for the next boot.

**reboot**
> Trigger a reboot into the offline upgrade environment that performs the transaction. With **--poweroff** (dnf5), power off afterwards instead of rebooting.

**clean**
> Remove cached packages and the saved transaction state.

**status**
> Print the state of the pending upgrade. Only in the dnf4 plugin; with dnf5 use **dnf offline status**.

**log**
> List previous upgrade attempts; with **--number** _N_ show journal output for that boot (commonly **-1** for the last).

**--releasever=**_VER_
> Set the Fedora release version to upgrade to (e.g. **45**, or **rawhide**). Required for **download**.

**--allowerasing**
> Permit DNF to remove packages whose dependencies cannot be satisfied on the new release.

**--no-downgrade**
> Behave like **dnf upgrade**: don't install packages from the new release that are older than the installed ones. The default behaves like **distro-sync**.

**--poweroff**
> With **reboot**: power off after the transaction completes (dnf5).

# DESCRIPTION

**dnf system-upgrade** is the DNF command used to perform major version upgrades of Fedora and other RPM-based distributions in an offline manner. Instead of upgrading the system while it runs, the plugin downloads every required package and then reboots into a dedicated systemd target where the transaction is applied with no user processes active.

The workflow is three stages: **download** stages packages and verifies dependencies; **reboot** restarts the machine into the offline upgrade environment; on completion the system reboots again into the new release. **clean** discards the staged transaction if the upgrade is aborted.

On Fedora 41 and later, **dnf** is **dnf5**, where system-upgrade is built in: **download** is its own subcommand, while **reboot**, **clean** and **log** are shared with the **dnf offline** command, which also handles transactions started with **--offline** on any operation (e.g. **dnf upgrade --offline**). On Fedora 40 and older, the dnf4 plugin (from **dnf-plugins-core**) provides the same workflow plus **status**, **offline-upgrade** and **offline-distrosync**.

# CAVEATS

The reboot phase rewrites the live root filesystem; the machine must be on stable power and not interrupted, or the system may be left unbootable. Third-party repositories often lag a release behind, so **--allowerasing** is frequently required. The plugin only supports going forward; downgrades between releases are not safe. Fedora supports upgrading across at most two releases at once (e.g. 43 to 45); upgrading the current release first and backing up data is recommended. Setting **DNF_SYSTEM_UPGRADE_NO_REBOOT** prevents dnf5 from rebooting.

# HISTORY

The plugin originated as **fedup** in **2012** for Fedora 18, providing the first supported in-place upgrade path. It was rewritten as **dnf-plugin-system-upgrade** in **2015** for Fedora 23 to integrate with DNF, and kept in **dnf-plugins-extras** (later **dnf-plugins-core**). In **2024** the plugin became a first-class component of **dnf5** shipping with Fedora 41.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [systemctl](/man/systemctl)(1), [rpm](/man/rpm)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf5)```

```[Documentation](https://dnf5.readthedocs.io/en/latest/commands/system-upgrade.8.html)```

```[Homepage](https://docs.fedoraproject.org/en-US/quick-docs/upgrading-fedora-offline/)```

<!-- verified: 2026-11-23 -->

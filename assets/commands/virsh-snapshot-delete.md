# TAGLINE

delete a libvirt domain snapshot

# TLDR

Delete a named **snapshot**

```virsh snapshot-delete [domain] [snapshot]```

Delete the **current** snapshot

```virsh snapshot-delete [domain] --current```

Delete a snapshot **and its children**

```virsh snapshot-delete [domain] [snapshot] --children```

Delete **only children**, keep this snapshot

```virsh snapshot-delete [domain] [snapshot] --children-only```

Remove **libvirt metadata** only (leave disk snapshot files)

```virsh snapshot-delete [domain] [snapshot] --metadata```

# SYNOPSIS

**virsh** **snapshot-delete** _domain_ {_snapshot_ | **--current**} [_--metadata_] [{**--children** | **--children-only**}]

# PARAMETERS

_snapshot_ | **--current**
> Snapshot to delete, or the domain's current snapshot.

**--children**
> Also delete descendant snapshots. Mutually exclusive with **--children-only**.

**--children-only**
> Delete descendants but keep this snapshot.

**--metadata**
> Delete only libvirt's snapshot metadata; leave the underlying snapshot data for other tools.

# DESCRIPTION

**virsh snapshot-delete** removes a snapshot from a domain. If the snapshot has children and you do not pass **--children** / **--children-only**, libvirt merges this snapshot's changes into the children so the remaining tree stays consistent.

Without **--metadata**, deleting a snapshot also drops the data for that point in time (internal snapshot content or managed files). With **--metadata**, only libvirt's record is removed.

This is a **virsh** subcommand, not a separate binary.

# CAVEATS

Destructive: snapshot contents are gone unless you used **--metadata** or an external file you keep. Deleting the current snapshot moves "current" to a parent or another snapshot. External qemu snapshots can leave backing-file chains that **qemu-img** still needs to manage. Needs libvirtd access, usually with privileges to change storage.

# HISTORY

Part of **libvirt** snapshot support in **virsh**.

# INSTALL

```apt: sudo apt install libvirt-clients```

```dnf: sudo dnf install libvirt-client```

```apk: sudo apk add libvirt-client```

```zypper: sudo zypper install libvirt-client```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-snapshot-list](/man/virsh-snapshot-list)(1), [virsh-snapshot-dumpxml](/man/virsh-snapshot-dumpxml)(1)

# RESOURCES

```[Documentation](https://libvirt.org/manpages/virsh.html#snapshot-delete)```

```[Homepage](https://libvirt.org/)```

<!-- verified: 2026-08-26 -->

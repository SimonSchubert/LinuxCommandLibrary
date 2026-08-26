# TAGLINE

list libvirt snapshots for a domain

# TLDR

List snapshots for a **domain**

```virsh snapshot-list [domain]```

Show **parent** snapshot names

```virsh snapshot-list --parent [domain]```

Print a **tree** of snapshot names

```virsh snapshot-list --tree [domain]```

List only **leaf** snapshots (no children)

```virsh snapshot-list --leaves [domain]```

Start from the **current** snapshot and list descendants

```virsh snapshot-list --current --descendants [domain]```

Names only, in **topological** order

```virsh snapshot-list --name --topological [domain]```

# SYNOPSIS

**virsh** **snapshot-list** _domain_ [_options_]

# PARAMETERS

**--parent**
> Add a parent-name column.

**--roots**
> Only snapshots with no parent.

**--tree**
> Tree of names (implies descendants when combined with **--from** / **--current**). Mutually exclusive with **--parent** and **--roots**.

**--name**
> Print names only (optionally tab-separated parent with **--parent**). Mutually exclusive with **--tree**.

**--topological**
> Sort so no child appears before its ancestors.

**--from** _snapshot_ / **--current**
> Filter to children of that snapshot (add **--descendants** for the full subtree).

**--leaves** / **--no-leaves**
> Filter to snapshots without / with children.

**--metadata** / **--no-metadata**
> Filter by whether libvirt stores snapshot metadata.

**--inactive** / **--active** / **--disk-only** / **--internal** / **--external**
> Filter by snapshot kind and domain state at snapshot time.

# DESCRIPTION

**virsh snapshot-list** shows snapshots libvirt knows for a domain: name, creation time, and domain state by default. Snapshots form a tree; **--tree** and **--parent** make that visible before **snapshot-revert** or **snapshot-delete**.

This is a **virsh** subcommand, not a separate binary.

# CAVEATS

External or `--no-metadata` snapshots may exist on disk without appearing here. Combining incompatible filters can error or return empty. Needs libvirtd access.

# HISTORY

Part of **libvirt** snapshot support in **virsh**.

# INSTALL

```apt: sudo apt install libvirt-clients```

```dnf: sudo dnf install libvirt-client```

```apk: sudo apk add libvirt-client```

```zypper: sudo zypper install libvirt-client```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-snapshot-dumpxml](/man/virsh-snapshot-dumpxml)(1), [virsh-snapshot-delete](/man/virsh-snapshot-delete)(1), [virsh-list](/man/virsh-list)(1)

# RESOURCES

```[Documentation](https://libvirt.org/manpages/virsh.html#snapshot-list)```

```[Homepage](https://libvirt.org/)```

<!-- verified: 2026-08-26 -->

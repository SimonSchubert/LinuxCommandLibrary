# TAGLINE

List libvirt virtual machines

# TLDR

**List running domains**

```virsh list```

**List all domains**

```virsh list --all```

**List all with title column**

```virsh list --all --title```

**List only shut off domains**

```virsh list --state-shutoff```

**List domains with autostart info**

```virsh list --all --autostart```

**List domains matching a name pattern**

```virsh list --all --name | grep [pattern]```

# SYNOPSIS

**virsh** **list** [_options_]

# PARAMETERS

**--all**
> Include inactive domains.

**--state-running**
> Only running.

**--state-paused**
> Only paused.

**--state-shutoff**
> Only shut off.

**--title**
> Show titles.

**--autostart**
> Show autostart status.

**--name**
> Show only domain names (one per line).

**--uuid**
> Show only domain UUIDs.

**--id**
> Show only domain IDs.

**--managed-save**
> Show managed save state.

**--with-managed-save**
> Only list domains with managed save state.

**--without-managed-save**
> Only list domains without managed save state.

**--state-other**
> Only list domains in other states (crashed, dying).

# DESCRIPTION

**virsh list** displays virtual machines managed by libvirt. Shows domain ID, name, and state. By default only shows running VMs; use `--all` for a complete list including inactive domains. The domain ID is only assigned to running domains.

# CAVEATS

Domain IDs are assigned dynamically and change each time a domain is started. Use domain names or UUIDs for stable references in scripts.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-help](/man/virsh-help)(1), [virt-manager](/man/virt-manager)(1)


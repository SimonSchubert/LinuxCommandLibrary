# TAGLINE

List libvirt virtual machines

# TLDR

**List running domains**

```virsh list```

**List all domains** including inactive

```virsh list --all```

**List all with title column**

```virsh list --all --title```

**List only shut off domains**

```virsh list --state-shutoff```

**List domains with autostart info**

```virsh list --all --autostart```

**List only domain names** (one per line)

```virsh list --all --name```

**List inactive domains only**

```virsh list --inactive```

# SYNOPSIS

**virsh** **list** [_options_]

# PARAMETERS

**--all**
> Include inactive domains.

**--inactive**
> List only inactive (shut off) domains.

**--state-running**
> List only running domains.

**--state-paused**
> List only paused domains.

**--state-shutoff**
> List only shut off domains.

**--state-other**
> List only domains in other states (crashed, dying, pmsuspended).

**--transient**
> List only transient domains (not persistently defined).

**--title**
> Show domain titles column.

**--autostart**
> Show autostart status column.

**--no-autostart**
> List only domains not configured for autostart.

**--name**
> Show only domain names (one per line).

**--uuid**
> Show only domain UUIDs.

**--id**
> Show only domain IDs.

**--managed-save**
> Show managed save state.

**--with-managed-save**
> List only domains with managed save state.

**--without-managed-save**
> List only domains without managed save state.

# DESCRIPTION

**virsh list** displays virtual machines managed by libvirt. Shows domain ID, name, and state. By default only shows running VMs; use `--all` for a complete list including inactive domains. The domain ID is only assigned to running domains.

# CAVEATS

Domain IDs are assigned dynamically and change each time a domain is started. Use domain names or UUIDs for stable references in scripts.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-help](/man/virsh-help)(1), [virt-manager](/man/virt-manager)(1)


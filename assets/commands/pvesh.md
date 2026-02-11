# TAGLINE

Command-line Proxmox REST API access

# TLDR

List available **nodes**

```pvesh get /nodes```

Display detailed information about **containers or VMs**

```pvesh get /nodes/[node_name]/[lxc|qemu]```

**Discover** API paths

```pvesh ls /```

Display API path **usage instructions**

```pvesh usage /pools```

**Add** a new thinpool storage

```pvesh create /storage --storage [storage_id] --vgname [volume_group] --type lvmthin --thinpool [thinpool_name] --content [content_types]```

# SYNOPSIS

**pvesh** _command_ _path_ [_options_]

# PARAMETERS

**get**, **g**
> Retrieve data from API path

**ls**, **l**
> List available subpaths

**usage**, **u**
> Show usage information for API path

**create**
> Create new resource at API path

**set**
> Modify existing resource

**delete**
> Remove resource at API path

**--output-format** _format_
> Output format (text, json, json-pretty)

# DESCRIPTION

**pvesh** provides direct command-line access to the Proxmox VE REST API. It allows querying and modifying all cluster resources including nodes, VMs, containers, storage, and users. This is useful for scripting and automation tasks.

The tool mirrors the web interface's capabilities, enabling administrators to perform any operation available through the GUI from the command line or scripts.

# CAVEATS

Requires root privileges or appropriate Proxmox permissions. API paths match the web interface structure. Complex operations may require multiple API calls.

# HISTORY

Part of **Proxmox VE**, providing CLI access to the same API used by the web interface. Essential for automation, scripting, and headless administration of Proxmox clusters.

# SEE ALSO

[qm](/man/qm)(1), [pct](/man/pct)(1), [pvesm](/man/pvesm)(1), [pveum](/man/pveum)(1)

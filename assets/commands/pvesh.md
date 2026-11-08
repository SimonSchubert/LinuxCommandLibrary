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

**get** _path_
> Retrieve data from API path

**ls** _path_
> List available subpaths

**usage** _path_ [**--command** _method_] [**-v**]
> Show usage information for API path

**create** _path_
> Call API POST on path

**set** _path_
> Call API PUT on path

**delete** _path_
> Call API DELETE on path

**--output-format** _format_
> Output format: text (default), json, json-pretty, yaml

**--noborder**, **--noheader**
> Omit table borders or column headers in text output

**--human-readable** _0|1_
> Render values as human-readable text (default 1)

**--quiet**
> Suppress printing results

**--noproxy**
> Disable automatic proxying to other cluster nodes

# DESCRIPTION

**pvesh** invokes Proxmox VE API functions directly from the command line, without going through the REST/HTTPS server. It allows querying and modifying all cluster resources including nodes, VMs, containers, storage, and users. This is useful for scripting and automation tasks.

The tool mirrors the web interface's capabilities, enabling administrators to perform any operation available through the GUI from the command line or scripts.

# CAVEATS

Only root is allowed to run pvesh. API paths match the web interface structure. Complex operations may require multiple API calls.

# HISTORY

Part of **Proxmox VE**, providing CLI access to the same API used by the web interface. Essential for automation, scripting, and headless administration of Proxmox clusters.

# SEE ALSO

[qm](/man/qm)(1), [pct](/man/pct)(1), [pvesm](/man/pvesm)(1), [pveum](/man/pveum)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-manager.git)```

```[Documentation](https://pve.proxmox.com/pve-docs/pvesh.1.html)```

<!-- verified: 2026-11-08 -->

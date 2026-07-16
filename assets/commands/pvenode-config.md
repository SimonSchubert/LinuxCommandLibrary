# TAGLINE

get or set Proxmox VE node configuration options

# TLDR

**Get** all node configuration options

```pvenode config get```

Get a **specific property**

```pvenode config get --property description```

Set the node **description** (notes panel)

```pvenode config set --description "primary cluster node"```

Configure **ACME** domains for TLS certificates

```pvenode config set --acme domains=pve.example.com```

Set **Wake-on-LAN** MAC address

```pvenode config set --wakeonlan XX:XX:XX:XX:XX:XX```

Set first guest **boot delay** in seconds

```pvenode config set --startall-onboot-delay 10```

Set RAM **ballooning target** percent

```pvenode config set --ballooning-target 90```

# SYNOPSIS

**pvenode config get** [_OPTIONS_]

**pvenode config set** [_OPTIONS_]

# PARAMETERS

**--property** _name_
> (get) Return only a specific property: acme, acmedomain0–5, ballooning-target, description, location, startall-onboot-delay, wakeonlan (default: all)

**--description** _text_
> (set) Node description shown in the web UI notes panel

**--acme** _settings_
> (set) Node-specific ACME settings (account, domains)

**--acmedomain**_n_ _settings_
> (set) ACME domain and validation plugin for domain index n

**--ballooning-target** _percent_
> (set) RAM usage target for ballooning, 0–100 (default 80)

**--startall-onboot-delay** _seconds_
> (set) Delay before starting on-boot guests after host boot, 0–300 (default 0)

**--wakeonlan** _settings_
> (set) Wake-on-LAN MAC and optional bind interface / broadcast address

**--location** _settings_
> (set) Node location (latitude, longitude, optional name)

**--delete** _list_
> (set) Settings to remove

**--digest** _hash_
> (set) Prevent concurrent modifications if config digest differs

# DESCRIPTION

**pvenode config** reads and writes node-level configuration for a Proxmox VE host. Settings include notes/description, ACME certificate domains, Wake-on-LAN, automatic guest start delay, memory ballooning target, and geographic location metadata.

These options affect the local node (not cluster-wide datacenter config). Certificate-related ACME domain settings work together with **pvenode acme** commands to order and renew TLS certificates used by the API and web UI.

# CAVEATS

Changing ACME domains does not by itself issue a certificate; you still need **pvenode acme cert order** (and typically a **pveproxy** restart). Concurrent edits can race; use **--digest** when scripting. Incorrect Wake-on-LAN settings will prevent remote power-on of sleeping nodes.

# HISTORY

**pvenode config** is part of the **Proxmox VE** **pvenode** node management tool.

# SEE ALSO

[pvesubscription](/man/pvesubscription)(1), [pveversion](/man/pveversion)(1), [pvesh](/man/pvesh)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pvenode.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-16 -->

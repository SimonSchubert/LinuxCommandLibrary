# TAGLINE

Proxmox VE subscription key manager

# TLDR

**Show** current subscription info

```pvesubscription get```

**Set** a subscription key

```pvesubscription set pveXc-xxxxxxxxxx```

**Update** subscription info from the server

```pvesubscription update```

Force refresh even if local cache is valid

```pvesubscription update --force```

**Delete** the subscription key from this node

```pvesubscription delete```

# SYNOPSIS

**pvesubscription** _COMMAND_ [_ARGS_] [_OPTIONS_]

# PARAMETERS

**get**
> Read subscription info for this node

**set** _key_
> Set the Proxmox VE subscription key

**update**
> Refresh subscription info from the license server

**--force**
> With **update**: always contact the server even if the local cache is still valid

**delete**
> Remove the subscription key from this node

**help**
> Show help for pvesubscription or a subcommand

# DESCRIPTION

**pvesubscription** manages the Proxmox VE subscription key on a node. A valid subscription enables access to the enterprise package repositories and official support channels. Without a subscription, nodes commonly use the free no-subscription repositories instead.

The tool can install or remove a key, display current status, and refresh validation data from Proxmox servers. Offline key handling is reserved for internal use; for offline environments Proxmox documents separate offline mirror tooling.

# CAVEATS

Subscription keys are node-specific and should not be shared across unrelated machines. Removing a key or running without a subscription does not remove Proxmox VE itself, but enterprise repo access and support entitlements change. Always verify repository configuration after changing subscription status.

# HISTORY

**pvesubscription** is part of the **Proxmox VE** administration CLI suite for managing commercial subscription licenses.

# SEE ALSO

[pvenode-config](/man/pvenode-config)(1), [pveversion](/man/pveversion)(1), [apt](/man/apt)(8)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pvesubscription.1.html)```

```[Homepage](https://www.proxmox.com)```

<!-- verified: 2026-07-16 -->

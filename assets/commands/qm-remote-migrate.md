# TAGLINE

Migrate a Proxmox VM to a remote host or cluster

# TLDR

Move a **stopped** virtual machine to a remote cluster

```qm remote-migrate [vmid] [target_vmid] 'apitoken=PVEAPIToken=[user]@[realm]![token]=[secret],host=[address],fingerprint=[fingerprint]' --target-bridge [bridge] --target-storage [storage]```

Move it **while it keeps running**

```qm remote-migrate [vmid] [target_vmid] 'apitoken=PVEAPIToken=[user]@[realm]![token]=[secret],host=[address],fingerprint=[fingerprint]' --target-bridge [bridge] --target-storage [storage] --online```

Reach an API listening on a **non-standard port**

```qm remote-migrate [vmid] [target_vmid] 'apitoken=PVEAPIToken=[user]@[realm]![token]=[secret],host=[address],fingerprint=[fingerprint],port=[8006]' --target-bridge [bridge] --target-storage [storage]```

Keep the **same bridge and storage names** on the far side

```qm remote-migrate [vmid] [target_vmid] 'apitoken=PVEAPIToken=[user]@[realm]![token]=[secret],host=[address],fingerprint=[fingerprint]' --target-bridge 1 --target-storage 1```

**Throttle** the transfer so it does not saturate the link

```qm remote-migrate [vmid] [target_vmid] 'apitoken=PVEAPIToken=[user]@[realm]![token]=[secret],host=[address],fingerprint=[fingerprint]' --target-bridge [bridge] --target-storage [storage] --bwlimit [value]```

**Remove the source** machine once the copy succeeds

```qm remote-migrate [vmid] [target_vmid] 'apitoken=PVEAPIToken=[user]@[realm]![token]=[secret],host=[address],fingerprint=[fingerprint]' --target-bridge [bridge] --target-storage [storage] --delete 1```

# SYNOPSIS

**qm remote-migrate** _vmid_ _target-vmid_ _target-endpoint_ [_OPTIONS_]

# PARAMETERS

**vmid**
> Source virtual machine ID on the local cluster

**target-vmid**
> Destination VM ID on the remote cluster (may match source)

**target-endpoint**
> Remote connection string: API token, host, TLS fingerprint (optional port)

**--target-bridge** _bridge_|_1_
> Map network bridges; `1` keeps source bridge names

**--target-storage** _storage_|_1_
> Map storage; `1` keeps source storage names

**--online**
> Perform online/live migration for a running VM

**--delete** _0|1_
> Remove the source VM after a successful migration

**--bwlimit** _kbps_
> Bandwidth limit for the transfer

# DESCRIPTION

**qm remote-migrate** migrates a virtual machine from the local Proxmox VE cluster to a **remote** host or cluster over the Proxmox API. Unlike `qm migrate` (intra-cluster), remote migration uses an API token and host fingerprint for authentication and TLS verification.

You must supply bridge and storage mapping so network and disks land on valid remote resources. Live migration (`--online`) moves a running guest with reduced downtime when the environments support it.

# CAVEATS

Requires a valid **API token** with sufficient privileges on the remote side and a matching TLS **fingerprint**. Network capacity and storage compatibility dominate transfer time. Test mappings carefully; wrong bridge/storage targets fail mid-migration. Treat API tokens as secrets.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management, enabling cross-cluster VM moves without shared cluster membership.

# SEE ALSO

[qm](/man/qm)(1), [qm-migrate](/man/qm-migrate)(1), [pvecm](/man/pvecm)(1)

# RESOURCES

```[Homepage](https://www.proxmox.com)```

```[Documentation](https://pve.proxmox.com/pve-docs/qm.1.html)```

<!-- verified: 2026-07-28 -->

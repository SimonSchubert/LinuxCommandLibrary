# TLDR

Start PR on all PVs in a VG with a **local key** (exclusive access by default)

```lvmpersist start --ourkey [0x1234abcd] --vg [vg_name]```

Start PR for a **shared VG** (allow multiple hosts)

```lvmpersist start --ourkey [0x1234abcd] --access sh --vg [vg_name]```

**Stop PR** on a VG and unregister the local key

```lvmpersist stop --ourkey [0x1234abcd] --vg [vg_name]```

**Take over** a local VG by preempting another host while starting PR

```lvmpersist start --ourkey [0xmy_key] --removekey [0xother_key] --vg [vg_name]```

**Remove another host's key** from a shared VG

```lvmpersist remove --ourkey [0xmy_key] --removekey [0xother_key] --vg [vg_name]```

**Show registered keys** and reservations for a VG

```lvmpersist read --vg [vg_name]```

Operate on **specific devices** instead of a VG

```lvmpersist start --ourkey [0x1234abcd] --device [/dev/sdX] --device [/dev/mapper/mpathY]```

# SYNOPSIS

**lvmpersist** _command_ [_options_]

# PARAMETERS

**start**
> Register a key and create a persistent reservation

**stop**
> Release reservation and unregister the key

**remove**
> Remove another host's key from devices

**read**
> Display registered keys and current reservations

**--ourkey _key_**
> The local host's reservation key (hexadecimal)

**--removekey _key_**
> Another host's key to preempt or remove

**--vg _vg_name_**
> Operate on all physical volumes in the specified volume group

**--device _device_**
> Operate on a specific device (can be repeated)

**--access _type_**
> Reservation type: ex (exclusive) or sh (shared)

# DESCRIPTION

**lvmpersist** manages SCSI persistent reservations (PR) on block devices used as LVM physical volumes. Persistent reservations prevent multiple hosts from simultaneously accessing shared storage, protecting against data corruption in clustered or failover configurations.

The tool can establish exclusive reservations (one host owns access) or shared reservations (multiple hosts coordinate access). Keys identify each host, and reservations can be preempted if a host fails or needs to be forcibly removed.

Common use cases include SAN-based clusters, high-availability failover pairs, and shared storage environments where fencing is required.

# CAVEATS

Requires SCSI devices that support persistent reservations (SCSI-3 PR). Not all storage arrays implement PR identically; test in your environment. Improper use can cause data loss in shared storage environments. Requires root privileges.

# SEE ALSO

[lvm](/man/lvm)(8), [sg_persist](/man/sg_persist)(8), [vgchange](/man/vgchange)(8), [lvmlockd](/man/lvmlockd)(8)

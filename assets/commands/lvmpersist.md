# TAGLINE

Manage SCSI persistent reservations on LVM physical volumes

# TLDR

Reserve every physical volume in a group for **this host alone**

```lvmpersist start --ourkey [0x1234abcd] --vg [vg_name]```

Reserve them so **several hosts may write**, as a cluster filesystem needs

```lvmpersist start --ourkey [0x1234abcd] --access sh --vg [vg_name]```

Reserve **named devices** rather than a whole group

```lvmpersist start --ourkey [0x1234abcd] --device [/dev/sdb] --device [/dev/mapper/mpatha]```

Show the **keys and reservations** currently held

```lvmpersist read --vg [vg_name]```

**Seize** a group from a host that has failed

```lvmpersist start --ourkey [0xmykey] --removekey [0xotherkey] --vg [vg_name]```

**Evict one host** from a shared reservation

```lvmpersist remove --ourkey [0xmykey] --removekey [0xotherkey] --vg [vg_name]```

**Release** the reservation and unregister this host's key

```lvmpersist stop --ourkey [0x1234abcd] --vg [vg_name]```

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

# INSTALL

```dnf: sudo dnf install lvm2```

```pacman: sudo pacman -S lvm2```

```apk: sudo apk add lvm2```

```zypper: sudo zypper install lvm2```

```nix: nix profile install nixpkgs#lvm2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lvm](/man/lvm)(8), [vgchange](/man/vgchange)(8), [pvcreate](/man/pvcreate)(8), [pvs](/man/pvs)(8)

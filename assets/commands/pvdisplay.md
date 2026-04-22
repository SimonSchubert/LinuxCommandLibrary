# TAGLINE

show detailed information about LVM physical volumes

# TLDR

**Show every physical volume**

```sudo pvdisplay```

**Show one specific PV**

```sudo pvdisplay [/dev/sda2]```

**Include the map of physical extents** to logical volumes

```sudo pvdisplay --maps [/dev/sda2]```

**Short / columnar output**

```sudo pvdisplay -s```

**Only show PVs in a given volume group**

```sudo pvdisplay --select "vg_name=[vg0]"```

**Display sizes in human units** (rather than default 2-decimal MiB)

```sudo pvdisplay --units h```

**JSON-formatted output**

```sudo pvdisplay --reportformat json```

# SYNOPSIS

**pvdisplay** [_options_] [_PhysicalVolume_...]

**pvdisplay** **-c** | **--columns** [_options_] [_PhysicalVolume_...]

# PARAMETERS

_PhysicalVolume_
> Device path (e.g. `/dev/sda2`, `/dev/nvme0n1p3`). Without any, all PVs are listed.

**-v**, **--verbose**
> Print more detail (repeatable: `-vv`, `-vvv` for more).

**-m**, **--maps**
> Show the mapping of physical extents on this PV to the logical extents of each LV that uses it.

**-s**, **--short**
> Short-form output — just name and size.

**-c**, **--colon**
> Output as a colon-separated single line per PV (scriptable).

**-C**, **--columns**
> Alias for running `pvs(8)`-style columnar output.

**--units** _u_
> Report sizes in units _u_: `b`, `k`/`K`, `m`/`M`, `g`/`G`, `t`/`T`, `h` (human). Lower-case = SI (powers of 1000); upper-case = IEC (powers of 1024).

**--select** _SELECTION_
> Filter to PVs matching a selection expression (e.g. `vg_name=vg0`, `pv_size>10g`).

**--reportformat** _FMT_
> `basic`, `json`, or `json_std`.

**--foreign**
> Show PVs owned by other hosts (shared storage).

**--ignorelockingfailure**
> Continue even if file/locking fails (read-only operations).

**--nolocking**
> Disable locking (for debugging / read-only rescue).

**--help**
> Show help.

# DESCRIPTION

**pvdisplay** prints per-PV information: device name, owning volume group, PV size, physical-extent (PE) size, total / free / allocated extent counts, allocation policy, UUID, and status. With `--maps` it also lists which logical-extent ranges of which LVs each PE belongs to — useful when planning evacuations with `pvmove` or sanity-checking device failures.

For scriptable output, prefer `pvs` (short/columnar, tunable column list) or `pvdisplay -c`.

# CAVEATS

Requires root (or `cap_sys_admin`) to read PV metadata. The device must have been initialized with `pvcreate`; otherwise it does not appear. On systems using `lvmlockd`/`sanlock` for shared storage, add `--foreign` to see PVs owned by other hosts. Very large VGs with many snapshots can produce long `--maps` output — page it.

# HISTORY

**pvdisplay** is part of **LVM2**, the in-kernel Logical Volume Manager user-space toolset. LVM2 is maintained by **Red Hat** and distributed under the GPL.

# SEE ALSO

[pvs](/man/pvs)(8), [pvcreate](/man/pvcreate)(8), [pvmove](/man/pvmove)(8), [vgdisplay](/man/vgdisplay)(8), [lvdisplay](/man/lvdisplay)(8), [lvm](/man/lvm)(8)

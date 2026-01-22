# TLDR

Convert to **RAID1**

```sudo lvconvert --type raid1 -m 1 /dev/vg_name/lv_name```

**Remove mirroring** (convert to linear)

```sudo lvconvert -m 0 /dev/vg_name/lv_name```

**Merge** snapshot into origin

```sudo lvconvert --merge /dev/vg_name/snapshot_lv```

**Repair** degraded RAID

```sudo lvconvert --repair /dev/vg_name/lv_name```

Convert to **thin pool**

```sudo lvconvert --type thin-pool --poolmetadata /dev/vg_name/meta_lv /dev/vg_name/pool_lv```

# SYNOPSIS

**lvconvert** [_options_] _vg_/_lv_

# DESCRIPTION

**lvconvert** converts or modifies the type, redundancy, or state of logical volumes. It can add/remove mirrors, convert between linear and RAID, merge snapshots, and convert to thin pools.

# PARAMETERS

**--type TYPE**
> Convert to specified type (raid1, linear, thin-pool, cache-pool)

**-m, --mirrors N**
> Number of mirrors (0 removes mirroring)

**--merge**
> Merge snapshot back into origin

**--repair**
> Repair degraded RAID volume

**--poolmetadata LV**
> Specify metadata LV for thin pool

**--stripes N**
> Number of stripes for conversion

# CAVEATS

Requires root privileges. Data migration may take time. Snapshot merge applies on next activation.

# SEE ALSO

[lvcreate](/man/lvcreate)(8), [lvchange](/man/lvchange)(8), [lvextend](/man/lvextend)(8), [lvm](/man/lvm)(8)

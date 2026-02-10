# TAGLINE

changes attributes or the activation state of logical volumes in LVM

# TLDR

**Activate** logical volume

```sudo lvchange -a y /dev/vg_name/lv_name```

**Deactivate** logical volume

```sudo lvchange -a n /dev/vg_name/lv_name```

Enable **autoactivation**

```sudo lvchange -a ay /dev/vg_name/lv_name```

Set **read-only** permission

```sudo lvchange -p r /dev/vg_name/lv_name```

**Skip activation**

```sudo lvchange -k y /dev/vg_name/lv_name```

**Refresh** logical volume

```sudo lvchange --refresh /dev/vg_name/lv_name```

# SYNOPSIS

**lvchange** [_options_] _vg_/_lv_

# DESCRIPTION

**lvchange** changes attributes or the activation state of logical volumes in LVM. It can activate/deactivate volumes, change permissions, and modify various LV properties.

# PARAMETERS

**-a, --activate y|n|ay**
> Activate (y), deactivate (n), or autoactivate (ay)

**-p, --permission r|rw**
> Set read-only (r) or read-write (rw)

**-k, --setactivationskip y|n**
> Set activation skip flag

**--refresh**
> Refresh volume using latest metadata

**-Z, --zero y|n**
> Zero first KB of new logical volume

**--addtag TAG**
> Add tag to logical volume

# CAVEATS

Requires root privileges. Volume must be unmounted for some operations. Part of LVM2 tools.

# SEE ALSO

[lvcreate](/man/lvcreate)(8), [lvdisplay](/man/lvdisplay)(8), [lvs](/man/lvs)(8), [lvm](/man/lvm)(8)

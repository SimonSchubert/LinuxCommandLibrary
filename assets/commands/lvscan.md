# TLDR

List **all** logical volumes

```sudo lvscan```

List **active** volumes only

```sudo lvscan --active```

List **inactive** volumes only

```sudo lvscan --inactive```

Output as **JSON**

```sudo lvscan --reportformat json```

# SYNOPSIS

**lvscan** [_options_]

# DESCRIPTION

**lvscan** scans and lists all logical volumes in the system. It shows the volume path, size, and activation status.

# PARAMETERS

**--active**
> Show only active logical volumes

**--inactive**
> Show only inactive logical volumes

**--reportformat FORMAT**
> Output format: basic, json

**-b, --blockdevice**
> Show block device names

**-v, --verbose**
> Verbose output

# OUTPUT FORMAT

Shows: ACTIVE/inactive, LV path, size, and status

# SEE ALSO

[lvs](/man/lvs)(8), [lvdisplay](/man/lvdisplay)(8), [vgscan](/man/vgscan)(8), [pvscan](/man/pvscan)(8)

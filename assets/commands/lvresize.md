# TLDR

Set volume to **specific size**

```sudo lvresize -L 120G [vg]/[lv]```

**Extend** with filesystem resize

```sudo lvresize -L +120G --resizefs [vg]/[lv]```

Extend to **100% free** space

```sudo lvresize -l 100%FREE [vg]/[lv]```

**Reduce** with filesystem resize

```sudo lvresize -L -120G --resizefs [vg]/[lv]```

# SYNOPSIS

**lvresize** [_options_] **-L** _size_ _vg_/_lv_

# DESCRIPTION

**lvresize** changes the size of a logical volume, either extending or reducing it. It combines the functionality of lvextend and lvreduce into a single command.

# PARAMETERS

**-L, --size SIZE**
> New size (+/- for relative change)

**-l, --extents EXTENTS**
> Size in extents (100%FREE, +50%FREE)

**-r, --resizefs**
> Also resize underlying filesystem

**-f, --force**
> Force resize without confirmation

**-n, --nofsck**
> Skip filesystem check

# CAVEATS

Reducing requires filesystem resize first or --resizefs. Extending is generally safe. Always backup before reducing.

# SEE ALSO

[lvextend](/man/lvextend)(8), [lvreduce](/man/lvreduce)(8), [lvm](/man/lvm)(8)

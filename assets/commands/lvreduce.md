# TLDR

Reduce volume to **specific size**

```sudo lvreduce -L 120G [logical_volume]```

Reduce by **amount** with filesystem resize

```sudo lvreduce -L -40G --resizefs [logical_volume]```

# SYNOPSIS

**lvreduce** [_options_] **-L** _size_ _lv_

# DESCRIPTION

**lvreduce** reduces the size of a logical volume. This is a destructive operation that should only be performed after reducing the filesystem inside the volume.

# PARAMETERS

**-L, --size SIZE**
> New size (or -SIZE to reduce by amount)

**-r, --resizefs**
> Also resize underlying filesystem

**-f, --force**
> Force reduction without confirmation

**-n, --nofsck**
> Skip filesystem check

**-t, --test**
> Test mode (don't apply changes)

# CAVEATS

**Data loss risk**: Always backup before reducing. Filesystem must be reduced first unless using --resizefs. ext4 supports online shrinking only with --resizefs.

# SEE ALSO

[lvextend](/man/lvextend)(8), [lvresize](/man/lvresize)(8), [resize2fs](/man/resize2fs)(8)

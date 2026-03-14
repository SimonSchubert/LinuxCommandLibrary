# TAGLINE

Display information about logical volumes

# TLDR

**List** logical volumes

```sudo lvs```

**List all** volumes including internal ones

```sudo lvs -a```

**Verbose** output

```sudo lvs -v```

Show **specific** fields

```sudo lvs -o lv_name,vg_name,lv_size```

**Append** a field to the default output

```sudo lvs -o +lv_path```

**Show available fields**

```sudo lvs -o help```

**No headings** with custom separator for scripting

```sudo lvs --noheadings --separator '|'```

**Filter** logical volumes by selection criteria

```sudo lvs -S 'lv_size>1g'```

**JSON output**

```sudo lvs --reportformat json```

# SYNOPSIS

**lvs** [_OPTIONS_] [_VolumeGroupName_|_LogicalVolume_...]

# DESCRIPTION

**lvs** displays information about logical volumes in a configurable table format. It provides a quick overview of LV names, sizes, attributes, and related volume groups.

# PARAMETERS

**-a**, **--all**
> Show all logical volumes including internal ones.

**-v**, **--verbose**
> Increase verbosity and show additional details. Can be repeated up to 4 times.

**-o**, **--options** _fields_
> Specify which fields to display. Prefix with `+` to append, `-` to remove, `#` to compact empty fields. Use `-o help` to list available fields.

**-S**, **--select** _criteria_
> Filter output rows matching selection criteria.

**-O**, **--sort** _fields_
> Sort output by specified fields. Prefix with `-` for reverse order.

**--noheadings**
> Suppress the heading line in output.

**--nosuffix**
> Suppress size unit suffixes in output.

**--separator** _char_
> Use specified character as field separator.

**--aligned**
> Use with --separator to align output columns.

**--nameprefixes**
> Add "LVM2_" prefix to field names, producing field=value pairs.

**--segments**
> Show segment information in default columns.

**--rows**
> Display columns as rows.

**--units** _units_
> Display sizes in specified units (b, s, k, m, g, t, p, e, h, H).

**--reportformat** _format_
> Output format: `basic` or `json`.

# CAVEATS

Some fields require verbose mode to display. Default output is designed for human readability; use `--separator` and `--noheadings` for scripting. Requires root privileges or membership in the appropriate group.

# HISTORY

**lvs** is part of **LVM2**, the Linux Logical Volume Manager, providing quick volume listing functionality.

# SEE ALSO

[lvm](/man/lvm)(8), [lvdisplay](/man/lvdisplay)(8), [lvcreate](/man/lvcreate)(8), [lvrename](/man/lvrename)(8), [pvs](/man/pvs)(8), [vgs](/man/vgs)(8)

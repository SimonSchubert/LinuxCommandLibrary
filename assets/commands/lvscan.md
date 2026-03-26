# TAGLINE

scans and lists all logical volumes in all volume groups

# TLDR

**List all logical volumes**

```sudo lvscan```

**Include internal LV components** (mirrors, etc.)

```sudo lvscan --all```

**Output in JSON format**

```sudo lvscan --reportformat json```

**Run in read-only mode** without taking locks

```sudo lvscan --readonly```

**Verbose output with extra detail**

```sudo lvscan -v```

# SYNOPSIS

**lvscan** [_options_]

# DESCRIPTION

**lvscan** scans and lists all logical volumes in all volume groups. The output shows one line per logical volume indicating whether it is active or inactive, the LV path, and its size.

# PARAMETERS

**-a**, **--all**
> Show information about internal LVs that are components of normal LVs (e.g., mirror images and logs).

**-b**, **--blockdevice**
> No longer used. Use lvs(8) or lvdisplay(8) instead.

**--readonly**
> Read on-disk metadata without taking locks. Useful for inspecting metadata on VMs or clustered VGs.

**--reportformat** _FORMAT_
> Output format: basic or json.

**--ignorelockingfailure**
> Allow the command to continue with read-only metadata after locking failures.

**-d**, **--debug**
> Increase debug detail (repeat 1-6 times).

**-q**, **--quiet**
> Suppress output and log messages.

**-t**, **--test**
> Run in test mode without updating metadata.

**-v**, **--verbose**
> Increase verbosity (repeat 1-4 times).

# SEE ALSO

[lvs](/man/lvs)(8), [lvdisplay](/man/lvdisplay)(8), [vgscan](/man/vgscan)(8), [pvscan](/man/pvscan)(8), [lvm](/man/lvm)(8)

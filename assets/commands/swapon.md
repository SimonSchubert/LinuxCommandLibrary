# TAGLINE

Enable swap devices and files

# TLDR

Show **swap information**

```swapon```

**Enable** a swap area

```sudo swapon /path/to/swapfile```

Enable **all** swap areas from /etc/fstab

```sudo swapon -a```

Enable swap by **label**

```sudo swapon -L swap_label```

Enable swap by **UUID**

```sudo swapon -U uuid```

Show swap **summary**

```swapon -s```

# SYNOPSIS

**swapon** [_options_] [_specialfile_...]

# DESCRIPTION

**swapon** enables devices and files for paging and swapping. Swap space can be specified by device path, label (-L), or UUID (-U). The command is typically invoked during system startup to distribute paging activity across multiple storage resources.

# PARAMETERS

**-a, --all**
> Enable all swap devices marked in /etc/fstab

**-d, --discard[=policy]**
> Enable trim/discard operations; policy can be 'once' or 'pages'

**-e, --ifexists**
> Silently skip devices that do not exist

**-f, --fixpgsz**
> Reinitialize swap space if page size mismatches kernel

**-L label**
> Use swap partition with the specified label

**-U uuid**
> Use swap partition with the specified UUID

**-p, --priority priority**
> Set swap priority (-1 to 32767, higher is preferred)

**-s, --summary**
> Display swap usage summary (deprecated, use --show)

**--show[=column...]**
> Display customizable swap area table

**-T, --fstab path**
> Use alternative fstab file

**-v, --verbose**
> Enable verbose output

# CAVEATS

Higher priority swap areas are used first. When areas have equal priority, they are used in round-robin fashion. The discard option can improve SSD performance but may cause delays.

# HISTORY

**swapon** is part of the **util-linux** package. Swap space management has been a core part of Unix-like systems for managing virtual memory.

# SEE ALSO

[swapoff](/man/swapoff)(8), [mkswap](/man/mkswap)(8), [fstab](/man/fstab)(5), [free](/man/free)(1)

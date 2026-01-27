# TLDR

Write **10 records** at one-second intervals to a binary file

```sadc 1 10 [/tmp/datafile]```

Write data to the **default daily data file** (/var/log/sa/saDD)

```sadc 1 10 -```

Collect **all available statistics** including disks and interrupts

```sadc -S ALL 1 10 [/tmp/datafile]```

Collect data with **disk and partition statistics**

```sadc -S XDISK 1 10 [/tmp/datafile]```

Add a **comment record** to the data file

```sadc -C "[system reboot]" [/var/log/sa/sa01]```

# SYNOPSIS

**sadc** [_-C comment_] [_-D_] [_-F_] [_-L_] [_-V_] [_-S {keyword,...}_] [_interval_] [_count_] [_outfile_]

# PARAMETERS

**-C** _comment_
> Write a dummy record containing the specified comment string when interval and count are not specified

**-D**
> Use saYYYYMMDD instead of saDD as the standard daily data file name

**-F**
> Force creation of outfile; truncate if it exists with an incompatible format

**-L**
> Try to get an exclusive lock on the outfile before writing or truncating

**-S** _keyword_
> Specify optional activities to collect: INT (interrupts), DISK (block devices), XDISK (partitions/filesystems), SNMP, IPV6, POWER, ALL, XALL

**-V**
> Print version number and exit

# DESCRIPTION

**sadc** (System Activity Data Collector) is the backend data collector for the **sar** command, part of the sysstat package. It samples system performance data at specified intervals and writes it in binary format to an output file.

The collector gathers metrics including CPU utilization, memory usage, I/O statistics, network activity, and process information. By default, it collects most kernel data except interrupts and disk statistics, which require explicit **-S** flags.

When outfile is set to **-**, sadc writes to the standard daily data file /var/log/sa/saDD. If count is omitted, sadc runs endlessly. The binary output is not human-readable and requires **sar** to interpret.

# CAVEATS

The **/proc** filesystem must be mounted for sadc to function. Available statistics depend on kernel version. sadc is typically invoked by the **sa1** script via cron rather than run directly. Output files from older sadc versions may be incompatible with newer releases.

# HISTORY

sadc is part of the **sysstat** package, originally written by Sebastien Godard. The sysstat tools evolved from earlier Unix system accounting utilities, with sadc providing the binary data collection layer that enables historical performance analysis through sar.

# SEE ALSO

[sar](/man/sar)(1), [iostat](/man/iostat)(1), [mpstat](/man/mpstat)(1), [vmstat](/man/vmstat)(8)

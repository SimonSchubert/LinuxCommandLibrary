# TLDR

Start **interactive** nmon

```nmon```

Save records to **file** with defaults

```nmon -f```

Save with **30 second** interval, **240 measurements**

```nmon -f -s 30 -c 240```

Enable **capacity planning** mode

```nmon -x```

Include **top processes** in output

```nmon -fdt```

# SYNOPSIS

**nmon** [**-h**] [**-s** _seconds_] [**-c** _count_] [**-f** **-d** _disks_ **-t** **-r** _name_] [**-x**]

# DESCRIPTION

**nmon** is a systems administrator, tuner, and benchmark tool that monitors and displays CPU, memory, network, disks, file systems, NFS, top processes, and resource information. It can run interactively or output data to a spreadsheet-compatible file.

# PARAMETERS

**-h**
> Display full help information

**-f**
> Enable spreadsheet output format for file recording

**-s SECONDS**
> Set refresh interval in seconds (default: 2)

**-c COUNT**
> Set number of refreshes to capture

**-d DISKS**
> Increase disk monitoring count (default: 256)

**-t**
> Include top processes in spreadsheet output

**-x**
> Enable capacity planning mode with 15-minute intervals over 1 day (-fdt -s 900 -c 96)

**-r NAME**
> Set the filename prefix for output files

# CAVEATS

In interactive mode, press "h" for help on available keyboard shortcuts. The default spreadsheet mode uses -s300 -c288 (5-minute intervals for 24 hours). Output files are in CSV format suitable for analysis tools.

# HISTORY

**nmon** was created by Nigel Griffiths at IBM and has become a popular performance monitoring tool for Linux systems.

# SEE ALSO

[top](/man/top)(1), [vmstat](/man/vmstat)(8), [iostat](/man/iostat)(1), [sar](/man/sar)(1)

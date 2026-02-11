# TAGLINE

Display kernel slab cache information

# TLDR

Start **slabtop**

```sudo slabtop```

Sort by **cache size**

```sudo slabtop -s c```

Sort by number of **objects**

```sudo slabtop -s o```

Sort by **object size**

```sudo slabtop -s s```

Display once and **exit**

```sudo slabtop -o```

Set **refresh delay** to 5 seconds

```sudo slabtop -d 5```

# SYNOPSIS

**slabtop** [_-d delay_] [_-s sortcriteria_] [_-o_]

# DESCRIPTION

**slabtop** displays detailed kernel slab cache information in real time. It shows a listing of the top caches sorted by one of the listed sort criteria, helping to monitor kernel memory allocation.

# PARAMETERS

**-d, --delay=N**
> Refresh the display every N seconds (default: 3)

**-s, --sort=S**
> Arrange output by specified sort criteria

**-o, --once**
> Display output once then exit

**-V, --version**
> Show version and exit

**-h, --help**
> Show usage help and exit

# SORT CRITERIA

**a**: Active objects (ACTIVE)
**b**: Objects per slab (OBJ/SLAB)
**c**: Cache size (CACHE SIZE)
**l**: Number of slabs (SLABS)
**o**: Number of objects (OBJS) - default
**s**: Object size (OBJ SIZE)
**u**: Cache utilization (USE)

# INTERACTIVE COMMANDS

**Space**: Refresh display immediately
**q**: Exit program
**s**: Change sort column

# CAVEATS

Requires root privileges to read kernel slab cache information. Sort criteria can be changed during runtime using the corresponding letter key.

# HISTORY

**slabtop** is part of the **procps-ng** package. It provides insight into the kernel's slab allocator, which manages memory for frequently used kernel objects.

# SEE ALSO

[top](/man/top)(1), [vmstat](/man/vmstat)(8), [free](/man/free)(1), [ps](/man/ps)(1)

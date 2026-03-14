# TAGLINE

List the ranges of available memory with their online status

# TLDR

List **memory information**

```lsmem```

List **all individual memory blocks**

```lsmem --all```

Output as **JSON**

```lsmem --json```

Show sizes in **bytes**

```lsmem --bytes```

Show **only the summary**

```lsmem --summary=only```

Select specific **output columns**

```lsmem --output [RANGE,SIZE,STATE,REMOVABLE]```

# SYNOPSIS

**lsmem** [_options_]

# DESCRIPTION

**lsmem** lists the ranges of available memory with their online status. The listed memory blocks correspond to the memory block representation in sysfs. The command also shows the memory block size and the amount of memory in online and offline state. Part of **util-linux**.

# PARAMETERS

**-J, --json**
> Output in JSON format

**-b, --bytes**
> Print sizes in bytes

**-o, --output COLUMNS**
> Specify output columns

**-a, --all**
> Show all memory blocks

**-n, --noheadings**
> Suppress column headers

**-r, --raw**
> Raw output without formatting

**--summary** [_WHEN_]
> Control summary output: never, always, only.

**-S, --split** _LIST_
> Columns to split memory blocks: STATE, REMOVABLE, NODE, ZONES, or none.

**-s, --sysroot** _DIR_
> Gather memory data for another Linux instance.

# CAVEATS

Only available on Linux. Requires sysfs to be mounted. Shows kernel's view of memory, not physical DIMM information.

# SEE ALSO

[free](/man/free)(1), [chmem](/man/chmem)(8), [dmidecode](/man/dmidecode)(8)

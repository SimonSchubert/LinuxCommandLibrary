# TAGLINE

lists the characteristics of the system's available memory including block

# TLDR

List **memory information**

```lsmem```

Output as **JSON**

```lsmem --json```

Show sizes in **bytes**

```lsmem --bytes```

# SYNOPSIS

**lsmem** [_options_]

# DESCRIPTION

**lsmem** lists the characteristics of the system's available memory including block sizes, states, and zones. It provides detailed information about memory modules and their configuration.

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

**--summary**
> Print only summary information

# CAVEATS

Only available on Linux. Requires sysfs to be mounted. Shows kernel's view of memory, not physical DIMM information.

# SEE ALSO

[free](/man/free)(1), [chmem](/man/chmem)(8), [dmidecode](/man/dmidecode)(8)

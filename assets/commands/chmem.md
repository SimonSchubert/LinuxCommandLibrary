# TLDR

Set a memory block **offline**

```sudo chmem -b -d [block_number]```

Set a memory block **online**

```sudo chmem -b -e [block_number]```

Set a memory range **offline** using hexadecimal addresses

```sudo chmem -d 0x[start_address]-0x[end_address]```

Set a memory range **online** using hexadecimal addresses

```sudo chmem -e 0x[start_address]-0x[end_address]```

Set memory online and assign to a **specific zone**

```sudo chmem -e 0x[start_address] -z [Movable]```

# SYNOPSIS

**chmem** [_options_] _size_|_range_|_block_

# DESCRIPTION

**chmem** modifies the state of memory blocks in a Linux system, bringing them online or offline. This is primarily used in virtualized environments for memory hotplug operations.

Memory blocks are chunks of physical memory that can be individually managed. The tool allows dynamic memory management without rebooting.

# PARAMETERS

**-b, --block**
> Operate on memory blocks by block number

**-d, --disable**
> Set memory offline

**-e, --enable**
> Set memory online

**-z, --zone** _zone_
> Assign memory to a specific zone (DMA, DMA32, Normal, Movable)

**-h, --help**
> Display help

# CAVEATS

Requires root privileges. Not all systems support memory hotplug. Memory containing kernel data or in-use pages cannot be offlined. Virtual machines may require specific configuration to support memory hotplug.

# SEE ALSO

[lsmem](/man/lsmem)(1), [free](/man/free)(1)

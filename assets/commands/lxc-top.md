# TAGLINE

displays real-time resource usage of LXC containers similar to top for processes

# TLDR

Start **lxc-top**

```lxc-top```

Set update **interval**

```lxc-top --delay 5```

**Sort** by criteria

```lxc-top --sort [n|c|b|m|k]```

# SYNOPSIS

**lxc-top** [_options_]

# DESCRIPTION

**lxc-top** displays real-time resource usage of LXC containers similar to top for processes. It shows CPU, memory, and I/O statistics for all running containers.

# PARAMETERS

**-d, --delay SECONDS**
> Update interval (default: 3)

**-s, --sort CRITERIA**
> Sort by: n(name), c(cpu), b(block I/O), m(memory), k(kernel memory)

**-r, --reverse**
> Reverse sort order

**-?, --help**
> Display help information

# DISPLAY COLUMNS

**Container**: Container name
**CPU**: CPU usage percentage
**MemUse**: Memory usage
**MemLim**: Memory limit
**BLKIO**: Block I/O statistics

# SEE ALSO

[lxc-info](/man/lxc-info)(1), [lxc-ls](/man/lxc-ls)(1), [top](/man/top)(1)

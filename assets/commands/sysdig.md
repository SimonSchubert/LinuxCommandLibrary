# TLDR

**Capture** all events from live system

```sysdig```

**Save** events to file

```sysdig -w [path/to/file].scap```

**Read** events from file

```sysdig -r [path/to/file].scap```

**Filter** events by process and event type

```sysdig proc.name=cat and evt.type=open```

**List** available chisels

```sysdig -cl```

**Use** a chisel to analyze traffic

```sysdig -c spy_ip [ip_address]```

# SYNOPSIS

**sysdig** [_options_] [_filter_]

# PARAMETERS

**-w, --write _file_**
> Write captured events to file

**-r, --read _file_**
> Read events from file

**-c, --chisel _name_**
> Run specified chisel

**-cl, --list-chisels**
> List available chisels

**-l, --list**
> List available fields

**-I _source_**
> Use specified input source

**-n _num_**
> Stop after num events

**-p _format_**
> Custom output format

**-j, --json**
> Output in JSON format

# DESCRIPTION

**sysdig** is a system-level exploration and troubleshooting tool. It captures system calls and events, providing deep visibility into system behavior. It supports filtering, chisels (Lua scripts for analysis), and various output formats.

Sysdig can be used for performance analysis, security monitoring, and debugging.

# FILTER SYNTAX

Filters use **field=value** syntax with AND, OR, and NOT operators:
- proc.name=nginx
- evt.type=open and fd.name contains /etc
- container.id!=host

# CAVEATS

Requires root privileges for live capture. Kernel headers may be needed for certain features. Generates significant data on busy systems.

# SEE ALSO

[strace](/man/strace)(1), [tcpdump](/man/tcpdump)(8), [perf](/man/perf)(1)

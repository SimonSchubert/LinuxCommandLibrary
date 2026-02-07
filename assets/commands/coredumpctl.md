# TAGLINE

core dump retrieval and analysis

# TLDR

**List** all captured core dumps

```coredumpctl```

List core dumps for a **specific program**

```coredumpctl list program```

Show **information** about core dump with PID

```coredumpctl info 1234```

**Debug** using the last core dump

```coredumpctl debug```

Debug last core dump of a **specific program**

```coredumpctl debug program```

**Extract** core dump to file

```coredumpctl -o /path/to/file dump program```

Debug with custom **gdb arguments**

```coredumpctl debug -A "-ex bt"```

# SYNOPSIS

**coredumpctl** [_OPTIONS_] [_COMMAND_] [_MATCHES_...]

# DESCRIPTION

**coredumpctl** is a systemd utility for managing core dumps - memory snapshots created when a program crashes. Instead of traditional core dump files scattered across the filesystem, systemd-coredump captures crashes and stores them in the journal with rich metadata including timestamps, process information, and system state.

The tool provides a unified interface for working with these captured core dumps. You can list all crashes, filter by program or time range, view detailed information about specific crashes, and launch a debugger to analyze the failure. Core dumps can also be extracted to files for offline analysis or sharing with developers.

This centralized approach to core dump management makes it much easier to track down intermittent crashes, debug production issues, and maintain system reliability. The integration with journalctl means crash data is preserved alongside system logs, providing full context for debugging. The tool requires systemd-coredump to be configured as the system's core dump handler, which is the default on most modern systemd-based distributions.

# COMMANDS

**list [MATCHES]**
> List core dumps in journal (default command)

**info [MATCHES]**
> Show detailed information about core dumps

**dump [MATCHES]**
> Export core dump data to stdout or file

**debug [MATCHES]**
> Invoke debugger on a core dump

# PARAMETERS

**-o, --output FILE**
> Write dump output to file

**-1**
> Show only the most recent core dump

**-S, --since TIME**
> Filter by start time

**-U, --until TIME**
> Filter by end time

**-r, --reverse**
> Show newest entries first

**-F, --field FIELD**
> Print all values of specified field

**-D, --directory DIR**
> Use journal files from directory

**--debugger DEBUGGER**
> Use specific debugger (default: gdb)

**-A, --debugger-arguments ARGS**
> Pass arguments to debugger

**-n, --lines NUM**
> Number of journal lines to show

**-q, --quiet**
> Suppress informational messages

**--json MODE**
> Output as JSON (short, pretty, off)

# MATCHES

Matches filter by: PID, executable name, path, or core dump timestamp.

# CONFIGURATION

**/etc/systemd/coredump.conf**
> Configuration file controlling core dump storage, compression, and retention settings.

# CAVEATS

Core dumps may contain sensitive data. Ensure proper permissions on extracted files. Requires systemd-coredump to be configured as the core dump handler.

# HISTORY

**coredumpctl** is part of **systemd**, providing centralized core dump management through systemd-coredump and the journal.

# SEE ALSO

[systemd-coredump](/man/systemd-coredump)(8), [gdb](/man/gdb)(1), [journalctl](/man/journalctl)(1), [coredump.conf](/man/coredump.conf)(5)

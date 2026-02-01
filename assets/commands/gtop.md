# TLDR

**Start gtop**

```gtop```

# SYNOPSIS

**gtop**

# KEYBOARD COMMANDS

**q**
> Quit.

**p**
> Sort by PID.

**c**
> Sort by CPU.

**m**
> Sort by memory.

# DESCRIPTION

**gtop** is a terminal-based graphical activity monitor written in Node.js. It displays CPU, memory, network, disk, and process information with visual graphs.

The interface shows system metrics in panels: CPU usage per core with bars, memory and swap usage, network throughput graphs, disk usage bars, and a process list.

CPU panel displays each core's usage as a horizontal bar with percentage. Memory shows used/total with progress bars. Network displays send/receive rates.

Process list shows top processes by resource usage. Sort by CPU (**c**), memory (**m**), or PID (**p**). The list updates in real-time.

gtop inspired several similar tools written in other languages (gotop, btm) offering additional features and better performance.

# CAVEATS

Requires Node.js runtime. Higher CPU usage compared to native alternatives. Limited configuration options. No custom layouts or themes.

# HISTORY

gtop was created by **Cem Akpolat** (aksakalli) and first released in **2017**. Written in Node.js using blessed-contrib, it popularized the graphical terminal monitor style. The visual design inspired many successors including gotop (Go), bashtop/bpytop (Python), and bottom (Rust). gtop remains popular for its simplicity and ease of installation via npm.

# SEE ALSO

[htop](/man/htop)(1), [gotop](/man/gotop)(1), [btm](/man/btm)(1), [top](/man/top)(1)

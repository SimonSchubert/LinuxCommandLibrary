# TAGLINE

Read this computer's status over MCP

# TLDR

**Serve** local machine facts over stdio

```janas-system```

Register with **Claude Code**

```claude mcp add system -- /path/to/janas-system```

# SYNOPSIS

**janas-system**

# DESCRIPTION

**janas-system** is a Janas service: a read-only MCP server over standard input and output for the computer it runs on. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory. None of its tools reaches the network. What it reads leaves the machine only in the answers sent back to the client.

Tools:

- **system_status** — hostname and OS, uptime, processor use over half a second (and the kernel's share) plus load, memory and swap, Linux pressure stalls when they are high, disks (those at least 90% full called out), battery, and temperatures (a sensor within 10 °C of its critical limit is called out)
- **system_disks** — each filesystem once. With `path` (`~` is home), what fills that directory, largest first, directory sizes summed over their contents
- **system_processes** — top by `cpu` or `memory`, or whose name contains `name`. Pid, user, share of the whole processor over half a second, memory, and how long it has run. The name only, never the arguments
- **system_errors** — log errors since boot or the last `hours`, the same message from the same program counted once, plus failed services
- **system_updates** — packages the package manager already knows are upgradable, how many are security updates, when that list was fetched, and the command that would fetch it again. Nothing is downloaded
- **system_network** — interfaces, state, addresses, link speed, Wi-Fi signal, bytes in and out, gateway, and name servers

On Linux it reads `/proc`, mount info, `statvfs`, `/sys/class/power_supply`, hwmon, `journalctl` (priority error and above), `systemctl --failed`, `apt list --upgradable`, `dnf check-update --cacheonly`, `pacman -Qu`, and the network tables. On Windows the same questions use Win32 (memory, disks, battery, processes, the System and Application event logs, IP Helper, WLAN). Windows temperatures are not reported. Windows Update is not read; the answer says where to look.

A directory walk stops after 8 seconds or 64 levels, does not cross filesystems, and does not follow symbolic links (on Windows, junctions or mounted volumes). On Linux a size is disk space; on Windows it is the file length. Hard links are counted at each name. `journalctl` without membership in `adm` or `systemd-journal` shows only the user's own messages, and the answer says so. At most 2,000 messages or a megabyte are read. Programs it starts take arguments as they are, with no shell and no terminal, and with a time limit. Nothing needs root.

**janas-chat** shows the full layout and gives the model a short brief. For status, the model is told to mention only what is wrong, or that all is well. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `system` in `~/.config/janas/mcp.json` replaces the automatic start.

It does not stop processes or install updates; the model is told to explain how, not to do it. A client that forwards tool results to a remote model also forwards program names, home paths, and log lines.

The Windows code is written against Win32 and has been compiled with MinGW-w64. Upstream has exercised it under Wine, not on Windows itself. dnf and pacman parsing follows those tools' documentation; the machine the service was developed on used apt.

# HISTORY

**janas-system** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-git](/man/janas-git)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/system/README.md)```

<!-- verified: 2026-10-23 -->

# TAGLINE

Virtual filesystem for process and kernel info

# TLDR

**View process information**

```cat /proc/[pid]/status```

**View CPU info**

```cat /proc/cpuinfo```

**View memory info**

```cat /proc/meminfo```

**View kernel parameters**

```cat /proc/sys/kernel/hostname```

# SYNOPSIS

**/proc** filesystem documentation

# COMMON FILES

**/proc/cpuinfo**
> CPU information.

**/proc/meminfo**
> Memory statistics.

**/proc/loadavg**
> System load averages.

**/proc/uptime**
> System uptime.

**/proc/version**
> Kernel version.

**/proc/mounts**
> Mounted filesystems.

**/proc/[pid]/**
> Per-process directory.

# DESCRIPTION

**/proc** is a virtual filesystem providing process and kernel information. It doesn't exist on disk - contents are generated dynamically by the kernel.

# EXAMPLES

```bash
# CPU details
cat /proc/cpuinfo

# Memory usage
cat /proc/meminfo | grep -E "MemTotal|MemFree"

# Process command line
cat /proc/$$/cmdline

# File descriptors
ls -l /proc/$$/fd

# Environment variables
cat /proc/$$/environ | tr '\0' '\n'

# Network statistics
cat /proc/net/dev
```

# PER-PROCESS FILES

```
/proc/[pid]/cmdline   - Command line
/proc/[pid]/cwd       - Current directory
/proc/[pid]/environ   - Environment
/proc/[pid]/exe       - Executable link
/proc/[pid]/fd/       - File descriptors
/proc/[pid]/maps      - Memory mappings
/proc/[pid]/status    - Process status
```

# CAVEATS

Linux-specific. Some files require root. Structure varies by kernel version.

# HISTORY

The /proc filesystem was introduced in **Unix System V** and extensively expanded in **Linux** for kernel introspection.

# SEE ALSO

[sysfs](/man/sysfs)(5), [ps](/man/ps)(1), [top](/man/top)(1), [proc](/man/proc)(5)

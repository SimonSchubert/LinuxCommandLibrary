# TAGLINE

Memory forensics analysis framework

# TLDR

**List available plugins** and profiles

```volatility --info```

**List processes** from a memory dump

```volatility -f [memory.img] --profile=[LinuxProfile] linux_pslist```

**Show network connections**

```volatility -f [memory.img] --profile=[Profile] linux_netstat```

**Recover bash history**

```volatility -f [memory.img] --profile=[Profile] linux_bash```

**List open files** for all processes

```volatility -f [memory.img] --profile=[Profile] linux_lsof```

**Show process command lines**

```volatility -f [memory.img] --profile=[Profile] linux_cmdline```

**Scan for Yara rules**

```volatility -f [memory.img] --profile=[Profile] linux_yarascan -y [rules.yar]```

# SYNOPSIS

**volatility** -f _memory_image_ [--profile=_PROFILE_] _plugin_ [_options_]

**vol.py** -f _memory_image_ _plugin_

# PARAMETERS

**-f** _FILE_, **--file** _FILE_
> Memory image file to analyze

**--profile** _PROFILE_
> Operating system profile (required for Volatility 2)

**--info**
> List available plugins and profiles

**-d**, **--debug**
> Enable debug output

**-h**, **--help**
> Show help message

**-p** _PID_
> Filter by process ID

**-o** _OFFSET_
> Physical offset in memory

**--output** _FORMAT_
> Output format (text, json, html)

**--output-file** _FILE_
> Write output to file

# LINUX PLUGINS

**linux_pslist**
> List running processes

**linux_pstree**
> Process tree view

**linux_bash**
> Recover bash command history

**linux_netstat**
> Show network connections

**linux_lsof**
> List open file descriptors

**linux_cmdline**
> Show process command-line arguments

**linux_mount**
> List mounted filesystems

**linux_find_file**
> Find files in memory

**linux_yarascan**
> Scan memory with Yara rules

**linux_moddump**
> Dump loaded kernel modules

**linux_proc_maps**
> Show process memory maps

# DESCRIPTION

**volatility** is an open-source memory forensics framework for extracting digital artifacts from RAM dumps. It analyzes memory images to recover running processes, network connections, command history, and other volatile data not available on disk.

The framework supports Windows, Linux, and macOS memory analysis. Linux plugins are prefixed with **linux_** and require a profile matching the exact distribution, kernel version, and architecture of the system that created the dump.

Volatility 3 simplifies profile management with automatic symbol detection, while Volatility 2 requires manually building or obtaining profiles. Memory dumps can be acquired using tools like LiME (Linux Memory Extractor) or VMware snapshots.

# CAVEATS

Linux analysis requires a profile matching the exact kernel version and distribution. Building profiles requires kernel headers and debug symbols. Memory images are large and analysis can be resource-intensive. Anti-forensic techniques may interfere with some plugins. Not all plugins work on all memory formats.

# HISTORY

The Volatility Framework was created by **Aaron Walters** and first released in **2007**. It emerged from academic research into memory forensics at George Mason University. The project became the standard tool for memory analysis in digital forensics and incident response. Volatility 3, released in **2019**, introduced Python 3 support and automatic symbol table generation, simplifying Linux and macOS analysis.

# SEE ALSO

[lime](/man/lime)(1), [strings](/man/strings)(1), [file](/man/file)(1), [dd](/man/dd)(1)

# TAGLINE

Memory forensics analysis framework

# TLDR

**List processes** with Volatility 3 (no profile needed)

```vol -f [memory.img] linux.pslist```

**Identify the kernel** to pick a matching symbol table (Volatility 3)

```vol -f [memory.img] banners```

**Recover bash history** (Volatility 3)

```vol -f [memory.img] linux.bash```

**List available plugins** and profiles (Volatility 2)

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

```volatility -f [memory.img] --profile=[Profile] linux_psaux```

**Scan for Yara rules**

```volatility -f [memory.img] --profile=[Profile] linux_yarascan -y [rules.yar]```

# SYNOPSIS

**volatility** -f _memory_image_ [--profile=_PROFILE_] _plugin_ [_options_]

**vol** -f _memory_image_ [_options_] _plugin_ [_plugin_options_]

**vol.py** -f _memory_image_ _plugin_

# PARAMETERS

**-f** _FILE_, **--file** _FILE_
> Memory image file to analyze

**--profile** _PROFILE_
> Operating system profile (required for Volatility 2)

**--info**
> List available plugins and profiles (Volatility 2)

**-d**, **--debug**
> Enable debug output (Volatility 2)

**-h**, **--help**
> Show help message

**-p** _PID_
> Filter by process ID (Volatility 2 plugin option)

**-o** _OFFSET_
> Physical offset in memory (Volatility 2 plugin option)

**--output** _FORMAT_
> Output format, such as text, json or html (Volatility 2)

**--output-file** _FILE_
> Write output to file (Volatility 2)

# VOLATILITY 3 OPTIONS

**-s** _DIRS_, **--symbol-dirs** _DIRS_
> Directories to search for symbol tables

**-p** _DIRS_, **--plugin-dirs** _DIRS_
> Directories to search for plugins

**-o** _DIR_, **--output-dir** _DIR_
> Directory for files written by plugins

**-r** _RENDERER_, **--renderer** _RENDERER_
> Output renderer, such as quick, csv, pretty or json

**-c** _FILE_, **--config** _FILE_
> Load configuration from a JSON file

**-v**, **--verbosity**
> Increase output verbosity

**-q**, **--quiet**
> Remove progress feedback

**--offline**
> Do not fetch symbol tables or other data remotely

# LINUX PLUGINS

Volatility 2 names are shown. Volatility 3 uses dotted names such as **linux.pslist**, **linux.pstree**, **linux.bash** and **linux.malfind**.

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

**linux_psaux**
> Show processes with their full command lines

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

Volatility 3 replaces profiles with symbol tables (ISF files) that it detects automatically from its **symbols** directory, while Volatility 2 requires manually building or obtaining profiles. Memory dumps can be acquired using tools like LiME (Linux Memory Extractor) or VMware snapshots.

# CAVEATS

The Volatility 2 repository is archived; upstream points to Volatility 3 for modern investigations. Linux analysis requires a profile (Volatility 2) or symbol table (Volatility 3) matching the exact kernel. Building them requires kernel debug symbols. Memory images are large and analysis can be resource-intensive. Anti-forensic techniques may interfere with some plugins. Not all plugins work on all memory formats.

# HISTORY

The Volatility Framework was created by **Aaron Walters** and first released in **2007**. The project became the standard tool for memory analysis in digital forensics and incident response. Volatility 3, released in **2019**, introduced Python 3 support and automatic symbol table generation, simplifying Linux and macOS analysis.

# SEE ALSO

[lime](/man/lime)(1), [strings](/man/strings)(1), [file](/man/file)(1), [dd](/man/dd)(1)

# RESOURCES

```[Source code](https://github.com/volatilityfoundation/volatility3)```

```[Documentation](https://volatility3.readthedocs.io/en/stable/)```

<!-- verified: 2026-11-09 -->

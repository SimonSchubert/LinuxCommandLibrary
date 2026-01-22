# TLDR

Start **hardinfo** GUI

```hardinfo```

Print **report** to stdout

```hardinfo -r```

Save report to **HTML file**

```hardinfo -r -f html > hardinfo.html```

# SYNOPSIS

**hardinfo** [_options_]

# PARAMETERS

**-r**, **--generate-report**
> Generate report to stdout instead of opening GUI

**-f**, **--report-format** _FORMAT_
> Report format: text, html, or shell

**-m**, **--load-module** _MODULE_
> Load specific module

**-a**, **--autoload**
> Automatically load all modules

**-l**, **--list-modules**
> List available modules

# DESCRIPTION

**hardinfo** (Hardware Information) is a graphical system information and benchmark tool for Linux. It displays detailed information about hardware components, software configuration, and system resources.

The GUI organizes information into categories including:
- **Computer** - Summary, operating system, kernel modules, boots
- **Devices** - Processor, memory, PCI devices, USB devices, storage
- **Network** - Interfaces, IP connections, routing table
- **Benchmarks** - CPU, FPU, and memory performance tests

Reports can be generated for documentation or support purposes in text, HTML, or shell variable formats.

# CAVEATS

Some information requires root privileges. Benchmark results are relative and shouldn't be compared across different hardinfo versions. Hardware detection depends on kernel drivers being loaded.

# HISTORY

hardinfo was created by Leandro A. F. Pereira and first released in **2003**. It has been a popular system information tool on Linux desktops, providing functionality similar to Windows' System Information utility.

# SEE ALSO

[lshw](/man/lshw)(1), [inxi](/man/inxi)(1), [hwinfo](/man/hwinfo)(8), [lscpu](/man/lscpu)(1)

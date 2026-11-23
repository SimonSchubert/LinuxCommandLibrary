# TAGLINE

generate human-readable backtrace from a coredump

# TLDR

**Generate backtrace** from a problem directory

```abrt-action-generate-backtrace -d [/var/spool/abrt/ccpp-2024-01-15]```

**Generate backtrace** with verbose output

```abrt-action-generate-backtrace -v -d [/var/spool/abrt/ccpp-2024-01-15]```

**Kill gdb** if it runs longer than 5 minutes

```abrt-action-generate-backtrace -d [problem_dir] -t [300]```

# SYNOPSIS

**abrt-action-generate-backtrace** [**-v**] [**-d** _DIR_] [**-t** _NUM_]

# PARAMETERS

**-d** _DIR_
> Path to the problem directory containing the coredump file

**-v**
> Be more verbose; can be specified multiple times for increased verbosity

**-t** _NUM_
> Kill gdb if it runs for more than NUM seconds (default 1800, i.e. 30 minutes)

# DESCRIPTION

**abrt-action-generate-backtrace** is part of the ABRT (Automatic Bug Reporting Tool) suite. It analyzes a coredump file and generates a human-readable backtrace showing the state of an application at the moment it crashed.

The tool runs **gdb** on a file named "coredump" in the specified problem directory. GDB generates the backtrace and other diagnostic information, which is then saved as a new element named "backtrace" in the problem directory. This backtrace can be used for debugging, bug reporting, or crash analysis.

For best results, the corresponding debuginfo packages should be installed for the crashed application and its libraries. Without debugging symbols, the backtrace will contain only memory addresses rather than function names and line numbers.

The tool integrates with libreport events and is typically invoked automatically by ABRT as the analyzer for C/C++ crashes, e.g. via **EVENT=analyze analyzer=CCpp** rules in **report_event.conf**. Settings are read from **CCpp.conf**.

# CAVEATS

Requires **gdb** to be installed. Quality of the backtrace depends on availability of debuginfo packages. Processing large coredumps can be memory-intensive and time-consuming; use the **-t** option to set a timeout if needed. Only works with coredumps from applications, not kernel crashes.

# HISTORY

ABRT (Automatic Bug Reporting Tool) was developed by **Red Hat** starting around **2009** for Fedora and RHEL systems. It provides automated crash detection and reporting infrastructure. The backtrace generation component was created to simplify the process of collecting diagnostic information from application crashes for submission to bug tracking systems like Bugzilla.

# SEE ALSO

[gdb](/man/gdb)(1), [abrt-cli](/man/abrt-cli)(1), [coredumpctl](/man/coredumpctl)(1), [abrt](/man/abrt)(1), [abrt-action-analyze-backtrace](/man/abrt-action-analyze-backtrace)(1), [debuginfod-find](/man/debuginfod-find)(1)

# RESOURCES

```[Source code](https://github.com/abrt/abrt)```

```[Documentation](https://abrt.readthedocs.io/)```

<!-- verified: 2026-11-23 -->

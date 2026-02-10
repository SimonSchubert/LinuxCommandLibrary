# TAGLINE

collects and submits kernel crash information

# TLDR

**Start kerneloops daemon**

```sudo kerneloops```

**Check for oops**

```kerneloops -d```

**Submit manually**

```kerneloops -s [oops_file]```

# SYNOPSIS

**kerneloops** [_options_]

# PARAMETERS

**-d**
> Debug mode.

**-s** _FILE_
> Submit specific oops file.

**--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**kerneloops** collects and submits kernel crash information. It monitors for kernel oops messages and sends them for analysis.

The daemon helps developers identify kernel bugs. Submitted data aids in kernel debugging.

# CAVEATS

Privacy considerations. Requires network. Daemon runs as root.

# HISTORY

kerneloops was created by **Intel** to collect kernel crash data and help identify bugs in the Linux kernel.

# SEE ALSO

[dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1), [kdump](/man/kdump)(8)

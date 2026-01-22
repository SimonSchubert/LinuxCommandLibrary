# TLDR

**Show all system information**

```uname -a```

**Show kernel name**

```uname -s```

**Show hostname**

```uname -n```

**Show kernel release version**

```uname -r```

**Show kernel version**

```uname -v```

**Show machine hardware name** (architecture)

```uname -m```

**Show operating system**

```uname -o```

# SYNOPSIS

**uname** [_options_]

# PARAMETERS

**-a**, **--all**
> Print all information

**-s**, **--kernel-name**
> Print kernel name (e.g., Linux)

**-n**, **--nodename**
> Print network hostname

**-r**, **--kernel-release**
> Print kernel release (e.g., 5.15.0-generic)

**-v**, **--kernel-version**
> Print kernel version

**-m**, **--machine**
> Print machine hardware name (e.g., x86_64, arm64)

**-p**, **--processor**
> Print processor type

**-i**, **--hardware-platform**
> Print hardware platform

**-o**, **--operating-system**
> Print operating system

# DESCRIPTION

**uname** prints system information about the machine and operating system. It's commonly used in scripts to detect the platform and adjust behavior accordingly.

The most common uses are **uname -a** for all information and **uname -m** to determine the system architecture (useful for downloading correct binaries).

Different Unix systems may support different options. The **-s**, **-n**, **-r**, **-v**, and **-m** options are most portable across Unix variants.

# CAVEATS

On some systems, **-p** and **-i** may return "unknown" if the information isn't available.

The output of **uname -m** varies by system: x86_64, amd64, arm64, aarch64 may represent similar architectures on different systems.

For detailed OS distribution information on Linux, check **/etc/os-release** or use **lsb_release**.

# SEE ALSO

[hostname](/man/hostname)(1), [arch](/man/arch)(1), [hostnamectl](/man/hostnamectl)(1), [lsb_release](/man/lsb_release)(1)

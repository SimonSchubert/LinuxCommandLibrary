# TAGLINE

simple program to insert a module into the Linux kernel

# TLDR

**Insert** a kernel module

```sudo insmod path/to/module.ko```

Insert module with **parameters**

```sudo insmod path/to/module.ko param=value```

# SYNOPSIS

**insmod** [_filename_] [_module options_...]

# DESCRIPTION

**insmod** is a simple program to insert a module into the Linux kernel. It requires the full path to the module file. Unlike modprobe, insmod does not handle dependencies automatically.

# PARAMETERS

_filename_
> Path to the kernel module file (**.ko**). Use **-** to read the module from standard input.

_module options_
> Key=value parameters passed to the module on load.

**-f**, **--force**
> Disable kernel version and vermagic checks. Dangerous: can cause memory corruption or crashes.

**--force-modversion**
> Ignore module version symbol mismatches.

**--force-vermagic**
> Ignore vermagic string mismatches.

**-s**, **--syslog**
> Send error messages to syslog instead of stderr.

**-v**, **--verbose**
> Print detailed information about what insmod is doing.

**-V**, **--version**
> Show program version and exit.

**-h**, **--help**
> Show help and exit.

# CAVEATS

insmod is a low-level tool that does not resolve dependencies and requires the full path to the **.ko** file. Use **modprobe** instead for most cases, as it handles dependencies and uses module names rather than file paths. Detailed error diagnostics typically appear in **dmesg** rather than on stderr. Loading modules requires root privileges.

# HISTORY

**insmod** is part of **kmod**. It provides direct module insertion without the intelligence of modprobe, useful for testing or loading modules not in the standard module path.

# SEE ALSO

[modprobe](/man/modprobe)(8), [rmmod](/man/rmmod)(8), [lsmod](/man/lsmod)(8), [modinfo](/man/modinfo)(8), [depmod](/man/depmod)(8), [kmod](/man/kmod)(8), [dmesg](/man/dmesg)(1)

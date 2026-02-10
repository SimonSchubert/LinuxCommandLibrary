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

**filename**
> Path to the kernel module file (.ko)

**module options**
> Parameters to pass to the module

# CAVEATS

insmod is a low-level tool that does not resolve dependencies. Use **modprobe** instead for most cases, as it handles dependencies and uses module names rather than file paths.

# HISTORY

**insmod** is part of **kmod**. It provides direct module insertion without the intelligence of modprobe, useful for testing or loading modules not in the standard module path.

# SEE ALSO

[modprobe](/man/modprobe)(8), [rmmod](/man/rmmod)(8), [lsmod](/man/lsmod)(8), [modinfo](/man/modinfo)(8)

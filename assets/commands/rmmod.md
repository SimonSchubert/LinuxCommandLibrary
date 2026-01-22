# TLDR

**Remove** a kernel module

```sudo rmmod module_name```

Remove with **verbose** output

```sudo rmmod --verbose module_name```

Remove and log to **syslog**

```sudo rmmod --syslog module_name```

**Force** removal

```sudo rmmod --force module_name```

# SYNOPSIS

**rmmod** [_-f_] [_-s_] [_-v_] _modulename_...

# DESCRIPTION

**rmmod** is a simple program to remove a module from the Linux kernel. It removes only the specified module without handling dependent modules.

# PARAMETERS

**-f, --force**
> Force removal even if module is in use (dangerous)

**-s, --syslog**
> Send errors to syslog instead of stderr

**-v, --verbose**
> Print verbose information

**-V, --version**
> Display version

**-h, --help**
> Display help

# CAVEATS

A module cannot be removed if it is in use by another module or process. Use **modprobe -r** instead for most cases as it handles dependencies. The **--force** option is dangerous and can crash the system.

# HISTORY

**rmmod** is part of **kmod**. It provides direct module removal without the intelligence of modprobe -r.

# SEE ALSO

[modprobe](/man/modprobe)(8), [insmod](/man/insmod)(8), [lsmod](/man/lsmod)(8)

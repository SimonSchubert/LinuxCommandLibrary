# TLDR

**Run** QEMU virtual machine

```virt-qemu-run [path/to/guest.xml]```

Run with **state** directory

```virt-qemu-run -r [path/to/directory] [path/to/guest.xml]```

Run with **verbose** output

```virt-qemu-run -v [path/to/guest.xml]```

Display **help**

```virt-qemu-run -h```

# SYNOPSIS

**virt-qemu-run** [_OPTIONS_] _GUEST.XML_

# PARAMETERS

**-r, --root** _DIR_
> Store state in specified directory

**-v, --verbose**
> Display verbose startup information

**-h, --help**
> Display help information

# DESCRIPTION

**virt-qemu-run** is an experimental tool to run a QEMU guest virtual machine independent of the libvirtd daemon. It provides a way to run VMs using libvirt XML definitions without requiring the full libvirt infrastructure.

This is useful for testing or running isolated VMs without daemon overhead.

# CAVEATS

Experimental tool. Guest XML must be valid libvirt format. Some features may not work without libvirtd. Not recommended for production use.

# SEE ALSO

[virt-manager](/man/virt-manager)(1), [virsh](/man/virsh)(1), [qemu](/man/qemu)(1)

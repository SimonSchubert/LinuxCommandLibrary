# TAGLINE

Run QEMU VMs without libvirtd

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

**-r** _DIR_, **--root** _DIR_
> Store VM state files in the specified directory. Must be removed manually after shutdown. When omitted, a temporary directory is created and cleaned up automatically when the VM exits.

**-s** _SECRET-XML-FILE_,_SECRET-VALUE-FILE_, **--secret** _SECRET-XML-FILE_,_SECRET-VALUE-FILE_
> Load a secret into the secret driver. The XML file defines the secret (UUID must match one referenced in the domain XML); the value file contains the secret data. May be repeated.

**-v**, **--verbose**
> Display verbose startup information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**virt-qemu-run** is an experimental tool to run a QEMU guest virtual machine independent of the **libvirtd** daemon. It provides a way to run VMs using libvirt domain XML definitions without requiring the full libvirt infrastructure. The guest runs in the foreground and the command exits when the guest shuts down.

This is useful for testing, embedded use cases, or running isolated VMs without daemon overhead. Exit status is 0 on successful shutdown and non-zero on failure.

# CAVEATS

Experimental tool; behavior may change between releases. Guest XML must be valid libvirt format. Some features dependent on libvirtd (such as the full device management API) may not work. Not recommended for production use.

# SEE ALSO

[virt-manager](/man/virt-manager)(1), [virsh](/man/virsh)(1), [qemu](/man/qemu)(1)

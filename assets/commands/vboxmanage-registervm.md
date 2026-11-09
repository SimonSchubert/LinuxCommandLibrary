# TAGLINE

Register existing VM with VirtualBox

# TLDR

**Register VM**

```vboxmanage registervm "[path/to/vmname.vbox]"```

**Register an encrypted VM, prompting for its password**

```vboxmanage registervm "[path/to/vmname.vbox]" --password -```

# SYNOPSIS

**vboxmanage** **registervm** _filename_ [**--password** _file_|**-**]

# PARAMETERS

_filename_
> The XML machine configuration file (**.vbox**).

**--password** _file_|**-**
> Encryption password of the VM, from a file or prompted with **-**.

# DESCRIPTION

**vboxmanage registervm** adds an existing VM configuration to VirtualBox. Use after manually copying VM files or to re-register removed VMs. Takes path to .vbox configuration file.

# CAVEATS

The VM cannot have the same UUID as a VM that is already registered. The manual advises placing the configuration file in the machines folder before registering it.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-unregistervm](/man/vboxmanage-unregistervm)(1), [vboxmanage-createvm](/man/vboxmanage-createvm)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-registervm)```

<!-- verified: 2026-11-09 -->

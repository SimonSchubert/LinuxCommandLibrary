# TAGLINE

Start VirtualBox virtual machines

# TLDR

**Start VM with GUI**

```vboxmanage startvm [vmname]```

**Start headless**

```vboxmanage startvm [vmname] --type headless```

**Start with separate frontend**

```vboxmanage startvm [vmname] --type separate```

# SYNOPSIS

**vboxmanage** **startvm** _vmname_ [_options_]

# PARAMETERS

**--type** _type_
> Frontend type: gui, headless, separate.

# DESCRIPTION

**vboxmanage startvm** starts a virtual machine. Supports GUI mode (default), headless (no window), and separate (detached GUI). Use headless for server VMs.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-controlvm](/man/vboxmanage-controlvm)(1)


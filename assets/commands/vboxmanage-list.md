# TAGLINE

List VirtualBox objects and information

# TLDR

**List all VMs**

```vboxmanage list vms```

**List running VMs**

```vboxmanage list runningvms```

**List host info**

```vboxmanage list hostinfo```

**List OS types**

```vboxmanage list ostypes```

**List extension packs**

```vboxmanage list extpacks```

# SYNOPSIS

**vboxmanage** **list** _what_ [_options_]

# PARAMETERS

**vms**
> All registered VMs.

**runningvms**
> Running VMs.

**ostypes**
> Supported OS types.

**hostinfo**
> Host system info.

**hdds**
> Hard disk images.

**dvds**
> DVD images.

**extpacks**
> Extension packs.

**groups**
> VM groups.

**--long**
> Detailed output.

# DESCRIPTION

**vboxmanage list** displays information about VirtualBox objects. Lists VMs, disk images, networks, and system information. Essential for discovering VM names and UUIDs.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)


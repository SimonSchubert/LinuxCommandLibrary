# TAGLINE

List VirtualBox objects and information

# TLDR

**List all VMs**

```vboxmanage list vms```

**List running VMs**

```vboxmanage list runningvms```

**List all VMs with full details**

```vboxmanage list --long vms```

**List host info**

```vboxmanage list hostinfo```

**List OS types**

```vboxmanage list ostypes```

**List extension packs**

```vboxmanage list extpacks```

**List bridgeable host network interfaces**

```vboxmanage list bridgedifs```

# SYNOPSIS

**vboxmanage** **list** [**--long**] [**--platform-arch**=_arch_] [**--sorted**] _what_

# PARAMETERS

**-l**, **--long**
> Detailed output.

**-s**, **--sorted**
> Sort entries alphabetically.

**-p**, **--platform-arch**=**x86**|**arm**
> Filter by platform architecture where applicable.

**vms**
> All registered VMs.

**runningvms**
> Running VMs.

**ostypes**
> Supported OS types.

**ossubtypes**
> Guest OS subtypes.

**hostinfo**
> Host system info.

**hostdrives**, **hostdvds**, **hostfloppies**
> Host storage, DVD and floppy drives.

**hostcpuids**
> CPUID information of the host CPUs.

**hdds**
> Hard disk images.

**dvds**
> DVD images.

**floppies**
> Floppy images.

**hddbackends**
> Virtual disk formats and their capabilities.

**extpacks**
> Extension packs.

**groups**
> VM groups.

**bridgedifs**, **hostonlyifs**, **hostonlynets**, **natnets**, **intnets**, **dhcpservers**
> Host and virtual networking.

**cloudproviders**, **cloudprofiles**, **cloudnets**
> Cloud integration.

**usbhost**, **usbfilters**
> Host USB devices and global USB filters.

**systemproperties**
> Global settings and limits.

**cpu-profiles**
> Known CPU profiles.

**screenshotformats**
> Available screenshot formats.

**webcams**
> Webcams attached to a running VM.

# DESCRIPTION

**vboxmanage list** displays information about VirtualBox objects. Lists VMs, disk images, networks, and system information. Essential for discovering VM names and UUIDs.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-list)```

<!-- verified: 2026-11-09 -->

# TAGLINE

Control running VirtualBox virtual machines

# TLDR

**Pause VM**

```vboxmanage controlvm [vmname] pause```

**Resume VM**

```vboxmanage controlvm [vmname] resume```

**Reset VM**

```vboxmanage controlvm [vmname] reset```

**Power off VM**

```vboxmanage controlvm [vmname] poweroff```

**Save state**

```vboxmanage controlvm [vmname] savestate```

**Send ACPI shutdown** signal (graceful)

```vboxmanage controlvm [vmname] acpipowerbutton```

**Take screenshot**

```vboxmanage controlvm [vmname] screenshotpng [file.png]```

**Set shared clipboard mode**

```vboxmanage controlvm [vmname] clipboard mode bidirectional```

**Connect/disconnect network cable**

```vboxmanage controlvm [vmname] setlinkstate1 [on|off]```

# SYNOPSIS

**vboxmanage** **controlvm** _vmname_ _command_ [_options_]

# PARAMETERS

**pause**
> Suspend VM execution.

**resume**
> Resume paused VM.

**reset**
> Hard reset VM.

**poweroff**
> Force power off.

**savestate**
> Save and stop VM.

**acpipowerbutton**
> Send ACPI shutdown.

**screenshotpng** _file_
> Capture screen.

**setvideomodehint** _w_ _h_ _bpp_
> Set video mode.

**clipboard mode** _disabled|hosttoguest|guesttohost|bidirectional_
> Set shared clipboard mode.

**setlinkstate**_N_ _on|off_
> Connect or disconnect virtual network cable N.

**nic**_N_ _null|nat|bridged|intnet|hostonly_
> Change the type of network adapter N.

**nicpromisc**_N_ _deny|allow-vms|allow-all_
> Set promiscuous mode for network adapter N.

**draganddrop** _disabled|hosttoguest|guesttohost|bidirectional_
> Set drag and drop mode.

# DESCRIPTION

**vboxmanage controlvm** controls running virtual machines. Manage VM state, send input, modify settings on running VMs. Central command for VM runtime control.

# CAVEATS

The **poweroff** and **reset** commands are equivalent to pulling the power cord — use **acpipowerbutton** for graceful shutdown. The VM must be in a running state for most commands. Network-related changes (nic, setlinkstate) take effect immediately on the running VM.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-startvm](/man/vboxmanage-startvm)(1), [vboxmanage-modifyvm](/man/vboxmanage-modifyvm)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)


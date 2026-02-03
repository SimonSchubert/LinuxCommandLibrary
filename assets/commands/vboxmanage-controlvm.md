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

**Take screenshot**

```vboxmanage controlvm [vmname] screenshotpng [file.png]```

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

**clipboard** _mode_
> Set clipboard mode.

# DESCRIPTION

**vboxmanage controlvm** controls running virtual machines. Manage VM state, send input, modify settings on running VMs. Central command for VM runtime control.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-startvm](/man/vboxmanage-startvm)(1)


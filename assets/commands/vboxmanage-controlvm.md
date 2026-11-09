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

**Shut down via Guest Additions**

```vboxmanage controlvm [vmname] shutdown```

**Type text** into the guest

```vboxmanage controlvm [vmname] keyboardputstring "[text]"```

Add a **NAT port forward** on adapter 1

```vboxmanage controlvm [vmname] natpf1 "[ssh],tcp,,[2222],,[22]"```

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
> Cold reset, like pressing a physical Reset button.

**poweroff**
> Power off immediately, like pulling the power cable.

**savestate**
> Save and stop VM.

**acpipowerbutton**
> Send ACPI shutdown.

**acpisleepbutton**
> Send ACPI sleep signal.

**shutdown** [**--force**]
> Ask the guest OS to shut down, optionally forcing it. Requires Guest Additions.

**reboot**
> Ask the guest OS to reboot. Requires Guest Additions.

**keyboardputstring** _string_ [_string..._]
> Send text as keyboard input.

**keyboardputscancode** _hex_ [_hex..._]
> Send raw keyboard scancodes.

**keyboardputfile** _file_
> Send the contents of a file as keyboard input.

**screenshotpng** _file_ [_display_]
> Capture screen to a PNG file.

**setvideomodehint** _xres_ _yres_ _bpp_
> Ask the guest to use a video mode.

**clipboard mode** _disabled|hosttoguest|guesttohost|bidirectional_
> Set shared clipboard mode.

**setlinkstate**_N_ _on|off_
> Connect or disconnect virtual network cable N.

**nic**_N_ _null|nat|bridged|intnet|hostonly|generic|natnetwork_
> Change the type of network adapter N.

**nicpromisc**_N_ _deny|allow-vms|allow-all_
> Set promiscuous mode for network adapter N.

**natpf**_N_ _rulename,tcp|udp,host-ip,hostport,guest-ip,guestport_
> Add a NAT port forwarding rule to adapter N. Use **natpf**_N_ **delete** _rulename_ to remove one.

**draganddrop** _disabled|hosttoguest|guesttohost|bidirectional_
> Set drag and drop mode.

**usbattach** _uuid|address_
> Attach a host USB device. Use **usbdetach** to detach.

**guestmemoryballoon** _size_
> Change the guest memory balloon size in MB.

**cpuexecutioncap** _percent_
> Limit how much host CPU time a virtual CPU can use.

**vrde** _on|off_
> Enable or disable the VirtualBox Remote Desktop server.

**recording** _on|off_
> Enable or disable screen recording.

**webcam** _attach|detach|list_
> Manage webcams passed through to the VM.

# DESCRIPTION

**vboxmanage controlvm** controls running virtual machines: changing VM state, sending keyboard input, and modifying settings at runtime. A VM can be addressed by name or UUID.

# CAVEATS

The **poweroff** and **reset** commands do not save the VM state, so data may be lost; use **acpipowerbutton** or **shutdown** for a graceful shutdown. The VM must be in a running state for most commands. Network-related changes (nic, setlinkstate) take effect immediately on the running VM.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-startvm](/man/vboxmanage-startvm)(1), [vboxmanage-modifyvm](/man/vboxmanage-modifyvm)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html)```

<!-- verified: 2026-11-09 -->

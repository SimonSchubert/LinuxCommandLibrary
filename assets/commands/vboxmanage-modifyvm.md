# TAGLINE

Configure VirtualBox VM settings

# TLDR

**Set memory**

```vboxmanage modifyvm [vmname] --memory=[2048]```

**Set CPUs**

```vboxmanage modifyvm [vmname] --cpus=[2]```

**Enable nested virtualization**

```vboxmanage modifyvm [vmname] --nested-hw-virt=on```

**Configure network**

```vboxmanage modifyvm [vmname] --nic1=nat```

**Forward host port 2222 to guest SSH**

```vboxmanage modifyvm [vmname] --nat-pf1="guestssh,tcp,,2222,,22"```

**Use bridged networking**

```vboxmanage modifyvm [vmname] --nic1=bridged --bridge-adapter1=[eth0]```

**Set boot order**

```vboxmanage modifyvm [vmname] --boot1=dvd --boot2=disk```

# SYNOPSIS

**vboxmanage** **modifyvm** _vmname_|_uuid_ [_options_]

# PARAMETERS

**--name**=_name_
> Rename VM.

**--description**=_text_
> Set the VM description.

**--os-type**=_type_
> Guest OS type; see **vboxmanage list ostypes**.

**--memory**=_mb_
> RAM size in MB.

**--cpus**=_n_
> Number of CPUs.

**--cpu-execution-cap**=_percent_
> Limit CPU time per virtual CPU.

**--nested-hw-virt**=**on**|**off**
> Nested virtualization.

**--firmware**=**bios**|**efi**|**efi32**|**efi64**
> Firmware used to boot the VM.

**--tpm-type**=**none**|**1.2**|**2.0**|**host**|**swtpm**
> Virtual TPM type.

**--boot**_N_=**none**|**floppy**|**dvd**|**disk**|**net**
> Device for boot slot _N_ (1 to 4).

**--vram**=_mb_
> Video memory.

**--graphicscontroller**=**none**|**vboxvga**|**vmsvga**|**vboxsvga**|**qemuramfb**
> Virtual graphics controller.

**--accelerate-3d**=**on**|**off**
> 3D acceleration. Requires Guest Additions.

**--nic**_N_=_type_
> Mode of adapter _N_: **none**, **null**, **nat**, **natnetwork**, **bridged**, **intnet**, **hostonly**, **hostonlynet**, **generic**, **cloud**.

**--nic-type**_N_=_type_
> Emulated hardware, e.g. **82540EM** or **virtio**.

**--bridge-adapter**_N_=_device_
> Host interface for bridged networking.

**--nat-pf**_N_=[_name_],**tcp**|**udp**,[_hostip_],_hostport_,[_guestip_],_guestport_
> Add a NAT port forwarding rule. Use **--nat-pf**_N_=**delete** _name_ to remove one.

**--mac-address**_N_=**auto**|_mac_
> MAC address of the adapter.

**--cable-connected**_N_=**on**|**off**
> Virtual cable state.

**--clipboard-mode**=**disabled**|**hosttoguest**|**guesttohost**|**bidirectional**
> Clipboard sharing. Requires Guest Additions.

**--drag-and-drop**=_mode_
> Drag and drop, with the same mode values as the clipboard.

**--usb-ohci**=**on**|**off**, **--usb-ehci**=**on**|**off**, **--usb-xhci**=**on**|**off**
> USB 1.1, 2.0 and 3.0 controllers.

**--vrde**=**on**|**off**
> Remote display server. **--vrde-port** sets the port.

# DESCRIPTION

**vboxmanage modifyvm** configures virtual machine settings such as CPU, memory, network, display and firmware. Disks and controllers are configured with **storagectl** and **storageattach** instead.

Most options correspond to the VM's Settings dialog in VirtualBox Manager.

# CAVEATS

The VM must be powered off; it cannot be running or in saved state. Use **vboxmanage controlvm** to change some settings at runtime. VirtualBox 7 renamed many options to hyphenated forms (for example **--accelerate3d** is now **--accelerate-3d**); the old spellings are still accepted.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-createvm](/man/vboxmanage-createvm)(1), [vboxmanage-controlvm](/man/vboxmanage-controlvm)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-modifyvm)```

<!-- verified: 2026-11-09 -->

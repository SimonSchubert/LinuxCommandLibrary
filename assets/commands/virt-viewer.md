# TLDR

**Connect to VM**

```virt-viewer [vmname]```

**Connect via URI**

```virt-viewer -c [qemu:///system] [vmname]```

**Connect to remote**

```virt-viewer -c [qemu+ssh://host/system] [vmname]```

**Full screen**

```virt-viewer --full-screen [vmname]```

**Wait for VM**

```virt-viewer --wait [vmname]```

# SYNOPSIS

**virt-viewer** [_-c uri_] [_--full-screen_] [_options_] _vmname_

# PARAMETERS

**-c** _URI_
> Connection URI.

**--full-screen**
> Full screen mode.

**--wait**
> Wait for VM.

**--reconnect**
> Auto reconnect.

**--hotkeys** _KEYS_
> Custom hotkeys.

# DESCRIPTION

**virt-viewer** displays VM console. It connects to VMs.

SPICE and VNC. Protocol support.

Remote connection. SSH tunneling.

Full screen mode. Dedicated display.

USB redirection. Pass devices.

# CAVEATS

libvirt required. VM must be running. X11/Wayland needed.

# HISTORY

**virt-viewer** is part of the **virt-manager** project, providing a minimal tool for viewing VM graphical consoles.

# SEE ALSO

[virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1), [remote-viewer](/man/remote-viewer)(1)

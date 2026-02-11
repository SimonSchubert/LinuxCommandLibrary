# TAGLINE

Display VM graphical console

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

**virt-viewer** is a lightweight graphical console client for viewing the display of virtual machines managed by libvirt. It connects to running VMs and renders their graphical output in a native window, providing a simple alternative to the full virt-manager application when only console access is needed.

The tool supports both SPICE and VNC display protocols, automatically detecting the appropriate connection method from the VM's configuration. Remote connections are supported through SSH tunneling, allowing users to securely access VM consoles on remote hypervisors without exposing display ports directly.

Additional features include full-screen mode for dedicated display use, USB device redirection for passing local hardware to the guest, shared clipboard support, and automatic screen resolution adjustment. The viewer can also wait for a VM to start before connecting, making it useful in scripted or automated workflows.

# CAVEATS

libvirt required. VM must be running. X11/Wayland needed.

# HISTORY

**virt-viewer** is part of the **virt-manager** project, providing a minimal tool for viewing VM graphical consoles.

# SEE ALSO

[virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1), [remote-viewer](/man/remote-viewer)(1)

# TAGLINE

View remote virtual machine displays

# TLDR

**Connect to a SPICE server**

```remote-viewer spice://[host]:[port]```

**Connect to a VNC server**

```remote-viewer vnc://[host]:[port]```

**View a remote desktop using a virt-viewer file**

```remote-viewer [path/to/connection.vv]```

**Connect in fullscreen mode**

```remote-viewer -f spice://[host]:[port]```

**Connect with a custom window title**

```remote-viewer -t "[My VM]" spice://[host]:[port]```

**Connect with a specific zoom level**

```remote-viewer -z [150] spice://[host]:[port]```

# SYNOPSIS

**remote-viewer** [_options_] [_URI_|_file_]

# PARAMETERS

**-f**, **--full-screen**
> Start in fullscreen mode.

**-t** _TITLE_, **--title** _TITLE_
> Set the window title.

**-z** _PCT_, **--zoom=** _PCT_
> Zoom level of the display window in percentage.

**-v**, **--verbose**
> Display information about the connection.

**--spice-controller**
> Use the SPICE controller to initialize the connection.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version number.

# DESCRIPTION

**remote-viewer** is a simple remote display client that supports SPICE and VNC protocols. It can connect to remote virtual machines or physical systems displaying their graphical output.

Connection parameters can be specified via URI on the command line or through a virt-viewer configuration file. The configuration file supports additional parameters like host, port, TLS settings, username, and password.

# CAVEATS

Requires appropriate client libraries for the connection protocol (SPICE, VNC). Display quality depends on network bandwidth.

# HISTORY

Part of **virt-viewer**, providing remote display tools for virtual machine management, commonly used with libvirt and QEMU/KVM.

# SEE ALSO

[virt-viewer](/man/virt-viewer)(1), [virt-manager](/man/virt-manager)(1)

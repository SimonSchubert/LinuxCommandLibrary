# TAGLINE

Transfer files between devices via QR codes

# TLDR

**Send** files or directories

```qrcp send [path/to/files...]```

**Receive** files

```qrcp receive```

Send with **compression**

```qrcp send --zip [path/to/directory]```

Use specific **port**

```qrcp send -p [8080]```

Use specific **network interface**

```qrcp send -i [eth0]```

**Keep server** alive

```qrcp send --keep-alive```

# SYNOPSIS

**qrcp** [**send**|**receive**] [**-p** _port_] [**-i** _interface_] [**--zip**] [**--keep-alive**] [_files_...]

# PARAMETERS

**-p, --port _port_**
> Use specific port number

**-i, --interface _iface_**
> Use specific network interface

**--zip**
> Compress files before transfer

**--keep-alive**
> Keep server running after transfer

**-q, --quiet**
> Quiet mode

# DESCRIPTION

**qrcp** transfers files between devices using QR codes. It starts a temporary web server and displays a QR code that other devices can scan to download or upload files.

The tool is useful for quick file transfers when setting up network shares is impractical. It works across different operating systems as long as the devices are on the same network.

# CAVEATS

Devices must be on the same network. Transfer speed depends on network conditions. Large files may take time over WiFi. Firewall may need port access.

# HISTORY

**qrcp** was created by **Claudio d'Angelis** to simplify file transfers between devices. It eliminates the need for cables, email attachments, or cloud services for quick local transfers.

# SEE ALSO

[wormhole](/man/wormhole)(1), [croc](/man/croc)(1), [rsync](/man/rsync)(1)

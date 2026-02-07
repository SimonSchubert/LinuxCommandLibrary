# TAGLINE

Share files between devices on the local network

# TLDR

**Share** a file

```airshare send [file.txt]```

**Receive** files

```airshare receive [code]```

Share multiple **files**

```airshare send [file1.txt] [file2.txt]```

Share a **directory**

```airshare send [directory/]```

# SYNOPSIS

**airshare** _command_ [_options_] [_files_]

# DESCRIPTION

**airshare** is a cross-platform file sharing tool that transfers files between devices on the same local network. It uses mDNS for device discovery and generates a simple code that recipients use to receive files.

The tool provides a simple alternative to complex file sharing setups, requiring no server configuration or account creation.

# PARAMETERS

**send** _files_
> Share files or directories

**receive** _code_
> Receive files using a share code

**--no-zip**
> Don't compress multiple files

**--port** _port_
> Specify port number

**--clipboard**
> Copy code to clipboard

# CAVEATS

Both devices must be on the same local network. Large files may take time to transfer depending on network speed. No encryption by default on older versions.

# HISTORY

**airshare** was developed as a Python-based alternative to AirDrop for cross-platform local file sharing, leveraging mDNS for zero-configuration networking.

# SEE ALSO

[croc](/man/croc)(1), [wormhole](/man/wormhole)(1), [scp](/man/scp)(1)

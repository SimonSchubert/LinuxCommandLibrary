# TAGLINE

transfers files via OBEX protocol

# TLDR

**List files on device**

```obexftp -b [device_address] -l [/]```

**Download file**

```obexftp -b [device_address] -g [remote_file]```

**Upload file**

```obexftp -b [device_address] -p [local_file]```

**List paired devices**

```obexftp -s```

**Use USB connection**

```obexftp -u [device] -l [/]```

# SYNOPSIS

**obexftp** [_options_] [_command_]

# PARAMETERS

**-b** _ADDRESS_
> Bluetooth device address.

**-u** _DEVICE_
> USB device.

**-l** _PATH_
> List directory.

**-g** _FILE_
> Get/download file.

**-p** _FILE_
> Put/upload file.

**-s**
> Search for devices.

**--help**
> Display help information.

# DESCRIPTION

**obexftp** transfers files via OBEX protocol. Supports Bluetooth and USB.

The tool enables file exchange with mobile devices. Part of OpenOBEX.

# CAVEATS

Requires Bluetooth or USB OBEX support. Device must be paired.

# HISTORY

obexftp was created for **file transfer** using the OBEX protocol over Bluetooth.

# SEE ALSO

[bluetooth](/man/bluetooth)(1), [hcitool](/man/hcitool)(1)


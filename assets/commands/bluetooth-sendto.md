# TLDR

**Open file transfer dialog to select device and files**

```bluetooth-sendto```

**Send a file to a specific Bluetooth device**

```bluetooth-sendto --device=[XX:XX:XX:XX:XX:XX] [path/to/file]```

**Send a file to a device with a specified name**

```bluetooth-sendto --device=[XX:XX:XX:XX:XX:XX] --name="[Device Name]" [path/to/file]```

**Send multiple files to a device**

```bluetooth-sendto --device=[XX:XX:XX:XX:XX:XX] [file1] [file2] [file3]```

# SYNOPSIS

**bluetooth-sendto** [**--device=**_XX:XX:XX:XX:XX:XX_] [**--name=**_NAME_] [_file..._]

# DESCRIPTION

**bluetooth-sendto** is a GTK application for transferring files over Bluetooth. It is part of the **gnome-bluetooth** package and provides a graphical dialog for selecting devices and files to transfer.

When run without arguments, it displays a file chooser and device selection dialog. When a device address is specified, it connects directly to that device. Multiple files can be sent in a single operation.

# PARAMETERS

**--device=**_XX:XX:XX:XX:XX:XX_
> Specify the Bluetooth MAC address of the target device. If omitted, a device chooser dialog is displayed

**--name=**_NAME_
> Specify the device name. If omitted, the name is auto-detected from the device address

**file...**
> One or more files to send. If omitted, a file chooser dialog is displayed

# CAVEATS

Requires Bluetooth to be enabled and the target device to be paired and within range. The receiving device must accept the incoming file transfer request. Part of the GNOME Bluetooth stack, so a GTK environment is required.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1)

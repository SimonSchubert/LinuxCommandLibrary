# TLDR

**List devices**

```kdeconnect-cli --list-available```

**Pair with device**

```kdeconnect-cli --pair -d [device-id]```

**Send file**

```kdeconnect-cli --share [file] -d [device-id]```

**Ring device**

```kdeconnect-cli --ring -d [device-id]```

**Send SMS**

```kdeconnect-cli --send-sms "[message]" --destination [number] -d [device-id]```

**Get battery status**

```kdeconnect-cli --battery -d [device-id]```

# SYNOPSIS

**kdeconnect-cli** [_options_]

# PARAMETERS

**--list-available**
> List available devices.

**--pair**
> Pair with device.

**--unpair**
> Unpair device.

**-d** _DEVICE_
> Target device ID.

**--share** _FILE_
> Send file to device.

**--ring**
> Ring device.

**--send-sms** _MSG_
> Send SMS message.

**--help**
> Display help information.

# DESCRIPTION

**kdeconnect-cli** controls KDE Connect from the command line. It connects Linux desktops with mobile devices.

The tool sends files, notifications, and controls media. It enables phone integration from terminal.

kdeconnect-cli connects to phones.

# CAVEATS

Requires KDE Connect daemon. Devices must be on same network. Phone app needed.

# HISTORY

kdeconnect-cli is part of **KDE Connect**, enabling seamless integration between Linux desktops and Android devices.

# SEE ALSO

[kdeconnect-indicator](/man/kdeconnect-indicator)(1), [gsconnect](/man/gsconnect)(1)

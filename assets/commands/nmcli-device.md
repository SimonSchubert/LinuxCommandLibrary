# TLDR

Show **status** of all network interfaces

```nmcli device```

List available **Wi-Fi networks**

```nmcli device wifi```

**Connect** to a Wi-Fi network

```nmcli device wifi connect ssid --ask```

Show **password** and QR code for current Wi-Fi

```nmcli device wifi show-password```

Show **detailed information** about a device

```nmcli device show wlan0```

# SYNOPSIS

**nmcli device** {_status_|_show_|_set_|_connect_|_reapply_|_modify_|_disconnect_|_delete_|_monitor_|_wifi_|_lldp_} [_ARGUMENTS_]

# DESCRIPTION

**nmcli device** manages network interfaces using NetworkManager. It can show device status, connect to networks, manage Wi-Fi connections, and control interface state.

# COMMANDS

**status**
> Print status of all network devices

**show [ifname]**
> Display detailed information about a device

**set ifname [property value]**
> Set device properties (autoconnect, managed)

**connect ifname**
> Connect a device

**reapply ifname**
> Reapply connection settings to a device

**disconnect ifname**
> Disconnect a device

**delete ifname**
> Delete a software device

**monitor [ifname]**
> Monitor device activity

**wifi list**
> List available Wi-Fi access points

**wifi connect ssid**
> Connect to a Wi-Fi network

**wifi rescan**
> Request a Wi-Fi scan

**wifi show-password**
> Show password for current Wi-Fi connection

**lldp [list]**
> Show LLDP neighbors

# PARAMETERS

**-a, --ask**
> Prompt for password when connecting

**--rescan auto|no|yes**
> Control Wi-Fi scanning before listing

**ifname**
> Network interface name (eth0, wlan0, etc.)

# CAVEATS

Wi-Fi operations require the NetworkManager daemon to be running and the device to be managed. Use **--ask** with wifi connect to interactively enter the password.

# HISTORY

Part of the **nmcli** command-line interface for **NetworkManager**. Provides device-level network management.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-connection](/man/nmcli)(1), [iw](/man/iw)(8), [iwctl](/man/iwctl)(1)

# TAGLINE

legacy BlueZ tool that emulates a Bluetooth HCI device via the hci_vhci kernel module

# TLDR

**Emulate an HCI device with a given local address**

```sudo hciemu [00:11:22:33:44:55]```

**Emulate a specific device type**

```sudo hciemu -d [vhci] [00:11:22:33:44:55]```

**Capture emulated traffic to a snoop file**

```sudo hciemu -s [capture.snoop] [00:11:22:33:44:55]```

**Run in the foreground without detaching**

```sudo hciemu -n [00:11:22:33:44:55]```

# SYNOPSIS

**hciemu** [_options_] _local-address_

# PARAMETERS

**-d** _device_
> Device type to emulate (e.g. vhci).

**-b** _bdaddr_
> Bluetooth device address to emulate.

**-s** _file_
> Write captured HCI packets to a snoop file.

**-n**
> Do not detach from the controlling terminal.

# DESCRIPTION

**hciemu** is a legacy BlueZ test utility that emulates a Bluetooth Host Controller Interface (HCI) device through the **hci_vhci** kernel module. It creates a virtual Bluetooth controller with a given local address, letting the Bluetooth stack and applications be exercised without physical hardware.

# CAVEATS

Requires the **hci_vhci** kernel module and root privileges. This standalone command dates from the pre-BlueZ5 bluez-utils test suite and has been dropped from the tools shipped by current Linux distributions; modern BlueZ only keeps an internal emulator library (used by its own test suite) under the same name, not a user-facing binary. For interactive Bluetooth testing today, use **bluetoothctl**.

# HISTORY

hciemu was part of the original **BlueZ** (bluez-utils) test tools, predating BlueZ5. It has since been removed from mainstream distribution packages.

# SEE ALSO

[hciconfig](/man/hciconfig)(1), [hcitool](/man/hcitool)(1), [bluetoothctl](/man/bluetoothctl)(1)

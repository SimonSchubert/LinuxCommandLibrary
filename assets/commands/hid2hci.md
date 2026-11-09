# TAGLINE

switches Bluetooth USB dongles between HID and HCI modes

# TLDR

**Switch device to HCI mode**

```sudo hid2hci --mode=hci --method=csr --devpath=[/devices/...]```

**Switch Dell device to HCI mode**

```sudo hid2hci --mode=hci --method=dell --devpath=[/devices/...]```

**Switch Logitech device to HCI mode**

```sudo hid2hci --method=logitech-hid --devpath=[/devices/...]```

**Restore device to HID mode**

```sudo hid2hci --mode=hid --method=csr --devpath=[/devices/...]```

# SYNOPSIS

**hid2hci** [_options_]

# PARAMETERS

**-m**, **--mode**=_MODE_
> Target mode to switch the device to: hid or hci (default: hci).

**-M**, **--method**=_METHOD_
> Vendor-specific switching method: csr, csr2, logitech-hid, or dell. Required.

**-p**, **--devpath**=_PATH_
> Device path relative to /sys, as in udev's %p (e.g. /devices/pci0000:00/...). Required.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**hid2hci** switches Bluetooth USB dongles between HID and HCI modes. Some devices boot in HID mode and need switching to function as Bluetooth controllers.

The tool is needed for certain USB Bluetooth adapters that start in keyboard/mouse mode. After switching, bluez can use the device.

# CAVEATS

Device-specific. Requires correct method. Part of BlueZ, only built when enabled at compile time, and installed in the udev helper directory rather than on PATH. It is normally run by udev rules (**hid2hci.rules**), not by hand. The upstream man page spells the Logitech method "logitech-hdi", but the code accepts only **logitech-hid**.

# HISTORY

hid2hci was developed as part of **BlueZ** to handle USB Bluetooth adapters with dual-mode firmware.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [udevadm](/man/udevadm)(8)

# RESOURCES

```[Source code](https://github.com/bluez/bluez)```

<!-- verified: 2026-11-09 -->

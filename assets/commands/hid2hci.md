# TAGLINE

switches Bluetooth USB dongles between HID and HCI modes

# TLDR

**Switch device to HCI mode**

```sudo hid2hci --mode=hci --method=csr --devpath=[/sys/devices/...]```

**Switch Dell device to HCI mode**

```sudo hid2hci --mode=hci --method=dell --devpath=[/sys/devices/...]```

**Restore device to HID mode**

```sudo hid2hci --mode=hid --method=csr --devpath=[/sys/devices/...]```

# SYNOPSIS

**hid2hci** [_options_]

# PARAMETERS

**--mode** _MODE_
> Target mode to switch the device to: hid or hci.

**--method** _METHOD_
> Vendor-specific switching method (csr, csr2, logitech-hdi, dell).

**--devpath** _PATH_
> Device path in /sys.

**--help**
> Display help information.

# DESCRIPTION

**hid2hci** switches Bluetooth USB dongles between HID and HCI modes. Some devices boot in HID mode and need switching to function as Bluetooth controllers.

The tool is needed for certain USB Bluetooth adapters that start in keyboard/mouse mode. After switching, bluez can use the device.

# CAVEATS

Device-specific. Requires correct method. Part of BlueZ package.

# HISTORY

hid2hci was developed as part of **BlueZ** to handle USB Bluetooth adapters with dual-mode firmware.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1)

# TAGLINE

switches Bluetooth USB dongles between HID and HCI modes

# TLDR

**Switch device to HCI mode**

```sudo hid2hci --method=dell [vendor]:[product]```

**Switch Dell device**

```sudo hid2hci --method=dell --devpath=/dev/bus/usb/[bus]/[device]```

**Restore HID mode**

```sudo hid2hci --tohid --devpath=[device-path]```

# SYNOPSIS

**hid2hci** [_options_]

# PARAMETERS

**--method** _METHOD_
> Switching method (dell, csr).

**--devpath** _PATH_
> USB device path.

**--tohid**
> Switch to HID mode.

**--tohci**
> Switch to HCI mode.

**-v**, **--verbose**
> Verbose output.

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

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [usb_modeswitch](/man/usb_modeswitch)(1)

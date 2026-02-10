# TAGLINE

emulates a Bluetooth HCI device

# TLDR

**Start HCI emulator**

```sudo hciemu```

**Emulate specific device**

```sudo hciemu -d [vhci]```

**Set device name**

```sudo hciemu -n [TestDevice]```

**Verbose output**

```sudo hciemu -v```

# SYNOPSIS

**hciemu** [_options_]

# PARAMETERS

**-d** _DEV_
> Device type to emulate.

**-n** _NAME_
> Device name.

**-v**
> Verbose mode.

**-h**
> Display help.

# DESCRIPTION

**hciemu** emulates a Bluetooth HCI (Host Controller Interface) device. It creates virtual Bluetooth adapters for testing.

The tool is useful for Bluetooth protocol testing and development. It enables testing Bluetooth applications without physical hardware.

# CAVEATS

Requires root or Bluetooth permissions. Testing tool only. Part of BlueZ.

# HISTORY

hciemu was developed as part of **BlueZ**, the official Linux Bluetooth stack, for testing and development purposes.

# SEE ALSO

[hciconfig](/man/hciconfig)(1), [hcitool](/man/hcitool)(1), [bluetoothctl](/man/bluetoothctl)(1)

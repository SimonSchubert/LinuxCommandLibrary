# TAGLINE

Trezor hardware wallet command-line interface

# TLDR

**List connected Trezor devices**

```trezorctl list```

**Get device features and info**

```trezorctl get-features```

**Get Bitcoin address** at a specific path

```trezorctl btc get-address -n "m/84'/0'/0'/0/0"```

**Sign a message** with Bitcoin

```trezorctl btc sign-message -n "m/84'/0'/0'/0/0" "[message]"```

**Wipe device** (factory reset)

```trezorctl device wipe```

**Update firmware**

```trezorctl firmware-update```

**Set device label**

```trezorctl device set-label "[My Trezor]"```

**Change PIN**

```trezorctl device change-pin```

# SYNOPSIS

**trezorctl** [_options_] _command_ [_subcommand_] [_arguments_]

# PARAMETERS

**list**
> List all connected Trezor devices.

**get-features**
> Retrieve device information including model, firmware version, and settings.

**btc get-address** **-n** _path_
> Get a Bitcoin address at the specified BIP32 derivation path.

**btc sign-message** **-n** _path_ _message_
> Sign a message using the key at the specified path.

**btc sign-tx**
> Sign a Bitcoin transaction interactively.

**device wipe**
> Wipe the device and reset to factory settings.

**device setup**
> Initialize a new device with seed generation.

**device recover**
> Recover a device using an existing seed phrase.

**device change-pin**
> Change or set the device PIN.

**device set-label** _label_
> Set a custom label for the device.

**device unlock-bootloader**
> Unlock the bootloader for advanced operations.

**firmware-update**
> Update device firmware to the latest version.

**set safety-checks** _strict_|_prompt_
> Set safety check level. Strict enforces full security; prompt allows overrides.

**-v**, **--verbose**
> Enable verbose output.

**--help**
> Show help for a command.

# DESCRIPTION

**trezorctl** is the command-line interface for Trezor hardware wallets, providing advanced control over device configuration, cryptocurrency operations, and security settings. It is part of the trezorlib Python package and communicates with Trezor One, Trezor Model T, and Trezor Safe devices.

The tool enables signing transactions, deriving addresses, managing device settings, updating firmware, and performing recovery operations without using the graphical Trezor Suite application. It supports multiple cryptocurrencies including Bitcoin, Ethereum, and various altcoins.

All sensitive operations require physical confirmation on the device, maintaining security even when using command-line tools. The interface is designed for advanced users who need scriptable access to hardware wallet functions.

# CAVEATS

Requires Python 3.9 or higher and libusb. On Linux, udev rules must be configured for device detection. Some operations like device wipe are irreversible; ensure seed phrase backup before proceeding. The device must be connected and unlocked for most commands.

# HISTORY

**trezorctl** was developed by **SatoshiLabs** as part of the Python tools for Trezor, the first hardware cryptocurrency wallet released in **2014**. The command-line interface evolved alongside the device firmware, adding support for new cryptocurrencies and security features. The tool is maintained in the official trezor-firmware repository.

# SEE ALSO

[gpg](/man/gpg)(1), [openssl](/man/openssl)(1)

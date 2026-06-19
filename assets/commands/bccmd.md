# TAGLINE

Issue BlueCore commands to CSR Bluetooth chips

# TLDR

**Get chip revision**

```bccmd chiprev```

**Get local Bluetooth clock**

```bccmd clock```

**Get random number from device**

```bccmd rand```

**Perform cold reset**

```bccmd coldreset```

**Perform warm reset**

```bccmd warmreset```

**Get PS key value**

```bccmd psget [key]```

**Set PS key value**

```bccmd psset [key] [value]```

**Use specific transport**

```bccmd -t [HCI|USB|BCSP|H4] [command]```

# SYNOPSIS

**bccmd** [_-t transport_] [_-d device_] _command_ [_args_]

# DESCRIPTION

**bccmd** is a utility for the CSR BCCMD interface that issues BlueCore commands to Cambridge Silicon Radio (CSR) Bluetooth devices. It allows direct control of Bluetooth chipset parameters and persistent store values.

The tool is part of the BlueZ Bluetooth stack and provides low-level access to CSR-based Bluetooth controllers.

# PARAMETERS

**-t** _transport_
> Transport type: HCI (default), USB, BCSP, H4. 3WIRE is recognized but not implemented

**-d** _device_
> Device to use (default: first HCI device or /dev/ttyS0 for serial)

**-h, --help**
> Display help information

# COMMANDS

**builddef**
> Get build definitions

**buildname**
> Get build name string

**chiprev**
> Get chip revision

**memtypes**
> Get memory types

**clock**
> Get local Bluetooth clock

**rand**
> Get random number

**keylen** _handle_
> Get current crypt key length

**coldreset**
> Perform cold reset

**warmreset**
> Perform warm reset

**disabletx**
> Disable transmitter

**enabletx**
> Enable transmitter

**singlechan** _channel_
> Lock radio on a specific channel

**hoppingon**
> Revert to channel hopping

**radiotest** _test_
> Run radio tests (tests 4, 6 and 7 are transmit tests)

**psget** _key_
> Get value for a PS key

**psset** _key_ _value_
> Set value for a PS key

**psclr** _key_
> Clear value for a PS key

**pslist**
> List all PS keys

**psread**
> Read all PS keys

**psload** _file_
> Load all PS keys from a PSR file

**pscheck** _file_
> Check the syntax of a PSR file

# CAVEATS

Only works with CSR-based Bluetooth chipsets. Modifying PS keys can alter device behavior including Bluetooth address. Some commands require specific transport connections. Changing device settings may void warranty.

# SEE ALSO

[hciconfig](/man/hciconfig)(1), [hcitool](/man/hcitool)(1), [bluetoothctl](/man/bluetoothctl)(1)

# RESOURCES

```[Source code](https://github.com/bluez/bluez)```

<!-- verified: 2026-06-19 -->

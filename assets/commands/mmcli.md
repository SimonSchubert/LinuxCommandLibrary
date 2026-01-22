# TLDR

**List available modems**

```mmcli --list-modems```

**Print information** about a modem

```mmcli --modem=[modem_id]```

**Enable** a modem

```mmcli --modem=[modem_id] --enable```

**Disable** a modem

```mmcli --modem=[modem_id] --disable```

**List SMS messages** on the modem

```sudo mmcli --modem=[modem_id] --messaging-list-sms```

**Delete SMS message**

```sudo mmcli --modem=[modem_id] --messaging-delete-sms=[sms_path]```

**Monitor modem status** changes

```mmcli --monitor-modems```

# SYNOPSIS

**mmcli** [**--list-modems**] [**--modem** _id_] [**--enable**|**--disable**] [**--messaging-list-sms**] [_options_]

# PARAMETERS

**-L, --list-modems**
> List all available modems

**-m, --modem _id_**
> Specify modem by index or DBus path

**-M, --monitor-modems**
> Monitor modem status changes

**-e, --enable**
> Enable the specified modem

**-d, --disable**
> Disable the specified modem

**-r, --reset**
> Reset the modem

**--factory-reset _code_**
> Reset modem to factory state with unlock code

**--command _at_command_**
> Send raw AT command to modem

**--messaging-list-sms**
> List SMS messages on modem

**--messaging-create-sms _properties_**
> Create new SMS message

**--messaging-delete-sms _sms_**
> Delete SMS message

**-S, --scan-modems**
> Scan for new modems

**--output-json**
> Output in JSON format

**--output-keyvalue**
> Output as key-value pairs

**-v, --verbose**
> Enable verbose output

# DESCRIPTION

**mmcli** is a command-line interface for ModemManager, a DBus-powered daemon that provides unified control of mobile broadband modems on Linux. It supports various modem types including USB modems, embedded cellular modules, and phone tethering.

The tool can enable/disable modems, manage connections, send/receive SMS, control GPS functionality, scan for networks, and perform SIM operations. It communicates with ModemManager through DBus.

# CAVEATS

Some operations require root privileges, particularly SMS and connection management. Modem indices may change across reboots or device reconnections; use DBus paths for stable identification. Factory reset requires carrier-specific unlock codes and erases all modem configuration.

# HISTORY

**mmcli** is part of **ModemManager**, developed by the freedesktop.org community. ModemManager provides a unified high-level API for mobile broadband modems, abstracting differences between vendor implementations. It is commonly used with NetworkManager for mobile connectivity.

# SEE ALSO

[ModemManager](/man/ModemManager)(8), [NetworkManager](/man/NetworkManager)(8), [nmcli](/man/nmcli)(1)

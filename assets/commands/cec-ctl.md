# TLDR

**List** CEC devices

```cec-ctl --list-devices```

**Monitor** CEC traffic

```sudo cec-ctl -m```

Show **CEC topology**

```cec-ctl -S```

# SYNOPSIS

**cec-ctl** [_options_]

# DESCRIPTION

**cec-ctl** controls kernel CEC (Consumer Electronics Control) devices. It provides low-level access to the CEC subsystem for monitoring traffic, configuring adapters, and sending commands.

This tool uses the kernel's CEC framework directly, unlike cec-client which uses libCEC.

# PARAMETERS

**--list-devices**
> List available CEC devices

**-m, --monitor**
> Monitor CEC traffic on the bus

**-S, --show-topology**
> Display the CEC device topology

**-d** _device_
> Use specific CEC device

**-p** _addr_
> Set physical address

**-o** _addr_
> Set logical address

# CAVEATS

Requires kernel CEC support (CONFIG_CEC). Monitor mode requires root privileges. Not all HDMI ports support CEC.

# SEE ALSO

[cec-client](/man/cec-client)(1)

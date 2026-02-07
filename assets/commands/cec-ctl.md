# TAGLINE

kernel CEC device control tool

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

**cec-ctl** controls kernel CEC (Consumer Electronics Control) devices through the Linux kernel's native CEC framework. It provides low-level access to the CEC subsystem for monitoring traffic, configuring adapters, and sending commands directly via the kernel driver.

Unlike cec-client which relies on the userspace libCEC library and requires a USB CEC adapter, cec-ctl works with CEC hardware integrated into graphics cards and SoCs that expose `/dev/cecN` device nodes. This makes it the preferred tool on platforms with built-in CEC support, such as many ARM-based media players and modern Intel GPUs.

The monitor mode (`-m`) is particularly useful for debugging CEC communication issues, as it displays all CEC traffic on the bus in real time.

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

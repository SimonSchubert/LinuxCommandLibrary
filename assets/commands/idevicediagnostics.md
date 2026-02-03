# TLDR

**Restart device**

```idevicediagnostics restart```

**Shutdown device**

```idevicediagnostics shutdown```

**Put device to sleep**

```idevicediagnostics sleep```

**Get diagnostics info**

```idevicediagnostics diagnostics```

**Get battery info**

```idevicediagnostics diagnostics Battery```

# SYNOPSIS

**idevicediagnostics** [_options_] _command_

# SUBCOMMANDS

**diagnostics** [_type_]
> Get diagnostic information.

**restart**
> Restart the device.

**shutdown**
> Shut down the device.

**sleep**
> Put device to sleep.

# PARAMETERS

**-u** _udid_
> Target specific device.

**-n**
> Connect over network.

# DESCRIPTION

**idevicediagnostics** performs diagnostic commands on iOS devices. Part of the libimobiledevice suite. Can restart, shutdown, or sleep devices, and retrieve diagnostic information about battery, gas gauge, and NAND storage.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [idevicecrashreport](/man/idevicecrashreport)(1)


# TLDR

Display **temperature** of a SATA drive

```hddtemp SATA:/dev/sda```

Display in **Fahrenheit**

```hddtemp -u F SATA:/dev/sda```

Display **numeric** value only

```hddtemp -n SATA:/dev/sda```

Log to **syslog** every N seconds

```hddtemp -S 60 SATA:/dev/sda```

**Wake** drive before reading temperature

```hddtemp -w SATA:/dev/sda```

Run in **daemon** mode

```hddtemp -d SATA:/dev/sda```

Show **debug** information

```hddtemp -D SATA:/dev/sda```

# SYNOPSIS

**hddtemp** [_options_] [_type_]:_device_

# DESCRIPTION

**hddtemp** displays the temperature of hard disk drives via S.M.A.R.T. (Self-Monitoring, Analysis and Reporting Technology). It can show temperature for SATA, PATA, and SCSI drives that support S.M.A.R.T.

# PARAMETERS

**-n, --numeric**
> Print only the numeric temperature value without units

**-u, --unit=UNIT**
> Set temperature unit (C for Celsius, F for Fahrenheit)

**-S, --syslog=SECONDS**
> Log temperatures to syslog every N seconds

**-d, --daemon**
> Run as daemon (TCP/IP server mode)

**-l, --listen=ADDR**
> Listen on specified address in daemon mode

**-p, --port=PORT**
> Listen on specified port in daemon mode (default: 7634)

**-w, --wake-up**
> Wake up the drive before reading temperature

**-q, --quiet**
> Suppress drive type compatibility warnings

**-D, --debug**
> Show S.M.A.R.T. fields and their values

**-f, --file=FILE**
> Use specified drive database file

# CAVEATS

Requires root privileges to access drive S.M.A.R.T. data. The drive type prefix (SATA, PATA, SCSI) is required for proper operation. Not all drives support temperature monitoring through S.M.A.R.T.

# HISTORY

**hddtemp** was developed to provide simple temperature monitoring for hard drives using S.M.A.R.T. data, commonly used for system health monitoring.

# SEE ALSO

[smartctl](/man/smartctl)(8), [sensors](/man/sensors)(1), [lm-sensors](/man/lm-sensors)(1)

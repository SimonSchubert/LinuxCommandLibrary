# TLDR

**Show device date and time**

```idevicedate```

**Set date and time**

```idevicedate -s "[2024-01-15 10:30:00]"```

**Show in UTC**

```idevicedate -u```

**Target specific device**

```idevicedate -u [device-udid]```

# SYNOPSIS

**idevicedate** [_options_]

# PARAMETERS

**-s** _datetime_
> Set device date/time.

**-u**
> Show time in UTC.

**-c**
> Use current host time.

**-n**
> Connect over network.

# DESCRIPTION

**idevicedate** displays or sets the date and time on iOS devices. Part of the libimobiledevice suite. Can synchronize device time with host system.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [date](/man/date)(1)


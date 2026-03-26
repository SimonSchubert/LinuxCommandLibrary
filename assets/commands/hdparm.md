# TAGLINE

Get and set SATA/IDE hard drive parameters

# TLDR

**Get device identification info**

```sudo hdparm -I [/dev/sda]```

**Test buffered and cached read speed**

```sudo hdparm -tT [/dev/sda]```

**Get or set write-caching**

```sudo hdparm -W [1] [/dev/sda]```

**Show current power mode status**

```sudo hdparm -C [/dev/sda]```

**Set Advanced Power Management level** (1-127 allow spindown, 128-254 keep spinning)

```sudo hdparm -B [127] [/dev/sda]```

**Set standby timeout** (value in 5-second increments, 0 to disable)

```sudo hdparm -S [60] [/dev/sda]```

**Force drive into standby mode**

```sudo hdparm -y [/dev/sda]```

# SYNOPSIS

**hdparm** [_OPTIONS_] _device_

# DESCRIPTION

**hdparm** gets and sets SATA/IDE hard drive parameters. It can display device information, configure power management settings, test performance, and enable or disable drive features.

# PARAMETERS

**-I**
> Display detailed device identification

**-i**
> Display kernel's cached identification info

**-B** [_value_]
> Get or set Advanced Power Management (1-254)

**-C**
> Display current power mode status

**-S** _value_
> Set standby timeout (0=off, 1-240=5s increments, 241-251=30m increments)

**-y**
> Force drive into standby mode

**-Y**
> Force drive into sleep mode (may require hard reset)

**-t**
> Test buffered read speed

**-T**
> Test cache read speed

**-g**
> Display drive geometry (cylinders, heads, sectors, size)

**-M** [_value_]
> Get or set Automatic Acoustic Management (0=off, 128=quiet, 254=fast)

**-W** [_value_]
> Get or set write-caching (0=off, 1=on)

**-F**
> Flush drive write cache

**--security-erase** _password_
> Secure erase the drive (WARNING: destroys all data)

# CAVEATS

Some features require kernel and hardware support. APM values 1-127 allow spindown while 128-254 keep the drive spinning. Sleep mode (-Y) may require power cycling to recover. When no options are given, -acdgkmur is assumed.

# HISTORY

**hdparm** has been the standard Linux tool for drive parameter control since the early days of IDE drives.

# SEE ALSO

[smartctl](/man/smartctl)(8), [blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8)

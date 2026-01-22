# TLDR

Get device **identification**

```sudo hdparm -I /dev/sda```

Get **APM** level

```sudo hdparm -B /dev/sda```

Set **APM** value

```sudo hdparm -B 127 /dev/sda```

Show **power mode**

```sudo hdparm -C /dev/sda```

Enter **standby** mode

```sudo hdparm -y /dev/sda```

Set **idle timeout**

```sudo hdparm -S 60 /dev/sda```

**Test** read speed

```sudo hdparm -tT /dev/sda```

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

**--security-erase** _password_
> Secure erase the drive

# CAVEATS

Some features require kernel and hardware support. APM values 1-127 allow spindown while 128-254 keep the drive spinning. Sleep mode may require power cycling to recover.

# HISTORY

**hdparm** has been the standard Linux tool for drive parameter control since the early days of IDE drives.

# SEE ALSO

[smartctl](/man/smartctl)(8), [blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8)

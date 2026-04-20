# TAGLINE

provides a command-line interface to the Intelligent Platform Management

# TLDR

Show **chassis power status**

```sudo ipmitool chassis status```

**Power on / off / cycle** the server remotely

```ipmitool -I lanplus -H [ip] -U [user] -P [pass] chassis power on```

Read all **sensors**

```sudo ipmitool sensor list```

Show **System Event Log** (SEL)

```sudo ipmitool sel list```

Configure **IPMI LAN** on channel 1

```sudo ipmitool lan print 1```

Activate **Serial-over-LAN** console

```ipmitool -I lanplus -H [ip] -U [user] sol activate```

# SYNOPSIS

**ipmitool** [_options_] _command_

# PARAMETERS

**-H** _HOST_
> Remote host IP address or hostname

**-U** _USER_
> Remote username

**-P** _PASSWORD_
> Remote password (or use -E to read from environment)

**-I** _INTERFACE_
> Interface type: open, lan, lanplus

**shell**
> Interactive IPMI shell

**sensor**
> Display sensor information

**chassis**
> Chassis commands (power, status, identify)

**lan**
> Configure LAN settings

**user**
> User management commands

**sol**
> Serial-over-LAN commands

# DESCRIPTION

**ipmitool** provides a command-line interface to the Intelligent Platform Management Interface (IPMI). IPMI enables out-of-band management of servers, including power control, hardware monitoring, and remote console access.

Common operations include checking sensor readings (temperatures, voltages, fan speeds), controlling power state, and accessing the serial console over the network. IPMI works independently of the main operating system.

# CAVEATS

IPMI access requires proper BMC configuration. Network access uses UDP ports 623 (IPMI) and may require firewall rules. lanplus interface provides encrypted communication. Local access requires the ipmi kernel modules.

# HISTORY

IPMI was developed by Intel, HP, NEC, and Dell starting in **1998**. ipmitool became the standard open-source tool for IPMI management on Linux systems, supporting both local and remote operations.

# SEE ALSO

[systemctl](/man/systemctl)(1), [dmidecode](/man/dmidecode)(8)

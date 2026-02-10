# TAGLINE

provides a command-line interface to the Intelligent Platform Management

# TLDR

Start the **IPMI driver** for local connections

```systemctl start ipmidrv```

Open IPMI **shell** on local hardware

```sudo ipmitool shell```

Open IPMI shell on **remote host**

```ipmitool -H [ip_address] -U [username] shell```

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

[ipmi-sensors](/man/ipmi-sensors)(8), [ipmi-chassis](/man/ipmi-chassis)(8), [bmc-info](/man/bmc-info)(8)

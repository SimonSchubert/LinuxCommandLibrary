# TAGLINE

multi-vendor SSH library for Python that simplifies CLI interactions

# TLDR

**Connect and send command (Python)**

```from netmiko import ConnectHandler; net_connect = ConnectHandler(**device); print(net_connect.send_command("show ip int brief"))```

**Send config commands**

```net_connect.send_config_set(["interface gi0/1", "description WAN"])```

**Save configuration**

```net_connect.save_config()```

**Enable mode**

```net_connect.enable()```

**Run a show command** from the shell against a device or group in the inventory

```netmiko-show --cmd "[show version]" [device_or_group]```

**Search device output** for a pattern (defaults to show run)

```netmiko-grep "[pattern]" [device_or_group]```

**Push configuration** from the shell

```netmiko-cfg --cmd "[logging buffered 20000]" [device_or_group]```

**List the devices** in the inventory

```netmiko-show --list-devices```

# SYNOPSIS

**from netmiko import ConnectHandler**

**netmiko-show** [_options_] [**--cmd** _command_] _device_or_group_

**netmiko-grep** [_options_] [**--cmd** _command_] _pattern_ _device_or_group_

**netmiko-cfg** [_options_] [**--cmd** _command_ | **--infile** _file_] _device_or_group_

# DESCRIPTION

**Netmiko** is a multi-vendor SSH library for Python that simplifies CLI interactions with network devices. It handles connection setup, privilege escalation, and output parsing.

Netmiko supports Cisco, Juniper, Arista, HP, and many other vendors.

The package also installs the **netmiko-show**, **netmiko-grep**, **netmiko-cfg**, **netmiko-encrypt** and **netmiko-bulk-encrypt** commands. The first three read devices and groups from a **.netmiko.yml** inventory in the current or home directory, and accept **--username**, **--password**, **--secret**, **--json** and **--raw**.

# EXAMPLE

```python
from netmiko import ConnectHandler

device = {
    'device_type': 'cisco_ios',
    'host': '192.168.1.1',
    'username': 'admin',
    'password': 'password',
}

net_connect = ConnectHandler(**device)
output = net_connect.send_command("show version")
net_connect.disconnect()
```

# SUPPORTED PLATFORMS

```
cisco_ios, cisco_xe, cisco_nxos
juniper_junos, arista_eos
hp_procurve, fortinet
linux, generic_termserver
```

# CAVEATS

Requires Python 3.11+. SSH must be enabled on devices. Some devices need special handling. Blocking operations by default.

# HISTORY

Netmiko was created by **Kirk Byers** in **2014** to simplify Python-based network automation over SSH.

# SEE ALSO

[napalm](/man/napalm)(1), [ansible](/man/ansible)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/ktbyers/netmiko)```

```[Documentation](https://ktbyers.github.io/netmiko/)```

<!-- verified: 2026-11-09 -->

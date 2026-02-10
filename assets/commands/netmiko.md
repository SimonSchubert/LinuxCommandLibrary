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

# SYNOPSIS

**netmiko** - Python library for SSH to network devices

# DESCRIPTION

**Netmiko** is a multi-vendor SSH library for Python that simplifies CLI interactions with network devices. It handles connection setup, privilege escalation, and output parsing.

Netmiko supports Cisco, Juniper, Arista, HP, and many other vendors.

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

SSH must be enabled on devices. Some devices need special handling. Blocking operations by default.

# HISTORY

Netmiko was created by **Kirk Byers** in **2014** to simplify Python-based network automation over SSH.

# SEE ALSO

[napalm](/man/napalm)(1), [paramiko](/man/paramiko)(1), [ansible](/man/ansible)(1)

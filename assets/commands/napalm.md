# TLDR

**Get device facts**

```napalm --user [admin] --password [pass] --vendor [ios] [192.168.1.1] call get_facts```

**Get interfaces**

```napalm --user [admin] --password [pass] --vendor [junos] [device] call get_interfaces```

**Configure device**

```napalm --user [admin] --password [pass] --vendor [eos] [device] configure [config.txt]```

**Validate configuration**

```napalm --user [admin] --password [pass] --vendor [nxos] [device] validate [validation.yml]```

# SYNOPSIS

**napalm** [_options_] _hostname_ _command_ [_args_]

# PARAMETERS

**--user** _username_
> Device username.

**--password** _password_
> Device password.

**--vendor** _vendor_
> Device vendor (ios, junos, eos, nxos).

**--optional_args** _args_
> Optional connection arguments.

**call** _method_
> Call NAPALM method.

**configure** _file_
> Apply configuration.

**validate** _file_
> Validate configuration.

# DESCRIPTION

**NAPALM** (Network Automation and Programmability Abstraction Layer with Multivendor support) is a Python library for network automation. It provides a unified API to interact with different network vendors.

The CLI tool provides quick access to NAPALM functionality.

# SUPPORTED VENDORS

```
ios, iosxr, nxos, eos
junos, fortios, panos
```

# CAVEATS

Requires vendor-specific libraries. SSH/API access must be configured. Python library more powerful than CLI.

# HISTORY

NAPALM was created by **David Barroso** and others at Spotify in **2015** to simplify multi-vendor network automation.

# SEE ALSO

[netmiko](/man/netmiko)(1), [ansible](/man/ansible)(1), [nornir](/man/nornir)(1)

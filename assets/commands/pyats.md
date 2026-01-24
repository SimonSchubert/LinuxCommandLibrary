# TLDR

**Run test script**

```pyats run job [job.py]```

**Parse device output**

```pyats parse "[show version]" --testbed [testbed.yaml]```

**Learn device feature**

```pyats learn [interface] --testbed [testbed.yaml]```

**Compare states**

```pyats diff [snapshot1] [snapshot2]```

**Shell with testbed**

```pyats shell --testbed [testbed.yaml]```

**Validate testbed**

```pyats validate testbed [testbed.yaml]```

**Create testbed**

```pyats create testbed interactive```

# SYNOPSIS

**pyats** _command_ [_options_] [_args_]

# PARAMETERS

**run**
> Execute test jobs.

**parse**
> Parse command output.

**learn**
> Learn device state.

**diff**
> Compare snapshots.

**shell**
> Interactive shell.

**validate**
> Validate configuration.

**create**
> Create configurations.

**--testbed** _FILE_
> Testbed YAML file.

**--device** _NAME_
> Specific device.

# DESCRIPTION

**pyats** is Cisco's network test automation framework. It automates network device testing and validation.

Testbeds define network topology. Devices, connections, and credentials are specified.

Parsing extracts structured data from CLI output. Genie parsers handle many show commands.

Learning captures device state. Features like interfaces, routing, and VLANs.

Diff compares states over time. Changes are highlighted for troubleshooting.

# CAVEATS

Cisco-focused but supports others. Learning curve for test scripting. Testbed setup required.

# HISTORY

**pyATS** (Python Automated Test System) was developed by **Cisco** for internal network testing. Released as open source to enable network test automation.

# SEE ALSO

[ansible](/man/ansible)(1), [netmiko](/man/netmiko)(1), [napalm](/man/napalm)(1)

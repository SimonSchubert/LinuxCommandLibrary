# TAGLINE

Cisco network test automation framework

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

**pyats** (Python Automated Test System) is Cisco's open-source network test automation framework for validating network device configurations and behavior. It uses YAML testbed files to define network topology, device connections, and credentials, providing a structured approach to automated network testing.

The framework includes a powerful parsing engine (Genie) that converts unstructured CLI output from show commands into structured Python dictionaries across hundreds of device types. The **learn** feature captures comprehensive device state for features like interfaces, routing tables, and VLANs, while **diff** compares snapshots taken at different times to identify configuration drift or changes after maintenance windows.

# CAVEATS

Cisco-focused but supports others. Learning curve for test scripting. Testbed setup required.

# HISTORY

**pyATS** (Python Automated Test System) was developed by **Cisco** for internal network testing. Released as open source to enable network test automation.

# SEE ALSO

[ansible](/man/ansible)(1), [netmiko](/man/netmiko)(1), [napalm](/man/napalm)(1)

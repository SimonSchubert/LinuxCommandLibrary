# TAGLINE

Cisco network test automation framework

# TLDR

**Run a test job** against a testbed

```pyats run job [job.py] --testbed-file [testbed.yaml]```

**Parse device output** into structured JSON

```pyats parse "[show version]" --testbed-file [testbed.yaml] --devices [device]```

**Learn a device feature** and save the snapshot

```pyats learn [interface] --testbed-file [testbed.yaml] --output [snapshot_dir]```

**Compare two snapshots**

```pyats diff [snapshot1] [snapshot2]```

**Open a Python shell** with the testbed loaded

```pyats shell --testbed-file [testbed.yaml]```

**Validate a testbed** file

```pyats validate testbed [testbed.yaml]```

**Create a testbed** interactively

```pyats create testbed interactive --output [testbed.yaml]```

**View the latest results** in a browser

```pyats logs view --latest```

# SYNOPSIS

**pyats** _command_ [_subcommand_] [_options_] [_args_]

# PARAMETERS

**run** job|robot|manifest
> Execute test jobs, Robot Framework scripts or manifests.

**parse** _commands_
> Run show commands and parse their output. **all** parses every supported command.

**learn** _features_
> Learn the operational state of device features. **all** learns every feature.

**diff** _pre_ _post_
> Compare snapshot files or directories produced by **parse** and **learn**.

**shell**
> Interactive Python shell with a global **testbed** variable.

**validate** testbed|datafile|jinja2_config
> Validate YAML files and Jinja2 configs.

**create** project|testbed
> Generate a project from a template or a testbed file.

**logs** list|view
> List log archives or open them in a browser.

**clean**, **migrate**, **secret**, **version**
> Device cleaning, migration helpers, credential handling and package versions.

**-t**, **--testbed-file** _FILE_
> Testbed YAML file.

**--devices** _NAMES_
> Devices to operate on (**parse**, **learn**).

**--output** _DIR_
> Output directory for **parse**, **learn** and **diff**; output file for **create testbed**.

**--via** _DEVICE:CONNECTION_
> Connection to use per device (**parse**, **learn**).

**--exclude** _KEYS_
> Keys to skip when comparing (**diff**).

**--connect**
> Also connect to the devices (**validate testbed**).

**--html-logs** [_DIR_]
> Generate HTML logs (**run job**).

**--archive-dir** _DIR_
> Alternate archive directory (**run job**).

**--no-ipython**
> Use the standard Python shell (**shell**).

**-v**, **--verbose** / **-q**, **--quiet**
> Increase or decrease output, additive up to three times.

# DESCRIPTION

**pyats** (Python Automated Test System) is Cisco's network test automation framework for validating network device configurations and behavior. It uses YAML testbed files to define network topology, device connections, and credentials, providing a structured approach to automated network testing.

The framework includes a parsing engine (Genie) that converts unstructured CLI output from show commands into structured Python dictionaries across Cisco platforms. The **learn** feature captures comprehensive device state for features like interfaces, routing tables, and VLANs, while **diff** compares snapshots taken at different times to identify configuration drift or changes after maintenance windows.

# CAVEATS

Cisco-focused but supports others. Learning curve for test scripting. Testbed setup required. **parse**, **learn** and **diff** need the Genie library (**pip install pyats[full]**), and **create testbed** needs the **pyats.contrib** package. Available **run job** flags vary with the plugin configuration.

# HISTORY

**pyATS** (Python Automated Test System) was developed by **Cisco** for internal network testing and released to the public free of charge through Cisco DevNet. The core is distributed in binary form and remains closed source, while companion packages such as Genie parsers and Unicon plugins are open source.

# SEE ALSO

[ansible](/man/ansible)(1), [netmiko](/man/netmiko)(1), [napalm](/man/napalm)(1)

# RESOURCES

```[Source code](https://github.com/CiscoTestAutomation/pyats.contrib)```

```[Homepage](https://developer.cisco.com/pyats/)```

```[Documentation](https://pubhub.devnetcloud.com/media/pyats/docs/cli/pyats.html)```

<!-- verified: 2026-11-09 -->

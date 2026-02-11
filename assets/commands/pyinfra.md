# TAGLINE

Automate infrastructure deployment with Python

# TLDR

**Deploy to servers**

```pyinfra [inventory] [deploy.py]```

**Run command on servers**

```pyinfra [inventory] exec -- [command]```

**Check what would change**

```pyinfra --dry [inventory] [deploy.py]```

**Deploy with facts**

```pyinfra [inventory] fact [server.Hostname]```

# SYNOPSIS

**pyinfra** [_options_] _inventory_ _operations_

# PARAMETERS

_INVENTORY_
> Target hosts file.

_OPERATIONS_
> Deploy script or commands.

**--dry**
> Dry run mode.

**exec**
> Execute command.

**fact**
> Get server facts.

**-v**
> Verbose output.

# DESCRIPTION

**pyinfra** automates infrastructure provisioning and configuration management using Python. Deploy scripts are written as regular Python files that describe desired system state through operations like installing packages, managing files, configuring services, and executing commands across groups of servers.

The tool connects to targets over SSH without requiring agents on remote machines, making it lightweight to adopt. An inventory file defines target hosts and groups, while deploy scripts specify what operations to run. The **--dry** flag previews changes before applying them, and the **fact** command gathers system information from targets for conditional logic in deployments.

# CONFIGURATION

**inventory.py**
> Default inventory file defining target hosts, groups, and connection details for deployments.

**deploy.py**
> Default deploy script containing operations to execute on target hosts.

**group_data/*.py**
> Group-specific data files providing variables for host groups defined in the inventory.

**config.py**
> Project-level configuration for SSH settings, sudo behavior, and operation defaults.

# CAVEATS

Python required. SSH-based deployment.

# HISTORY

pyinfra was created for **Python-based** infrastructure automation.

# SEE ALSO

[ansible](/man/ansible)(1), [fabric](/man/fabric)(1), [salt](/man/salt)(1)


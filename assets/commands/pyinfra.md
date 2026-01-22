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

**pyinfra** automates infrastructure with Python. Configuration management.

The tool deploys to servers. Agentless automation.

pyinfra manages infrastructure.

# CAVEATS

Python required. SSH-based deployment.

# HISTORY

pyinfra was created for **Python-based** infrastructure automation.

# SEE ALSO

[ansible](/man/ansible)(1), [fabric](/man/fabric)(1), [salt](/man/salt)(1)


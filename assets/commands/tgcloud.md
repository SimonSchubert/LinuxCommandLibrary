# TAGLINE

Manage TigerGraph Cloud instances

# TLDR

**List instances**

```tgcloud instance list```

**Create instance**

```tgcloud instance create [name]```

**Delete instance**

```tgcloud instance delete [name]```

**Show status**

```tgcloud instance status [name]```

**Start instance**

```tgcloud instance start [name]```

# SYNOPSIS

**tgcloud** _command_ [_subcommand_] [_options_]

# PARAMETERS

**instance**
> Instance operations.

**list**
> List instances.

**create**
> Create instance.

**delete**
> Delete instance.

**status**
> Show status.

**--help**
> Show help.

# DESCRIPTION

**tgcloud** is the command-line interface for managing TigerGraph Cloud graph database instances. It provides programmatic control over cloud-hosted TigerGraph deployments, enabling instance lifecycle management including creation, deletion, starting, stopping, and status monitoring.

The tool is designed for automation and scripting workflows, allowing DevOps teams to manage TigerGraph Cloud infrastructure from the terminal or CI/CD pipelines without using the web console.

# CAVEATS

TigerGraph account needed. Cloud service. Authentication required.

# HISTORY

**tgcloud** is the CLI tool for managing **TigerGraph Cloud** graph database instances.

# SEE ALSO

[gsql](/man/gsql)(1), [neo4j](/man/neo4j)(1)

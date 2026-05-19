# TAGLINE

Manage TigerGraph Cloud instances

# TLDR

**Log in** to TigerGraph Cloud

```tgcloud login```

**List solutions** (cloud instances)

```tgcloud solution list```

**Create a solution** interactively

```tgcloud solution create```

**Start a solution**

```tgcloud solution start [solution_id]```

**Stop a solution**

```tgcloud solution stop [solution_id]```

**Terminate (delete) a solution**

```tgcloud solution terminate [solution_id]```

**Backup a solution**

```tgcloud backup create [solution_id]```

# SYNOPSIS

**tgcloud** _command_ [_subcommand_] [_options_]

# SUBCOMMANDS

**login**
> Authenticate against TigerGraph Cloud using your account credentials or API token.

**logout**
> Sign out of the current session.

**solution list**
> List all solutions (cloud instances) in the account.

**solution create**
> Create a new solution (configure region, tier, version, etc.).

**solution start** _id_ / **solution stop** _id_
> Start or stop a solution.

**solution terminate** _id_
> Permanently delete a solution and its data.

**backup create** _id_ / **backup list** _id_ / **backup restore** _id_
> Manage solution backups.

**user list**
> List users in the organization.

# PARAMETERS

**--help**, **-h**
> Show command help.

**--verbose**
> Verbose output.

# DESCRIPTION

**tgcloud** is the command-line interface for managing TigerGraph Cloud graph database instances ("solutions"). It provides programmatic control over cloud-hosted TigerGraph deployments, enabling instance lifecycle management (create, start, stop, terminate), backup operations, and user/organization management.

The tool is designed for automation and scripting workflows, allowing DevOps teams to manage TigerGraph Cloud infrastructure from the terminal or CI/CD pipelines without using the web console.

# CAVEATS

Requires a TigerGraph Cloud account and active subscription. Authentication via **tgcloud login** is mandatory before other commands. Terminate operations are irreversible and delete all data in the solution unless a backup exists.

# HISTORY

**tgcloud** is the official CLI for **TigerGraph Cloud**, the managed offering of the TigerGraph graph database platform.

# SEE ALSO

[gsql](/man/gsql)(1), [neo4j](/man/neo4j)(1)

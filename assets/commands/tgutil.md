# TAGLINE

TigerGraph database administration utilities

# TLDR

**Show utility help**

```tgutil --help```

**Backup operation**

```tgutil backup```

**Restore operation**

```tgutil restore```

**Show status**

```tgutil status```

# SYNOPSIS

**tgutil** _command_ [_options_]

# PARAMETERS

**backup**
> Backup database.

**restore**
> Restore from backup.

**status**
> Show status.

**--help**
> Show help.

**--config** _FILE_
> Config file.

# DESCRIPTION

**tgutil** provides administrative utilities for TigerGraph graph database installations. It handles core operations including database backup and restore, system status monitoring, and configuration management.

The tool is used by database administrators to perform maintenance tasks on local TigerGraph deployments, offering command-line access to operations that would otherwise require the web-based admin interface.

# CAVEATS

TigerGraph required. Admin access needed. Local installation.

# HISTORY

**tgutil** provides utility commands for TigerGraph graph database administration and maintenance.

# SEE ALSO

[gsql](/man/gsql)(1), [tginfo](/man/tginfo)(1), [tgcloud](/man/tgcloud)(1)

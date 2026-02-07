# TAGLINE

Grafana plugin and administration manager

# TLDR

**Install plugin**

```grafana-cli plugins install [plugin-id]```

**List installed plugins**

```grafana-cli plugins ls```

**Update plugin**

```grafana-cli plugins update [plugin-id]```

**Remove plugin**

```grafana-cli plugins remove [plugin-id]```

**List available plugins**

```grafana-cli plugins list-remote```

# SYNOPSIS

**grafana-cli** [_options_] _command_

# PARAMETERS

**plugins install** _ID_
> Install plugin.

**plugins ls**
> List installed.

**plugins update** _ID_
> Update plugin.

**plugins remove** _ID_
> Remove plugin.

**plugins list-remote**
> List available plugins.

**--pluginsDir** _DIR_
> Plugin directory.

**--help**
> Display help information.

# DESCRIPTION

**grafana-cli** manages Grafana plugins and administration tasks. It installs, updates, and removes visualization plugins and data sources from the Grafana plugin repository.

The tool handles plugin lifecycle management independently of the Grafana server. It also provides admin commands for password reset and database migration.

# CAVEATS

Requires appropriate permissions. May need Grafana restart. Plugin compatibility varies.

# HISTORY

grafana-cli was developed alongside **Grafana** to provide command-line management of the visualization platform.

# SEE ALSO

[grafana-server](/man/grafana-server)(1)

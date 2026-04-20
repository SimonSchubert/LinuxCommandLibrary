# TAGLINE

Grafana plugin and administration manager

# TLDR

**Install plugin**

```grafana-cli plugins install [plugin-id]```

**List installed plugins**

```grafana-cli plugins ls```

**Update all installed plugins**

```grafana-cli plugins update-all```

**Update plugin**

```grafana-cli plugins update [plugin-id]```

**Remove plugin**

```grafana-cli plugins remove [plugin-id]```

**List available plugins** in the remote repository

```grafana-cli plugins list-remote```

**Reset the admin password**

```grafana-cli admin reset-admin-password [newpassword]```

# SYNOPSIS

**grafana-cli** [_global-options_] _command_ _subcommand_ [_args_]

# COMMANDS

**plugins install** _ID_ [_VERSION_]
> Install a plugin, optionally pinning to a specific version.

**plugins ls**
> List installed plugins.

**plugins update** _ID_
> Update a single plugin to the latest compatible version.

**plugins update-all**
> Update every installed plugin.

**plugins remove** _ID_
> Remove an installed plugin.

**plugins list-remote**
> List all plugins available in the configured repository.

**plugins list-versions** _ID_
> List available versions for a given plugin.

**admin reset-admin-password** _PASSWORD_
> Reset the built-in admin account password.

**admin data-migration encrypt-datasource-passwords**
> Migrate plaintext data-source passwords to the secureJsonData field.

# PARAMETERS

**--config** _FILE_
> Use an alternate **grafana.ini** configuration file.

**--homepath** _DIR_
> Grafana home directory used to locate config and plugin paths.

**--pluginsDir** _DIR_
> Override the plugin install directory.

**--pluginUrl** _URL_
> Install a plugin from a custom URL (zip) instead of the plugin repository.

**--repo** _URL_
> Use a different plugin repository.

**--insecure**
> Skip TLS verification when downloading plugins.

**-d**, **--debug**
> Enable debug output.

**-v**, **--version**
> Show the CLI version.

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

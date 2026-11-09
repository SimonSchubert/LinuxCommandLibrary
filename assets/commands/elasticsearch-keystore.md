# TAGLINE

Manage encrypted Elasticsearch secure settings

# TLDR

**Create keystore**

```elasticsearch-keystore create```

**Create a password-protected keystore**

```elasticsearch-keystore create -p```

**List settings**

```elasticsearch-keystore list```

**Add setting** (prompts for value)

```elasticsearch-keystore add [setting.name]```

**Add setting from stdin**

```echo -n "[value]" | elasticsearch-keystore add --stdin [setting.name]```

**Add setting from file**

```elasticsearch-keystore add-file [setting.name] [file]```

**Show a setting value**

```elasticsearch-keystore show [setting.name]```

**Remove setting**

```elasticsearch-keystore remove [setting.name]```

**Upgrade keystore**

```elasticsearch-keystore upgrade```

**Change the keystore password**

```elasticsearch-keystore passwd```

# SYNOPSIS

**elasticsearch-keystore** _command_ [_options_]

# SUBCOMMANDS

**create**
> Create a new keystore.

**list**
> List entries in keystore.

**add** _settings_...
> Add one or more settings (prompts for values).

**add-file** (_setting_ _path_)...
> Add one or more settings from files.

**remove** _settings_...
> Remove one or more settings.

**show** [**-o** _file_] _setting_
> Display the value of a single setting.

**has-passwd**
> Check if keystore is password-protected.

**upgrade**
> Upgrade keystore format.

**passwd**
> Change or set the keystore password.

# PARAMETERS

**-x**, **--stdin**
> Read setting values from stdin, separated by newlines (used with add).

**-f**, **--force**
> Overwrite existing settings without prompting (used with add). Also creates an obfuscated keystore if none exists.

**-p**
> Prompt for a password when creating the keystore. Without one the keystore is only obfuscated.

**-o**, **--output** _file_
> Write the setting to a file (used with show).

**-h**, **--help**
> Display help.

**-s**, **--silent**
> Show minimal output.

**-v**, **--verbose**
> Show verbose output.

# DESCRIPTION

**elasticsearch-keystore** manages the secure settings keystore for Elasticsearch. Stores sensitive configuration like passwords and API keys in encrypted form.

# CAVEATS

Run as the user that runs Elasticsearch. Secure settings are node-specific, so run the command on every node. Changes take effect after a restart unless the setting is reloadable. Settings are not validated, so unsupported ones can stop Elasticsearch from starting. Shell quoting matters: quotes around a value become part of it.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-certutil](/man/elasticsearch-certutil)(1)

# RESOURCES

```[Source code](https://github.com/elastic/elasticsearch)```

```[Homepage](https://www.elastic.co/elasticsearch)```

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/elasticsearch-keystore)```

<!-- verified: 2026-11-09 -->

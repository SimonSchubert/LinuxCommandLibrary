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

```echo "[value]" | elasticsearch-keystore add --stdin [setting.name]```

**Add setting from file**

```elasticsearch-keystore add-file [setting.name] [file]```

**Show a setting value**

```elasticsearch-keystore show [setting.name]```

**Remove setting**

```elasticsearch-keystore remove [setting.name]```

**Upgrade keystore**

```elasticsearch-keystore upgrade```

# SYNOPSIS

**elasticsearch-keystore** _command_ [_options_]

# SUBCOMMANDS

**create**
> Create a new keystore.

**list**
> List entries in keystore.

**add**
> Add setting (prompts for value).

**add-file**
> Add setting from file.

**remove**
> Remove setting.

**show**
> Display setting value.

**has-passwd**
> Check if keystore is password-protected.

**upgrade**
> Upgrade keystore format.

**passwd**
> Change keystore password.

# PARAMETERS

**--stdin**
> Read setting value from stdin (used with add).

**-f**, **--force**
> Overwrite existing setting without prompting.

**-p**
> Prompt for password when creating keystore.

**-o** _file_
> Output file (used with show).

**-h**, **--help**
> Display help.

**-s**, **--silent**
> Show minimal output.

**-v**, **--verbose**
> Show verbose output.

# DESCRIPTION

**elasticsearch-keystore** manages the secure settings keystore for Elasticsearch. Stores sensitive configuration like passwords and API keys in encrypted form.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-certutil](/man/elasticsearch-certutil)(1)


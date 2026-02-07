# TAGLINE

Manage encrypted Elasticsearch secure settings

# TLDR

**Create keystore**

```elasticsearch-keystore create```

**List settings**

```elasticsearch-keystore list```

**Add setting**

```elasticsearch-keystore add [setting.name]```

**Add setting from file**

```elasticsearch-keystore add-file [setting.name] [file]```

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

**upgrade**
> Upgrade keystore format.

**passwd**
> Change keystore password.

# PARAMETERS

**-s**, **--stdin**
> Read value from stdin.

**-f**, **--force**
> Overwrite existing setting.

# DESCRIPTION

**elasticsearch-keystore** manages the secure settings keystore for Elasticsearch. Stores sensitive configuration like passwords and API keys in encrypted form.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-certutil](/man/elasticsearch-certutil)(1)


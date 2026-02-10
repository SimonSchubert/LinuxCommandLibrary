# TAGLINE

manages Jujutsu configuration

# TLDR

**List all config values**

```jj config list```

**Get specific config value**

```jj config get [user.name]```

**Set config value**

```jj config set --user [key] "[value]"```

**Edit config in editor**

```jj config edit --user```

# SYNOPSIS

**jj** **config** _subcommand_ [_options_]

# PARAMETERS

**list**
> List configuration values.

**get** _name_
> Get a configuration value.

**set** _name_ _value_
> Set a configuration value.

**unset** _name_
> Remove a configuration value.

**edit**
> Edit configuration in editor.

**path**
> Show configuration file path.

# DESCRIPTION

**jj config** manages Jujutsu configuration. Supports user-level config (global) and repo-level config (per-repository). Configuration uses TOML format and controls settings like user identity, aliases, and UI preferences.

# SEE ALSO

[jj](/man/jj)(1), [jj-init](/man/jj-init)(1)


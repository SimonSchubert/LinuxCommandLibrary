# TAGLINE

manages npm configuration

# TLDR

**List all config**

```npm config list```

**Get config value**

```npm config get [registry]```

**Set config value**

```npm config set [registry] [https://registry.npmjs.org/]```

**Delete config**

```npm config delete [key]```

**Edit config file**

```npm config edit```

**List all with defaults**

```npm config list -l```

**Set global config**

```npm config set [key] [value] -g```

# SYNOPSIS

**npm** **config** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Config subcommand.

**list**
> Show configuration.

**get** _KEY_
> Get value.

**set** _KEY_ _VALUE_
> Set value.

**delete** _KEY_
> Remove setting.

**edit**
> Open editor.

**--help**
> Display help information.

# DESCRIPTION

**npm config** manages npm configuration. Controls registry, proxy, and other settings.

The command modifies .npmrc files. Per-project or global configuration.

# CAVEATS

Multiple .npmrc locations. Project overrides global. Credentials stored here.

# HISTORY

npm config is the **configuration management** system for npm behavior customization.

# SEE ALSO

[npm](/man/npm)(1), [npmrc](/man/npmrc)(5)


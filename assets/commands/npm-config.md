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

**set** _KEY=VALUE_
> Set a config value.

**get** _KEY_
> Echo a config value to stdout.

**list**
> Show all config settings. Use **-l** to show defaults. Use **--json** for JSON output.

**delete** _KEY_
> Remove a key from all configuration files.

**edit**
> Open the config file in an editor. Use **--global** to edit the global config.

**fix**
> Repair invalid configuration entries.

**-g**, **--global**
> Operate on the global configuration file.

**--location** _user|global|project_
> Target a specific configuration level.

# DESCRIPTION

**npm config** manages npm configuration across multiple levels. It reads settings from the command line, environment variables, and .npmrc files (project, user, and global).

Configuration files are plain ini-formatted lists of key = value pairs. Environment variables prefixed with **npm_config_** are also recognized as configuration settings.

# CAVEATS

Multiple .npmrc locations exist with a precedence order: project > user > global > defaults. Credentials and tokens may be stored in .npmrc files.

# HISTORY

npm config is the **configuration management** system for npm behavior customization.

# SEE ALSO

[npm](/man/npm)(1), [npmrc](/man/npmrc)(5)


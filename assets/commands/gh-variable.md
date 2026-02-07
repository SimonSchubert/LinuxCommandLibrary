# TAGLINE

Manage GitHub Actions configuration variables

# TLDR

**List variables**

```gh variable list```

**Set a variable**

```gh variable set [name] -b "[value]"```

**Set from file**

```gh variable set [name] < [file]```

**Delete a variable**

```gh variable delete [name]```

**Set organization variable**

```gh variable set [name] -o [org] -b "[value]"```

# SYNOPSIS

**gh** **variable** _command_ [_options_]

# SUBCOMMANDS

**list**
> List variables.

**set**
> Set a variable.

**delete**
> Delete a variable.

**get**
> Get a variable.

# PARAMETERS

**-b**, **--body** _value_
> Variable value.

**-R**, **--repo** _owner/repo_
> Repository.

**-o**, **--org** _name_
> Organization.

**-e**, **--env** _name_
> Environment.

# DESCRIPTION

**gh variable** manages GitHub Actions configuration variables for storing non-sensitive workflow data. Unlike secrets, variables are not encrypted and their values can be retrieved, making them suitable for configuration settings, feature flags, and environment names.

Variables can be scoped to repositories, organizations, or specific deployment environments. They are accessible in workflows via the **vars** context (e.g., `vars.VARIABLE_NAME`). They are ideal for API endpoints, build configurations, and other non-secret parameters.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret](/man/gh-secret)(1)

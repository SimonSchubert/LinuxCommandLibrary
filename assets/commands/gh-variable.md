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

**Get a variable value**

```gh variable get [name]```

**Set organization variable**

```gh variable set [name] -o [org] -b "[value]"```

**Set environment variable**

```gh variable set [name] -e [environment] -b "[value]"```

**List variables as JSON**

```gh variable list --json name,value```

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
> Get a single variable.

# PARAMETERS

**-b**, **--body** _value_
> Variable value.

**-R**, **--repo** _owner/repo_
> Select a repository.

**-o**, **--org** _name_
> Set or list variables for an organization.

**-e**, **--env** _name_
> Set or list variables for an environment.

**-v**, **--visibility** _scope_
> Set visibility for an organization variable: all, private, or selected.

**--json** _fields_
> Output JSON with the specified fields.

**-q**, **--jq** _expression_
> Filter JSON output using a jq expression.

# DESCRIPTION

**gh variable** manages GitHub Actions configuration variables for storing non-sensitive workflow data. Unlike secrets, variables are not encrypted and their values can be retrieved, making them suitable for configuration settings, feature flags, and environment names.

Variables can be scoped to repositories, organizations, or specific deployment environments. They are accessible in workflows via the **vars** context (e.g., `vars.VARIABLE_NAME`). They are ideal for API endpoints, build configurations, and other non-secret parameters.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret](/man/gh-secret)(1)

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

**gh variable** manages GitHub Actions variables. Variables store non-sensitive configuration data for workflows.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret](/man/gh-secret)(1)


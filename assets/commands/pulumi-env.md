# TLDR

**Open environment in console**

```pulumi env open [org/env]```

**Get environment value**

```pulumi env get [org/env] [key]```

**Set environment value**

```pulumi env set [org/env] [key] [value]```

**List environments**

```pulumi env ls```

# SYNOPSIS

**pulumi** **env** _command_ [_options_]

# PARAMETERS

**open** _name_
> Open environment in browser.

**get** _name_ _key_
> Get environment value.

**set** _name_ _key_ _value_
> Set environment value.

**ls**
> List environments.

**init** _name_
> Initialize environment.

**rm** _name_
> Remove environment.

# DESCRIPTION

**pulumi env** manages Pulumi ESC (Environments, Secrets, and Configuration). ESC provides centralized management of configuration and secrets across stacks and applications.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-config](/man/pulumi-config)(1)


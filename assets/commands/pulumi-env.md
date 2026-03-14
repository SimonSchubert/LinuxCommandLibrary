# TAGLINE

Manage Pulumi ESC environments and secrets

# TLDR

**List all environments**

```pulumi env ls```

**Open and evaluate an environment**

```pulumi env open [org/env]```

**Get a specific value from an environment**

```pulumi env get [org/env] [key]```

**Set a value in an environment**

```pulumi env set [org/env] [key] [value]```

**Initialize a new environment**

```pulumi env init [org/env]```

**Edit an environment definition**

```pulumi env edit [org/env]```

**Remove an environment**

```pulumi env rm [org/env]```

**Run a command with environment variables loaded**

```pulumi env run [org/env] -- [command]```

# SYNOPSIS

**pulumi** **env** _command_ [_options_]

# SUBCOMMANDS

**ls**
> List environments.

**open** _name_
> Open and evaluate an environment, displaying resolved values.

**get** _name_ _key_
> Get a specific value from an environment.

**set** _name_ _key_ _value_
> Set a value in an environment.

**init** _name_
> Create a new environment.

**edit** _name_
> Edit an environment definition in an editor.

**rm** _name_
> Remove an environment.

**run** _name_ **--** _command_
> Run a command with environment variables set.

**version-tag** _name_
> Manage environment version tags.

# DESCRIPTION

**pulumi env** manages Pulumi ESC (Environments, Secrets, and Configuration). ESC provides centralized management of configuration and secrets across stacks and applications. Environments can compose other environments and integrate with secret providers like AWS Secrets Manager, HashiCorp Vault, and others.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-config](/man/pulumi-config)(1), [pulumi-stack](/man/pulumi-stack)(1)

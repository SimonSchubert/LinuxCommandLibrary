# TAGLINE

Manage Pulumi stack configuration values

# TLDR

**Set configuration value**

```pulumi config set [key] [value]```

**Set secret value**

```pulumi config set --secret [key] [value]```

**Get configuration value**

```pulumi config get [key]```

**List all configuration**

```pulumi config```

**Remove configuration**

```pulumi config rm [key]```

# SYNOPSIS

**pulumi** **config** [_command_] [_options_]

# PARAMETERS

**set** _key_ _value_
> Set configuration value.

**get** _key_
> Get configuration value.

**rm** _key_
> Remove configuration.

**refresh**
> Update config from state.

**--secret**
> Encrypt value.

**--plaintext**
> Store unencrypted.

**-s**, **--stack** _name_
> Target stack.

**--json**
> Output as JSON.

# DESCRIPTION

**pulumi config** manages stack configuration values. Configuration includes parameters like cloud regions, instance sizes, and secrets. Secrets are encrypted in state files.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-stack](/man/pulumi-stack)(1)


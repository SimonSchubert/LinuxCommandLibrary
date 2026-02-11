# TAGLINE

Manage isolated infrastructure environments

# TLDR

**Show current stack**

```pulumi stack```

**List all stacks**

```pulumi stack ls```

**Select stack**

```pulumi stack select [stack]```

**Create new stack**

```pulumi stack init [name]```

**Delete stack**

```pulumi stack rm [name]```

**Export stack state**

```pulumi stack export > state.json```

# SYNOPSIS

**pulumi** **stack** [_command_] [_options_]

# PARAMETERS

**ls**
> List stacks.

**select** _name_
> Switch to stack.

**init** _name_
> Create stack.

**rm** _name_
> Delete stack.

**export**
> Export state to JSON.

**import**
> Import state from JSON.

**output** _name_
> Get stack output.

**history**
> Show deployment history.

**rename** _name_
> Rename stack.

**tag** _cmd_
> Manage stack tags.

# DESCRIPTION

**pulumi stack** manages stacks. Stacks are isolated instances of infrastructure (dev, staging, prod). Each stack has its own state, configuration, and resources.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-config](/man/pulumi-config)(1)


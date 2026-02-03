# TLDR

**Connect to serverless namespace**

```doctl serverless connect```

**Deploy functions**

```doctl serverless deploy [path]```

**List functions**

```doctl serverless functions list```

**Invoke a function**

```doctl serverless functions invoke [name]```

**Get function logs**

```doctl serverless activations logs [activation_id]```

**Initialize a project**

```doctl serverless init --language [js] [path]```

# SYNOPSIS

**doctl** **serverless** _command_ [_options_]

# SUBCOMMANDS

**connect**
> Connect to namespace.

**deploy**
> Deploy project.

**undeploy**
> Remove deployed resources.

**functions**
> Manage functions.

**activations**
> View function activations.

**init**
> Initialize new project.

**status**
> Show namespace status.

**watch**
> Watch project for changes.

# DESCRIPTION

**doctl serverless** manages DigitalOcean Functions (serverless computing). Deploy, invoke, and monitor serverless functions without managing infrastructure.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-apps](/man/doctl-apps)(1)


# TAGLINE

manage DigitalOcean Functions serverless computing

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

**doctl serverless** manages DigitalOcean Functions, a serverless computing platform that allows deploying and running code without managing infrastructure. Functions respond to events and HTTP requests, scaling automatically based on demand.

The platform supports multiple programming languages including JavaScript (Node.js), Python, PHP, and Go. Functions are organized into namespaces and deployed as projects containing one or more function definitions. Each function activation is logged and can be inspected for debugging.

Serverless computing is ideal for event-driven workloads, API endpoints, background processing, and applications with variable traffic patterns. DigitalOcean Functions handles scaling, load balancing, and infrastructure management automatically.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-apps](/man/doctl-apps)(1)

# TAGLINE

Zapier integration development CLI

# TLDR

**Login**

```zapier login```

**Initialize project**

```zapier init [project-name]```

**Push integration**

```zapier push```

**Test integration**

```zapier test```

**Validate**

```zapier validate```

**Deploy**

```zapier promote [version]```

# SYNOPSIS

**zapier** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate.

**init**
> Create project.

**push**
> Upload code.

**test**
> Run tests.

**validate**
> Check integration.

**promote**
> Deploy version.

# DESCRIPTION

**zapier** is the official command-line interface for developing integrations on the Zapier automation platform. It provides tools for creating, testing, validating, and deploying custom integrations that connect third-party applications.

The development workflow starts with **zapier init** to scaffold a new project, followed by defining triggers, actions, and searches in JavaScript. The **test** command runs integration tests locally, and **validate** checks the integration against Zapier's schema requirements before deployment.

Once ready, **zapier push** uploads the integration to Zapier's platform where it becomes available for users to incorporate into their automated workflows. The **promote** command makes a specific version publicly available.

# CAVEATS

Zapier account required. Node.js needed. Platform-specific.

# HISTORY

**zapier** CLI was created for building integrations on the **Zapier** automation platform.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1)

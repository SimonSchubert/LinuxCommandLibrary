# TAGLINE

Zapier Platform CLI for building integrations

# TLDR

**Authenticate with Zapier**

```zapier login```

**Initialize a new integration project**

```zapier init [project-name]```

**Push integration code to Zapier**

```zapier push```

**Run integration tests locally**

```zapier test```

**Validate the integration against Zapier's schema**

```zapier validate```

**Promote a version to public access**

```zapier promote [1.0.0] [100]```

**View logs for the integration**

```zapier logs```

**Invoke a trigger or action locally for testing**

```zapier invoke [trigger] [trigger_key]```

# SYNOPSIS

**zapier** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with Zapier.

**logout**
> Deauthenticate from Zapier.

**init**
> Create a new integration project.

**scaffold**
> Scaffold a new trigger, action, or search.

**push**
> Upload the current integration to Zapier.

**test**
> Run integration tests locally.

**validate**
> Check integration against Zapier's schema.

**promote**
> Promote a version to public access.

**describe**
> Describe the current integration.

**logs**
> View recent logs for the integration.

**env:set**
> Set environment variables for a version.

**env:get**
> Get environment variables for a version.

**invoke**
> Invoke a trigger, action, or search locally.

**register**
> Register a new integration on Zapier.

**build**
> Build a pushable zip from the current directory.

**versions**
> List the versions of the current integration.

# DESCRIPTION

**zapier** is the official command-line interface for developing integrations on the Zapier automation platform. It provides tools for creating, testing, validating, and deploying custom integrations that connect third-party applications using JavaScript.

The development workflow starts with **zapier init** to scaffold a new project, followed by defining triggers, actions, and searches in JavaScript (Node.js v22). The **test** command runs integration tests locally, **invoke** lets you test triggers and actions from the terminal, and **validate** checks the integration against Zapier's schema requirements before deployment.

Once ready, **zapier push** uploads the integration to Zapier's platform. The **promote** command makes a specific version publicly available. Environment variables for deployed versions are managed with the **env:set** and **env:get** commands.

# CAVEATS

Zapier account required. Node.js required (integrations run on Node.js v22). Installed via `npm install -g zapier-platform-cli`.

# HISTORY

The **zapier** CLI was created by **Zapier** as the developer tool for building integrations on their automation platform. It replaced the earlier visual builder approach, giving developers a code-first workflow using JavaScript and Node.js.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1)

# TAGLINE

Zapier Platform CLI for building integrations (now zapier-platform)

# TLDR

**Authenticate** with Zapier

```zapier-platform login```

**Authenticate** with single sign-on

```zapier-platform login --sso```

**Initialize** a new integration from a template

```zapier-platform init [path] --template [minimal]```

**Register** a new integration on Zapier

```zapier-platform register "[Title]"```

**Push** integration code to Zapier

```zapier-platform push```

Run integration **tests** locally

```zapier-platform test```

**Validate** the integration against Zapier's schema

```zapier-platform validate```

**Promote** a version to be the public version

```zapier-platform promote [1.0.0]```

**Migrate** users from one version to another

```zapier-platform migrate [1.0.0] [1.0.1] [100]```

View **logs** for the integration

```zapier-platform logs --type [http]```

**Invoke** a trigger or action locally for testing

```zapier-platform invoke [trigger] [trigger_key]```

# SYNOPSIS

**zapier-platform** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with Zapier. Use **--sso** for single sign-on accounts.

**logout**
> Deauthenticate from Zapier.

**init** _PATH_
> Create a new integration project. Takes **--template** and **--language**.

**scaffold** _ACTIONTYPE_ _NOUN_
> Scaffold a new trigger, action, or search.

**register** [_TITLE_]
> Register a new integration on Zapier.

**link**
> Link the current directory to an existing integration.

**build**
> Build a pushable zip from the current directory.

**upload**
> Upload the latest build to Zapier.

**push**
> Build and upload the current integration to Zapier.

**pull**
> Retrieve the latest version of the integration from Zapier.

**test**
> Run integration tests locally. Arguments after **--** go to the test script.

**validate**
> Check integration against Zapier's schema.

**invoke** [_ACTIONTYPE_] [_ACTIONKEY_]
> Invoke a trigger, action, or search locally. Use **--remote** to run on Zapier servers.

**describe**
> Describe the current integration.

**promote** _VERSION_
> Mark a version as the official public version.

**migrate** _FROM_ _TO_ [_PERCENT_]
> Move users from one version to another.

**deprecate** _VERSION_ _DATE_
> Mark a version as deprecated on a date.

**canary:create**, **canary:list**, **canary:delete**
> Route a share of traffic between versions.

**versions**
> List the versions of the current integration.

**logs**
> View recent logs for the integration.

**env:set** _VERSION_ [_KEY=VALUE_...]
> Set environment variables for a version.

**env:get** _VERSION_
> Get environment variables for a version.

**env:unset** _VERSION_ [_KEY_...]
> Remove environment variables for a version.

**integrations**
> List the integrations you have access to.

**-d**, **--debug**
> Show extra debugging output.

**-f**, **--format** _FORMAT_
> Output format for listing commands: plain, json, raw, row or table.

# DESCRIPTION

**zapier-platform** is the official command-line interface for developing integrations on the Zapier automation platform. It provides tools for creating, testing, validating, and deploying custom integrations written in JavaScript or TypeScript.

The development workflow starts with **init** to create a new project, followed by defining triggers, actions, and searches. The **test** command runs integration tests locally, **invoke** lets you test triggers and actions from the terminal, and **validate** checks the integration against Zapier's schema requirements before deployment.

Once ready, **push** uploads the integration to Zapier's platform. The **promote** command makes a specific version the public one and **migrate** moves existing users to it. Environment variables for deployed versions are managed with the **env:set**, **env:get** and **env:unset** commands.

# CAVEATS

The executable was renamed: since **zapier-platform-cli** 19.0.0 only **zapier-platform** is installed, while 18.x still shipped **zapier** as a deprecated wrapper. Older tutorials using plain **zapier** map one to one. Zapier account required. Requires Node.js 22 or later. Installed via `npm install -g zapier-platform-cli`.

# HISTORY

The CLI was created by **Zapier** as the developer tool for building integrations on their automation platform. It offers a code-first workflow in JavaScript and Node.js alongside the web-based Platform UI.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/zapier/zapier-platform)```

```[Documentation](https://docs.zapier.com/integrations/build-cli/overview)```

<!-- verified: 2026-11-09 -->

# TAGLINE

Slack app development command-line interface

# TLDR

**Create a new Slack app** from a template

```slack create [app-name]```

**Run an app locally** for development

```slack run```

**Deploy an app** to Slack

```slack deploy```

**List available commands**

```slack help```

**Create a trigger** for an app

```slack trigger create```

**List installed apps** and workspaces

```slack list```

**Login to a workspace**

```slack login```

**Display version information**

```slack version```

# SYNOPSIS

**slack** _command_ [_options_]

# PARAMETERS

**-a**, **--app** _string_
> Use a specific app ID or environment.

**-w**, **--team** _string_
> Select workspace or organization by team name or ID.

**--token** _string_
> Set the access token associated with a team.

**--config-dir** _string_
> Use a custom path for system config directory.

**-f**, **--force**
> Ignore warnings and continue executing command.

**--no-color**
> Remove styles and formatting from outputs.

**-s**, **--skip-update**
> Skip checking for the latest version of CLI.

**-v**, **--verbose**
> Print debug logging and additional info.

**-e**, **--experiment** _strings_
> Use experiment(s) in the command.

**-h**, **--help**
> Display help information.

# COMMANDS

**create**
> Create a new Slack app from a template.

**run**
> Run the app locally for development.

**deploy**
> Deploy the app to Slack infrastructure.

**trigger** **create**|**list**|**delete**
> Manage workflow triggers.

**datastore** **query**|**put**|**delete**
> Interact with app datastores.

**login**
> Authenticate with a Slack workspace.

**logout**
> Remove authentication.

**list**
> List installed apps and workspaces.

**activity**
> View app activity logs.

**version**
> Display CLI version information.

**help**
> Display help for any command.

# DESCRIPTION

**slack** is the official Slack command-line interface for creating, developing, and deploying Slack apps. It works with the Deno Slack SDK and Bolt frameworks for JavaScript and Python to build workflow automations, integrations, and custom functionality for Slack workspaces.

The CLI provides commands for the full app development lifecycle: scaffolding new apps from templates, running apps locally during development, deploying to Slack's infrastructure, and managing triggers and datastores. It handles authentication with Slack workspaces and provides activity logging for debugging.

The CLI is installed via a shell script and is available for Linux and macOS.

# CAVEATS

Requires authentication with a Slack workspace that has app development permissions. Some features require a paid Slack plan. If another CLI tool named "slack" exists in your path, use a custom alias during installation. The CLI requires network access to Slack's APIs.

# HISTORY

The **Slack CLI** was released by Slack (now part of Salesforce) to enable developers to build next-generation Slack apps using their platform. It was introduced alongside the Deno Slack SDK as part of Slack's effort to simplify app development. The CLI replaced older deployment methods and integrated with Slack's workflow automation features. Development continues with regular updates adding new capabilities.

# SEE ALSO

[slack-term](/man/slack-term)(1), [slackcat](/man/slackcat)(1)

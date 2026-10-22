# TAGLINE

CLI for the Omnara managed agent platform

# TLDR

**Log in** through the browser and save an API token

```omnara login```

Choose the default **organization and project**

```omnara config select```

Launch an agent from a **YAML config** and a first message

```omnara agents launch --file [agent.yaml] --name "[Machine assistant]" --message "[Report this machine's OS and free disk space.]"```

**Chat** with a running agent in the terminal

```omnara agents chat [agt_id]```

Show the **authenticated user** and organizations

```omnara whoami```

**List** agents in the current project

```omnara agents list```

Register **this computer** as a machine and install the daemon

```omnara machines create-local --display-name [build-server-1] --project-ids [proj_id]```

Point the CLI at a **self-hosted** instance

```omnara config --api-url [http://localhost:8000/api/v1] --issuer-url [http://localhost:8000]```

# SYNOPSIS

**omnara** [_options_] [_command_]

**omnara** **login** [**--no-browser**] [**--token-name** _name_]

**omnara** **config** [**--org** _org-id_] [**--project** _project-id_] [**--api-url** _url_] [**--issuer-url** _url_]

**omnara** **agents** _subcommand_ [_options_]

# DESCRIPTION

**omnara** is the command-line client for Omnara, an open-source managed agent platform (Apache 2.0). It launches and manages durable AI agents, machines, model providers, secrets, skills, integrations, and related resources through the same REST API as the dashboard and TypeScript SDK. The npm package is **omnara**; the binary name is **omnara**. Node.js **22** or later is required. Run it with **npx omnara** or install the package globally.

The CLI is a Commander program generated from the Omnara SDK and OpenAPI operations, plus a few custom commands (`login`, `logout`, `config`, `agents chat`, `agents events stream`, `machines create-local`). Most list and get commands print a table or record; pass **--json** for the raw JSON response. Field flags can be replaced with **--body** JSON; flags override that body.

Hosted API requests go to `https://api.omnara.com/v1` and browser login uses `https://app.omnara.com`. Self-hosted deployments serve the same API under `/api/v1` on their own origin. A first command that needs an account starts device login in the browser when stdin is a terminal; otherwise set **OMNARA_API_KEY** or run **omnara login**.

# COMMANDS

**login**
> Open a browser (or print the approval URL with **--no-browser**) and save an API token. **--token-name** labels the created token.

**logout**
> Remove the saved token from the config file. The token stays valid until revoked under Personal tokens in the account menu.

**config**
> Show or save defaults. **--org**, **--project**, **--api-url**, and **--issuer-url** write those keys. Changing **--org** clears the saved project. **config select** interactively chooses an organization and project (needs a terminal).

**whoami**
> Print the authenticated user and their organizations.

**agents** (alias **agent**)
> Launch and manage agents. Subcommands: **list**, **get** _agent-id_, **launch**, **update** _agent-id_, **cancel** _agent-id_, **archive** _agent-id_, **mcp-add** _agent-id_, **chat** [_agent-id_], **input** _agent-id_, **events**, **interactions**. **launch** takes **--file**, **--source**, **--config**, and/or **--profile**, plus **--name** and **--message**. **chat** needs an interactive terminal. **input** sends **--message** or **--content-blocks**; **--delivery-mode** is `queued` or `steering`. **events list** / **events stream** read the timeline; **stream** accepts **--after-sequence** and **--deltas**. **cancel** stops the current turn; **archive** retires the agent (no unarchive). Agent `activity.state` is `running`, `waiting_on_interaction`, `idle`, or `archived`.

**machines** (alias **machine**)
> Manage BYO machines. **create-local** creates a machine, mints a daemon token, and installs **omnarad** on this computer (**--display-name** required). It refuses if `~/.omnarad` (or **OMNARA_HOME**) already holds a daemon; run **omnarad uninstall** first. **create** prints a one-time token and install command for another computer. Also **list**, **get**, **update**, **delete**.

**profiles** (alias **profile**)
> Agent launch templates. **create** requires **--name** and a config via **--file**, **--source**, or **--config**. Also **list**, **get**, **update**, **rename**, **delete**, **mcp-add**.

**grant** (alias **grants**)
> Share resources with a project: **skills**, **secrets**, **machines**, **pools**, **models**. **grant machines add** requires **--machine-id**.

**orgs**, **projects**, **members**, **keys**
> Organization and project administration, invitations, org API keys, and personal access tokens.

**pools**, **model-providers**, **models**, **secrets**, **skills**, **memory-stores**, **crons**, **integrations**
> Machine pools, model provider configs and models, secrets (including **mcp-oauth**), skill packages, memory stores, cron triggers, and project integrations (Slack, GitHub, Discord).

# PARAMETERS

**-h**, **--help**
> Print usage. Every command accepts **-h** / **--help**.

**--org** _org-id_
> Organization ID. Defaults from the config file or **OMNARA_ORG_ID**.

**--project** _project-id_
> Project ID. Defaults from the config file or **OMNARA_PROJECT_ID**.

**--json**
> Print the raw JSON response instead of a table or record.

**--body** _json_
> Full request body as JSON; field flags override it.

**--file** _path_
> Path to an agent config (`.yaml`, `.yml`, or `.json`). Used by **agents launch** and **profiles create**.

**--source** _text_
> Inline YAML or JSON agent config.

**--config** _id_
> Existing agent config ID (`acfg_…`).

**--profile** _id_
> Agent profile ID (`aprf_…`). Runs that profile's current config unless a config is also given.

**--message** _text_
> First user message on **launch**, or a single text block on **agents input**.

**--name** _name_
> Display name for a launched agent, profile, or similar resource.

**--no-browser**
> With **login**, print the approval URL instead of opening a browser.

# CONFIGURATION

**~/.config/omnara/config.json**
> Saved token, default organization, default project, and API URLs. The directory is created mode `0700` and the file is written mode `0600`. Keys: `token`, `org_id`, `project_id`, `api_url`, `issuer_url`. A legacy `base_url` key is dropped on load.

An agent config is YAML or JSON. A minimal hosted-cloud example:

```
version: v1
instruction: |
  You are an engineering assistant. Use your machine to run commands.
model:
  provider_config: omnara-openrouter
  name: anthropic/claude-fable-5.1
machine_sources:
  - machine_pool_name: default-pool
```

On Omnara Cloud the first project includes provider `omnara-openrouter` and pool `default-pool`. Self-hosted instances start with no models or machines; add those in the console, then set **--api-url** and **--issuer-url** before **login**.

# ENVIRONMENT

**OMNARA_API_KEY**
> Bearer token. Overrides the token in the config file. The REST docs also show `OMNARA_TOKEN` for curl and the SDK; the CLI reads **OMNARA_API_KEY**.

**OMNARA_ORG_ID**
> Default organization ID. Overrides `org_id` in the config file.

**OMNARA_PROJECT_ID**
> Default project ID. Overrides `project_id` in the config file.

**OMNARA_API_URL**
> API root used for requests. Default `https://api.omnara.com/v1`. Self-hosted example: `http://localhost:8000/api/v1`.

**OMNARA_ISSUER_URL**
> Web app origin used for login and browser links. Default `https://app.omnara.com`.

# CAVEATS

Requires Node.js 22 or later. **agents chat** and **config select** need an interactive terminal. Without a saved token and without a TTY, commands fail with `not logged in: run 'omnara login' or set OMNARA_API_KEY`. **logout** does not revoke the token on the server.

**machines create-local** will not overwrite an existing daemon home. Public resource IDs use a type prefix (`agt_`, `acfg_`, `aprf_`, `mch_`, `org_`, `proj_`, …) plus 26 lowercase base32 characters; treat them as opaque.

Archiving an agent deletes its integration subscriptions, stops work, drops queued inputs, and releases pooled machines. Machines you connected yourself, configs, and profiles remain.

# HISTORY

Omnara is an Apache-2.0 project at **omnara-ai/omnara**. The CLI lives in `frontend/packages/cli` and is published to npm as **omnara**. The same repository ships the control plane, dashboard, TypeScript SDK (`@omnara/sdk`), and the **omnarad** machine daemon.

# SEE ALSO

[omnarad](/man/omnarad)(1), [npx](/man/npx)(1), [npm](/man/npm)(1), [node](/man/node)(1), [docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [curl](/man/curl)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/omnara-ai/omnara)```

```[Homepage](https://www.omnara.com)```

```[Documentation](https://docs.omnara.com)```

<!-- verified: 2026-10-22 -->

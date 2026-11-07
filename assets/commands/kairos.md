# TAGLINE

Operate a Kairos fraud-decision server from the shell

# TLDR

Create an account on the **local** server

```kairos signup```

Log in to a **named profile**

```kairos login --profile [prod] --url [https://kairos.finic.ai] --email [you@example.com]```

Create an API **key**

```kairos keys create "[My server]"```

Define an **action** from a JSON file

```kairos actions define [withdrawal] --data @[withdrawal.json]```

Import historical **events**

```kairos import events [transactions.csv] --type [transaction] --ts [created_at] --entity [user=customer]```

Ask for a **decision**

```kairos decide [withdrawal] -e [user=user_42] -p [usd=900]```

Run a **workflow** and wait for it

```kairos workflows run [review_payout] -i [user=user_42] --wait```

Start the local API and console from a checkout

```pnpm kairos dev```

List every command

```kairos --help```

# SYNOPSIS

**kairos** [_global options_] _command_ [_arguments_]

# PARAMETERS

**signup**

> Create an account against the server this profile points at

**login** **--profile** _name_ **--url** _url_ **--email** _address_

> Store credentials for a local or hosted Kairos

**keys create** _name_

> Create a secret key for application code

**actions define** _name_ **--data** _@file_

> Register an action. The `@` prefix reads the body from a file

**import events** _file_ **--type** _type_ **--ts** _column_ **--entity** _name=column_

> Load a CSV of past events. Repeat **--entity** for each entity column the file has

**decide** _action_ **-e** _entity=id_ **-p** _field=value_

> Request a decision. **-e** names an entity. **-p** sets a payload field

**workflows run** _name_ **-i** _entity=id_ [**--wait**]

> Start a workflow. **--wait** blocks until it finishes

**dev**

> From a Kairos checkout, via `pnpm kairos dev`: API on port 8787 and the console on port 5273

**--help**

> List the command tree

# DESCRIPTION

**kairos** is the command-line client for Kairos, Finic's real-time fraud and risk decision service. The npm package `@kairos/cli` exposes the binary name **kairos** (`apps/cli/bin/kairos.mjs`). Inside the repository, `pnpm kairos` runs the same commands. `pnpm link --global` from `apps/cli` puts **kairos** on `PATH`.

A self-hosted checkout needs Node.js 22, pnpm 10, and a Grayson API key in `.env`. The server starts its own Postgres. `pnpm kairos dev` serves the API at `http://localhost:8787` and the console at `http://localhost:5273`. Hosted use points **login** at `https://kairos.finic.ai`.

Application code usually calls the HTTP API or the `@finic-ai/kairos` / `finic-kairos` libraries. The CLI is how you sign up, mint keys, define actions, import events, and run decisions or workflows from a terminal. `kairos --help` is the full tree. The examples above are the ones the project documents for a first session.

# CAVEATS

This is not the Kairos immutable Linux distribution, and it is not the Kerberos **kadmin** family. A package simply named `kairos` in a distro index is a different project.

**dev** is a repository script (`pnpm kairos dev`), not a second binary. The linked global command is **kairos** plus the subcommands in **--help**.

Self-hosting needs the Grayson key before the API will start. The CLI does not replace the TypeScript or Python SDKs inside an application.

# HISTORY

Kairos is developed by Finic (finic-ai) as an open-source decisioning server with an agent-oriented CLI. The console and the HTTP API ship in the same repository as **kairos**.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/finic-ai/kairos)```

```[Homepage](https://kairos.finic.ai)```

```[Documentation](https://kairos.finic.ai/docs)```

<!-- verified: 2026-11-07 -->

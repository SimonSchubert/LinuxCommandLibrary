# TAGLINE

Discover, inspect, and run hosted agent data endpoints

# TLDR

Store an **API key** and activate it (first key is activated automatically)

```monid keys add --label [main] --key [monid_live_...]```

Switch the **active key**

```monid keys activate --label [main]```

**Search** the catalog for endpoints that match a task

```monid discover -q "[twitter posts]"```

Show **schema and pricing** for one endpoint

```monid inspect -p [apify] -e [/apidojo/tweet-scraper]```

**Start a run** and print the run id

```monid run -p [apify] -e [/apidojo/tweet-scraper] -i '{"searchTerms":["AI"],"maxItems":10}'```

**Poll** a run and write results to a file

```monid runs get -r [run-id] --wait -o [tweets.json]```

Start a run and **block** until it finishes

```monid run -p [apify] -e [/apidojo/tweet-scraper] -i '{"searchTerms":["AI"]}' --wait -o [tweets.json]```

Show the **workspace wallet** balance

```monid balance```

Print the **authenticated identity**

```monid whoami```

# SYNOPSIS

**monid** [_global-options_] _command_ [_subcommand_] [_options_]

# PARAMETERS

**discover** **-q** _QUERY_
> Search the catalog with a short natural-language query. Optional **--limit**, **-s**/**--min-score**, and **-u**/**--include-unavailable**.

**inspect** **-p** _PROVIDER_ **-e** _ENDPOINT_
> Print full details for one endpoint: description, input schema, pricing, and provider docs.

**run** **-p** _PROVIDER_ **-e** _ENDPOINT_
> Execute an endpoint. Pass body JSON with **-i** or **-f**/**--input-file**, plus optional **--query** and **--path** JSON. Without **--wait**, asynchronous runs return a run id immediately.

**runs list**
> List recent runs. Optional **--limit** and **--cursor**.

**runs get** **-r** _RUN_ID_
> Show status and results for a run. **--wait** [_TIMEOUT_] polls until a terminal status (default timeout 300 seconds).

**runs stop** **-r** _RUN_ID_
> Stop a queued or in-progress run.

**keys add** **-l** _LABEL_ **-k** _KEY_
> Store an API key locally. Keys must match **monid_**_stage_**_**_secret_. The first stored key becomes active.

**keys list**
> List locally stored keys (values are obfuscated).

**keys activate** **-l** _LABEL_
> Select which stored key is used for subsequent commands.

**keys remove** **-l** _LABEL_
> Delete a stored key. Prompts unless **-f**/**--force** is given.

**balance**
> Show the current workspace wallet balance in USD.

**whoami**
> Show the identity behind the active key. **--workspaces** lists workspaces the caller can access.

**resources**
> List, inspect, release, and follow events for provisioned provider resources.

**-j**, **--json**
> Print raw JSON instead of formatted text. Disables spinners and color. Supported on the data commands.

**-h**, **--help**
> Show help for the CLI or a subcommand.

**-V**, **--version**
> Print the CLI version.

# DESCRIPTION

**monid** is the command-line client for Monid, a hosted catalog that lets agents and developers discover third-party data and generation tools, inspect each tool's contract, and execute it through one API. The product is often described as an OpenRouter-style router for agent tools: one base URL and one key against many providers (search, scraping, enrichment, social data, and media generation), with usage settled per call.

Typical workflow is **discover** → **inspect** → **run** → **runs get**. Discover ranks endpoints for a query and shows price. Inspect returns the JSON input schema and pricing model (**PER_CALL** or **PER_RESULT**, optionally with a flat fee). Run submits that schema as JSON. Some providers complete synchronously; others accept the job and return HTTP 202 with a run id. The recommended pattern is to start without **--wait** and poll with **runs get**. **--wait** polls with exponential backoff until the run finishes or the timeout expires.

The CLI talks to **https://api.monid.ai** by default. Authentication is a Bearer API key created in the Monid web app and stored locally with **monid keys**. There is also an HTTP API and an MCP server at **https://mcp.monid.ai/v1** for clients that do not use this binary.

Install from npm as **@monid-ai/cli** (Node.js 20 or newer). Running **monid** with no subcommand prints help.

# CAVEATS

Almost every command requires a stored, active API key. Create keys at **https://app.monid.ai/access/api-keys**; they are shown once. Executions are billed against a prepaid workspace wallet (top up in the web app). Discover and inspect are documented as free; **run** is charged according to the endpoint's price. Provider errors complete as data and are not billed.

The catalog and the CLI live on the network. There is no offline mode. Endpoint availability, latency, and price change; always **discover** and **inspect** rather than hard-coding a provider path. **--json** is the form meant for scripts and **jq**. **monid setup** only sends best-effort install telemetry and is not required for use.

# CONFIGURATION

Config and credentials live under **$XDG_CONFIG_HOME/monid/**, or **~/.config/monid/** if **XDG_CONFIG_HOME** is unset:

**config.yaml**
> CLI version, **active_key** label, and cached update-check fields.

**credentials.yaml**
> Stored API keys (file mode 0600).

**MONID_API_BASE_URL**
> Override the API origin (default **https://api.monid.ai**).

**NO_COLOR**
> Disable ANSI color.

# HISTORY

Monid launched in **2026** as a commercial API that routes agent tool calls across many vendors from one account. The open-source CLI is **@monid-ai/cli** (TypeScript, MIT), maintained in the **monid-ai/cli** repository.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/monid-ai/cli)```

```[Homepage](https://monid.ai)```

```[Documentation](https://docs.monid.ai)```

<!-- verified: 2026-09-16 -->

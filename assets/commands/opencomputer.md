# TAGLINE

Build, deploy, and run OpenComputer cloud agents from the shell

# TLDR

Sign in to the **cloud**

```opencomputer login```

Scaffold a project and **link** it to a cloud project

```opencomputer init [my-agent]```

```opencomputer link --create-project [my-agent]```

Check the local project **before** a deploy

```opencomputer doctor```

**Deploy** and run one prompt

```opencomputer deploy --alias development```

```opencomputer run [hello-world] "[Say hello]"```

Store a secret from **stdin** (the value is not a command argument)

```printf %s "$TOKEN" | opencomputer secrets set [name] --value-stdin```

Follow **logs** for one agent

```opencomputer logs --agent [my-agent] --environment development --follow```

# SYNOPSIS

**opencomputer** [_global options_] _command_ [_arguments_]

# PARAMETERS

**--api-url** _url_
> API base URL. Default **https://app.opencomputer.dev**. The same value can be set with the environment variable **OPENCOMPUTER API URL** (underscores between the three words).

**--api-key** _key_
> API key. Or set the environment variable **OPENCOMPUTER API KEY** (underscores between the three words).

**--json**
> Print machine-readable output. Errors are a JSON object on stderr.

**--idempotency-key** _key_
> Stable retry key for commands that change cloud state.

**--verbose**
> Print session events.

**--version**
> Print the CLI version and exit.

**login** [**--no-browser**] [**--force**]
> Sign in. **whoami** prints the current identity. **logout** [**--local**] signs out.

**init** _directory_
> Create an agent project. **.** means the current directory.

**link** **--project** _id-or-slug_ | **--create-project** _name_
> Bind this directory to a cloud project. Later commands reuse that binding.

**doctor**
> Local checks before deploy, including secret names referenced in code.

**deploy** [**--alias** **development** | **production**] [**--watch**]
> Deploy the linked project. **--watch** keeps deploying as files change.

**run** _agent_ _prompt_ [**--keep**]
> Run one prompt on a deployed agent and print the remaining credit balance.

**secrets set** _name_ **--value-stdin**
> Upload a secret. The value is read from stdin only. **secrets list** and **secrets remove** take **--environment** and **--agent**.

**env set** _name_ **--value-stdin**
> Set an encrypted runtime environment variable, also from stdin only.

**logs** [**--follow**]
> Read runtime and managed-egress logs. **--session** limits the stream to one session.

**memory** _list_ | _show_ | _create_ | _edit_ | _export_ | _remove_
> Manage memory documents for one environment. **edit** opens **$EDITOR**.

**webhooks** _create_ | _list_ | _enable_ | _disable_ | _rotate-token_ | _remove_
> HTTPS hooks that start a fresh session. The bearer token is shown only when it is created or rotated.

**billing**
> Show the plan. **upgrade** prints the checkout link.

# DESCRIPTION

**opencomputer** is the command-line client for OpenComputer, an open-source coding-agent service aimed at Slack and a hosted or self-hosted computer. The CLI calls the public HTTP API. It does not start a local agent server.

Agent source lives under **opencomputer/agents/**. **init** creates one hello-world agent. **link** stores which cloud project this directory deploys to. **doctor** and **deploy** print that project before they change anything. An unlinked directory fails with the **link** command to run next.

**model connect claude** and **model connect codex** attach a Claude or ChatGPT plan using a one-time code from the dashboard. They do not require **opencomputer login**. **models** and **model-access** are aliases of **model**.

Compiled bundles are cached under **node_modules/.cache/opencomputer/**, not inside the **opencomputer/** source tree.

Install the published package with **npx @opencomputer/cli**, or run the **opencomputer** binary from a global install of that package. **opencomputer-create** is the separate scaffold command from the same package.

# CAVEATS

Secret and runtime-env values are accepted only with **--value-stdin**. Putting the secret on the command line is rejected so it does not land in the shell history.

When credits or a trial limit are exhausted, commands fail with HTTP 402. **run** prints a billing warning before that stop. Retrying the same command does not add credit.

The default API is the hosted service at **https://app.opencomputer.dev**. Point **--api-url** at another deployment only when you mean to.

# SEE ALSO

[opencomputer-create](/man/opencomputer-create)(1)

# RESOURCES

```[Source code](https://github.com/diggerhq/opencomputer)```

```[Homepage](https://opencomputer.dev)```

```[Documentation](https://docs.opencomputer.dev)```

<!-- verified: 2026-11-21 -->

# TAGLINE

Deploy and operate applications on Stackdome

# TLDR

**Log in with an API token**

```stackdome login --url https://[host] --token [token]```

**Show the active server, project, and stack**

```stackdome ctx -o json```

**Scaffold a Stackfile in the current directory**

```stackdome init```

**Convert a Compose file into a Stackfile**

```stackdome init -f [compose.yaml]```

**Check a Stackfile locally**

```stackdome validate```

**Deploy and wait until the release finishes**

```stackdome deploy --wait```

**Watch stack status**

```stackdome status --watch```

**Follow runtime logs for one resource**

```stackdome logs [web] --follow```

**Print a public URL without opening a browser**

```stackdome open -o json```

**Roll a stack back to an earlier release**

```stackdome rollback release [release-id] --wait```

# SYNOPSIS

**stackdome** [**-o** _FORMAT_] [_command_] [_options_] [_arguments_]

# PARAMETERS

**-o** _FORMAT_, **--output** _FORMAT_
> Output format: **table** (default), **json**, or **yaml**. In **json** and **yaml** modes stdout carries only the result object. Prompts and progress go to stderr.

**--log-level** _LEVEL_
> Log level: **debug**, **info**, **warn** (default), or **error**.

**--no-color**
> Disable colored output.

**login** **--url** _URL_ **--token** _TOKEN_
> Store a full-access API token for a Stackdome server. **--insecure** allows HTTP or skips HTTPS certificate checks. Without **--token**, the command prints that server's token setup steps and exits with a validation error.

**logout**
> Clear credentials stored for the active context. A token supplied by **STACKDOME_TOKEN** is left unchanged.

**whoami**
> Print the authenticated user, organization, project, server, and whether the token came from the config file or the environment.

**ctx**
> Print the active server, organization, project, selected stack, and authentication source. Credentials are omitted.

**signup** **--url** _URL_
> Print web signup and API-token setup steps for a server.

**init** [**-f** _FILE_] [**--name** _NAME_] [**--force**]
> Write **stackfile.yaml**. A **docker-compose.yaml** or **compose.yaml** in the working directory is converted. **-f** selects a Compose file. **--name** defaults to the directory name. **--force** overwrites an existing Stackfile.

**validate** [**-f** _FILE_]
> Load and validate a Stackfile on the local machine. The default file is **stackfile.yaml**. This does not authenticate or create a release.

**deploy** [**-f** _FILE_] [**--name** _NAME_] [**--wait**] [**--timeout** _DURATION_]
> Save the stack definition, then create a release. **-f** defaults to **stackfile.yaml**. **--wait** (**-w**) blocks until the release reaches a terminal state. **--timeout** defaults to 10 minutes.

**apply** [**-f** _FILE_] [**--name** _NAME_]
> Save a stack definition. No release is created and the running workload stays as it is.

**status** [_RESOURCE_] [**--watch**] [**--conditions**] [**-s** _STACK_]
> Show live status for the selected stack, or for one resource. **--watch** (**-w**) refreshes continuously. **--conditions** includes the full condition history. **-s** overrides the selected stack.

**logs** [_RESOURCE_] [**--follow**] [**--tail** _N_] [**--since** _DURATION_] [**-s** _STACK_]
> Read runtime logs. **--follow** (**-f**) streams new lines. **--tail** defaults to 100. **--since** takes a duration such as **5m** or **1h**. **logs build** _ID_ reads logs for one build.

**restart** _RESOURCE_ [**-s** _STACK_]
> Restart one runtime resource.

**open** [_RESOURCE_] [**-s** _STACK_]
> Open the first public URL for the stack or one resource. Structured output prints the URL and does not launch a browser.

**rollback release** _ID_ [**--wait**] [**-s** _STACK_]
> Create a new release from a historical release. **--wait** follows that release. **--timeout** defaults to 10 minutes.

**cancel release** _ID_ [**-s** _STACK_]
> Cancel a pending release.

**doctor**
> Check local configuration, server connectivity, authentication, project scope, the selected stack, and Stackfile readiness. Remote state is left unchanged.

**get** _RESOURCE_
> Read a collection or one identified resource. Collections include **stacks**, **builds**, **releases**, **secrets**, **volumes**, **postgres-addons**, **tokens**, and **token-scopes**. Singular forms include **stack**, **build**, **release**, **secret**, and **postgres-addon**. Also **config**, **stackfile-schema**, **release-events**, **postgres-backups**, and **postgres-credentials**.

**list** _COLLECTION_
> List a collection. Equivalent to **get** with the plural resource name.

**describe** _RESOURCE_ _ID_
> Show one resource. Equivalent to **get** with the singular name and an identifier.

**create** _RESOURCE_
> Create a **secret**, **volume**, **token**, **postgres-addon**, or **release**. **create release** releases the saved stack definition. **create secret** takes repeatable **--data** _KEY=VALUE_ pairs or **--from-file**. **create token** prints the token value once. **create postgres-addon** defaults to PostgreSQL 16, **10Gi** storage, and one instance. **--wait** waits until the addon is ready.

**update secret** _NAME_
> Replace the values of an existing secret. Later reads still hide those values.

**delete** _RESOURCE_ _NAME_ [**--yes**]
> Permanently delete a **stack**, **secret**, **volume**, **token**, or **postgres-addon**. The command prompts unless **--yes** (**-y**) is set.

**use stack** _NAME_
> Persist a stack as the default for later stack-scoped commands.

**use context** _URL_
> Persist a different Stackdome server URL. Authenticate again after switching servers.

**backup postgres-addon** _NAME_
> Trigger an immediate backup of a PostgreSQL addon.

**export stackfile** _STACK_
> Write a saved stack back out as Stackfile YAML or JSON. **--output-file** chooses the destination.

**api** _PATH_ [**-X** _METHOD_] [**--data** _JSON_] [**--yes**]
> Send an authenticated request to an API path. Mutating methods prompt unless **--yes** is set.

**completion** [**bash**|**zsh**|**fish**]
> Print a shell completion script.

**version**
> Print the CLI version, commit, build date, and Go runtime.

# DESCRIPTION

**stackdome** is the command-line client for Stackdome, an open-source platform that deploys an application as one stack: its services, databases, and volumes, from a git repository or a container image. The same commands target Stackdome Cloud or a self-hosted installation.

The application is described in **stackfile.yaml**. **deploy** uploads that definition and starts a release. **apply** stores the definition and leaves the current release in place. Read commands (**get**, **list**, **describe**) and change commands (**create**, **update**, **delete**) take a resource type as their next argument.

Commands run non-interactively. **STACKDOME_URL** and **STACKDOME_TOKEN** authenticate without a config file. A token that cannot look up its own project can name that scope with **STACKDOME_ORG** and **STACKDOME_PROJECT**.

Exit status is **0** on success, **1** for a general error, **2** for an authentication or authorization failure, **3** when a resource is not found, **4** for invalid usage, **5** for a conflict, and **130** when the command is interrupted or a confirmation is declined.

Upstream publishes prebuilt Linux and macOS archives, and an install script at **https://get.stackdome.com/cli.sh**, which verifies the published checksum and installs the **stackdome** binary.

# CONFIGURATION

**stackfile.yaml**
> Declarative application definition in the working directory. **init** creates it, **validate** checks it locally, and **deploy** and **apply** send it to the server.

**~/.stackdome/config.json**
> Stored server URL, credentials, organization, project, and selected stack. The directory is created mode **0700** and the file mode **0600**. **STACKDOME_CONFIG** selects another path. A token taken from **STACKDOME_TOKEN** is not written into this file.

# CAVEATS

**login** takes an API token. It does not ask for an account password. Omitting **--token** prints setup instructions and fails validation.

**-f** is the Stackfile path on **deploy**, **apply**, and **validate**. On **logs** and on release-event commands, **-f** means follow the stream.

**deploy --wait**, **rollback release --wait**, and **create postgres-addon --wait** stop after 10 minutes unless **--timeout** is set. **deploy** can save the stack and still fail while creating the release.

A runtime resource named **build** must be selected with **logs --resource build**. The positional form **logs build** is the build-log subcommand.

Stackdome Cloud is in alpha. Capacity is limited, and each organization can connect one cluster.

Secret values and a newly created API token are shown at creation time. Later **get** and **describe** calls return metadata.

**get postgres-credentials** prints short-lived database credentials. Treat that output as secret.

# HISTORY

The Stackdome CLI is published under the MIT license. Its copyright notice is dated **2024**. The hosted Stackdome Cloud service is offered as an alpha.

# SEE ALSO

[railway](/man/railway)(1), [fly](/man/fly)(1), [heroku](/man/heroku)(1), [docker](/man/docker)(1), [vercel](/man/vercel)(1)

# RESOURCES

```[Source code](https://github.com/axernel-labs/stackdome-cli)```

```[Homepage](https://stackdome.com)```

```[Documentation](https://docs.stackdome.com/reference/cli)```

<!-- verified: 2026-10-22 -->

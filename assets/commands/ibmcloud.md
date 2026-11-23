# TAGLINE

CLI for managing resources on IBM Cloud

# TLDR

**Log in interactively**

```ibmcloud login```

**Log in with single sign-on**

```ibmcloud login --sso```

**Log in non-interactively** with an API key

```ibmcloud login --apikey @[path/to/apikey.json] -r [us-south]```

**Set the target region and resource group**

```ibmcloud target -r [us-south] -g [default]```

**List resource instances**

```ibmcloud resource service-instances```

**Show account information**

```ibmcloud account show```

**Install a plugin** from the IBM Cloud repo

```ibmcloud plugin install [plugin-name]```

**List installed plugins**

```ibmcloud plugin list```

**Update all installed plugins**

```ibmcloud plugin update --all```

**Update the CLI** itself

```ibmcloud update```

**Trace API requests** of a single command

```IBMCLOUD_TRACE=true ibmcloud [resource groups]```

# SYNOPSIS

**ibmcloud** _command_ [_subcommand_] [_options_]

# PARAMETERS

**login** [**-a** _ENDPOINT_] [**--sso**] [**--apikey** _KEY_ | **@**_FILE_] [**-r** _REGION_] [**-g** _GROUP_] [**-c** _ACCOUNT_ID_]
> Authenticate against IBM Cloud. `--sso` logs in with a federated ID via a one-time passcode, `--apikey` uses a platform API key (or a key file prefixed with `@`), `--cr-token` with `--profile` logs in as a compute resource with a trusted profile.

**logout**
> End the current session.

**target** [**-r** _REGION_] [**-g** _GROUP_] [**-o** _ORG_] [**-s** _SPACE_]
> Set or show the current target region, resource group, or (legacy) Cloud Foundry org and space.

**account** _subcommand_
> Manage accounts (e.g. `account show`, `account users`, `account list`).

**resource** _subcommand_
> Manage resource groups and service instances (e.g. `resource groups`, `resource service-instances`, `resource service-instance-create`).

**plugin** _subcommand_
> Manage plugins: `install`, `uninstall`, `list`, `update`, `repo-plugins`.

**iam** _subcommand_
> Manage users, service IDs, API keys, and access policies.

**config** [**--http-timeout** _SECONDS_] [**--color** _true|false_] [**--locale** _LOCALE_|CLEAR] [**--check-version** _true|false_] [**--trace** _true|false|FILE_]
> Write CLI defaults to the configuration file (HTTP timeout, default 60 s; output color; locale; version check; HTTP tracing). Only one option per invocation.

**api** [_ENDPOINT_]
> Show or set the API endpoint (e.g. `cloud.ibm.com`, or `private.cloud.ibm.com` for private endpoints).

**update**
> Update the CLI to the latest version.

**--help**, **-h**
> Display help.

**--version**
> Print the CLI version.

# DESCRIPTION

**ibmcloud** is the official command-line interface for IBM Cloud. It wraps IBM Cloud's REST APIs for account, IAM, and resource management, and exposes service-specific functionality through installable plugins.

Most workflows begin with `ibmcloud login` followed by `ibmcloud target` to select the region and resource group. From there, `resource`, `iam`, and plugin commands create and manage services, clusters, and functions. Plugins such as `kubernetes-service`, `code-engine`, `container-registry`, and `cloud-databases` add service-specific subcommands.

# CONFIGURATION

**~/.bluemix/config.json**
> Stores session, target, and configuration information.

**IBMCLOUD_API_KEY**
> If set, used by `ibmcloud login` to authenticate non-interactively; accepts the key or `@filename`.

**IBMCLOUD_HOME**
> Overrides the configuration directory (session metadata is written to `$IBMCLOUD_HOME/.bluemix`); use separate values to run several sessions or accounts in parallel.

**IBMCLOUD_TRACE**
> `true` prints API request diagnostics to stdout; a file path appends them to that file.

**IBMCLOUD_COLOR**, **IBMCLOUD_VERSION_CHECK**, **IBMCLOUD_HTTP_TIMEOUT**
> Per-session overrides for color output, the update check, and the HTTP timeout in seconds.

# CAVEATS

Requires an IBM Cloud account and network access to `cloud.ibm.com`. Many service commands live in plugins, which must be installed first. Running resource commands before `ibmcloud target` often yields "no target" or empty results. IBM Cloud Foundry (and with it the `cf`-related org/space targeting) reached end of support in 2023, so older tutorials based on `ibmcloud cf` no longer apply. Pass API keys via `@file` or `IBMCLOUD_API_KEY` instead of the command line to keep them out of shell history.

# HISTORY

**ibmcloud** is the official CLI for **IBM Cloud** (formerly **Bluemix**). The current binary unified and replaced the older `bluemix` (`bx`) CLI around 2018, adopting the `ibmcloud` command name along with IBM's Bluemix-to-IBM-Cloud rebrand.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [az](/man/az)(1), [oc](/man/oc)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-getting-started)```

<!-- verified: 2026-11-23 -->

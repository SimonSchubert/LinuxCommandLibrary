# TAGLINE

CLI for managing resources on IBM Cloud

# TLDR

**Log in interactively**

```ibmcloud login```

**Log in with single sign-on**

```ibmcloud login --sso```

**Log in non-interactively** with an API key

```ibmcloud login --apikey [API_KEY]```

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

# SYNOPSIS

**ibmcloud** _command_ [_subcommand_] [_options_]

# PARAMETERS

**login** [**--sso**] [**--apikey** _KEY_] [**-r** _REGION_] [**-g** _GROUP_] [**-c** _ACCOUNT_ID_]
> Authenticate against IBM Cloud. `--sso` uses single sign-on, `--apikey` uses a platform API key.

**logout**
> End the current session.

**target** [**-r** _REGION_] [**-g** _GROUP_] [**-o** _ORG_] [**-s** _SPACE_]
> Set or show the current target region, resource group, Cloud Foundry org, or space.

**account** _subcommand_
> Manage accounts (e.g. `account show`, `account users`, `account list`).

**resource** _subcommand_
> Manage resource groups and service instances (e.g. `resource groups`, `resource service-instances`, `resource service-instance-create`).

**plugin** _subcommand_
> Manage plugins: `install`, `uninstall`, `list`, `update`, `repo-plugins`.

**cf** _subcommand_
> Cloud Foundry commands (requires the `cloud-foundry` plugin).

**iam** _subcommand_
> Manage users, service IDs, API keys, and access policies.

**config** [**--http-timeout** _N_] [**--color** _on|off_] [**--locale** _LOCALE_] [**--check-version** _true|false_]
> Configure CLI behavior (HTTP timeout, output color, locale, version check).

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
> If set, used by `ibmcloud login` to authenticate non-interactively.

**IBMCLOUD_HOME**
> Overrides the default `~/.bluemix` configuration directory.

# CAVEATS

Requires an IBM Cloud account and network access to `cloud.ibm.com`. Many service commands live in plugins, which must be installed first. Some regions require specific resource groups; running commands before `ibmcloud target` often yields "no target" errors.

# HISTORY

**ibmcloud** is the official CLI for **IBM Cloud** (formerly **Bluemix**). The current binary unified and replaced the older `bluemix` (`bx`) CLI around 2018, adopting the `ibmcloud` command name along with IBM's Bluemix-to-IBM-Cloud rebrand.

# SEE ALSO

[aws](/man/aws)(1), [gcloud](/man/gcloud)(1), [az](/man/az)(1), [oc](/man/oc)(1), [kubectl](/man/kubectl)(1)

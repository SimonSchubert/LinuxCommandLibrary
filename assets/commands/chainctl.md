# TAGLINE

manage Chainguard container images and resources

# TLDR

**Authenticate with Chainguard**

```chainctl auth login```

**List available container images**

```chainctl images list```

**List image tags**

```chainctl images tags list [image_name]```

**Get image details**

```chainctl images describe [image_name]```

**List organizations**

```chainctl iam organizations list```

**Configure chainctl settings**

```chainctl config set [key] [value]```

# SYNOPSIS

**chainctl** [**--api** _url_] [**--config** _file_] [**-o** _format_] [**--log-level** _level_] _command_ [_subcommand_] [_arguments..._]

# DESCRIPTION

**chainctl** (Chainguard Control) is the command-line interface for managing Chainguard resources, including security-hardened container images, identity management, and platform configurations.

The CLI follows the **context noun verb** style of interaction, allowing users to discover available images, analyze security metadata, manage organizations, and control access to Chainguard resources.

# PARAMETERS

**--api** _url_
> Chainguard platform API URL (default: https://console-api.enforce.dev)

**--config** _file_
> Path to chainctl config file (or set CHAINCTL_CONFIG)

**-o, --output** _format_
> Output format: csv, json, table, tree, wide, markdown, yaml, or go-template

**--log-level** _level_
> Log level: debug, info (default: ERROR)

**--force-color**
> Force color output

**Main commands:**

**auth** - Authentication commands (login, logout, token)
**images** - Manage container images (list, describe, tags)
**iam** - Identity and access management
**packages** - Interact with Chainguard packages
**config** - Manage chainctl configuration

# CONFIGURATION

**CHAINCTL_CONFIG**
> Environment variable specifying an alternate configuration file location.

# CAVEATS

Requires a Chainguard account for authentication. Some commands require appropriate IAM permissions within your organization.

# HISTORY

**chainctl** was developed by **Chainguard** as part of their secure software supply chain platform. Chainguard focuses on providing minimal, hardened container images with reduced attack surfaces and continuous security updates.

# SEE ALSO

[docker](/man/docker)(1), [cosign](/man/cosign)(1)

# TAGLINE

AWS SSO session and credential manager with an interactive terminal UI

# TLDR

**Launch the interactive TUI** to select an SSO profile, account, and role

```sesh```

**Authenticate directly** with a specific SSO, account, and role

```sesh [MyOrg] [MyAccount] [AdminRole]```

**Open the AWS console in the browser** for a specific session

```sesh [MyOrg] [MyAccount] [AdminRole] -b```

**Set credentials with a specific region**

```sesh [MyOrg] [MyAccount] [AdminRole] -r [eu-west-1]```

**Use a custom AWS profile name**

```sesh [MyOrg] [MyAccount] [AdminRole] --profile [production]```

**Show the current session identity**

```sesh -w```

**Output environment variables** for shell eval integration

```sesh --eval [MyOrg] [MyAccount]```

# SYNOPSIS

**sesh** [**-v**|**--version**] [**-b**|**--browser**] [**-w**|**--whoami**] [**-r**|**--region** _region_] [**-e**|**--eval**] [**-p**|**--profile** _name_] [_ssoname_ _accountname_ [_rolename_]]

# PARAMETERS

**-v**, **--version**
> Display version information and exit

**-b**, **--browser**
> Open the AWS console in the default browser instead of setting credentials

**-w**, **--whoami**
> Print the current AWS account name and ID for the active session

**-r** _region_, **--region** _region_
> Specify the AWS region to use for the session

**-e**, **--eval**
> Output shell export commands to stdout for setting AWS environment variables; used for shell integration

**-p** _name_, **--profile** _name_
> Use a custom AWS profile name for the credentials entry; the tool remembers profile names per account and role combination

# DESCRIPTION

**awsesh** (invoked as **sesh**) is a lightweight command-line tool for managing AWS SSO sessions and credentials. It provides an interactive terminal user interface built with Charm libraries (Bubble Tea, Bubbles, Lip Gloss) that allows users to browse SSO profiles, filter accounts by name with fuzzy search, select roles, and establish authenticated sessions.

The tool operates in two primary modes. In interactive TUI mode, running **sesh** without positional arguments launches a full-screen terminal interface where users can add, edit, and delete SSO profiles, browse accounts with filtering, set per-account regions, assign custom profile names, and open accounts directly in the AWS console. In CLI mode, providing an SSO name, account name, and optionally a role name on the command line performs direct session authentication without the TUI.

When a session is established, awsesh writes temporary credentials to the AWS shared credentials file (typically **~/.aws/credentials**) and can set the following environment variables via shell integration: **AWS_PROFILE**, **AWS_REGION**, **AWS_ACCESS_KEY_ID**, **AWS_SECRET_ACCESS_KEY**, **AWS_SESSION_TOKEN**, and **AWS_SESSION_EXPIRATION**. For organizations with over 100 SSO accounts, roles are lazy-loaded to avoid AWS API rate limiting.

# CONFIGURATION

awsesh follows the XDG Base Directory specification for its own configuration and respects the standard AWS configuration environment variables:

**AWS_CONFIG_FILE**
> Path to the AWS config file (default: ~/.aws/config)

**AWS_SHARED_CREDENTIALS_FILE**
> Path to the AWS shared credentials file (default: ~/.aws/credentials)

Shell integration is configured by adding a wrapper function to your shell profile (~/.bashrc, ~/.zshrc, or fish config):

```sesh() { eval "$(command sesh --eval "$@")"; }```

This enables environment variables to be set in the current shell session, which is required for compatibility with tools like **Starship** prompt.

# CAVEATS

The application directly modifies the AWS credentials file (~/.aws/credentials. Users with complex or hand-maintained credential configurations should back up the file before first use. The tool is currently in beta and has not reached a stable 1.0 release. A TypeScript rewrite is available on the beta branch with an API-based architecture for plugin and scripting support.

# HISTORY

**awsesh** was created by **Alvin Johansson** and **Sebastian Bille** at **Elva Labs** with the repository published on GitHub in **March 2025**. The first tagged release (v0.0.1) appeared on **March 25, 2025**. The project is written in Go, licensed under the MIT license, and continues active development with beta releases through 2026.

# SEE ALSO

[aws-sso](/man/aws-sso)(1), [aws-vault](/man/aws-vault)(1), [aws-configure](/man/aws-configure)(1), [aws](/man/aws)(1)

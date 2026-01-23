# TLDR

**Sign in** to a 1Password account

```op signin```

**List all items** in a vault

```op item list --vault [vault_name]```

**Get details** of a specific item

```op item get "[item_name]"```

**Get specific fields** from an item

```op item get "[item_name]" --fields label=username,label=password```

**Read a secret** using a secret reference

```op read "op://[vault]/[item]/[field]"```

**Run a command** with secrets injected as environment variables

```op run --env-file [.env] -- [command]```

**Create a new item** in a vault

```op item create --category login --title "[title]" --vault [vault_name]```

**List all vaults** in the account

```op vault list```

# SYNOPSIS

**op** [_command_] [_subcommand_] [_flags_]

# PARAMETERS

**account**
> Manage locally configured 1Password accounts

**item**
> Perform CRUD operations on vault items (get, list, create, edit, delete)

**vault**
> Manage vaults and their permissions

**document**
> Manage document-type items (get, list, create, edit, delete)

**read**
> Resolve and retrieve secret references

**run**
> Pass secrets as environment variables to a subprocess

**inject**
> Insert secrets into configuration files or templates

**signin**
> Authenticate to a 1Password account

**signout**
> End the current session

**whoami**
> Display information about the signed-in account

**completion**
> Generate shell completion scripts

**--format** _json_
> Output results in JSON format for parsing with tools like jq

**--fields** _label=field_
> Specify particular fields to retrieve from an item

**--vault** _name_
> Target a specific vault for the operation

**--cache=false**
> Disable daemon caching (useful in restricted environments)

# DESCRIPTION

**op** is the official command-line interface for 1Password, a password manager and secrets management platform. It enables secure access to passwords, credentials, and sensitive data directly from the terminal.

The CLI follows a noun-verb command structure where the first argument is typically a resource type (item, vault, user) followed by an action (get, list, create). It supports both interactive and scripted workflows, making it suitable for development automation and CI/CD pipelines.

Key capabilities include retrieving credentials using secret references in the format **op://vault/item/field**, injecting secrets into environment variables for running processes, and managing vault contents programmatically. The tool uses daemon-based caching on Unix systems to improve performance and reduce API calls.

Items can be referenced by name or by their 26-character alphanumeric ID, with IDs being more stable and efficient for automation. Output can be formatted as JSON for integration with tools like **jq**.

# CAVEATS

Requires a 1Password account and must be authenticated before most operations. The daemon caching feature stores encrypted data in memory, which may not be suitable for all security environments—use **--cache=false** to disable. Service accounts have different authentication flows than personal accounts.

# HISTORY

1Password was founded by **AgileBits** in **2006** as a password manager for macOS. The command-line interface was first released in **2017** to support developer workflows and automation. Version 2 of the CLI, released in **2022**, introduced the current noun-verb command structure, secret references, and improved service account support for CI/CD integration.

# SEE ALSO

[pass](/man/pass)(1), [gopass](/man/gopass)(1), [vault](/man/vault)(1), [gpg](/man/gpg)(1)

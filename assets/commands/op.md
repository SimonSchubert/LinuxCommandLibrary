# TLDR

**Sign in**

```op signin```

**List vaults**

```op vault list```

**Get item**

```op item get "[item_name]"```

**Get password**

```op item get "[item_name]" --field password```

**Create item**

```op item create --category login --title "[name]"```

**List items**

```op item list```

# SYNOPSIS

**op** [_command_] [_options_]

# PARAMETERS

**signin**
> Authenticate to 1Password.

**vault list**
> List vaults.

**item get** _NAME_
> Get item details.

**item list**
> List items.

**item create**
> Create new item.

**--field** _FIELD_
> Get specific field.

**--help**
> Display help information.

# DESCRIPTION

**op** is the 1Password CLI. Manages passwords and secrets from terminal.

The tool provides secure credential access. Integrates with shells and scripts.

op accesses 1Password vaults.

# CAVEATS

Requires 1Password account. Biometric auth supported. Session tokens expire.

# HISTORY

op was created by **1Password** for command-line access to password vaults.

# SEE ALSO

[pass](/man/pass)(1), [gopass](/man/gopass)(1), [bitwarden-cli](/man/bitwarden-cli)(1)


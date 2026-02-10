# TAGLINE

manages authentication tokens

# TLDR

**List tokens**

```npm token list```

**Create token**

```npm token create```

**Create read-only token**

```npm token create --read-only```

**Create CI token**

```npm token create --cidr=[192.168.1.0/24]```

**Revoke token**

```npm token revoke [token-id]```

# SYNOPSIS

**npm** **token** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Token subcommand.

**list**
> Show all tokens.

**create**
> Generate new token.

**revoke** _ID_
> Invalidate token.

**--read-only**
> Read-only token.

**--cidr** _RANGE_
> IP restriction.

**--help**
> Display help information.

# DESCRIPTION

**npm token** manages authentication tokens. Creates tokens for CI/CD.

The command handles API tokens. Supports scoped permissions.

# CAVEATS

Requires authentication. Tokens are sensitive. Store securely.

# HISTORY

npm token provides **token management** for automated npm registry access.

# SEE ALSO

[npm](/man/npm)(1), [npm-login](/man/npm-login)(1), [npm-publish](/man/npm-publish)(1)


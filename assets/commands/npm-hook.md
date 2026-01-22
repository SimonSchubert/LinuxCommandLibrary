# TLDR

**List hooks**

```npm hook ls```

**Add hook**

```npm hook add [package] [url] [secret]```

**Remove hook**

```npm hook rm [id]```

**Update hook**

```npm hook update [id] [url] [secret]```

# SYNOPSIS

**npm** **hook** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Hook subcommand.

**ls**
> List hooks.

**add** _PKG_ _URL_
> Add webhook.

**rm** _ID_
> Remove hook.

**update** _ID_
> Update hook.

**--help**
> Display help information.

# DESCRIPTION

**npm hook** manages npm registry webhooks. Triggers on package events.

The command configures notifications. Useful for CI/CD integration.

npm hook manages webhooks.

# CAVEATS

Requires authentication. Registry webhooks. Enterprise feature.

# HISTORY

npm hook enables **webhook management** for automated responses to npm registry events.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1)


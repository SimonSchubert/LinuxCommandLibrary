# TAGLINE

CLI for SourceHut services

# TLDR

**List builds**

```hut builds list```

**List todos**

```hut todo list```

**Show project**

```hut project show```

**Create paste**

```hut paste create [file]```

**List emails**

```hut lists emails```

# SYNOPSIS

**hut** _service_ _command_ [_options_]

# PARAMETERS

_SERVICE_
> SourceHut service (builds, todo, git, etc.).

_COMMAND_
> Service command.

**builds**
> Build service.

**todo**
> Todo tracker.

**git**
> Git repositories.

**paste**
> Paste service.

**--help**
> Display help information.

# DESCRIPTION

**hut** is the CLI for SourceHut services. It provides access to builds, todos, git hosting, mailing lists, and other sr.ht features.

The tool enables automation and scripting of SourceHut workflows. It covers all major services in the platform.

# CAVEATS

Requires SourceHut account. Service-specific commands. OAuth authentication.

# HISTORY

hut is the official CLI for **SourceHut** (sr.ht), a software development platform by **Drew DeVault**.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [hub](/man/hub)(1)

# TLDR

**Install an extension**

```gh extension install [owner]/[repo]```

**List installed extensions**

```gh extension list```

**Upgrade all extensions**

```gh extension upgrade --all```

**Remove an extension**

```gh extension remove [name]```

**Create a new extension**

```gh extension create [name]```

# SYNOPSIS

**gh extension** _command_ [_options_]

# PARAMETERS

**install** _REPO_
> Install extension from repository.

**list**
> List installed extensions.

**upgrade**
> Upgrade installed extensions.

**remove** _NAME_
> Uninstall an extension.

**create** _NAME_
> Scaffold a new extension.

**browse**
> Browse available extensions.

**--all**
> Apply to all extensions (upgrade).

**--help**
> Display help information.

# DESCRIPTION

**gh extension** manages GitHub CLI extensions. Extensions add new commands to gh, providing functionality beyond the built-in commands like accessibility testing, code review tools, or custom workflows.

Extensions are GitHub repositories containing executables that follow gh's extension protocol. They can be written in any language and distributed through GitHub. The extension system enables community contributions to gh.

gh extension provides full lifecycle management from installation to updates and removal.

# CAVEATS

Extensions run with user permissions. Review extension code before installing. Extensions are not officially supported by GitHub.

# HISTORY

The extension system was added to **GitHub CLI** in **2021**, enabling community-driven expansion of gh functionality through a plugin architecture.

# SEE ALSO

[gh](/man/gh)(1), [gh-a11y](/man/gh-a11y)(1)

# TAGLINE

shorthand for codespaces management

# TLDR

**Create a codespace**

```gh cs create```

**List codespaces**

```gh cs list```

**Connect to codespace via SSH**

```gh cs ssh```

**Open codespace in VS Code**

```gh cs code```

**Stop a codespace**

```gh cs stop -c [codespace-name]```

# SYNOPSIS

**gh cs** _command_ [_options_]

# PARAMETERS

**create**
> Create a new codespace.

**list**
> List available codespaces.

**ssh**
> SSH into a codespace.

**code**
> Open codespace in VS Code.

**stop**
> Stop a running codespace.

**delete**
> Delete a codespace.

**ports**
> Manage port forwarding.

**-c** _CODESPACE_, **--codespace** _CODESPACE_
> Target codespace name.

**-R** _REPO_, **--repo** _REPO_
> Repository for new codespace.

**--help**
> Display help information.

# DESCRIPTION

**gh cs** (codespaces) manages GitHub Codespaces from the command line. Codespaces are cloud-hosted development environments that provide full VS Code experience with configurable compute resources.

The command enables creating, connecting, and managing codespaces without visiting github.com. It supports SSH connections for terminal access and integration with local VS Code installations.

gh cs streamlines cloud development workflows directly from the terminal.

# CAVEATS

Requires GitHub account with Codespaces access. Usage may incur charges. Codespaces have timeout and retention limits.

# HISTORY

gh cs was added to the **GitHub CLI** to support Codespaces, GitHub's cloud development environment launched in **2020**.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1), [code](/man/code)(1)

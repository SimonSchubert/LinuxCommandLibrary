# TAGLINE

shorthand for codespaces management

# TLDR

**Create a codespace for a repository**

```gh cs create -R [owner/repo]```

**List codespaces**

```gh cs list```

**Connect to codespace via SSH**

```gh cs ssh -c [codespace-name]```

**Open codespace in VS Code**

```gh cs code```

**Stop a running codespace**

```gh cs stop -c [codespace-name]```

**Delete a codespace**

```gh cs delete -c [codespace-name]```

**Copy files from codespace to local machine**

```gh cs cp remote:[/path/to/file] [local/path]```

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
> Open codespace in Visual Studio Code.

**stop**
> Stop a running codespace.

**delete**
> Delete codespaces.

**ports**
> List and manage port forwarding.

**cp**
> Copy files between local and remote file systems.

**logs**
> Access codespace logs.

**rebuild**
> Rebuild a codespace.

**view**
> View details about a codespace.

**jupyter**
> Open a codespace in JupyterLab.

**edit**
> Edit a codespace.

**-c** _CODESPACE_, **--codespace** _CODESPACE_
> Target codespace name. If omitted, a list is displayed for selection.

**-R** _REPO_, **--repo** _REPO_
> Repository for new codespace.

**--help**
> Display help information.

# DESCRIPTION

**gh cs** is the shorthand alias for **gh codespace**, managing GitHub Codespaces from the command line. Codespaces are cloud-hosted development environments that provide a full VS Code experience with configurable compute resources.

The command enables creating, connecting, and managing codespaces without visiting github.com. It supports SSH connections for terminal access, integration with local VS Code installations, and file copying between local and remote environments.

# CAVEATS

Requires GitHub account with Codespaces access. Usage may incur charges. Codespaces have timeout and retention limits.

# HISTORY

gh cs was added to the **GitHub CLI** to support Codespaces, GitHub's cloud development environment launched in **2020**.

# SEE ALSO

[gh](/man/gh)(1), [gh-codespace](/man/gh-codespace)(1), [gh-repo](/man/gh-repo)(1), [code](/man/code)(1)

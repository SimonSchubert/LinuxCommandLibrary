# TLDR

**Create a new workspace**

```devpod up [github.com/user/repo]```

**Create workspace** with specific provider

```devpod up [github.com/user/repo] --provider [docker]```

**List workspaces**

```devpod list```

**Connect to workspace** via SSH

```devpod ssh [workspace_name]```

**Stop a workspace**

```devpod stop [workspace_name]```

**Delete a workspace**

```devpod delete [workspace_name]```

**Add a provider**

```devpod provider add [kubernetes]```

# SYNOPSIS

**devpod** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: up, list, ssh, stop, delete, provider.

**up** _SOURCE_
> Create workspace from git repo, folder, or image.

**--provider** _PROVIDER_
> Specify infrastructure provider.

**--ide** _IDE_
> IDE to use (vscode, openvscode, cursor, etc.).

**list**
> List all workspaces.

**ssh** _WORKSPACE_
> SSH into workspace.

**stop** _WORKSPACE_
> Stop running workspace.

**delete** _WORKSPACE_
> Delete workspace.

**--help**
> Display help information.

# DESCRIPTION

**DevPod** is an open-source tool for creating reproducible development environments based on devcontainer.json specifications. It abstracts infrastructure by supporting multiple providers including Docker, Kubernetes, and cloud VMs.

DevPod workspaces are created from git repositories, local directories, or container images. The tool automatically provisions infrastructure, builds the dev container, and connects your IDE. It supports VS Code, JetBrains IDEs, and SSH access.

The provider architecture allows running the same development environment locally with Docker or remotely on cloud infrastructure, maintaining consistency regardless of where the environment runs.

# CAVEATS

Requires configured providers for target infrastructure. Cloud providers incur costs. Large dev containers may have slow initial setup. Some features require specific IDE integrations.

# HISTORY

DevPod was created by **Loft Labs** and released in **2023**. It was designed to provide a vendor-neutral, open-source alternative to cloud development environments, with support for the devcontainer specification.

# SEE ALSO

[devcontainer](/man/devcontainer)(1), [docker](/man/docker)(1), [code](/man/code)(1)

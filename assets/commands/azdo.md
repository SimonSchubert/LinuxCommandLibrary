# TAGLINE

Terminal UI for Azure DevOps

# TLDR

**Start** the interactive TUI

```azdo```

**Try it out** with realistic mock data, no setup required

```azdo demo```

**Set or update** the Azure DevOps personal access token

```azdo auth```

**Show** the version

```azdo --version```

# SYNOPSIS

**azdo** [_command_] [_options_]

# DESCRIPTION

**azdo** is a terminal user interface for **Azure DevOps**. It brings pull requests, work items, and pipelines into a keyboard-driven console application so you can review and manage them without switching to the web portal.

From the TUI you can list and filter pull requests, view diffs, vote, and add inline comments; browse work items and change their state; and monitor pipeline runs down to individual stages, jobs, and tasks with log viewing. An optional metrics dashboard shows live status and trend analysis, and the tool supports multiple projects, several built-in themes, and state that persists across sessions.

Authentication uses an Azure DevOps **Personal Access Token (PAT)**, stored in the system keyring (or supplied through the **AZDO_PAT** environment variable). Configuration, including the organization and project names, lives in **~/.config/azdo-tui/config.yaml**.

# PARAMETERS

**demo**

> Launch the interface populated with mock data, so it can be explored without any configuration.

**auth**

> Set or update the stored personal access token.

**--version**

> Print version information and exit.

**--help**

> Show usage information.

# CONFIGURATION

**~/.config/azdo-tui/config.yaml**

> Holds the organization name, the list of projects, and optional settings such as polling interval, theme, and metrics options.

**AZDO_PAT**

> Environment variable used as a fallback source for the personal access token when none is found in the keyring.

# CAVEATS

The personal access token needs the right scopes (typically Build read, Code read/write, and Work Items read/write) for all features to work. azdo is a young, third-party project not affiliated with Microsoft, so its behavior may change between releases.

# SEE ALSO

[az](/man/az)(1), [gh](/man/gh)(1), [glab](/man/glab)(1), [lazygit](/man/lazygit)(1), [tig](/man/tig)(1)

# RESOURCES

```[Source code](https://github.com/Elpulgo/azdo)```

<!-- verified: 2026-06-16 -->

# TAGLINE

Terminal UI for managing Azure Container Apps

# TLDR

**Launch the TUI** connected to Azure

```az-tui```

**Launch with mock data** for testing without Azure connectivity

```az-tui --mock```

**Restrict to a specific resource group** before launching

```ACA_RG="my-resource-group" az-tui```

**Display the version** and exit

```az-tui -version```

# SYNOPSIS

**az-tui** [_options_]

# PARAMETERS

**-mock**, **-m**
> Use mock data instead of connecting to Azure CLI

**-version**
> Print version information and exit

# DESCRIPTION

**az-tui** is a terminal-based user interface for managing Azure Container Apps, inspired by **K9s**. It provides a keyboard-driven interface for browsing, inspecting, and debugging container applications directly from the terminal without needing the Azure portal.

The tool follows a hierarchical navigation model: resource groups, container apps, revisions, containers, and environment variables. Users can view detailed application metadata in JSON format, inspect revisions with active status and traffic allocation percentages, stream container logs in real-time, and execute commands within running containers for troubleshooting.

Written in Go using the Bubble Tea TUI framework, **az-tui** communicates with Azure through the Azure CLI. Navigation uses VIM-inspired key bindings: **/** to filter, **:** to switch contexts, **Enter** to drill down, **Esc** to go back, and **q** to quit. Mode-specific bindings include **r** to refresh, **R** to restart a revision, **l** to view logs, **s** to open a shell, and **v** to display environment variables.

A mock mode (**--mock**) provides synthetic data for development and testing without requiring Azure credentials.

# CONFIGURATION

The **ACA_RG** environment variable can be set to restrict browsing to a specific Azure resource group. If unset, all resource groups across the subscription are displayed.

# CAVEATS

Requires the Azure CLI to be installed and authenticated via **az login**. The Azure Container Apps extension must be installed (**az extension add -n containerapp**). Only manages Azure Container Apps; other Azure services are not supported. The project is in early development.

# HISTORY

**az-tui** was created by **IAL32** and released as an open-source project under the MIT license on GitHub in **August 2024**. It is written in Go and built on the Charm ecosystem (Bubble Tea, Bubbles, Lip Gloss).

# SEE ALSO

[az](/man/az)(1), [k9s](/man/k9s)(1), [docker](/man/docker)(1)

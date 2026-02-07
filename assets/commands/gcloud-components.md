# TAGLINE

Google Cloud SDK component manager

# TLDR

**List available components**

```gcloud components list```

**Install component**

```gcloud components install [kubectl]```

**Update all components**

```gcloud components update```

**Remove component**

```gcloud components remove [component-id]```

**Reinstall component**

```gcloud components reinstall [component-id]```

# SYNOPSIS

**gcloud components** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: list, install, update, remove, reinstall.

**list**
> Show available and installed components.

**install** _COMPONENT_
> Install specified component.

**update**
> Update SDK to latest version.

**remove** _COMPONENT_
> Uninstall component.

**reinstall** _COMPONENT_
> Reinstall component.

**--help**
> Display help information.

# DESCRIPTION

**gcloud components** manages the modular component system of the Google Cloud SDK. The SDK follows a core-plus-components architecture where a minimal base installation can be extended with additional tools as needed.

Common optional components include kubectl for Kubernetes management, gsutil for Cloud Storage operations, bq for BigQuery interactions, and language-specific App Engine runtimes. This modular approach keeps the initial SDK installation small while allowing expansion for specific workflows.

The update command keeps all installed components current with the latest features and bug fixes. Component management is tracked locally, allowing different machines to have different component sets based on their specific use cases. Some components have dependencies on others, which the system handles automatically during installation.

# CAVEATS

Updates may change behavior. Some components have dependencies. Admin rights may be needed.

# HISTORY

gcloud components is part of the **Google Cloud SDK** management system, enabling modular installation of only the tools you need.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-help](/man/gcloud-help)(1)

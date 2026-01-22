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

**gcloud components** manages Google Cloud SDK components. It installs additional tools like kubectl, gsutil, and bq, and keeps the SDK updated.

The command handles downloading, installing, and updating individual components. The SDK can be extended with optional tools for specific GCP services.

gcloud components ensures you have the tools needed for your GCP workflow.

# CAVEATS

Updates may change behavior. Some components have dependencies. Admin rights may be needed.

# HISTORY

gcloud components is part of the **Google Cloud SDK** management system, enabling modular installation of only the tools you need.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-help](/man/gcloud-help)(1)

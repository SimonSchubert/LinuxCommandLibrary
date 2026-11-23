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

**Install multiple components**

```gcloud components install [kubectl] [gke-gcloud-auth-plugin]```

Install **alpha and beta** commands

```gcloud components install alpha beta```

**Roll back** (or pin) the SDK to a specific version

```gcloud components update --version=[500.0.0]```

**Show only installed** components

```gcloud components list --only-local-state```

# SYNOPSIS

**gcloud components** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: list, install, update, remove, reinstall, repositories.

**list**
> Show available and installed components, their size, and current version.

**install** _COMPONENT_...
> Install one or more components (and their dependencies).

**update** [**--version**=_VERSION_]
> Update all installed components to the latest available version, or to a specific SDK version (useful for rolling back).

**remove** _COMPONENT_...
> Uninstall one or more components.

**reinstall**
> Reinstall the gcloud CLI with the same components you have now.

**repositories**
> Manage additional component repositories (add, list, remove) for Trusted Tester programs.

**--show-versions**
> (list) Show installed and latest available versions of each component.

**--only-local-state**
> (list) Only show locally installed components.

**--quiet**, **-q**
> Disable interactive prompts.

**--help**
> Display help information.

# DESCRIPTION

**gcloud components** manages the modular component system of the Google Cloud SDK. The SDK follows a core-plus-components architecture where a minimal base installation can be extended with additional tools as needed.

Installed by default are **core**, **gcloud** and **bq**. Optional components include **alpha**, **beta** and **preview** command tracks, **kubectl** and **gke-gcloud-auth-plugin** for Kubernetes, the legacy **gsutil** (superseded by **gcloud storage**), emulators for Bigtable, Datastore, Pub/Sub and Spanner, and language-specific App Engine extensions. This modular approach keeps the initial SDK installation small while allowing expansion for specific workflows.

The update command keeps all installed components current with the latest features and bug fixes. Component management is tracked locally, allowing different machines to have different component sets based on their specific use cases. Some components have dependencies on others, which the system handles automatically during installation.

# CAVEATS

The component manager is **disabled** when the CLI was installed via apt or dnf/yum: install the matching OS packages instead, such as **google-cloud-cli-gke-gcloud-auth-plugin** or **kubectl**. Updates may change behavior. Writing to a system-wide installation directory may require admin rights.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-help](/man/gcloud-help)(1), [gcloud-version](/man/gcloud-version)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Documentation](https://docs.cloud.google.com/sdk/docs/components)```

<!-- verified: 2026-11-23 -->

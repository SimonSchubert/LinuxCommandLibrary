# TAGLINE

Initialize a Terraform working directory

# TLDR

**Initialize the current directory**

```terraform init```

**Initialize and upgrade** providers and modules

```terraform init -upgrade```

**Initialize with backend configuration** from a file

```terraform init -backend-config=[path/to/config.hcl]```

**Initialize without configuring** a backend

```terraform init -backend=false```

**Initialize and migrate state** to a new backend

```terraform init -migrate-state```

**Initialize from a module source**

```terraform init -from-module=[source]```

# SYNOPSIS

**terraform** **init** [_options_]

# PARAMETERS

**-upgrade**
> Upgrade modules and plugins to the latest allowed versions.

**-backend** _true|false_
> Enable or disable backend configuration. Default is **true**.

**-backend-config** _path_
> Provide backend configuration via file path or key=value pair. Can be specified multiple times.

**-reconfigure**
> Reconfigure the backend, ignoring any saved configuration. Prevents state migration.

**-migrate-state**
> Attempt to copy existing state to the new backend with interactive prompts.

**-force-copy**
> Suppress migration prompts and automatically copy state.

**-from-module** _source_
> Copy a module into the target directory before initialization.

**-get** _true|false_
> Download child modules. Default is **true**.

**-plugin-dir** _path_
> Force plugin installation to read plugins only from the specified directory.

**-lockfile** _mode_
> Set lockfile mode. Use **readonly** to verify checksums without updating the lockfile.

**-input** _true|false_
> Enable or disable interactive prompts. Default is **true**.

**-lock** _true|false_
> Lock state files during operations. Default is **true**.

**-lock-timeout** _duration_
> Duration to retry acquiring a state lock. Default is **0s**.

**-no-color**
> Disable color codes in the output.

**-json**
> Enable machine-readable JSON output.

# DESCRIPTION

**terraform init** initializes a working directory containing Terraform configuration files. This is the first command to run after writing a new configuration or cloning an existing one from version control. It is safe to run multiple times and will not delete existing configuration or state.

The command performs several initialization steps: it configures the backend for storing state, downloads and installs provider plugins declared in the configuration, and downloads child modules referenced in the configuration. Each of these steps can be individually controlled with flags.

# CAVEATS

When changing backends, you must choose between **-reconfigure** (discard old state) and **-migrate-state** (copy state to new backend). Running init without either flag when the backend has changed will produce an error. The **-plugin-dir** option disables the default plugin download behavior, so the directory must contain all required providers.

# HISTORY

**Terraform** was created by **Mitchell Hashimoto** and released by **HashiCorp** in **2014**. The init command was introduced to manage the growing complexity of provider plugins and module dependencies. Provider plugin management was significantly reworked in **Terraform 0.13** (2020) with the introduction of the dependency lock file and the public Terraform Registry as the default plugin source.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-apply](/man/terraform-apply)(1)

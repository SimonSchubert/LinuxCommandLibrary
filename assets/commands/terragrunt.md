# TAGLINE

Terraform wrapper for DRY configurations

# TLDR

**Initialize modules**

```terragrunt init```

**Plan changes**

```terragrunt plan```

**Apply changes**

```terragrunt apply```

**Destroy infrastructure**

```terragrunt destroy```

**Run on all modules**

```terragrunt run-all apply```

**Plan all modules**

```terragrunt run-all plan```

**Show outputs**

```terragrunt output```

**Graph dependencies**

```terragrunt graph-dependencies```

# SYNOPSIS

**terragrunt** [_init_] [_plan_] [_apply_] [_destroy_] [_run-all_] [_options_]

# PARAMETERS

**init**
> Initialize Terraform.

**plan**
> Show execution plan.

**apply**
> Apply changes.

**destroy**
> Destroy infrastructure.

**output**
> Show outputs.

**run-all** _CMD_
> Run command on all modules.

**graph-dependencies**
> Show dependency graph.

**--terragrunt-config** _FILE_
> Config file.

**--terragrunt-working-dir** _DIR_
> Working directory.

**--terragrunt-source** _SOURCE_
> Module source override.

**--terragrunt-non-interactive**
> Non-interactive mode.

**--terragrunt-parallelism** _N_
> Parallel operations.

# DESCRIPTION

**terragrunt** is a thin wrapper for Terraform that provides extra tools for keeping configurations DRY and managing multiple modules.

DRY configuration avoids repetition across environments. Common settings are defined once and inherited by modules.

Remote state configuration is centralized. Backend settings don't need repetition in every module.

Dependencies between modules are managed automatically. run-all executes commands across multiple modules in dependency order.

Before and after hooks run custom commands around Terraform operations. This enables validation, notifications, and cleanup.

Lock file management handles concurrent access. Multiple team members can work safely on shared infrastructure.

# CONFIGURATION

**terragrunt.hcl**
> Module-level configuration file defining Terraform source, inputs, dependencies, and backend settings

**TERRAGRUNT_CONFIG**
> Environment variable to override the default configuration file path

**TERRAGRUNT_DOWNLOAD**
> Environment variable to set the directory where Terragrunt downloads Terraform source code

# CAVEATS

Adds complexity over plain Terraform. Learning curve for configuration syntax. Some Terraform features need workarounds.

# HISTORY

**Terragrunt** was created by **Gruntwork** around **2016** to address pain points in managing Terraform at scale. It's widely used for multi-environment, multi-account infrastructure management.

# SEE ALSO

[terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1), [aws](/man/aws)(1)

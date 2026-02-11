# TAGLINE

Infrastructure as code provisioning tool

# TLDR

**Initialize a Terraform working directory**

```terraform init```

**Preview infrastructure changes**

```terraform plan```

**Apply infrastructure changes**

```terraform apply```

**Destroy managed infrastructure**

```terraform destroy```

**Format configuration files**

```terraform fmt```

**Validate configuration syntax**

```terraform validate```

**Show current state**

```terraform show```

**List resources in state**

```terraform state list```

**Import existing infrastructure**

```terraform import [resource_type.name] [id]```

# SYNOPSIS

**terraform** _command_ [_options_] [_args_]

# PARAMETERS

**init**
> Initialize working directory, download providers

**plan**
> Create execution plan showing proposed changes

**apply**
> Apply changes to reach desired state

**destroy**
> Destroy all managed infrastructure

**fmt**
> Format configuration files to canonical style

**validate**
> Check configuration syntax and consistency

**show**
> Display current state or saved plan

**output**
> Read output values from state

**state**
> Advanced state management commands

**import**
> Import existing infrastructure into state

**workspace**
> Manage workspaces

**-auto-approve**
> Skip interactive approval (apply/destroy)

**-var** _'key=value'_
> Set input variable

**-var-file** _file_
> Load variables from file

**-target** _resource_
> Target specific resource

**-parallelism** _n_
> Limit concurrent operations

# DESCRIPTION

**terraform** is an infrastructure as code tool for building, changing, and versioning cloud infrastructure safely and efficiently. It uses declarative configuration files to describe desired infrastructure state.

Configuration is written in HCL (HashiCorp Configuration Language) defining resources like servers, networks, and databases. Terraform communicates with cloud providers (AWS, Azure, GCP, etc.) via plugins called providers.

The workflow is: **init** (setup), **plan** (preview), **apply** (execute). State is tracked in **terraform.tfstate**, enabling Terraform to know what exists and what needs changing.

Workspaces allow managing multiple environments (dev, staging, prod) from the same configuration with different state files.

# CONFIGURATION

**terraform.tfvars**
> Default variable values file, automatically loaded when present in the working directory

**\*.auto.tfvars**
> Additional variable files automatically loaded alphabetically

**~/.terraformrc** or **%APPDATA%/terraform.rc**
> CLI configuration file for provider installation methods, credentials, and plugin cache

**TF_VAR_name**
> Environment variables prefixed with TF_VAR_ set input variable values

**TF_CLI_CONFIG_FILE**
> Override the default CLI configuration file location

# CAVEATS

State files contain sensitive information (passwords, keys) and should be stored securely. Use remote backends (S3, Terraform Cloud) for team collaboration and state locking.

**terraform destroy** is irreversible. Always run **plan** first and verify the destruction plan carefully.

Provider versions should be pinned in configuration to ensure reproducibility. Unexpected provider updates can cause issues.

Changes made outside Terraform (manual console changes) cause state drift. Use **terraform refresh** or **import** to reconcile.

# HISTORY

Terraform was created by **HashiCorp** and first released in **2014** by Mitchell Hashimoto. It pioneered the "infrastructure as code" approach for multi-cloud provisioning and became the de facto standard for declarative infrastructure management.

# SEE ALSO

[aws](/man/aws)(1), [ansible](/man/ansible)(1), [pulumi](/man/pulumi)(1), [tofu](/man/tofu)(1)

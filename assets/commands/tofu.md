# TAGLINE

Open-source infrastructure as code tool

# TLDR

**Initialize directory**

```tofu init```

**Plan changes**

```tofu plan```

**Apply changes**

```tofu apply```

**Destroy resources**

```tofu destroy```

**Format files**

```tofu fmt```

**Validate config**

```tofu validate```

# SYNOPSIS

**tofu** _command_ [_options_]

# PARAMETERS

**init**
> Initialize working directory.

**plan**
> Show execution plan.

**apply**
> Apply changes.

**destroy**
> Remove resources.

**fmt**
> Format files.

**validate**
> Check configuration.

**-auto-approve**
> Skip approval.

# DESCRIPTION

**tofu** (OpenTofu) is an open-source infrastructure-as-code tool forked from Terraform, allowing you to define cloud and on-premises resources in declarative HCL configuration files. It supports major cloud providers including AWS, GCP, and Azure through a provider plugin system.

The workflow follows an init-plan-apply cycle: **init** downloads providers and modules, **plan** previews proposed changes, and **apply** creates or modifies the actual infrastructure. State is tracked in a state file that maps configuration to real resources, enabling incremental updates and safe destruction with **destroy**.

# CAVEATS

Terraform fork. Provider compatibility. State file important.

# HISTORY

**OpenTofu** was forked from **Terraform** in 2023 after HashiCorp changed Terraform's license, maintained by the Linux Foundation.

# SEE ALSO

[terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1), [ansible](/man/ansible)(1)

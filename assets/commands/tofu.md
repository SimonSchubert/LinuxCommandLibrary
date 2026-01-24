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

**tofu** manages infrastructure. It's OpenTofu, a Terraform fork.

Infrastructure as code. Declarative config.

Multi-cloud support. AWS, GCP, Azure.

State management. Track resources.

Plan before apply. Preview changes.

# CAVEATS

Terraform fork. Provider compatibility. State file important.

# HISTORY

**OpenTofu** was forked from **Terraform** in 2023 after HashiCorp changed Terraform's license, maintained by the Linux Foundation.

# SEE ALSO

[terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1), [ansible](/man/ansible)(1)

# TAGLINE

Destroy Terraform-managed infrastructure

# TLDR

**Destroy** all resources in the current configuration

```terraform destroy```

**Destroy** without interactive confirmation

```terraform destroy -auto-approve```

**Destroy** a **specific resource** only

```terraform destroy -target=[resource_type.resource_name]```

**Preview** what would be destroyed without executing

```terraform plan -destroy```

**Destroy** with specific **variable values**

```terraform destroy -var '[name]=[value]'```

**Destroy** with a **variable file**

```terraform destroy -var-file=[prod.tfvars]```

**Destroy** with limited **parallelism** to avoid API rate limits

```terraform destroy -parallelism=[5]```

# SYNOPSIS

**terraform destroy** [_options_]

# PARAMETERS

**-auto-approve**
> Skip the interactive confirmation prompt

**-target=**_RESOURCE_
> Destroy only the specified resource and its dependencies. Can be specified multiple times.

**-var** '_NAME_=_VALUE_'
> Set an input variable value. Can be specified multiple times.

**-var-file=**_PATH_
> Load variable values from a file

**-lock=**_BOOL_
> Control whether Terraform locks the state file. Default: **true**.

**-lock-timeout=**_DURATION_
> How long to wait to acquire the state lock. Example: **20s**.

**-parallelism=**_N_
> Limit concurrent resource operations. Default: **10**.

**-refresh=**_BOOL_
> Whether to refresh state before planning. Default: **true**.

**-state=**_PATH_
> Path to the state file. Default: **terraform.tfstate**.

**-no-color**
> Disable color output

# DESCRIPTION

**terraform destroy** permanently deletes all infrastructure resources tracked in the current Terraform state file. It is a convenience alias for **terraform apply -destroy**.

The command reads the state file to identify managed resources, validates state against cloud provider APIs, builds a dependency graph to determine the correct reverse destruction order, presents a plan for confirmation, and then deletes resources via provider APIs. After completion, it updates the state file to reflect that the resources no longer exist.

It is designed primarily for ephemeral infrastructure in development and testing environments. For production, it should only be used in controlled decommissioning scenarios.

# CAVEATS

This command is **irreversible**. Once resources are destroyed, the cloud provider removes them permanently and Terraform cannot restore them. If a destroy operation fails partway through, you may end up in a partially destroyed state. The command operates exclusively based on the state file and has no awareness of resources not tracked in state. Resources with **deletion protection** enabled at the provider level cannot be destroyed until protection is manually disabled. Configurations using **lifecycle { prevent_destroy = true }** will cause the destroy to fail with an error. Using **-target** for selective destruction can leave infrastructure in an inconsistent state and should be reserved for exceptional situations.

# HISTORY

**Terraform** was created by **Mitchell Hashimoto** and **Armon Dadgar** at **HashiCorp**, with **v0.1.0** released in **July 2014**. The destroy subcommand has been part of Terraform's core workflow since the earliest releases. In **v0.15.2** (April 2021), **terraform apply -destroy** was added as the explicit form, making **terraform destroy** an official convenience alias. Terraform reached general availability with **v1.0.0** in **June 2021**.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-apply](/man/terraform-apply)(1)

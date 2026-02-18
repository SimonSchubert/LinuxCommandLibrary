# TAGLINE

Apply Terraform infrastructure changes

# TLDR

**Apply changes** with interactive approval

```terraform apply```

**Apply a saved plan** file

```terraform apply [plan.tfplan]```

**Apply without confirmation** prompt

```terraform apply -auto-approve```

**Apply with a variable**

```terraform apply -var="[key]=[value]"```

**Replace a specific resource**

```terraform apply -replace=[resource]```

**Apply with limited parallelism**

```terraform apply -parallelism=[n]```

# SYNOPSIS

**terraform** **apply** [_options_] [_plan file_]

# PARAMETERS

**-auto-approve**
> Skip interactive approval of the plan before applying.

**-var** _name=value_
> Set an input variable value. Can be specified multiple times.

**-var-file** _file_
> Load variable values from a file.

**-replace** _resource_
> Force replacement of a specific resource instance.

**-target** _resource_
> Limit the operation to a specific resource and its dependencies.

**-parallelism** _n_
> Limit the number of concurrent operations. Default is **10**.

**-compact-warnings**
> Show warning messages in compact form with only the summary.

**-input** _true|false_
> Enable or disable interactive prompts. Default is **true**.

**-lock** _true|false_
> Lock the state file during operations. Default is **true**.

**-lock-timeout** _duration_
> Duration to retry acquiring a state lock. Default is **0s**.

**-no-color**
> Disable color codes in the output.

**-json**
> Enable machine-readable JSON output. Implies **-input=false**.

**-destroy**
> Create a plan to destroy all resources, then apply it.

**-refresh-only**
> Only update the state to match remote objects.

# DESCRIPTION

**terraform apply** executes the actions proposed in a Terraform plan to create, update, or destroy infrastructure. When run without a saved plan file, it automatically creates a new plan, prompts for approval, and then performs the proposed changes. When given a saved plan file (from **terraform plan -out**), it executes the plan without prompting.

The command compares the desired state defined in configuration files against the current state and determines the minimal set of changes needed. It supports all planning modes and options from **terraform plan** when no saved plan is provided.

# CAVEATS

Running **terraform apply** without **-auto-approve** in non-interactive environments (CI/CD) will hang waiting for input. Use **-auto-approve** or pipe a saved plan file for automation. State locking should not be disabled in team environments as it risks state corruption from concurrent operations.

# HISTORY

**Terraform** was created by **Mitchell Hashimoto** and released by **HashiCorp** in **2014**. It pioneered the infrastructure-as-code approach using a declarative configuration language (HCL). The apply command has been a core part of the plan-then-apply workflow since the initial release, with JSON output support added in later versions.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-init](/man/terraform-init)(1), [terraform-fmt](/man/terraform-fmt)(1)

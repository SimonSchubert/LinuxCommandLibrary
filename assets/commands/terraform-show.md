# TAGLINE

Display Terraform state or plan in human-readable form

# TLDR

**Show the current state**

```terraform show```

**Show a saved plan file**

```terraform show [plan.tfplan]```

**Output state as JSON**

```terraform show -json```

**Output a plan file as JSON**

```terraform show -json [plan.tfplan]```

**Show state without color**

```terraform show -no-color```

# SYNOPSIS

**terraform** **show** [_options_] [_file_]

# PARAMETERS

**-json**
> Output the state or plan in machine-readable JSON format. Sensitive values are shown in plain text.

**-no-color**
> Disable terminal color codes in the output.

# DESCRIPTION

**terraform show** reads and displays Terraform state or plan files in a human-readable format. When called without a file argument, it renders the latest state snapshot, showing all managed resources and their current attribute values. When given a plan file (created by **terraform plan -out**), it displays the proposed changes including resources to be created, modified, or destroyed.

The **-json** flag produces structured JSON output suitable for processing by external tools, CI/CD pipelines, or policy engines. The JSON format includes the full resource state, planned changes, and provider configuration.

# CAVEATS

The **-json** flag exposes **sensitive values in plain text**, including passwords, tokens, and keys stored in state. State files should be treated as sensitive data. The JSON output format requires Terraform **0.12 or later**, and the schema may change between major versions. When using **-json** with a plan file, the plan must have been created without **-refresh=false**.

# HISTORY

The **show** subcommand has been available since early Terraform releases by **HashiCorp**. JSON output support was added in **Terraform 0.12** (May 2019) as part of a broader effort to provide machine-readable output across all commands. The JSON output schema has been incrementally extended to cover additional resource metadata and planned change details.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-apply](/man/terraform-apply)(1), [terraform-output](/man/terraform-output)(1)

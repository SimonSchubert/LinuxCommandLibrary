# TAGLINE

Validate Terraform configuration syntax and internal consistency

# TLDR

**Validate** the configuration in the current directory

```terraform validate```

**Output** validation results as **JSON**

```terraform validate -json```

**Validate** without color

```terraform validate -no-color```

**Validate** after a backend-free init (CI / modules)

```terraform init -backend=false && terraform validate```

# SYNOPSIS

**terraform** **validate** [_options_]

# PARAMETERS

**-json**
> Produce machine-readable JSON output (disables color). Suitable for editor integrations and CI.

**-no-color**
> Disable color in human-readable output.

**-var** _'NAME=VALUE'_
> Set a single root-module input variable. May be repeated.

**-var-file** _FILENAME_
> Load variable values from a **.tfvars** file. May be repeated.

# DESCRIPTION

**terraform validate** checks whether the Terraform configuration files in a working directory are syntactically valid and internally consistent. It verifies attribute names, value types, and module structure without contacting remote services such as remote state backends or provider APIs.

Validation requires an initialized working directory with referenced providers and modules installed. For local checks without configuring a backend, run **terraform init -backend=false** first. To validate configuration in the context of a specific workspace, variables, and state, use **terraform plan**, which includes an implied validation step.

The command is safe to run automatically as a post-save editor check or as a CI step for reusable modules. With **-json**, results include **valid**, **error_count**, **warning_count**, and a **diagnostics** array describing each issue.

# CAVEATS

Does not replace **terraform plan**: remote resource existence, provider API behavior, and runtime variable constraints are not fully exercised. An uninitialized directory will fail until plugins and modules are installed. Exit status is non-zero when errors are detected; warnings alone do not make the configuration invalid.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-07-24 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-fmt](/man/terraform-fmt)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/validate)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-07-24 -->

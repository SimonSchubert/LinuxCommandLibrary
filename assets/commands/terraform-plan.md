# TAGLINE

Preview Terraform infrastructure changes

# TLDR

**Create execution plan**

```terraform plan```

**Save plan to file**

```terraform plan -out=[plan.tfplan]```

**Plan with variable**

```terraform plan -var="[key]=[value]"```

**Plan destroy**

```terraform plan -destroy```

**Plan specific target**

```terraform plan -target=[resource]```

# SYNOPSIS

**terraform** **plan** [_options_]

# PARAMETERS

**-out** _file_
> Save plan to file.

**-var** _name=value_
> Set variable.

**-var-file** _file_
> Variable file.

**-target** _resource_
> Target specific resource.

**-destroy**
> Plan destruction.

**-refresh-only**
> Only refresh state.

**-detailed-exitcode**
> Exit 2 if changes planned.

# DESCRIPTION

**terraform plan** creates an execution plan showing proposed changes. Compares current state with configuration. Review before applying to understand infrastructure changes.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-apply](/man/terraform-apply)(1)


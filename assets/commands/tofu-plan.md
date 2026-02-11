# TAGLINE

Preview OpenTofu infrastructure changes

# TLDR

**Create execution plan**

```tofu plan```

**Save plan to file**

```tofu plan -out=[plan.tfplan]```

**Plan with variable**

```tofu plan -var="[key]=[value]"```

**Plan destroy**

```tofu plan -destroy```

# SYNOPSIS

**tofu** **plan** [_options_]

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

# DESCRIPTION

**tofu plan** creates an execution plan for OpenTofu. OpenTofu is the open-source fork of Terraform. Shows proposed changes before applying to infrastructure.

# SEE ALSO

[tofu](/man/tofu)(1), [terraform-plan](/man/terraform-plan)(1)


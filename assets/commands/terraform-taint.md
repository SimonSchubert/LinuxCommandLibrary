# TAGLINE

Mark a Terraform resource as tainted to force replacement on next apply

# TLDR

**Taint a resource** so it will be recreated on next apply

```terraform taint aws_instance.example```

**Taint even if currently missing** from state

```terraform taint -allow-missing module.foo.aws_instance.bar[0]```

**Taint without state lock**

```terraform taint -lock=false aws_instance.example```

# SYNOPSIS

**terraform** **taint** [_options_] _address_

# DESCRIPTION

**terraform taint** marks a resource instance in the Terraform state as "tainted". On the next `terraform apply`, Terraform will destroy the existing object and create a replacement.

This was historically used to force replacement of resources that became inconsistent or corrupted.

**Note:** This command is deprecated. The recommended approach is to use the `-replace` flag on `terraform apply` or `terraform plan`, e.g. `terraform apply -replace="aws_instance.example"`.

# PARAMETERS

**-allow-missing**
> Succeed even if the resource address is not present in state.

**-lock**=_true|false_
> Acquire a state lock (default true). Use `-lock=false` to disable.

**-lock-timeout**=_duration_
> Duration to retry acquiring a state lock (e.g. `3s`).

**-var** '_NAME=VALUE_'
> Set an input variable value (repeatable).

**-var-file**=_filename_
> Load variable values from a `.tfvars` file (repeatable).

# CAVEATS

Tainting is deprecated in modern Terraform versions. Using `-replace` during planning/applying is preferred because it is more explicit and works in a single step. Taint/untaint only affect state and require a separate apply.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-apply](/man/terraform-apply)(1), [terraform-untaint](/man/terraform-untaint)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/taint)```

<!-- verified: 2026-07-11 -->

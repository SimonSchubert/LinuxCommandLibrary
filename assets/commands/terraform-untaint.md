# TAGLINE

Remove the tainted status from a Terraform resource instance

# TLDR

**Remove taint** from a resource so it will not be replaced

```terraform untaint aws_instance.example```

**Untaint even if missing** from state

```terraform untaint -allow-missing module.foo.resource.bar```

**Untaint without acquiring state lock**

```terraform untaint -lock=false aws_instance.example```

# SYNOPSIS

**terraform** **untaint** [_options_] _address_

# DESCRIPTION

**terraform untaint** clears the tainted flag from a resource instance in the state file. The resource will be treated normally on the next apply (no forced replacement).

Like `terraform taint`, this command is deprecated in favor of more explicit mechanisms such as `-replace` on apply.

# PARAMETERS

**-allow-missing**
> Succeed even if the address does not exist in state.

**-lock**=_true|false_
> Control state locking.

**-lock-timeout**=_duration_
> How long to wait for a lock.

# CAVEATS

Deprecated. Prefer `terraform apply -replace=...` or state manipulation commands when you need to force or prevent replacement.

# SEE ALSO

terraform-apply, terraform-taint, terraform-state

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/untaint)```

<!-- verified: 2026-07-09 -->

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

**terraform untaint** clears the tainted flag from a resource instance in the state file. The resource will be treated normally on the next apply (no forced replacement). It does not modify remote infrastructure—only state.

Like `terraform taint`, this command is deprecated in favor of more explicit mechanisms such as `-replace` on apply.

# PARAMETERS

**-allow-missing**
> Succeed even if the address does not exist in state.

**-lock**=_true|false_
> Control state locking (default true). Use `-lock=false` to disable.

**-lock-timeout**=_duration_
> How long to wait for a lock (e.g. `3s`).

**-no-color**
> Disable terminal color sequences in output.

# CAVEATS

Deprecated. Prefer `terraform apply -replace=...` when you need to force replacement. Untaint only removes the state marker; it does not repair remote objects.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-apply](/man/terraform-apply)(1), [terraform-taint](/man/terraform-taint)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/untaint)```

<!-- verified: 2026-07-11 -->

# TAGLINE

Print the Terraform version and installed providers

# TLDR

**Show** the Terraform version, platform, and installed providers

```terraform version```

Print the same information as **JSON**

```terraform version -json```

# SYNOPSIS

**terraform** **version** [_options_]

# PARAMETERS

**-json**

> Print a JSON object instead of the human-readable report. The object includes **terraform_version**, **platform**, **provider_selections**, and **terraform_outdated**. Upgrade notices and security bulletin text are omitted.

# DESCRIPTION

**terraform version** prints the version of the **terraform** binary, the platform it was built for, and the providers selected for the current working directory. With no extra arguments it also reports when this binary is older than the current release, and it can include security bulletin checks unless those checks are disabled in the Terraform CLI settings.

The provider list is the selection already recorded for this directory. A directory that has not been initialized has no providers to list; the Terraform version and platform are still printed. **terraform version** does not download providers, refresh state, or change the configuration.

# CAVEATS

**-json** is the only flag specific to this subcommand. The JSON form leaves out the upgrade and security text that the human-readable form may print.

The provider versions shown are the ones selected for this working directory, not every provider installed on the machine. Run **terraform init** before expecting a provider list.

# HISTORY

**terraform version** has been part of the Terraform CLI throughout the HashiCorp releases. Terraform itself was created by **Mitchell Hashimoto** at **HashiCorp** and first released in **2014**.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-11-22 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-providers](/man/terraform-providers)(1), [tofu](/man/tofu)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/version)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-11-22 -->

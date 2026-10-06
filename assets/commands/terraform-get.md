# TAGLINE

Download modules declared in a Terraform configuration

# TLDR

**Download** the modules referenced by the root module

```terraform get```

**Update** modules that are already in the local cache

```terraform get -update```

Set a **const variable** that a module source uses

```terraform get -var='[name]=[value]'```

Load those values from a **tfvars file**

```terraform get -var-file=[path/to/file.tfvars]```

**Disable** colored output

```terraform get -no-color```

# SYNOPSIS

**terraform** **get** [_options_]

# PARAMETERS

**-update**

> Check modules that are already downloaded and fetch a newer revision when the source has one.

**-var** _'name=value'_

> Set one input variable declared in the root module. Repeat the flag to set more than one. A variable used in a module **source** or **version** must be declared with **const = true**.

**-var-file** _filename_

> Load variable values from a **.tfvars** file. Repeat the flag to include more than one file.

**-no-color**

> Disable colored output.

# DESCRIPTION

**terraform get** downloads the modules declared in the root module into the **.terraform** directory of the working directory. That directory is a local cache. Do not commit it.

**terraform init** also downloads modules, and it installs provider plugins. **get** does not install providers. Use **-update** when a module source can move, such as a Git branch, and the cached copy should be checked again.

# CAVEATS

Terraform evaluates most input variables when it creates a plan, so those values are not available during **get**. Any variable referenced from a module block's **source** or **version** argument must set **const = true**. Other variables can be left unset.

**-update** refreshes modules only. Provider upgrades are done with **terraform init -upgrade**.

# HISTORY

Terraform was created by **Mitchell Hashimoto** at **HashiCorp** and first released in **2014**.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-10-06 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-plan](/man/terraform-plan)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/get)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-10-06 -->

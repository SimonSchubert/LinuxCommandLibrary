# TAGLINE

Inspect and manage Terraform provider requirements

# TLDR

Show **providers required** by the current configuration

```terraform providers```

Update the **dependency lock file** for all required providers

```terraform providers lock```

Record checksums for **several platforms** in the lock file

```terraform providers lock -platform=[linux_amd64] -platform=[darwin_arm64]```

Lock only a **named provider**

```terraform providers lock [registry.terraform.io/hashicorp/aws]```

**Mirror** required providers into a local directory

```terraform providers mirror [path/to/mirror]```

Mirror packages for a **specific platform**

```terraform providers mirror -platform=[linux_amd64] [path/to/mirror]```

Print provider **schemas as JSON**

```terraform providers schema -json```

Build lock entries from a **filesystem mirror**

```terraform providers lock -fs-mirror=[path/to/mirror]```

Build lock entries from a **network mirror**

```terraform providers lock -net-mirror=[https://mirror.example.com/providers/]```

# SYNOPSIS

**terraform** **providers** [_options_]

**terraform** **providers** **lock** [_options_] [_providers_...]

**terraform** **providers** **mirror** [_options_] _target-dir_

**terraform** **providers** **schema** **-json** [_options_]

# PARAMETERS

**-var** _'NAME=VALUE'_
> Set a single root-module input variable. May be repeated.

**-var-file** _FILENAME_
> Load variable values from a **.tfvars** file. May be repeated.

**lock**
> Write selected provider versions and package checksums into **.terraform.lock.hcl** without installing the plugins into the working directory.

**-platform** _OS_ARCH_
> Target platform for **lock** or **mirror** (for example **linux_amd64**, **darwin_arm64**, **windows_amd64**). Repeat to cover several systems.

**-fs-mirror** _PATH_
> For **lock**: read provider packages from a local filesystem mirror instead of origin registries.

**-net-mirror** _URL_
> For **lock**: read provider packages from a network mirror instead of origin registries.

**-enable-plugin-cache**
> For **lock**: use the globally configured plugin cache. Off by default because the cache is not an authoritative source.

**mirror**
> Download required provider packages into _target-dir_ using the filesystem-mirror layout (and JSON indexes for the network-mirror protocol).

**-lock-file** _true|false_
> For **mirror**: honour **.terraform.lock.hcl** when choosing versions. Default is **true**.

**schema**
> Print detailed schemas for every provider used in the configuration. **-json** is required.

# DESCRIPTION

**terraform providers** reports the provider requirements of the configuration in the current working directory, showing where each requirement comes from. Providers are plugins that talk to remote APIs (AWS, Azure, Kubernetes, and many others) and also some local-only helpers.

The default output is a tree of the root module, child modules, and tests, annotated with provider source addresses and version constraints. A second section lists providers still required by the current state, which can include plugins for resources that have been removed from configuration but not yet destroyed.

Provider dependencies appear when a configuration declares a **required_providers** or **provider** block, when it uses a resource or data source belonging to a provider, or when state still contains instances of that provider. Run this command after **terraform init** to confirm which plugins the working directory actually selected.

Subcommands cover the rest of the plugin lifecycle. **terraform providers lock** consults origin registries (or a mirror) and writes version selections plus signed checksums into **.terraform.lock.hcl**, which is the usual way to pre-populate hashes for every platform a team uses. **terraform providers mirror** copies those packages into a directory that air-gapped machines can later use as a filesystem or network mirror. **terraform providers schema -json** dumps resource, data source, ephemeral resource, and function schemas for tooling.

# CAVEATS

**terraform providers lock** prints signing information but does not decide whether a provider is trustworthy. Review the reported keys before committing an updated lock file.

Lock entries built with **-fs-mirror** or **-net-mirror** record only the checksums the mirror reports, and only for the platforms you requested. Official signed checksums come from origin registries.

**terraform providers schema** requires **-json**; there is no human-readable schema dump. The working directory must already be initialized so provider plugins are installed.

**terraform providers mirror** is available in Terraform 0.13 and later. Re-running it on an existing directory adds new platforms without deleting packages already present.

# HISTORY

**Terraform** was created by **Mitchell Hashimoto** and released by **HashiCorp** in **2014**. Automatic provider installation and the public Terraform Registry became the default in **Terraform 0.13** (2020), which also introduced **.terraform.lock.hcl**, **terraform providers lock**, and **terraform providers mirror**.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-09-22 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-plan](/man/terraform-plan)(1), [tofu](/man/tofu)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/providers)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-09-22 -->

# TAGLINE

Search existing infrastructure to import into Terraform

# TLDR

**List resources** that match `.tfquery.hcl` files in the working directory

```terraform query```

Pass an **input variable** declared in the query file

```terraform query -var="[env]=[prod]"```

Load variables from a **tfvars file**

```terraform query -var-file=[path/to/file.tfvars]```

Print **JSON** results

```terraform query -json```

**Generate import blocks** and resource configuration for the matches

```terraform query -generate-config-out=[generated.tf]```

Evaluate a **policy set** against the resources the query finds

```terraform query -policies=[path/to/policy-set]```

# SYNOPSIS

**terraform** **query** [_options_]

# PARAMETERS

**-var** _'name=value'_

> Set an input variable declared in the query configuration. Repeat the flag to set more than one variable.

**-var-file** _filename_

> Load variable values from a file, in addition to **terraform.tfvars** and **\*.auto.tfvars**. Repeat the flag to include more than one file.

**-policies** _path_

> Evaluate policies from a policy set directory against the resources the query discovers. Repeat the flag for more than one policy set. **--policies** is also accepted. The path must be a directory.

**-generate-config-out** _path_

> Write **import** and **resource** blocks for the results, including resource identities, to a new file. The path must not already exist. Combined with **-json**, the generated configuration is included in the JSON output instead of written to a file.

**-json**

> Print machine-readable JSON instead of the human-readable listing.

**-no-color**

> Disable colored output.

# DESCRIPTION

**terraform query** asks configured providers to list remote objects that match **list** blocks in **.tfquery.hcl** files, then prints the matches. It is the bulk counterpart of importing one resource at a time: the query itself does not change state. Copy the generated **import** and **resource** blocks into the configuration and run **terraform apply** to bring those objects under management.

Each result names the list block that found it, as **list.**_type_**.**_label_, and the identity of the discovered resource. Providers may add a short description or other fields. How many rows come back depends on the provider and on limits and filters in the query file.

The working directory needs a normal Terraform configuration with a **required_providers** block, plus the query files, and it must already be initialized so the provider plugins and credentials are available. **terraform validate -query** checks query files without contacting providers. Since Terraform 1.15, **terraform fmt** reformats **.tfquery.hcl** files.

# CONFIGURATION

**.tfquery.hcl**

> Query files in the configuration root. Each **list** "_type_" "_name_" block names a resource type, a **provider**, and optional provider-specific filters inside a **config** block. **variable** and **locals** blocks in these files supply values to the query.

**terraform.tfvars**, **\*.auto.tfvars**

> Variable files loaded automatically, the same way as for **plan** and **apply**. **-var** and **-var-file** override them.

**cloud** block

> When the configuration is connected to HCP Terraform or Terraform Enterprise, query results can be compared with resources already managed in other workspaces. **-generate-config-out** still writes its file on the local machine.

# CAVEATS

**terraform query** requires **Terraform 1.14** or later. Earlier releases have no query command and do not load **.tfquery.hcl** files.

The command reads live infrastructure. It needs provider credentials and a successful **terraform init**. It does not create, update, or destroy resources, and it does not write them into state until you apply the generated **import** blocks.

Only resource types whose provider implements listing can appear. A **list** block for an unsupported type fails the query.

**-generate-config-out** refuses to overwrite an existing file. Delete or move the previous output before running the command again. With **-json**, Terraform does not write that file; the generated configuration is part of the JSON document.

**-policies** expects directories. A path that is not a directory is rejected before the query runs.

# HISTORY

**terraform query** shipped in **Terraform 1.14.0** (November 19, 2025) together with **list** blocks in **.tfquery.hcl** files, so existing infrastructure can be discovered and turned into import configuration. **Terraform 1.15.0** (April 29, 2026) taught **terraform fmt** to format those query files.

Terraform itself was created by **Mitchell Hashimoto** at **HashiCorp** and first released in **2014**.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-09-27 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-validate](/man/terraform-validate)(1), [terraform-plan](/man/terraform-plan)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/query)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-09-27 -->

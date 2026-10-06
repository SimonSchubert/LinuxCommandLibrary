# TAGLINE

Import an existing remote object into Terraform state

# TLDR

**Import** one remote object into a resource address

```terraform import [aws_instance.foo] [i-abcd1234]```

Import a resource that lives **inside a module**

```terraform import [module.foo.aws_instance.bar] [i-abcd1234]```

Import one instance of a resource that uses **count**

```terraform import '[aws_instance.baz[0]]' [i-abcd1234]```

Import one instance of a resource that uses **for_each**

```terraform import '[aws_instance.baz["example"]]' [i-abcd1234]```

Pass a variable and **skip prompts**

```terraform import -input=false -var='[name]=[value]' [aws_instance.foo] [i-abcd1234]```

Read variables from a **tfvars file**

```terraform import -var-file=[path/to/file.tfvars] [aws_instance.foo] [i-abcd1234]```

# SYNOPSIS

**terraform** **import** [_options_] _address_ _id_

# PARAMETERS

**-config** _=path_

> Directory of Terraform configuration that configures the provider. Defaults to the working directory.

**-input** _=true|false_

> Ask for provider settings that are not in the configuration or the environment. Set **false** for automation.

**-lock** _=false_

> Do not take a state lock. Unsafe when another command might use the same workspace.

**-lock-timeout** _=duration_

> How long to retry a state lock. The default is **0s**.

**-no-color**

> Disable colored output.

**-parallelism** _=n_

> Limit concurrent operations while Terraform walks the graph. The default is **10**.

**-provider** _=provider_

> Deprecated. Override the provider configuration used for this import. Terraform otherwise uses the provider selected by the target resource.

**-var** _'name=value'_

> Set a variable as a Terraform literal expression. Repeat the flag to set more than one. Lists and maps can be passed this way.

**-var-file** _filename_

> Load variables from a file. **terraform.tfvars** and **\*.auto.tfvars** in the working directory are loaded automatically. Repeat the flag to add more files. Only useful with **-config**.

**-ignore-remote-version**

> Accepted only for HCP Terraform and the **remote** backend. Skip the remote service version check.

**-state** _path_, **-state-out** _path_, **-backup** _path_

> Legacy options accepted only by the **local** backend.

# DESCRIPTION

**terraform import** reads one object that already exists in a provider and records it in state at _address_. _id_ is the provider's identifier for that object: an EC2 instance id for **aws_instance**, a zone id for a Route 53 zone, and something else for every other resource type. The provider documentation defines the format. A wrong id produces an error and does not change state.

The address can point at the root module or at a nested module, including a **count** or **for_each** instance. Quote addresses that contain brackets so the shell does not expand them.

The command loads provider settings from configuration in the **-config** directory. If that configuration is missing, Terraform prompts, unless credentials are supplied through the provider's environment variables. Provider blocks read during import cannot depend on anything except variables. A provider that refers to a data source is rejected.

**import** blocks in configuration are the alternative that runs during **terraform apply** and can be reviewed in a plan. **terraform plan -generate-config-out** is the experimental flag that writes HCL for import blocks that do not already have a resource block. The output path must not already exist.

# CONFIGURATION

**provider** blocks

> Configure the provider that owns the object. Credentials can also come from that provider's environment variables.

**terraform.tfvars**, **\*.auto.tfvars**

> Variable files loaded automatically when **-config** points at a directory that contains them. **-var** and **-var-file** override those files.

# CAVEATS

**terraform import** writes state. It does not write a **resource** block. The address should already exist in configuration. An imported object with no configuration shows up as a destroy on the next plan.

Each remote object should be bound to one address. Importing the same object to a second address breaks the assumption Terraform makes about state, and later plans can fight over it.

**-lock=false** lets a concurrent **plan**, **apply**, or **import** rewrite the same state. **-provider** is deprecated.

The id string is not portable across resource types. Copy it from the provider's import documentation for that type.

# HISTORY

**terraform import** was added in **Terraform 0.7.0** (August 2, 2016) as state import for existing infrastructure. **Terraform 1.5.0** (June 12, 2023) added configuration **import** blocks and **terraform plan -generate-config-out**. That release left the **terraform import** command itself unchanged.

Terraform was created by **Mitchell Hashimoto** at **HashiCorp** and first released in **2014**.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-10-06 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-apply](/man/terraform-apply)(1), [terraform-query](/man/terraform-query)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/import)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-10-06 -->

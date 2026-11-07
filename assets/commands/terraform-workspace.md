# TAGLINE

Create, select, and delete Terraform workspaces

# TLDR

List workspaces (the current one is marked)

```terraform workspace list```

Print the **current** workspace name

```terraform workspace show```

Create a workspace

```terraform workspace new [name]```

**Select** an existing workspace

```terraform workspace select [name]```

Select a workspace, **creating it** if needed

```terraform workspace select -or-create [name]```

Delete a workspace that is not tracking resources

```terraform workspace delete [name]```

Delete a workspace **even if it has resources**

```terraform workspace delete -force [name]```

# SYNOPSIS

**terraform** **workspace** **list** | **show** | **new** [_options_] _NAME_ | **select** [_options_] _NAME_ | **delete** [_options_] _NAME_

# PARAMETERS

**list**

> Print every workspace in this working directory. The selected workspace is marked

**show**

> Print only the name of the selected workspace

**new** _NAME_

> Create _NAME_ and select it. **-state** _path_ copies an existing state file into the new workspace instead of starting empty

**select** _NAME_

> Select an existing workspace. **-or-create** creates _NAME_ when it does not exist yet

**delete** _NAME_

> Delete _NAME_. **-force** deletes it even when its state still tracks resources

**-lock** _true_|_false_

> Lock state during **new**, **select**, and **delete**. The default is to lock

**-lock-timeout** _duration_

> How long to wait for the state lock. The default is `0s`

# DESCRIPTION

**terraform workspace** manages workspaces: separate state instances that share one configuration. It is a **terraform** command group, not a separate binary. Each subcommand has its own options. A new working directory starts in the **default** workspace.

**list** and **show** only read the local workspace index. **select** changes which state later commands such as **plan** and **apply** will use. **new** creates a workspace and selects it. **select -or-create** is the form to use in scripts that should succeed whether or not the name already exists.

**delete** refuses a workspace whose state still contains resources, unless **-force** is set. Forcing the delete removes the state. It does not destroy the real infrastructure those objects represent.

# CAVEATS

You cannot delete the workspace that is currently selected. Select another one first. The **default** workspace cannot be deleted.

**-force** drops state that still names real objects. Those objects keep running. Destroy them with **terraform destroy** in that workspace before deleting it, unless you intend to abandon the state on purpose.

Workspaces are not a substitute for separate root modules when the configurations themselves should differ. They separate state, not the `.tf` files.

# HISTORY

Terraform gained named environments early, and those were renamed **workspaces**. **select -or-create** is the later flag for creating a missing workspace in one step. Terraform itself was created by Mitchell Hashimoto at HashiCorp and first released in 2014.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-plan](/man/terraform-plan)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/workspace)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-11-07 -->

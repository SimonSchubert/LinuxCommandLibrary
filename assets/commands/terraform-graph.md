# TAGLINE

Print a Terraform dependency graph in DOT format

# TLDR

**Print** the resource dependency graph of the current configuration

```terraform graph```

Render that graph to a **PNG** with Graphviz

```terraform graph -type=plan | dot -Tpng > [graph.png]```

Graph the **apply** of a saved plan

```terraform graph -plan=[path/to/tfplan]```

**Highlight cycles** in a plan graph

```terraform graph -type=plan -draw-cycles```

Choose the **operation** the graph represents

```terraform graph -type=[plan|plan-refresh-only|plan-destroy|apply]```

# SYNOPSIS

**terraform** **graph** [_options_]

# PARAMETERS

**-plan** _=tfplan_

> Graph the apply of a saved plan file. Implies **-type=apply**.

**-draw-cycles**

> Color edges that form a cycle. Valid only together with **-type**.

**-type** _=plan|plan-refresh-only|plan-destroy|apply_

> Draw the graph for that operation instead of the default resources-only graph. These graphs include more of the Terraform runtime and are harder to read.

**-var** _'name=value'_

> Set one input variable declared in the root module. Repeat the flag to set more than one.

**-var-file** _filename_

> Load variable values from a **.tfvars** file. Repeat the flag to include more than one file.

# DESCRIPTION

**terraform graph** writes a dependency graph of the configuration, or of a selected operation, to standard output. The text is in the DOT language. The default graph shows only the order of **resource** and **data** blocks. **-type** selects a fuller graph for **plan**, **plan-refresh-only**, **plan-destroy**, or **apply**.

The **dot** program from Graphviz turns that text into an image. Online DOT renderers accept the same text. The command does not change infrastructure or state.

# CAVEATS

**-draw-cycles** is rejected unless **-type** selects an operation graph. The default simplified graph does not support it.

**-plan** always implies **-type=apply**, even if another type is requested. The plan file has to be one **terraform plan -out** produced.

The operation graphs expose implementation details of the Terraform runtime. They are diagnostic output, not a stable API.

# HISTORY

Terraform was created by **Mitchell Hashimoto** at **HashiCorp** and first released in **2014**.

# INSTALL

```pacman: sudo pacman -S terraform```

```nix: nix profile install nixpkgs#terraform```

<!-- packages: 2026-10-06 -->

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-apply](/man/terraform-apply)(1), [dot](/man/dot)(1)

# RESOURCES

```[Documentation](https://developer.hashicorp.com/terraform/cli/commands/graph)```

```[Homepage](https://www.terraform.io)```

```[Source code](https://github.com/hashicorp/terraform)```

<!-- verified: 2026-10-06 -->

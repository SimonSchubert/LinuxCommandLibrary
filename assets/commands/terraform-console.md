# TAGLINE

Interactive Terraform expression evaluator

# TLDR

**Open** the interactive console

```terraform console```

**Evaluate** an expression against the **planned state**

```terraform console -plan```

**Evaluate** an expression **non-interactively**

```echo '[expression]' | terraform console```

**Open** the console with a specific **variable file**

```terraform console -var-file=[path/to/vars.tfvars]```

# SYNOPSIS

**terraform console** [_options_]

# PARAMETERS

**-plan**
> Generate an execution plan first and evaluate expressions against the planned state rather than the current state. Shows values Terraform expects after the plan is applied

**-state=**_path_
> Path to a local state file to evaluate expressions against (legacy, local backend only)

**-var** _'NAME=VALUE'_
> Set a variable value on the command line

**-var-file=**_FILE_
> Load variable definitions from a file

# DESCRIPTION

**terraform console** provides an interactive **REPL** (Read-Eval-Print Loop) for evaluating Terraform expressions. It allows testing expressions and interpolations, inspecting current state values, experimenting with built-in functions like **split()**, **lower()**, **length()**, and debugging configurations interactively.

The console is **read-only** and does not modify state, configuration files, or infrastructure resources. However, it locks the state file while running, preventing concurrent **plan** or **apply** operations.

Fields, outputs, variables, and locals from the current Terraform state can be accessed directly. Type **exit** or press **Ctrl-C** / **Ctrl-D** to quit.

# CAVEATS

The console **locks the state file** while running, so you cannot run **terraform plan** or **terraform apply** in the same workspace concurrently. You must run **terraform init** before using the console. Resources that have not been created yet show as unknown unless you use the **-plan** flag. The special **type()** function is only available within the console (since Terraform v1.1). You cannot define new variables interactively.

# HISTORY

Introduced in **Terraform v0.8** in **November 2016** by Mitchell Hashimoto, co-founder of HashiCorp. Originally described as an interactive console for experimenting with interpolations. Support for **-var** and **-var-file** was added later via a fix in **September 2019**. The **type()** function was added in **Terraform v1.1** as a console-only feature.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-plan](/man/terraform-plan)(1), [terraform-apply](/man/terraform-apply)(1), [terraform-login](/man/terraform-login)(1)

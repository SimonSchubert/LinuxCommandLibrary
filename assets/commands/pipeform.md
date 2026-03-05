# TAGLINE

TUI that visualizes Terraform runtime progress

# TLDR

**Pipe a Terraform plan into the TUI**

```terraform plan -json | pipeform```

**Pipe a Terraform apply into the TUI**

```terraform apply -auto-approve -json | pipeform```

**Export timing data to CSV**

```terraform apply -json | pipeform --time-csv=[output.csv]```

# SYNOPSIS

_terraform_command_ **-json** | **pipeform** [_options_]

# PARAMETERS

**--time-csv** _PATH_
> Generate a CSV file with timing data for further analysis.

# DESCRIPTION

**pipeform** is a TUI that visualizes the progress of Terraform operations. It reads Terraform's machine-readable JSON output via a pipe and displays execution progress interactively. After execution, output variables are shown in a table with clipboard copy support.

# CAVEATS

All piped Terraform commands must include the **-json** flag. Only works with Terraform's machine-readable JSON output format.

# HISTORY

**pipeform** was created by **magodo** and is written in **Go**.

# SEE ALSO

[terraform](/man/terraform)(1)

# TAGLINE

Display OpenTofu state output values

# TLDR

**Show all outputs**

```tofu output```

**Show specific output**

```tofu output [name]```

**Output as JSON**

```tofu output -json```

**Get raw value**

```tofu output -raw [name]```

# SYNOPSIS

**tofu** **output** [_options_] [_name_]

# PARAMETERS

**-json**
> Output as JSON. Sensitive values are displayed in plain text.

**-raw**
> Output raw string value. Only works with values that can be automatically converted to strings.

**-state** _path_
> Read from a specific state file instead of the default.

**-no-color**
> Disable color output.

# DESCRIPTION

**tofu output** displays output values from OpenTofu state. OpenTofu is the open-source fork of Terraform. Shows values defined in output blocks. When called without a name argument, it displays all outputs. The default human-readable format may change between versions; use -json for stable machine-readable output in scripts. When using -json or -raw, sensitive values are displayed in plain text.

# SEE ALSO

[tofu](/man/tofu)(1), [tofu-plan](/man/tofu-plan)(1), [terraform-output](/man/terraform-output)(1)


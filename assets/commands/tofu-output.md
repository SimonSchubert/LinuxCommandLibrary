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
> Output as JSON.

**-raw**
> Output raw string value.

**-state** _path_
> Read from state file.

# DESCRIPTION

**tofu output** displays output values from OpenTofu state. OpenTofu is the open-source fork of Terraform. Shows values defined in output blocks.

# SEE ALSO

[tofu](/man/tofu)(1), [terraform-output](/man/terraform-output)(1)


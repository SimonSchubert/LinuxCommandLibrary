# TAGLINE

Display Terraform output values

# TLDR

**Show all outputs**

```terraform output```

**Show specific output**

```terraform output [name]```

**Output as JSON**

```terraform output -json```

**Get raw value**

```terraform output -raw [name]```

# SYNOPSIS

**terraform** **output** [_options_] [_name_]

# PARAMETERS

**-json**
> Output as JSON.

**-raw**
> Output raw string value.

**-state** _path_
> Read from state file.

**-no-color**
> Disable color output.

# DESCRIPTION

**terraform output** displays output values from Terraform state. Shows values defined in output blocks. Useful for scripting and passing values to other tools.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-apply](/man/terraform-apply)(1)


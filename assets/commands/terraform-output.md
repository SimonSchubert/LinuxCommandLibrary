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

**terraform output** reads output values from the Terraform state file. It displays values defined in `output` blocks of the root module. Useful for scripting, passing values between configurations, and extracting infrastructure details like IP addresses, URLs, or resource IDs.

Use **-raw** to get a bare string suitable for shell scripting (no quotes or formatting). Use **-json** to get machine-readable output including type information. When called without a name, all outputs are displayed.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-apply](/man/terraform-apply)(1), [terraform-plan](/man/terraform-plan)(1)


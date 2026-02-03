# TLDR

**Format current directory**

```tofu fmt```

**Format recursively**

```tofu fmt -recursive```

**Check formatting**

```tofu fmt -check```

**Show diff**

```tofu fmt -diff```

# SYNOPSIS

**tofu** **fmt** [_options_] [_dir_]

# PARAMETERS

**-recursive**
> Process subdirectories.

**-check**
> Check if formatted.

**-diff**
> Show formatting diff.

**-write**
> Write changes.

# DESCRIPTION

**tofu fmt** formats OpenTofu configuration files. OpenTofu is the open-source fork of Terraform. Formats HCL files to canonical style for consistency.

# SEE ALSO

[tofu](/man/tofu)(1), [terraform-fmt](/man/terraform-fmt)(1)


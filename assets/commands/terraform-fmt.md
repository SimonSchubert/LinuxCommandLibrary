# TAGLINE

Format Terraform configuration files

# TLDR

**Format current directory**

```terraform fmt```

**Format recursively**

```terraform fmt -recursive```

**Check formatting**

```terraform fmt -check```

**Show diff**

```terraform fmt -diff```

**Check formatting and show diff**

```terraform fmt -check -diff```

**Format a specific directory**

```terraform fmt [path/to/directory]```

# SYNOPSIS

**terraform** **fmt** [_options_] [_dir_]

# PARAMETERS

**-recursive**
> Process subdirectories.

**-check**
> Check if formatted (exit 0 if yes).

**-diff**
> Show formatting diff.

**-write**
> Write changes (default true).

**-list**
> List files with formatting differences (default true).

**-no-color**
> Disable color output in diff.

# DESCRIPTION

**terraform fmt** formats Terraform configuration files to canonical style. Ensures consistent formatting across files and teams. Run before commits or in CI.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-init](/man/terraform-init)(1), [terraform-plan](/man/terraform-plan)(1)


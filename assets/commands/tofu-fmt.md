# TAGLINE

Format OpenTofu configuration files

# TLDR

**Format current directory**

```tofu fmt```

**Format recursively**

```tofu fmt -recursive```

**Check formatting (exit non-zero if not formatted)**

```tofu fmt -check```

**Show diff of formatting changes**

```tofu fmt -diff```

**Format from stdin and write to stdout**

```cat main.tf | tofu fmt -```

# SYNOPSIS

**tofu** **fmt** [_options_] [_target_]

# DESCRIPTION

**tofu fmt** rewrites OpenTofu configuration files to a canonical format and style. It applies a subset of the HCL language style conventions, along with other minor adjustments for readability. OpenTofu is the open-source fork of Terraform maintained by the Linux Foundation.

By default, **tofu fmt** scans the current directory for configuration files. If you provide a target directory, it will scan that directory. If a single file is provided, only that file is processed. A hyphen (_-_) as target reads from standard input.

# PARAMETERS

**-list**=_false_
> Don't list the files containing formatting inconsistencies.

**-write**=_false_
> Don't overwrite the input files (implied by **-check** or when reading from stdin).

**-diff**
> Display diffs of formatting changes.

**-check**
> Check if the input is formatted. Exit status is 0 if all input is properly formatted; non-zero otherwise.

**-recursive**
> Also process files in subdirectories. By default, only the given directory is processed.

# CAVEATS

The command modifies files in place unless **-check**, **-write=false**, or stdin input is used. Formatting changes from **tofu fmt** may not be stable across major versions; re-run after upgrades. Syntactically valid but unformatted files are changed; invalid files produce errors without modification.

# HISTORY

**OpenTofu** was forked from **Terraform** in **2023** after HashiCorp changed Terraform's license to the Business Source License. The **fmt** subcommand was inherited from Terraform and remains largely compatible with **terraform fmt**.

# SEE ALSO

[tofu](/man/tofu)(1), [terraform-fmt](/man/terraform-fmt)(1)

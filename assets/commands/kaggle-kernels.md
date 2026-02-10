# TAGLINE

manages Kaggle notebooks from the command line

# TLDR

**List kernels**

```kaggle kernels list```

**Push kernel to Kaggle**

```kaggle kernels push -p [path]```

**Pull kernel from Kaggle**

```kaggle kernels pull [owner/kernel-name]```

**Get kernel output**

```kaggle kernels output [owner/kernel-name]```

**Check kernel status**

```kaggle kernels status [owner/kernel-name]```

# SYNOPSIS

**kaggle** **kernels** _subcommand_ [_options_]

# PARAMETERS

**list**
> List available kernels.

**push** **-p** _path_
> Push kernel to Kaggle.

**pull** _kernel_
> Download kernel files.

**output** _kernel_
> Download kernel output.

**status** _kernel_
> Check kernel run status.

**init** **-p** _path_
> Initialize kernel metadata.

# DESCRIPTION

**kaggle kernels** manages Kaggle notebooks (kernels) from the command line. Part of the Kaggle CLI, it allows pushing, pulling, and monitoring computational notebooks used for data science projects.

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-datasets](/man/kaggle-datasets)(1)


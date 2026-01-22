# TLDR

**Generate bug report**

```git bugreport```

**Specify output directory**

```git bugreport --output-directory [path]```

**Specify filename suffix**

```git bugreport --suffix [description]```

# SYNOPSIS

**git bugreport** [_options_]

# PARAMETERS

**--output-directory** _DIR_
> Directory for report file.

**--suffix** _SUFFIX_
> Suffix for filename.

**-s** _SUFFIX_
> Short for --suffix.

**--help**
> Display help information.

# DESCRIPTION

**git bugreport** generates a template for reporting bugs to the Git project. It collects system information, git version, and configuration details needed for debugging.

The report includes environment information, installed hooks, and space for describing the problem. It outputs to a text file ready for submission to the git mailing list.

git bugreport streamlines the process of creating useful bug reports.

# CAVEATS

For reporting git bugs, not project bugs. May include sensitive config info. Review before submitting.

# HISTORY

git bugreport was added to **Git** to standardize bug reporting and ensure necessary diagnostic information is included.

# SEE ALSO

[git](/man/git)(1), [git-diagnose](/man/git-diagnose)(1)

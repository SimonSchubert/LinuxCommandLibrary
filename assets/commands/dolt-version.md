# TLDR

**Show Dolt version**

```dolt version```

**Show detailed version** info

```dolt version --verbose```

# SYNOPSIS

**dolt version** [_options_]

# PARAMETERS

**--verbose**, **-v**
> Show detailed version information.

**--feature**
> Show feature version.

**--help**
> Display help information.

# DESCRIPTION

**dolt version** displays the installed Dolt version and build information. The verbose flag provides additional details including the Go version used for compilation and build metadata.

Version information is useful for troubleshooting, ensuring compatibility with repositories, and verifying installations. Different Dolt versions may have different storage formats or feature support.

# CAVEATS

Version numbers follow semantic versioning. Repository format versions may differ from tool version. Older versions may not read newer repository formats.

# HISTORY

dolt version follows standard version reporting conventions, providing essential information for support and compatibility verification in the **Dolt** ecosystem.

# SEE ALSO

[dolt](/man/dolt)(1), [git-version](/man/git-version)(1)

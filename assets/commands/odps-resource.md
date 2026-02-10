# TAGLINE

manages MaxCompute resources

# TLDR

**List resources**

```odps resource list```

**Upload resource**

```odps resource add [file] -t [type]```

**Delete resource**

```odps resource drop [name]```

**Download resource**

```odps resource get [name] -o [output]```

# SYNOPSIS

**odps** **resource** [_command_] [_options_]

# PARAMETERS

**list**
> List resources.

**add** _FILE_
> Upload resource.

**drop** _NAME_
> Delete resource.

**get** _NAME_
> Download resource.

**-t** _TYPE_
> Resource type (jar, py, file).

**-o** _OUTPUT_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**odps resource** manages MaxCompute resources. Uploads JARs, files, and archives.

The tool handles resource operations. Part of ODPS CLI.

# CAVEATS

Resource size limits apply. Part of Alibaba Cloud ODPS tools.

# HISTORY

odps resource provides **resource management** for Alibaba Cloud MaxCompute.

# SEE ALSO

[odps](/man/odps)(1), [odps-func](/man/odps-func)(1)


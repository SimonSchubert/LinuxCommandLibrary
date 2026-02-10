# TAGLINE

manages MaxCompute resources

# TLDR

**List resources**

```odpscmd resource list```

**Add JAR resource**

```odpscmd resource add jar [file.jar]```

**Add Python resource**

```odpscmd resource add py [file.py]```

**Delete resource**

```odpscmd resource drop [name]```

# SYNOPSIS

**odpscmd** **resource** [_command_] [_options_]

# PARAMETERS

**list**
> List resources.

**add** _TYPE_ _FILE_
> Add resource (jar, py, file, archive).

**drop** _NAME_
> Delete resource.

**desc** _NAME_
> Describe resource.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd resource** manages MaxCompute resources. Uploads JARs and files.

The tool handles resource operations. Part of odpscmd suite.

# CAVEATS

Legacy tool. Resource size limits apply.

# HISTORY

odpscmd resource provides **resource management** for MaxCompute Console.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odpscmd-func](/man/odpscmd-func)(1)


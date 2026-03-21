# TAGLINE

manage MaxCompute (ODPS) resources

# TLDR

**List all resources in the current project**

```odps resource list```

**Upload a JAR resource**

```odps resource add [file.jar] -t jar```

**Upload a Python file resource**

```odps resource add [script.py] -t py```

**Upload a generic file resource with a comment**

```odps resource add [data.csv] -t file -c "[description]"```

**Delete a resource by name**

```odps resource drop [resource_name]```

**Download a resource to a local file**

```odps resource get [resource_name] -o [output_file]```

# SYNOPSIS

**odps** **resource** [_command_] [_options_]

# PARAMETERS

**list**
> List all resources in the current project.

**add** _FILE_
> Upload a local file as a resource.

**drop** _NAME_
> Delete a resource by name.

**get** _NAME_
> Download a resource to local storage.

**-t** _TYPE_
> Resource type: jar, py, file, archive, or table.

**-c** _COMMENT_
> Add a comment or description to the resource.

**-o** _OUTPUT_
> Output file path for the get command.

**-f**
> Force overwrite if the resource already exists.

**--help**
> Display help information.

# DESCRIPTION

**odps resource** manages resources in Alibaba Cloud MaxCompute (formerly ODPS). Resources include JAR files for UDFs, Python scripts, plain files, and archives that can be referenced by MaxCompute jobs.

Uploaded resources are stored in the current project and can be used in SQL statements, MapReduce jobs, and user-defined functions. Part of the ODPS CLI (odpscmd) toolset.

# CAVEATS

Resource size limits apply (default 512 MB for files). Requires a valid ODPS configuration with project and credentials. Resource names must be unique within a project; use -f to overwrite existing resources.

# HISTORY

odps resource provides **resource management** for Alibaba Cloud MaxCompute.

# SEE ALSO

[odps](/man/odps)(1), [odps-func](/man/odps-func)(1), [odps-tunnel](/man/odps-tunnel)(1)

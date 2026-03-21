# TAGLINE

manages MaxCompute (ODPS) project resources

# TLDR

**List all resources in the current project**

```odpscmd resource list```

**Add a JAR resource**

```odpscmd resource add jar [file.jar]```

**Add a Python resource**

```odpscmd resource add py [file.py]```

**Add a file resource with a comment**

```odpscmd resource add file [data.csv] -c "[description]"```

**Add an archive resource**

```odpscmd resource add archive [file.tar.gz]```

**Describe a resource**

```odpscmd resource desc [resource_name]```

**Delete a resource**

```odpscmd resource drop [resource_name]```

# SYNOPSIS

**odpscmd** **resource** _command_ [_options_]

# PARAMETERS

**list**
> List all resources in the current project.

**add** _TYPE_ _FILE_ [**-c** _COMMENT_]
> Upload a resource. TYPE is one of: jar, py, file, archive, table.

**drop** _NAME_
> Delete a resource by name.

**desc** _NAME_
> Show metadata and details of a resource.

**-c** _COMMENT_
> Add a comment or description when uploading a resource.

**-f**
> Force overwrite if a resource with the same name already exists.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd resource** manages resources within Alibaba Cloud MaxCompute (formerly ODPS) projects. Resources are files uploaded to a project that can be referenced by MapReduce jobs, UDFs (User-Defined Functions), and Graph jobs.

Supported resource types include JAR files for Java-based UDFs and MapReduce programs, Python files for PyODPS UDFs, plain files for data, and archives (tar.gz, zip) for bundled dependencies. Table resources reference existing MaxCompute tables.

Resources must be uploaded before they can be used in function definitions or job submissions. Each resource has a unique name within a project and can include an optional comment for documentation purposes.

# CAVEATS

Individual resource files have a size limit (typically 500 MB, but varies by configuration). Resource names must be unique within a project. The **-f** flag is needed to overwrite an existing resource. Part of the odpscmd CLI which requires a valid MaxCompute project configuration.

# HISTORY

odpscmd resource is part of the **MaxCompute Console** (odpscmd), Alibaba Cloud's command-line tool for managing MaxCompute projects, originally known as ODPS (Open Data Processing Service).

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odpscmd-func](/man/odpscmd-func)(1), [odpscmd-auth](/man/odpscmd-auth)(1), [odpscmd-tunnel](/man/odpscmd-tunnel)(1)

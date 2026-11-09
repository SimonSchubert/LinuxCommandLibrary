# TAGLINE

manage MaxCompute (ODPS) resources

# TLDR

**List all resources in the current project**

```list resources;```

**Upload a JAR resource**, overwriting an existing one

```add jar [path/to/file.jar] -f;```

**Upload a Python file resource**

```add py [path/to/script.py];```

**Upload a file resource with an alias and comment**

```add file [path/to/data.csv] as [alias.csv] comment '[description]';```

**Register a table partition as a resource**

```add table [table_name] partition ([pt='1']) as [alias];```

**Show details of a resource**

```desc resource [resource_name];```

**Download a resource to a local path**

```get resource [resource_name] [path/to/output];```

**Delete a resource**

```drop resource [resource_name];```

# SYNOPSIS

**add** **file**|**archive** _local_file_ [**as** _alias_] [**comment** '_text_'] [**-f**];

**add** **py**|**jar** _local_file_ [**comment** '_text_'] [**-f**];

**add** **table** _table_name_ [**partition** (_spec_)] [**as** _alias_] [**comment** '_text_'] [**-f**];

**list** **resources**;

**desc** **resource** _name_;

**get** **resource** _name_ _path_;

**drop** **resource** _name_;

# PARAMETERS

**as** _ALIAS_
> Resource name to use instead of the file or table name. Not supported for jar and py.

**comment** '_TEXT_'
> Add a comment to the resource.

**partition** (_SPEC_)
> Add only the given partition of a table.

**-f**
> Overwrite an existing resource with the same name. Without it, a name conflict fails.

# DESCRIPTION

These statements manage resources in Alibaba Cloud MaxCompute (formerly ODPS). Resources include JAR files for UDFs, Python scripts, plain files, archives and tables that can be referenced by MaxCompute jobs.

There is no `odps resource` subcommand: the statements are entered in the interactive client (**odpscmd**) and end with a semicolon. They can also be passed non-interactively with the client's **-e** option.

# CAVEATS

Each resource file is limited to 2048 MB, and the resources referenced by one SQL or MapReduce job are limited to 2048 MB in total. External tables cannot be added. TABLE resources cannot be downloaded with **get resource**. **drop resource** asks for confirmation. Resource names are case-insensitive.

# SEE ALSO

[odps](/man/odps)(1), [odpscmd](/man/odpscmd)(1), [odps-func](/man/odps-func)(1), [odps-tunnel](/man/odps-tunnel)(1)

# RESOURCES

```[Source code](https://github.com/aliyun/aliyun-odps-console)```

```[Homepage](https://www.alibabacloud.com/product/maxcompute)```

```[Documentation](https://www.alibabacloud.com/help/en/maxcompute/user-guide/resource-operations)```

<!-- verified: 2026-11-09 -->

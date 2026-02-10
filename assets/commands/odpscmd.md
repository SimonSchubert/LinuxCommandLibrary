# TAGLINE

maxCompute Console

# TLDR

**Start interactive console**

```odpscmd```

**Execute SQL**

```odpscmd -e "[SELECT * FROM table]"```

**Run script file**

```odpscmd -f [script.sql]```

**Use specific project**

```odpscmd --project [project_name]```

# SYNOPSIS

**odpscmd** [_options_]

# PARAMETERS

**-e** _SQL_
> Execute SQL statement.

**-f** _FILE_
> Execute script file.

**--project** _NAME_
> Specify project.

**--endpoint** _URL_
> Service endpoint.

**-u** _CONFIG_
> User configuration file.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd** is MaxCompute Console. Interactive CLI for Alibaba Cloud big data.

The tool provides SQL execution and management. Java-based client.

# CAVEATS

Requires Java. Legacy tool name. Use odps for newer CLI.

# HISTORY

odpscmd was the original **MaxCompute CLI** for Alibaba Cloud data processing.

# SEE ALSO

[odps](/man/odps)(1), [odpscmd-tunnel](/man/odpscmd-tunnel)(1)


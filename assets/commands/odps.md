# TAGLINE

alibaba Cloud MaxCompute CLI

# TLDR

**Start interactive session**

```odps```

**Execute SQL query**

```odps -e "[SELECT * FROM table]"```

**Run SQL file**

```odps -f [query.sql]```

**Specify project**

```odps --project [project_name]```

# SYNOPSIS

**odps** [_options_]

# PARAMETERS

**-e** _SQL_
> Execute SQL statement.

**-f** _FILE_
> Execute SQL file.

**--project** _NAME_
> Use project.

**--endpoint** _URL_
> Service endpoint.

**--help**
> Display help information.

# DESCRIPTION

**odps** is Alibaba Cloud MaxCompute CLI. Runs SQL on big data platform.

The tool provides command-line access to MaxCompute. Processes large datasets.

# CAVEATS

Requires Alibaba Cloud credentials. MaxCompute billing applies.

# HISTORY

odps was created for **Alibaba Cloud MaxCompute** data processing and analytics.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odps-tunnel](/man/odps-tunnel)(1)


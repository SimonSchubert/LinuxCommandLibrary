# TAGLINE

transfers data to/from MaxCompute

# TLDR

**Upload data to table**

```odps tunnel upload [file] [project.table]```

**Download table data**

```odps tunnel download [project.table] [output]```

**Upload with partition**

```odps tunnel upload [file] [project.table/pt=value]```

**Show tunnel status**

```odps tunnel show```

# SYNOPSIS

**odps** **tunnel** [_command_] [_options_]

# PARAMETERS

**upload** _FILE_ _TABLE_
> Upload data to table.

**download** _TABLE_ _FILE_
> Download table data.

**show**
> Show tunnel status.

**-fd** _DELIMITER_
> Field delimiter.

**-rd** _DELIMITER_
> Record delimiter.

**--help**
> Display help information.

# DESCRIPTION

**odps tunnel** transfers data to/from MaxCompute. High-speed data channel.

The tool provides bulk data operations. Part of ODPS CLI.

# CAVEATS

Large file support. Part of Alibaba Cloud ODPS tools. Bandwidth limits may apply.

# HISTORY

odps tunnel provides **high-speed data transfer** for Alibaba Cloud MaxCompute.

# SEE ALSO

[odps](/man/odps)(1), [odpscmd-tunnel](/man/odpscmd-tunnel)(1)

